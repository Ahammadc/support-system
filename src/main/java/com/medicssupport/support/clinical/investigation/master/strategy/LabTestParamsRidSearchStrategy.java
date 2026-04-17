package com.medicssupport.support.clinical.investigation.master.strategy;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.investigation.master.model.lab_test_params.LabTestParams;
import com.medicssupport.support.clinical.investigation.master.model.lab_test_params.LabTestParamsConstants;
import com.medicssupport.support.clinical.investigation.master.repository.LabTestParamsRepository;
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

@Component(LabTestParamsConstants.STRATEGY_LTP_RID)
@Slf4j
public class LabTestParamsRidSearchStrategy extends SearchStrategyExtended<LabTestParams> {

    @Autowired
    private LabTestParamsRepository labTestParamsRepository;

    @Override
    public Page<LabTestParams> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> rids = dataMap.getOrDefault(LabTestParamsConstants.KEY_LTP_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching lab test params by rid: {}", rids);

        return labTestParamsRepository.findAllByRidIn(rids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return LabTestParamsConstants.COLUMN_RID;
    }
}
