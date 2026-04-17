package com.medicssupport.support.clinical.investigation.transaction.controller;

import com.medicssupport.support.clinical.investigation.transaction.service.ResultDetailService;
import com.medicssupport.support.clinical.investigation.transaction.service.worklist.model.ProcessValidationResult;
import com.medicssupport.support.search.model.SearchRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/worklist")
public class WorklistController {

    private final ResultDetailService resultDetailService;

    public WorklistController(ResultDetailService resultDetailService) {
        this.resultDetailService = resultDetailService;
    }

    @PostMapping("/result_detail")
    public List<ProcessValidationResult> getWorklist(@RequestBody SearchRequest request) {
        return resultDetailService.getLabServiceStatus(request);
    }
}