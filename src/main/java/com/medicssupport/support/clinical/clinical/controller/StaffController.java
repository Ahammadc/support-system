package com.medicssupport.support.clinical.clinical.controller;

import com.medicssupport.support.application.core.layer.SuperController;
import com.medicssupport.support.clinical.clinical.converter.StaffConverter;
import com.medicssupport.support.clinical.clinical.model.staff.Staff;
import com.medicssupport.support.clinical.clinical.model.staff.StaffDTO;
import com.medicssupport.support.clinical.clinical.model.staff.StaffConstants;
import com.medicssupport.support.clinical.clinical.service.StaffService;
import com.medicssupport.support.search.model.SearchRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.medicssupport.support.application.model.ApiResponse;
import com.medicssupport.support.application.model.PageResponse;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@RequestMapping(StaffConstants.PATH_STAFF)
@RestController
@Slf4j
public class StaffController extends SuperController<Staff, StaffDTO, Long> {

    protected StaffController(StaffService staffService, StaffConverter staffConverter) {
        super(staffService, staffConverter);
    }
}
