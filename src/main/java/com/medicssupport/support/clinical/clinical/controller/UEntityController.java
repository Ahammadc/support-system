package com.medicssupport.support.clinical.clinical.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.clinical.converter.UEntityConverter;
import com.medicssupport.support.clinical.clinical.model.entity.UEntity;
import com.medicssupport.support.clinical.clinical.model.entity.UEntityDTO;
import com.medicssupport.support.clinical.clinical.model.entity.UEntityConstants;
import com.medicssupport.support.clinical.clinical.service.UEntityService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(UEntityConstants.PATH_UENTITY)
@RestController
public class UEntityController extends SuperController<UEntity, UEntityDTO, Integer> {

    protected UEntityController(UEntityService uEntityService, UEntityConverter uEntityConverter) {
        super(uEntityService, uEntityConverter);
    }
}
