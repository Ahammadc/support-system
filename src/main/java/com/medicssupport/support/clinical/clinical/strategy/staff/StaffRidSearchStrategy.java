package com.medicssupport.support.clinical.clinical.strategy.staff;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.clinical.model.staff.Staff;
import com.medicssupport.support.clinical.clinical.model.staff.StaffConstants;
import com.medicssupport.support.clinical.clinical.repository.StaffRepository;
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

@Component(StaffConstants.STRATEGY_STAFF_RID)
@Slf4j
public class StaffRidSearchStrategy extends SearchStrategyExtended<Staff> {

    @Autowired
    private StaffRepository staffRepository;

    @Override
    public Page<Staff> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Long> staffRids = dataMap.getOrDefault(StaffConstants.KEY_STAFF_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Long::valueOf)
                .toList();

        log.info("Searching staff by staff_rid: {}", staffRids);

        return staffRepository.findAllByStaffRidIn(staffRids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return StaffConstants.COLUMN_STAFF_RID;
    }
}
