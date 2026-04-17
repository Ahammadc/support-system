package com.medicssupport.support.clinical.investigation.master.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.investigation.master.model.lab_test_params.LabTestParams;
import com.medicssupport.support.clinical.investigation.master.repository.LabTestParamsRepository;
import com.medicssupport.support.clinical.investigation.master.service.LabTestParamsService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class LabTestParamsServiceImplement extends SuperServiceImpl<LabTestParams, Integer> implements LabTestParamsService {

    @Autowired
    public LabTestParamsServiceImplement(LabTestParamsRepository labTestParamsRepository, Map<String, SearchStrategy<LabTestParams>> searchStrategies) {
        super(labTestParamsRepository, searchStrategies);
    }
}
