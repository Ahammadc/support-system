package com.medicssupport.support.clinical.investigation.transaction.service.worklist;

import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetail;

import com.medicssupport.support.clinical.investigation.transaction.service.worklist.model.ValidationResult;

public interface WorklistStrategy {
    ValidationResult evaluate(ResultDetail resultDetail);
    ValidationResult evaluate(ResultDetail resultDetail, boolean includeDataSegments);
    String getWorklistName();
}
