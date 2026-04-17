package com.medicssupport.support.clinical.clinical.strategy.patient_search;

import com.medicssupport.support.application.constants.CommonConstants;
import com.medicssupport.support.application.exception.InvalidSearchValueException;
import com.medicssupport.support.clinical.clinical.model.patient.Patient;
import com.medicssupport.support.clinical.clinical.model.patient.PatientConstants;
import com.medicssupport.support.clinical.clinical.repository.PatientRepository;
import com.medicssupport.support.search.model.SearchData;
import com.medicssupport.support.search.service.SearchStrategyExtended;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Component(PatientConstants.STRATEGY_PAT_PHONE)
@Slf4j
public class PhoneSearchStrategy extends SearchStrategyExtended<Patient> {

    private static final Pattern PHONE_PATTERN = Pattern.compile(CommonConstants.PHONE_NUMBER_REGEX);

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Page<Patient> search(List<SearchData> searchData, Pageable pageable) {
        Map<String, List<String>> dataMap = getSearchDataMap(searchData, 1);
        List<String> patPhones = dataMap.getOrDefault(PatientConstants.KEY_PAT_PHONE, List.of());
        log.info("Searching patients by Phone: {}", patPhones);

        return patientRepository.findByPatPhoneIn(patPhones, pageable);
    }

    @Override
    public void validate(List<SearchData> searchData, Integer expectedLength) {
        super.validate(searchData, expectedLength);

        List<SearchData> cleanedData = cleanSearchValues(searchData);

        Map<String, List<String>> dataMap = cleanedData.stream()
                .collect(Collectors.toMap(
                        SearchData::getSearchKey,
                        SearchData::getSearchValues,
                        (existing, replacement) -> existing
                ));

        List<String> patPhones = dataMap.getOrDefault(PatientConstants.KEY_PAT_PHONE, List.of());

        List<String> invalidPatPhones = new ArrayList<>();

        for (String phone : patPhones) {
            String cleanPhone = phone.replaceAll(CommonConstants.NON_NUMERIC_REGEX, "");
            if (!PHONE_PATTERN.matcher(cleanPhone).matches()) {
                invalidPatPhones.add(phone);
            }
        }
        if (!invalidPatPhones.isEmpty()) {
            throw new InvalidSearchValueException(
                    "Invalid phone number format: " + invalidPatPhones + ". Phone number must be 10-15 digits."
            );
        }
    }

    @Override
    public String getDefaultSortField() {
        return PatientConstants.COLUMN_PAT_RID;
    }
}