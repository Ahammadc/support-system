package com.medicssupport.support.clinical.investigation.transaction.service;

import com.medicssupport.support.application.core.layer.SuperService;
import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetail;
import com.medicssupport.support.clinical.investigation.transaction.service.worklist.model.ProcessValidationResult;
import com.medicssupport.support.search.model.SearchRequest;

import java.util.List;

public interface ResultDetailService extends SuperService<ResultDetail, Long> {
    List<ProcessValidationResult> getLabServiceStatus(SearchRequest request);
}

