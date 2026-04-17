package com.medicssupport.support.clinical.clinical.strategy.appointment;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.clinical.clinical.model.appointment.Appointment;
import com.medicssupport.support.clinical.clinical.model.appointment.AppointmentConstants;
import com.medicssupport.support.clinical.clinical.repository.AppointmentRepository;
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

@Component(AppointmentConstants.STRATEGY_APPT_ENT_RID)
@Slf4j
public class ApptEntRidSearchStrategy extends SearchStrategyExtended<Appointment> {

    @Autowired
    private AppointmentRepository appointmentRepository;

    @Override
    public Page<Appointment> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, SearchConstants.EXPECTED_SIZE_ONE);

        List<Integer> apptEntRids = dataMap.getOrDefault(AppointmentConstants.KEY_APPT_ENT_RID, List.of()).stream()
                .filter(val -> val.matches(CommonConstants.NUMERIC_REGEX))
                .map(Integer::valueOf)
                .toList();

        log.info("Searching appointment by appt_ent_rid: {}", apptEntRids);

        return appointmentRepository.findAllByApptEntRidIn(apptEntRids, pageable);
    }

    @Override
    public String getDefaultSortField() {
        return AppointmentConstants.COLUMN_APPT_RID;
    }
}
