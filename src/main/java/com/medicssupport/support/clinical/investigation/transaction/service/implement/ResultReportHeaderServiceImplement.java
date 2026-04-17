package com.medicssupport.support.clinical.investigation.transaction.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.investigation.transaction.model.result_report_header.ResultReportHeader;
import com.medicssupport.support.clinical.investigation.transaction.repository.ResultReportHeaderRepository;
import com.medicssupport.support.clinical.investigation.transaction.service.ResultReportHeaderService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class ResultReportHeaderServiceImplement extends SuperServiceImpl<ResultReportHeader, Integer> implements ResultReportHeaderService {

    @Autowired
    public ResultReportHeaderServiceImplement(ResultReportHeaderRepository repository, Map<String, SearchStrategy<ResultReportHeader>> searchStrategies) {
        super(repository, searchStrategies);
    }
}
