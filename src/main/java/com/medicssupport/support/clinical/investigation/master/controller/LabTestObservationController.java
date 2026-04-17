package com.medicssupport.support.clinical.investigation.master.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.investigation.master.converter.LabTestObservationConverter;
import com.medicssupport.support.clinical.investigation.master.model.lab_test_observation.LabTestObservation;
import com.medicssupport.support.clinical.investigation.master.model.lab_test_observation.LabTestObservationDTO;
import com.medicssupport.support.clinical.investigation.master.model.lab_test_observation.LabTestObservationConstants;
import com.medicssupport.support.clinical.investigation.master.service.LabTestObservationService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping(LabTestObservationConstants.PATH_LAB_TEST_OBSERVATION)
@RestController
public class LabTestObservationController extends SuperController<LabTestObservation, LabTestObservationDTO, Integer> {

    protected LabTestObservationController(LabTestObservationService labTestObservationService, LabTestObservationConverter labTestObservationConverter) {
        super(labTestObservationService, labTestObservationConverter);
    }
}