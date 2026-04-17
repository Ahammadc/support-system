package com.medicssupport.support.clinical.investigation.transaction.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.investigation.transaction.model.result_observation.ResultObservation;
import com.medicssupport.support.clinical.investigation.transaction.repository.ResultObservationRepository;
import com.medicssupport.support.clinical.investigation.transaction.service.ResultObservationService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class ResultObservationServiceImplement extends SuperServiceImpl<ResultObservation, Integer> implements ResultObservationService {

    @Autowired
    public ResultObservationServiceImplement(ResultObservationRepository repository, Map<String, SearchStrategy<ResultObservation>> searchStrategies) {
        super(repository, searchStrategies);
    }
}
