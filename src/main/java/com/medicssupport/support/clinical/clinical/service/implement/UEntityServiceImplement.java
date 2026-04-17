package com.medicssupport.support.clinical.clinical.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.clinical.model.entity.UEntity;
import com.medicssupport.support.clinical.clinical.repository.UEntityRepository;
import com.medicssupport.support.clinical.clinical.service.UEntityService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class UEntityServiceImplement extends SuperServiceImpl<UEntity, Integer> implements UEntityService {

    @Autowired
    public UEntityServiceImplement(UEntityRepository uEntityRepository, Map<String, SearchStrategy<UEntity>> searchStrategies) {
        super(uEntityRepository, searchStrategies);
    }
}
