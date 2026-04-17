package com.medicssupport.support.clinical.investigation.transaction.service.worklist;

import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetail;

import com.medicssupport.support.clinical.investigation.transaction.service.worklist.model.*;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class GenericWorklistStrategy implements WorklistStrategy {

    private final String worklistName;
    private final Map<String, ValidationCondition> conditions;
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm a");

    public GenericWorklistStrategy(String worklistName, Map<String, ValidationCondition> conditions) {
        this.worklistName = worklistName;
        this.conditions = conditions;
    }

    public GenericWorklistStrategy(String worklistName, Map<String, Predicate<ResultDetail>> predicateMap, boolean isPredicate) {
        this.worklistName = worklistName;
        this.conditions = predicateMap.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> new ValidationCondition(
                                entry.getKey(),
                                entry.getValue(),
                                rd -> "N/A",
                                "N/A",
                                "N/A",
                                "N/A",
                                false,
                                "N/A"
                        )
                ));
    }

    @Override
    public ValidationResult evaluate(ResultDetail resultDetail) {
        return evaluate(resultDetail, true);
    }

    @Override
    public ValidationResult evaluate(ResultDetail resultDetail, boolean includeDataSegments) {
        if (getWorklistName() == null) {
            return null;
        }

        List<ConditionResult> conditionResults = new ArrayList<>();
        boolean allPassed = true;
        List<ChecklistItem> checklistItems = new ArrayList<>();

        for (Map.Entry<String, ValidationCondition> entry : conditions.entrySet()) {
            ValidationCondition condition = entry.getValue();

            if (includeDataSegments) {
                boolean result = condition.getPredicate().test(resultDetail);
                if (!result) {
                    allPassed = false;
                }

                String actualValue = condition.getActualValueExtractor().apply(resultDetail);
                conditionResults.add(ConditionResult.builder()
                        .label(condition.getConditionName())
                        .value(actualValue)
                        .status(result ? "Pass" : "Fail")
                        .failMessage(result ? null : condition.getFailMessage())
                        .issueType(result ? null : condition.getIssueType())
                        .action(result ? null : condition.getAction())
                        .build());

                if (condition.isChecklist()) {
                    checklistItems.add(new ChecklistItem(String.format(condition.getChecklistMessage(), actualValue)));
                }
            }
        }

        List<SupplementaryInfo> supplementaryInfo = new ArrayList<>();
        if (resultDetail.getRdOrderDate() != null) {
            supplementaryInfo.add(SupplementaryInfo.builder()
                    .key("Order Date")
                    .value(resultDetail.getRdOrderDate().format(DATE_TIME_FORMATTER))
                    .type("datetime")
                    .build());
        }

        SubjectHeader subjectHeader = SubjectHeader.builder()
                .id(String.valueOf(resultDetail.getRdRid()))
                .title(resultDetail.getRdServiceName())
                .subTitle(getWorklistName())
                .indicator(allPassed ? "success" : "error")
                .supplementaryInfo(supplementaryInfo)
                .build();

        List<DataSegment> dataSegments = new ArrayList<>();
        if (includeDataSegments) {
            dataSegments.add(DataSegment.builder()
                    .segmentName("Validating Conditions")
                    .renderType("TABLE")
                    .items(conditionResults)
                    .build());

            if (!checklistItems.isEmpty()) {
                dataSegments.add(DataSegment.builder()
                        .segmentName("Checklist")
                        .renderType("LIST")
                        .items(checklistItems)
                        .build());
            }
        }

        return ValidationResult.builder()
                .subjectHeader(subjectHeader)
                .dataSegments(dataSegments)
                .build();
    }

    @Override
    public String getWorklistName() {
        return worklistName;
    }
}
