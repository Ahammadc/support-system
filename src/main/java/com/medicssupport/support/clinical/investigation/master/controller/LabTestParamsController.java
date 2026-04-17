package com.medicssupport.support.clinical.investigation.master.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.investigation.master.converter.LabTestParamsConverter;
import com.medicssupport.support.clinical.investigation.master.model.lab_test_params.LabTestParams;
import com.medicssupport.support.clinical.investigation.master.model.lab_test_params.LabTestParamsDTO;
import com.medicssupport.support.clinical.investigation.master.model.lab_test_params.LabTestParamsConstants;
import com.medicssupport.support.clinical.investigation.master.service.LabTestParamsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(LabTestParamsConstants.PATH_LAB_TEST_PARAMS)
@RestController
public class LabTestParamsController extends SuperController<LabTestParams, LabTestParamsDTO, Integer> {

    protected LabTestParamsController(LabTestParamsService labTestParamsService, LabTestParamsConverter labTestParamsConverter) {
        super(labTestParamsService, labTestParamsConverter);
    }
}