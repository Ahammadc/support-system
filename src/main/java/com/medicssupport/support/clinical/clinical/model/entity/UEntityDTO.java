package com.medicssupport.support.clinical.clinical.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UEntityDTO {
    private Integer entRid;
    private String entCode;
    private Integer entType;
    private String entName;
    private String entRemarks;
    private String entStreet;
    private String entCity;
    private String entState;
    private String entCountry;
    private String entPinCode;
    private Integer entRegionIndex;
    private String entRegionName;
    private String entPhone;
    private String entMobile;
    private String entMail;
    private Integer entAccountRid;
    private Integer entParentRid;
    private BigDecimal entPath;
    private Boolean entRegistered;
    private LocalDateTime entRegDatetime;
    private LocalDateTime entUnregDatetime;
    private String entShortName;
    private String entDisplayAddress;
    private Integer entRootParentRid;
    private String entTaxCode;
    private String entCinNo;
    private String entLtNo;
    private String entTimezone;
    private String entLandmarks;
    private String entMapGeographicPoints;
    private String entHospitalRegNo;
    private Integer entFtRid;
    private Integer entModelRid;
    private Integer entFacilityTypeRid;
    private Integer entDistrict;
    private String entLocaleLanguageCode;
    private String entLocaleCountryCode;
    private Integer entServiceTaxNo;
    private String entDesktop;
    private Integer entGcRid;
    private Integer entCreatedUserRid;
    private LocalDate entSubscriptionDueFrom;
    private Integer entIsDemo;
    private Integer entIsOnTrialMode;
    private LocalDateTime entSwitchedToLiveDatetime;
    private String entMartId;
    private Boolean entIsUnassigned;
    private Integer entPaymentCount;
    private LocalDate entSubscribedTillDate;
    private LocalDate entSubscribedFromDate;
    private String entSubscribedPlanCode;
    private String entSubscribedPlanName;
    private String entGstin;
    private Integer entConcurrentUserLimit;
}
