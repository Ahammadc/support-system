package com.medicssupport.support.clinical.investigation.transaction.service.worklist.model;

import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetail;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.Function;
import java.util.function.Predicate;

@Getter
@AllArgsConstructor
public class ValidationCondition {
    private String conditionName;
    private Predicate<ResultDetail> predicate;
    private Function<ResultDetail, String> actualValueExtractor;
    private String failMessage;
    private String issueType;
    private String action;
    private boolean isChecklist;
    private String checklistMessage;
}
