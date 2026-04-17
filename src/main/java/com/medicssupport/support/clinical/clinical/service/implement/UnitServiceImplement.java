package com.medicssupport.support.clinical.clinical.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.clinical.model.unit.Unit;
import com.medicssupport.support.clinical.clinical.repository.UnitRepository;
import com.medicssupport.support.clinical.clinical.service.UnitService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class UnitServiceImplement extends SuperServiceImpl<Unit, Integer> implements UnitService {

    @Autowired
    public UnitServiceImplement(UnitRepository unitRepository, Map<String, SearchStrategy<Unit>> searchStrategies) {
        super(unitRepository, searchStrategies);
    }
}
