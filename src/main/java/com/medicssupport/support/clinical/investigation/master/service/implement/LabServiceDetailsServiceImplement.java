package com.medicssupport.support.clinical.investigation.master.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.investigation.master.model.lab_service_details.LabServiceDetails;
import com.medicssupport.support.clinical.investigation.master.repository.LabServiceDetailsRepository;
import com.medicssupport.support.clinical.investigation.master.service.LabServiceDetailsService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class LabServiceDetailsServiceImplement extends SuperServiceImpl<LabServiceDetails, Integer> implements LabServiceDetailsService {

    @Autowired
    public LabServiceDetailsServiceImplement(LabServiceDetailsRepository labServiceDetailsRepository, Map<String, SearchStrategy<LabServiceDetails>> searchStrategies) {
        super(labServiceDetailsRepository, searchStrategies);
    }
}
