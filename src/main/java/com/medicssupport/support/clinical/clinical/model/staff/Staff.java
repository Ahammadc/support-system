package com.medicssupport.support.clinical.clinical.model.staff;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "u_staff") // Change to your actual table name if different
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Staff {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "staff_rid")
    private Long staffRid;

    @Column(name = "staff_name")
    private String staffName;

    @Column(name = "staff_abbrv")
    private String staffAbbrv;

    @Column(name = "staff_code")
    private String staffCode;

    @Column(name = "staff_address")
    private String staffAddress;

    @Column(name = "staff_city")
    private String staffCity;

    @Column(name = "staff_state")
    private String staffState;

    @Column(name = "staff_country")
    private String staffCountry;

    @Column(name = "staff_category")
    private Integer staffCategory;

    @Column(name = "staff_pan_card_no")
    private String staffPanCardNo;

    @Column(name = "staff_user_rid")
    private Long staffUserRid;

    @Column(name = "staff_patient_rid")
    private Integer staffPatientRid;

    @Column(name = "staff_resource_rid")
    private Integer staffResourceRid;

    @Column(name = "staff_speciality_abbrv")
    private String staffSpecialityAbbrv;

    @Column(name = "staff_entity_rid")
    private Long staffEntityRid;

    @Column(name = "staff_unit_rid")
    private Integer staffUnitRid;

    @Column(name = "staff_doj")
    private LocalDate staffDoj;

    @Column(name = "staff_dol")
    private LocalDate staffDol;

    @Column(name = "staff_contract_from")
    private LocalDate staffContractFrom;

    @Column(name = "staff_contract_to")
    private LocalDate staffContractTo;

    @Column(name = "staff_valid")
    private Boolean staffValid;

    @Column(name = "staff_mod_user_rid")
    private Long staffModUserRid;

    @Column(name = "staff_mod_datetime")
    private LocalDateTime staffModDatetime;

    @Column(name = "staff_row_invalidated")
    private Boolean staffRowInvalidated;

    @Column(name = "staff_compensation")
    private Float staffCompensation;

    @Column(name = "staff_is_consultant")
    private Integer staffIsConsultant;

    @Column(name = "staff_is_ext_doctor")
    private Integer staffIsExtDoctor;

    @Column(name = "staff_can_refer")
    private Integer staffCanRefer;

    @Column(name = "staff_ref_rid")
    private Integer staffRefRid;

    @Column(name = "staff_is_admitting_doctor")
    private Integer staffIsAdmittingDoctor;

    @Column(name = "staff_is_primary_admit_doc")
    private Integer staffIsPrimaryAdmitDoc;

    @Column(name = "staff_designation_index")
    private Integer staffDesignationIndex;

    @Column(name = "staff_designation")
    private String staffDesignation;

    @Column(name = "staff_qualification")
    private String staffQualification;

    @Column(name = "staff_registration_num")
    private String staffRegistrationNum;

    @Column(name = "staff_first_consultation_fee")
    private Float staffFirstConsultationFee;

    @Column(name = "staff_follow_up_cons_fee")
    private Float staffFollowUpConsFee;

    @Column(name = "staff_created_datetime", insertable = false, updatable = false)
    private LocalDateTime staffCreatedDatetime;

    @Column(name = "staff_has_multi_loc_access")
    private Integer staffHasMultiLocAccess;

    @Column(name = "staff_sub_category_index")
    private Integer staffSubCategoryIndex;

    @Column(name = "staff_speciality_index")
    private Integer staffSpecialityIndex;

    @Column(name = "staff_speciality_name")
    private String staffSpecialityName;

    @Column(name = "staff_secondary_speciality_index")
    private Integer staffSecondarySpecialityIndex;

    @Column(name = "staff_secondary_speciality_name")
    private String staffSecondarySpecialityName;

    @Column(name = "staff_tertiary_speciality_index")
    private Integer staffTertiarySpecialityIndex;

    @Column(name = "staff_tertiary_speciality_name")
    private String staffTertiarySpecialityName;

    @Column(name = "staff_to_be_rostered")
    private Integer staffToBeRostered;

    @Column(name = "port_staff_id")
    private Integer portStaffId;

    @Column(name = "staff_email_id")
    private String staffEmailId;

    @Column(name = "staff_mobile")
    private String staffMobile;

    @Column(name = "staff_eligibility_rid")
    private Integer staffEligibilityRid;

    @Column(name = "staff_is_schedulable")
    private Integer staffIsSchedulable;

    @Column(name = "staff_dummy_1")
    private Integer staffDummy1;

    @Column(name = "staff_bank_acc_no")
    private String staffBankAccNo;

    @Column(name = "staff_max_consultation_no")
    private Integer staffMaxConsultationNo;

    @Lob
    @Column(name = "staff_digital_signature")
    private String staffDigitalSignature;

    @Column(name = "staff_title")
    private Integer staffTitle;

    @Column(name = "staff_parent_rid")
    private Integer staffParentRid;

    @Column(name = "staff_payment_method")
    private Integer staffPaymentMethod;

    @Column(name = "staff_credit_period")
    private Integer staffCreditPeriod;

    @Column(name = "staff_bank_name")
    private String staffBankName;

    @Column(name = "staff_bank_branch")
    private String staffBankBranch;

    @Column(name = "staff_ifsc_code")
    private String staffIfscCode;

    @Column(name = "staff_is_system_defined")
    private Integer staffIsSystemDefined;

    @Column(name = "staff_account_number")
    private String staffAccountNumber;

    @Column(name = "staff_is_service_provider")
    private Integer staffIsServiceProvider;

    @Column(name = "staff_update_my_appt_to_gcal")
    private Boolean staffUpdateMyApptToGcal;

    @Column(name = "port_staff_u_rid")
    private Integer portStaffURid;

    @Column(name = "staff_manually_ported")
    private Integer staffManuallyPorted;

    @Column(name = "staff_old_unit_rid")
    private Integer staffOldUnitRid;

    @Column(name = "staff_old_staff_rid")
    private Integer staffOldStaffRid;

    @Column(name = "staff_name_in_reginal_font")
    private String staffNameInReginalFont;

    @Column(name = "staff_type_index")
    private Integer staffTypeIndex;

    @Column(name = "staff_free_visit_count")
    private Integer staffFreeVisitCount;

    @Column(name = "staff_free_visit_validity")
    private Integer staffFreeVisitValidity;

    @Column(name = "staff_is_required_consultation_fee")
    private Integer staffIsRequiredConsultationFee;

    @Column(name = "staff_is_required_consultation_fee_ip")
    private Integer staffIsRequiredConsultationFeeIp;

    @Column(name = "staff_free_visit_count_ip")
    private Integer staffFreeVisitCountIp;

    @Column(name = "staff_free_visit_validity_ip")
    private Integer staffFreeVisitValidityIp;

    @Column(name = "staff_is_schedulable_online")
    private Integer staffIsSchedulableOnline;

    @Column(name = "staff_reporting_time")
    private Integer staffReportingTime;

    @Column(name = "staff_external_id")
    private String staffExternalId;

    @Column(name = "staff_can_perform_video_consultation")
    private Integer staffCanPerformVideoConsultation;

    @Column(name = "staff_can_handle_covid_patients")
    private Integer staffCanHandleCovidPatients;

    @Column(name = "staff_grade_index")
    private Integer staffGradeIndex;

    @Column(name = "staff_is_user")
    private Integer staffIsUser;

    @Column(name = "staff_old_rid")
    private Integer staffOldRid;

    @Column(name = "staff_token_prefix")
    private String staffTokenPrefix;

    @Lob
    @Column(name = "staff_past_experience")
    private String staffPastExperience;

    @Lob
    @Column(name = "staff_description")
    private String staffDescription;

    @Column(name = "staff_nic_speciality_rid")
    private Integer staffNicSpecialityRid;

    @Column(name = "staff_is_remote_user")
    private Integer staffIsRemoteUser;
}