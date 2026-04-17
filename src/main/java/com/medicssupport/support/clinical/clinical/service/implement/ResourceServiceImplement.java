package com.medicssupport.support.clinical.clinical.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.clinical.model.resource.Resource;
import com.medicssupport.support.clinical.clinical.repository.ResourceRepository;
import com.medicssupport.support.clinical.clinical.service.ResourceService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class ResourceServiceImplement extends SuperServiceImpl<Resource, Integer> implements ResourceService {

    @Autowired
    public ResourceServiceImplement(ResourceRepository resourceRepository, Map<String, SearchStrategy<Resource>> searchStrategies) {
        super(resourceRepository, searchStrategies);
    }
}
