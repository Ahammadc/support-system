package com.medicssupport.support.clinical.investigation.master.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.investigation.master.model.age_category.AgeCategory;
import com.medicssupport.support.clinical.investigation.master.repository.AgeCategoryRepository;
import com.medicssupport.support.clinical.investigation.master.service.AgeCategoryService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class AgeCategoryServiceImplement extends SuperServiceImpl<AgeCategory, Integer> implements AgeCategoryService {

    @Autowired
    public AgeCategoryServiceImplement(AgeCategoryRepository ageCategoryRepository, Map<String, SearchStrategy<AgeCategory>> searchStrategies) {
        super(ageCategoryRepository, searchStrategies);
    }
}
