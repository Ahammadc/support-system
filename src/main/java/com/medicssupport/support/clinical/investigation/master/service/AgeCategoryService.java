package com.medicssupport.support.clinical.investigation.master.service;

import com.medicssupport.support.application.core.layer.SuperService;
import com.medicssupport.support.clinical.investigation.master.model.age_category.AgeCategory;
import org.springframework.stereotype.Service;

@Service
public interface AgeCategoryService extends SuperService<AgeCategory, Integer> {}
