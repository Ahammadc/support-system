package com.medicssupport.support.clinical.investigation.transaction.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.investigation.transaction.converter.ResultDetailConverter;
import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetail;
import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetailConstants;
import com.medicssupport.support.clinical.investigation.transaction.model.result_detail.ResultDetailDTO;
import com.medicssupport.support.clinical.investigation.transaction.service.ResultDetailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(ResultDetailConstants.PATH_RESULT_DETAIL)
@RestController
@Slf4j
public class ResultDetailController extends SuperController<ResultDetail, ResultDetailDTO, Long> {

    protected ResultDetailController(ResultDetailService service, ResultDetailConverter converter) {
        super(service, converter);
    }
}
