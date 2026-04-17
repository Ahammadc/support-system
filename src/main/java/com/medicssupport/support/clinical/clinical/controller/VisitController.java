package com.medicssupport.support.clinical.clinical.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.clinical.converter.VisitConverter;
import com.medicssupport.support.clinical.clinical.model.visit.Visit;
import com.medicssupport.support.clinical.clinical.model.visit.VisitConstants;
import com.medicssupport.support.clinical.clinical.model.visit.VisitDTO;
import com.medicssupport.support.clinical.clinical.service.VisitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping(VisitConstants.PATH_VISIT)
@RestController
@Slf4j
public class VisitController extends SuperController<Visit, VisitDTO, Integer> {

	private final VisitService visitService;
	private final VisitConverter visitConverter;

	protected VisitController(VisitService visitService, VisitConverter visitConverter) {
		super(visitService, visitConverter);
		this.visitService = visitService;
		this.visitConverter = visitConverter;
	}
}