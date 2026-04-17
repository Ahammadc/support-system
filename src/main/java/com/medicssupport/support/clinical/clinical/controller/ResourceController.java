package com.medicssupport.support.clinical.clinical.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.clinical.converter.ResourceConverter;
import com.medicssupport.support.clinical.clinical.model.resource.Resource;
import com.medicssupport.support.clinical.clinical.model.resource.ResourceDTO;
import com.medicssupport.support.clinical.clinical.model.resource.ResourceConstants;
import com.medicssupport.support.clinical.clinical.service.ResourceService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(ResourceConstants.PATH_RESOURCE)
@RestController
public class ResourceController extends SuperController<Resource, ResourceDTO, Integer> {

    protected ResourceController(ResourceService resourceService, ResourceConverter resourceConverter) {
        super(resourceService, resourceConverter);
    }
}
