package com.medicssupport.support.clinical.clinical.model.patient;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "u_patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pat_rid")
    private Long patRid;

    @Column(name = "pat_ent_rid")
    private Integer patEntRid;

    @Column(name = "pat_mrn")
    private String patMRN;

    @Column(name = "pat_seq_no")
    private Integer patSeqNo;

    @Column(name = "pat_name", nullable = false, length = 500)
    private String patName;

    @Column(name = "pat_full_name", nullable = false, length = 1500)
    private String patFullName;

    @Column(name = "pat_middle_name", nullable = false, length = 500)
    private String patMiddleName;

    @Column(name = "pat_family_name", nullable = false, length = 500)
    private String patFamilyName;

    @Column(name = "pat_gender_index")
    private Integer patGenderIndex;

    @Column(name = "pat_gender_name", length = 15)
    private String patGenderName;

    @Column(name = "pat_caste_index")
    private Integer patCasteIndex;

    @Column(name = "pat_religion_index")
    private Integer patReligionIndex;

    @Column(name = "pat_blood_group_index")
    private Integer patBloodGroupIndex;

    @Column(name = "pat_dob")
    private LocalDate patDob;

    @Column(name = "pat_address", length = 1275)
    private String patAddress;

    @Column(name = "pat_area_rid")
    private Integer patAreaRid;

    @Column(name = "pat_area", length = 100)
    private String patArea;

    @Column(name = "pat_city_index")
    private Integer patCityIndex;

    @Column(name = "pat_city", length = 50)
    private String patCity;

    @Column(name = "pat_state_index")
    private Integer patStateIndex;

    @Column(name = "pat_state", length = 30)
    private String patState;

    @Column(name = "pat_country_index")
    private Integer patCountryIndex;

    @Column(name = "pat_country", length = 30)
    private String patCountry;

    @Column(name = "pat_phone", length = 150)
    private String patPhone;

    @Column(name = "pat_file_path", length = 200)
    private String patFilePath;

    @Column(name = "pat_file_type", length = 200)
    private String patFileType;

    @Column(name = "pat_user_rid")
    private Integer patUserRid;

    @Column(name = "pat_account_rid")
    private Integer patAccountRid;

    @Column(name = "pat_valid")
    private Integer patValid;

    @Column(name = "pat_mod_user_rid")
    private Integer patModUserRid;

    @Column(name = "pat_mod_datetime")
    private LocalDateTime patModDatetime;

    @Column(name = "pat_email", length = 375)
    private String patEmail;

    @Column(name = "pat_title_index")
    private Integer patTitleIndex;

    @Column(name = "pat_title_name", length = 10)
    private String patTitleName;

    @Column(name = "pat_marital_status_index")
    private Integer patMaritalStatusIndex;

    @Column(name = "pat_postal_code", length = 10)
    private String patPostalCode;

    @Column(name = "pat_is_vip")
    private Boolean patIsVip;

    @Column(name = "pat_doc_container_rid")
    private Integer patDocContainerRid;

    @Column(name = "pat_parent_pat_rid")
    private Integer patParentPatRid;

    @Column(name = "pat_computed_dob")
    private LocalDate patComputedDob;

    @Column(name = "pat_create_datetime", nullable = false, updatable = false)
    @CreationTimestamp
    private LocalDateTime patCreateDatetime;

    @Column(name = "pat_is_offline_created")
    private Integer patIsOfflineCreated;

    @Column(name = "pat_provisional_mrn", length = 20)
    private String patProvisionalMrn;

    @Column(name = "pat_type")
    private Integer patType;

    @Column(name = "pat_corporate_rid")
    private Integer patCorporateRid;

    @Column(name = "pat_employee_id", length = 15)
    private String patEmployeeId;

    @Column(name = "pat_has_alert")
    private Boolean patHasAlert;

    @Column(name = "port_id")
    private Integer portId;

    @Column(name = "old_reg_date", nullable = false)
    private LocalDateTime oldRegDate;

    @Column(name = "pat_old_mrn", length = 20)
    private String patOldMrn;

    @Column(name = "pat_is_expired")
    private Integer patIsExpired;

    @Column(name = "pat_merge_patient_rid")
    private Integer patMergePatientRid;

    @Column(name = "pat_temp_mrn", length = 20)
    private String patTempMrn;

    @Column(name = "pat_creation_mode")
    private Integer patCreationMode;

    @Column(name = "pat_temp_online_rid")
    private Integer patTempOnlineRid;

    @Column(name = "pat_registered_datetime")
    private LocalDateTime patRegisteredDatetime;

    @Column(name = "pat_tehsil", length = 50)
    private String patTehsil;

    @Column(name = "pat_is_senior_citizen")
    private Integer patIsSeniorCitizen;

    @Column(name = "pat_district")
    private Integer patDistrict;

    @Column(name = "pat_external_id", length = 150)
    private String patExternalId;

    @Column(name = "pat_is_unknown")
    private Boolean patIsUnknown;

    @Column(name = "pat_marks_for_identification", length = 500)
    private String patMarksForIdentification;

    @Column(name = "port_org_pat_rid")
    private Integer portOrgPatRid;

    @Column(name = "pat_old_appt_rid")
    private Integer patOldApptRid;

    @Column(name = "pat_is_ported")
    private Boolean patIsPorted;

    @Column(name = "pat_enterprise_rid")
    private Integer patEnterpriseRid;

}
