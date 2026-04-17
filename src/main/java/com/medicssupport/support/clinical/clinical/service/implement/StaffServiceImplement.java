package com.medicssupport.support.clinical.clinical.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.clinical.model.staff.Staff;
import com.medicssupport.support.clinical.clinical.repository.StaffRepository;
import com.medicssupport.support.clinical.clinical.service.StaffService;
import com.medicssupport.support.search.service.SearchStrategy;
import com.medicssupport.support.search.model.SearchData;
import com.medicssupport.support.search.model.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicssupport.support.application.exception.InvalidSearchTypeException;
import com.medicssupport.support.application.model.PageResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
@Slf4j
public class StaffServiceImplement extends SuperServiceImpl<Staff, Long> implements StaffService {

    @Autowired
    public StaffServiceImplement(StaffRepository staffRepository, Map<String, SearchStrategy<Staff>> searchStrategies) {
        super(staffRepository, searchStrategies);
    }
}
