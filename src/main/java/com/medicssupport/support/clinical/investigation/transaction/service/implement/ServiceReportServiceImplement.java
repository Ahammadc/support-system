package com.medicssupport.support.clinical.investigation.transaction.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.investigation.transaction.model.service_report.ServiceReport;
import com.medicssupport.support.clinical.investigation.transaction.repository.ServiceReportRepository;
import com.medicssupport.support.clinical.investigation.transaction.service.ServiceReportService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class ServiceReportServiceImplement extends SuperServiceImpl<ServiceReport, Integer> implements ServiceReportService {

    @Autowired
    public ServiceReportServiceImplement(ServiceReportRepository repository, Map<String, SearchStrategy<ServiceReport>> searchStrategies) {
        super(repository, searchStrategies);
    }
}
