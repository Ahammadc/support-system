package com.medicssupport.support.clinical.investigation.master.strategy;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.investigation.master.model.lab_service_details.LabServiceDetails;
import com.medicssupport.support.clinical.investigation.master.model.lab_service_details.LabServiceDetailsConstants;
import com.medicssupport.support.clinical.investigation.master.repository.LabServiceDetailsRepository;
import com.medicssupport.support.search.constants.SearchConstants;
import com.medicssupport.support.search.model.SearchData;
import com.medicssupport.support.search.service.SearchStrategyExtended;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component(LabServiceDetailsConstants.STRATEGY_LSD_SER_RID)
@Slf4j
public class LabServiceDetailsSerRidSearchStrategy extends SearchStrategyExtended<LabServiceDetails> {

    @Autowired
    private LabServiceDetailsRepository labServiceDetailsRepository;

    @Override
    public Page<LabServiceDetails> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> serRids = dataMap.getOrDefault(LabServiceDetailsConstants.KEY_LSD_SER_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching lab service details by ser_rid: {}", serRids);

        return labServiceDetailsRepository.findAllBySerRidIn(serRids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return LabServiceDetailsConstants.COLUMN_SER_RID;
    }
}
