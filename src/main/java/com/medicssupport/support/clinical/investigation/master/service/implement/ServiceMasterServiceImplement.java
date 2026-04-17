package com.medicssupport.support.clinical.investigation.master.service.implement;

import com.medicssupport.support.application.core.layer.SuperServiceImpl;
import com.medicssupport.support.clinical.investigation.master.model.service_master.ServiceMaster;
import com.medicssupport.support.clinical.investigation.master.repository.ServiceMasterRepository;
import com.medicssupport.support.clinical.investigation.master.service.ServiceMasterService;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
@Slf4j
public class ServiceMasterServiceImplement extends SuperServiceImpl<ServiceMaster, Integer> implements ServiceMasterService {

    @Autowired
    public ServiceMasterServiceImplement(ServiceMasterRepository serviceMasterRepository, Map<String, SearchStrategy<ServiceMaster>> searchStrategies) {
        super(serviceMasterRepository, searchStrategies);
    }
}
