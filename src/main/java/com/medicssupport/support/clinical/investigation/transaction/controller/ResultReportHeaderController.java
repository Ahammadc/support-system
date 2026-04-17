package com.medicssupport.support.clinical.investigation.transaction.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.investigation.transaction.converter.ResultReportHeaderConverter;
import com.medicssupport.support.clinical.investigation.transaction.model.result_report_header.ResultReportHeader;
import com.medicssupport.support.clinical.investigation.transaction.model.result_report_header.ResultReportHeaderConstants;
import com.medicssupport.support.clinical.investigation.transaction.model.result_report_header.ResultReportHeaderDTO;
import com.medicssupport.support.clinical.investigation.transaction.service.ResultReportHeaderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(ResultReportHeaderConstants.PATH_RESULT_REPORT_HEADER)
@RestController
@Slf4j
public class ResultReportHeaderController extends SuperController<ResultReportHeader, ResultReportHeaderDTO, Integer> {

    protected ResultReportHeaderController(ResultReportHeaderService service, ResultReportHeaderConverter converter) {
        super(service, converter);
    }
}
