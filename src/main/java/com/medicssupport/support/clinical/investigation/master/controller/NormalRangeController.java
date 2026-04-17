package com.medicssupport.support.clinical.investigation.master.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.investigation.master.converter.NormalRangeConverter;
import com.medicssupport.support.clinical.investigation.master.model.normal_range.NormalRange;
import com.medicssupport.support.clinical.investigation.master.model.normal_range.NormalRangeDTO;
import com.medicssupport.support.clinical.investigation.master.model.normal_range.NormalRangeConstants;
import com.medicssupport.support.clinical.investigation.master.service.NormalRangeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(NormalRangeConstants.PATH_NORMAL_RANGE)
@RestController
public class NormalRangeController extends SuperController<NormalRange, NormalRangeDTO, Integer> {

    protected NormalRangeController(NormalRangeService normalRangeService, NormalRangeConverter normalRangeConverter) {
        super(normalRangeService, normalRangeConverter);
    }
}