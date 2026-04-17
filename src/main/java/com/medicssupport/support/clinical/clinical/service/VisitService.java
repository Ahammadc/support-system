package com.medicssupport.support.clinical.clinical.service;

import java.util.List;

import com.medicssupport.support.application.core.layer.SuperService;
import org.springframework.stereotype.Service;

import com.medicssupport.support.clinical.clinical.model.visit.Visit;

@Service
public interface VisitService extends SuperService<Visit, Integer> {

}