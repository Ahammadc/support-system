package com.medicssupport.support.clinical.clinical.service;

import com.medicssupport.support.application.core.layer.SuperService;
import com.medicssupport.support.clinical.clinical.model.staff.Staff;
import com.medicssupport.support.search.model.SearchRequest;
import org.springframework.stereotype.Service;

import com.medicssupport.support.application.model.PageResponse;

import java.util.List;

@Service
public interface StaffService extends SuperService<Staff, Long> {}
