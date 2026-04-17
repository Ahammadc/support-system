package com.medicssupport.support.clinical.investigation.transaction.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.investigation.transaction.converter.ResultObservationConverter;
import com.medicssupport.support.clinical.investigation.transaction.model.result_observation.ResultObservation;
import com.medicssupport.support.clinical.investigation.transaction.model.result_observation.ResultObservationConstants;
import com.medicssupport.support.clinical.investigation.transaction.model.result_observation.ResultObservationDTO;
import com.medicssupport.support.clinical.investigation.transaction.service.ResultObservationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(ResultObservationConstants.PATH_RESULT_OBSERVATION)
@RestController
@Slf4j
public class ResultObservationController extends SuperController<ResultObservation, ResultObservationDTO, Integer> {

    protected ResultObservationController(ResultObservationService service, ResultObservationConverter converter) {
        super(service, converter);
    }
}
