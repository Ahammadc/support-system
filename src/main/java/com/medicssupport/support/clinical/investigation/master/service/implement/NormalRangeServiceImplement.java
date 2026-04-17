package com.medicssupport.support.clinical.investigation.master.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.investigation.master.model.normal_range.NormalRange;
import com.medicssupport.support.clinical.investigation.master.repository.NormalRangeRepository;
import com.medicssupport.support.clinical.investigation.master.service.NormalRangeService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class NormalRangeServiceImplement extends SuperServiceImpl<NormalRange, Integer> implements NormalRangeService {

    @Autowired
    public NormalRangeServiceImplement(NormalRangeRepository normalRangeRepository, Map<String, SearchStrategy<NormalRange>> searchStrategies) {
        super(normalRangeRepository, searchStrategies);
    }
}
