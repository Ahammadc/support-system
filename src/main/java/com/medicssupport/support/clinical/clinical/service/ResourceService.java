package com.medicssupport.support.clinical.clinical.service;

import com.medicssupport.support.application.core.layer.SuperService;
import com.medicssupport.support.clinical.clinical.model.resource.Resource;
import org.springframework.stereotype.Service;

@Service
public interface ResourceService extends SuperService<Resource, Integer> {}
