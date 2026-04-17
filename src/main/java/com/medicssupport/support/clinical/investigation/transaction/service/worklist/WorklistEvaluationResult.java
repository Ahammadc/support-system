package com.medicssupport.support.clinical.investigation.transaction.service.worklist;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorklistEvaluationResult {
    private String worklist;
    private Map<String, Boolean> conditionResults;
}
