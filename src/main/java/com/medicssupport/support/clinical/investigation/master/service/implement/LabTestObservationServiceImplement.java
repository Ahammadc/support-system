package com.medicssupport.support.clinical.investigation.master.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.investigation.master.model.lab_test_observation.LabTestObservation;
import com.medicssupport.support.clinical.investigation.master.repository.LabTestObservationRepository;
import com.medicssupport.support.clinical.investigation.master.service.LabTestObservationService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class LabTestObservationServiceImplement extends SuperServiceImpl<LabTestObservation, Integer> implements LabTestObservationService {

    @Autowired
    public LabTestObservationServiceImplement(LabTestObservationRepository labTestObservationRepository, Map<String, SearchStrategy<LabTestObservation>> searchStrategies) {
        super(labTestObservationRepository, searchStrategies);
    }
}
