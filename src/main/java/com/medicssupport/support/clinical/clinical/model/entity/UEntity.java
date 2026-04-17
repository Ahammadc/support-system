package com.medicssupport.support.clinical.clinical.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "u_entity")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ent_rid")
    private Integer entRid;

    @Column(name = "ent_code", length = 50, unique = true)
    private String entCode;

    @Column(name = "ent_type")
    private Integer entType;

    @Column(name = "ent_name", length = 100)
    private String entName;

    @Column(name = "ent_remarks", length = 1024)
    private String entRemarks;

    @Column(name = "ent_street", length = 255)
    private String entStreet;

    @Column(name = "ent_city", length = 100)
    private String entCity;

    @Column(name = "ent_state", length = 100)
    private String entState;

    @Column(name = "ent_country", length = 50)
    private String entCountry;

    @Column(name = "ent_pin_code", length = 10)
    private String entPinCode;

    @Column(name = "ent_region_index")
    private Integer entRegionIndex;

    @Column(name = "ent_region_name", length = 50)
    private String entRegionName;

    @Column(name = "ent_phone", length = 100)
    private String entPhone;

    @Column(name = "ent_mobile", length = 15)
    private String entMobile;

    @Column(name = "ent_mail", length = 50)
    private String entMail;

    @Column(name = "ent_account_rid")
    private Integer entAccountRid;

    @Column(name = "ent_parent_rid")
    private Integer entParentRid;

    @Column(name = "ent_path")
    private BigDecimal entPath;

    @Column(name = "ent_registered")
    private Boolean entRegistered;

    @Column(name = "ent_reg_datetime")
    private LocalDateTime entRegDatetime;

    @Column(name = "ent_unreg_datetime")
    private LocalDateTime entUnregDatetime;

    @Column(name = "ent_short_name", length = 50)
    private String entShortName;

    @Column(name = "ent_display_address", length = 200)
    private String entDisplayAddress;

    @Column(name = "ent_root_parent_rid")
    private Integer entRootParentRid;

    @Column(name = "ent_tax_code", length = 30)
    private String entTaxCode;

    @Column(name = "ent_cin_no", length = 50)
    private String entCinNo;

    @Column(name = "ent_lt_no", length = 50)
    private String entLtNo;

    @Column(name = "ent_timezone", length = 100)
    private String entTimezone;

    @Column(name = "ent_landmarks", length = 256)
    private String entLandmarks;

    @Column(name = "ent_map_geographic_points", length = 1000)
    private String entMapGeographicPoints;

    @Column(name = "ent_hospital_reg_no", length = 30)
    private String entHospitalRegNo;

    @Column(name = "ent_ft_rid")
    private Integer entFtRid;

    @Column(name = "ent_model_rid")
    private Integer entModelRid;

    @Column(name = "ent_facility_type_rid")
    private Integer entFacilityTypeRid;

    @Column(name = "ent_district")
    private Integer entDistrict;

    @Column(name = "ent_locale_language_code", length = 10)
    private String entLocaleLanguageCode;

    @Column(name = "ent_locale_country_code", length = 10)
    private String entLocaleCountryCode;

    @Column(name = "ent_service_tax_no")
    private Integer entServiceTaxNo;

    @Column(name = "ent_desktop", length = 100)
    private String entDesktop;

    @Column(name = "ent_gc_rid")
    private Integer entGcRid;

    @Column(name = "ent_created_user_rid")
    private Integer entCreatedUserRid;

    @Column(name = "ent_subscription_due_from")
    private LocalDate entSubscriptionDueFrom;

    @Column(name = "ent_is_demo")
    private Integer entIsDemo;

    @Column(name = "ent_is_on_trial_mode")
    private Integer entIsOnTrialMode;

    @Column(name = "ent_switched_to_live_datetime")
    private LocalDateTime entSwitchedToLiveDatetime;

    @Column(name = "ent_mart_id", length = 100)
    private String entMartId;

    @Column(name = "ent_is_unassigned")
    private Boolean entIsUnassigned;

    @Column(name = "ent_payment_count")
    private Integer entPaymentCount;

    @Column(name = "ent_subscribed_till_date")
    private LocalDate entSubscribedTillDate;

    @Column(name = "ent_subscribed_from_date")
    private LocalDate entSubscribedFromDate;

    @Column(name = "ent_subscribed_plan_code", length = 50)
    private String entSubscribedPlanCode;

    @Column(name = "ent_subscribed_plan_name", length = 50)
    private String entSubscribedPlanName;

    @Column(name = "ent_gstin", length = 30)
    private String entGstin;

    @Column(name = "ent_concurrent_user_limit")
    private Integer entConcurrentUserLimit;
}