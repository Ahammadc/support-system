package com.medicssupport.support.clinical.investigation.transaction.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.investigation.transaction.converter.ServiceReportConverter;
import com.medicssupport.support.clinical.investigation.transaction.model.service_report.ServiceReport;
import com.medicssupport.support.clinical.investigation.transaction.model.service_report.ServiceReportConstants;
import com.medicssupport.support.clinical.investigation.transaction.model.service_report.ServiceReportDTO;
import com.medicssupport.support.clinical.investigation.transaction.service.ServiceReportService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(ServiceReportConstants.PATH_SERVICE_REPORT)
@RestController
@Slf4j
public class ServiceReportController extends SuperController<ServiceReport, ServiceReportDTO, Integer> {

    protected ServiceReportController(ServiceReportService service, ServiceReportConverter converter) {
        super(service, converter);
    }
}
