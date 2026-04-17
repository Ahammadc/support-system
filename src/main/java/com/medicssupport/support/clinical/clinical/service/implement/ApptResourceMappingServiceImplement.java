package com.medicssupport.support.clinical.clinical.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.clinical.model.appt_resource_mapping.ApptResourceMapping;
import com.medicssupport.support.clinical.clinical.repository.ApptResourceMappingRepository;
import com.medicssupport.support.clinical.clinical.service.ApptResourceMappingService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class ApptResourceMappingServiceImplement extends SuperServiceImpl<ApptResourceMapping, Integer> implements ApptResourceMappingService {

    @Autowired
    public ApptResourceMappingServiceImplement(ApptResourceMappingRepository apptResourceMappingRepository, Map<String, SearchStrategy<ApptResourceMapping>> searchStrategies) {
        super(apptResourceMappingRepository, searchStrategies);
    }
}
