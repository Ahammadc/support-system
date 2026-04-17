package com.medicssupport.support.clinical.clinical.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.clinical.converter.UnitConverter;
import com.medicssupport.support.clinical.clinical.model.unit.Unit;
import com.medicssupport.support.clinical.clinical.model.unit.UnitDTO;
import com.medicssupport.support.clinical.clinical.model.unit.UnitConstants;
import com.medicssupport.support.clinical.clinical.service.UnitService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(UnitConstants.PATH_UNIT)
@RestController
public class UnitController extends SuperController<Unit, UnitDTO, Integer> {

    protected UnitController(UnitService unitService, UnitConverter unitConverter) {
        super(unitService, unitConverter);
    }
}
