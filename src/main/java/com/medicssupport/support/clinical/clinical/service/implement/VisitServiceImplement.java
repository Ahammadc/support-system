package com.medicssupport.support.clinical.clinical.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.clinical.model.visit.Visit;
import com.medicssupport.support.clinical.clinical.repository.VisitRepository;
import com.medicssupport.support.clinical.clinical.service.VisitService;
import com.medicssupport.support.search.service.SearchStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class VisitServiceImplement extends SuperServiceImpl<Visit, Integer> implements VisitService {

    private final VisitRepository visitRepository;

    @Autowired
    public VisitServiceImplement(VisitRepository visitRepository, Map<String, SearchStrategy<Visit>> searchStrategies) {
        super(visitRepository, searchStrategies);
        this.visitRepository = visitRepository;
    }
}

