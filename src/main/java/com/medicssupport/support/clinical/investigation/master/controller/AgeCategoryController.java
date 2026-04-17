package com.medicssupport.support.clinical.investigation.master.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.investigation.master.converter.AgeCategoryConverter;
import com.medicssupport.support.clinical.investigation.master.model.age_category.AgeCategory;
import com.medicssupport.support.clinical.investigation.master.model.age_category.AgeCategoryDTO;
import com.medicssupport.support.clinical.investigation.master.model.age_category.AgeCategoryConstants;
import com.medicssupport.support.clinical.investigation.master.service.AgeCategoryService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(AgeCategoryConstants.PATH_AGE_CATEGORY)
@RestController
public class AgeCategoryController extends SuperController<AgeCategory, AgeCategoryDTO, Integer> {

    protected AgeCategoryController(AgeCategoryService ageCategoryService, AgeCategoryConverter ageCategoryConverter) {
        super(ageCategoryService, ageCategoryConverter);
    }
}