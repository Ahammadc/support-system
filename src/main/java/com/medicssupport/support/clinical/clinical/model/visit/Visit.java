package com.medicssupport.support.clinical.clinical.model.visit;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "uh_visit")
public class Visit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "visit_rid")
    private Integer visitRid;

    @Column(name = "visit_id", length = 20)
    private String visitId;

    @Column(name = "visit_type_index")
    private Integer visitTypeIndex;

    @Column(name = "visit_subtype_index")
    private Integer visitSubtypeIndex;

    @Column(name = "visit_patient_type")
    private Integer visitPatientType;

    @Column(name = "visit_patient_rid")
    private Integer visitPatientRid;

    @Column(name = "visit_patient_category")
    private Integer visitPatientCategory;

    @Column(name = "visit_episode_rid")
    private Integer visitEpisodeRid;

    @Column(name = "visit_reason", length = 600)
    private String visitReason;

    @Column(name = "visit_reason_index")
    private Integer visitReasonIndex;

    @Column(name = "visit_unit_rid")
    private Integer visitUnitRid;

    @Column(name = "visit_entity_rid")
    private Integer visitEntityRid;

    @Column(name = "visit_appt_rid")
    private Integer visitApptRid;

    @Column(name = "visit_admission_request_rid")
    private Integer visitAdmissionRequestRid;

    @Column(name = "visit_time")
    private LocalTime visitTime;

    @Column(name = "visit_date")
    private LocalDate visitDate;

    @Column(name = "visit_patient_age")
    private Integer visitPatientAge;

    @Column(name = "visit_patient_age_unit", length = 10)
    private String visitPatientAgeUnit;

    @Column(name = "visit_mod_user_rid")
    private Integer visitModUserRid;

    @Column(name = "visit_mod_datetime")
    private LocalDateTime visitModDatetime;

    @Column(name = "visit_payer_rid")
    private Integer visitPayerRid;

    @Column(name = "visit_policy_rid")
    private Integer visitPolicyRid;

    @Column(name = "visit_policy_number", length = 20)
    private String visitPolicyNumber;

    @Column(name = "visit_consulting_doctor")
    private Integer visitConsultingDoctor;

    @Column(name = "visit_consultation_start_datetime")
    private LocalDateTime visitConsultationStartDatetime;

    @Column(name = "visit_attending_doctor")
    private Integer visitAttendingDoctor;

    @Column(name = "visit_referral_type")
    private Integer visitReferralType;

    @Column(name = "visit_referral_rid")
    private Integer visitReferralRid;

    @Column(name = "visit_doctor_analysis", length = 300)
    private String visitDoctorAnalysis;

    @Column(name = "visit_estimated_len_of_stay", length = 50)
    private String visitEstimatedLenOfStay;

    @Column(name = "visit_container_rid")
    private Integer visitContainerRid;

    @Column(name = "visit_status")
    private Integer visitStatus;

    @Column(name = "visit_state")
    private Integer visitState;

    @Column(name = "visit_treatmentplan", length = 200)
    private String visitTreatmentplan;

    @Column(name = "visit_discharge_date")
    private LocalDate visitDischargeDate;

    @Column(name = "visit_discharge_time")
    private LocalTime visitDischargeTime;

    @Column(name = "visit_discharge_reason", length = 100)
    private String visitDischargeReason;

    @Column(name = "visit_billing_bedtype_rid")
    private Integer visitBillingBedtypeRid;

    @Column(name = "visit_procedure_rid")
    private Integer visitProcedureRid;

    @Column(name = "visit_procedure_name", length = 255)
    private String visitProcedureName;

    @Column(name = "visit_surgeon_rid")
    private Integer visitSurgeonRid;

    @Column(name = "visit_jt_admit_doc1_rid")
    private Integer visitJtAdmitDoc1Rid;

    @Column(name = "visit_jt_admit_doc2_rid")
    private Integer visitJtAdmitDoc2Rid;

    @Column(name = "visit_arrived_date_time")
    private LocalDateTime visitArrivedDateTime;

    @Column(name = "visit_referral_name", length = 100)
    private String visitReferralName;

    @Column(name = "visit_ready_for_discharge")
    private Integer visitReadyForDischarge;

    @Column(name = "visit_mfd_date_time")
    private LocalDateTime visitMfdDateTime;

    @Column(name = "visit_referral_patient_mrn", length = 20)
    private String visitReferralPatientMrn;

    @Column(name = "visit_final_bill")
    private Boolean visitFinalBill;

    @Column(name = "visit_created_user_rid")
    private Integer visitCreatedUserRid;

    @Column(name = "visit_create_datetime", insertable = false, updatable = false)
    private LocalDateTime visitCreateDatetime;

    @Column(name = "visit_adm_req_rid")
    private Integer visitAdmReqRid;

    @Column(name = "VISIT_SEALED")
    private Integer visitSealed;

    @Column(name = "visit_token_sequence_number")
    private Integer visitTokenSequenceNumber;

    @Column(name = "visit_token_number", length = 255)
    private String visitTokenNumber;

    @Column(name = "visit_authorised_by")
    private Integer visitAuthorisedBy;

    @Column(name = "visit_remarks", length = 100)
    private String visitRemarks;

    @Column(name = "visit_gop_required")
    private Boolean visitGopRequired;

    @Column(name = "visit_pre_consultation_required")
    private Integer visitPreConsultationRequired;

    @Column(name = "visit_discharge_doc")
    private Integer visitDischargeDoc;

    @Column(name = "visit_pat_is_pregnant")
    private Boolean visitPatIsPregnant;

    @Column(name = "visit_is_mlc")
    private Short visitIsMlc;

    @Column(name = "visit_mlc_case_number", length = 20)
    private String visitMlcCaseNumber;

    @Column(name = "visit_mlc_registered_with", length = 50)
    private String visitMlcRegisteredWith;

    @Column(name = "visit_mlc_batch_no", length = 150)
    private String visitMlcBatchNo;

    @Column(name = "visit_mlc_reason", length = 200)
    private String visitMlcReason;

    @Column(name = "visit_current_unit_rid")
    private Integer visitCurrentUnitRid;

    @Column(name = "visit_billing_clearance_date_time")
    private LocalDateTime visitBillingClearanceDateTime;

    @Column(name = "visit_is_high_priority")
    private Integer visitIsHighPriority;

    @Column(name = "visit_is_vip_patient")
    private Integer visitIsVipPatient;

    @Column(name = "visit_merge_patient_rid")
    private Integer visitMergePatientRid;

    @Column(name = "visit_sequence_number")
    private Integer visitSequenceNumber;

    @Column(name = "visit_location_rid")
    private Integer visitLocationRid;

    @Column(name = "visit_mlc_category")
    private Integer visitMlcCategory;

    @Column(name = "visit_discharge_adv_doc_rid")
    private Integer visitDischargeAdvDocRid;

    @Column(name = "visit_final_bill_datetime")
    private LocalDateTime visitFinalBillDatetime;

    @Column(name = "visit_acutal_discharge_date_time")
    private LocalDateTime visitAcutalDischargeDateTime;

    @Column(name = "visit_creation_mode")
    private Integer visitCreationMode;

    @Column(name = "visit_temp_online_rid")
    private Integer visitTempOnlineRid;

    @Column(name = "visit_mlc_name", length = 50)
    private String visitMlcName;

    @Column(name = "visit_mlc_designation", length = 100)
    private String visitMlcDesignation;

    @Column(name = "visit_mlc_patcompanion", length = 100)
    private String visitMlcPatcompanion;

    @Column(name = "visit_mlc_relation")
    private Integer visitMlcRelation;

    @Column(name = "visit_pat_cat_rid")
    private Integer visitPatCatRid;

    @Column(name = "visit_pat_cat_desc", length = 50)
    private String visitPatCatDesc;

    @Column(name = "visit_lr_no", length = 15)
    private String visitLrNo;

    @Column(name = "visit_proc_inst_rid")
    private Integer visitProcInstRid;

    @Column(name = "visit_mod_proc_inst_rid")
    private Integer visitModProcInstRid;

    @Column(name = "visit_mlr_rid")
    private Integer visitMlrRid;

    @Column(name = "visit_ref_rid")
    private Integer visitRefRid;

    @Column(name = "visit_recipient_pat_rid")
    private Integer visitRecipientPatRid;

    @Column(name = "visit_recipient_incident_rid")
    private Integer visitRecipientIncidentRid;

    @Column(name = "visit_referredto_rid")
    private Integer visitReferredtoRid;

    @Column(name = "visit_referredto_name", length = 500)
    private String visitReferredtoName;

    @Column(name = "visit_referral_source_rid")
    private Integer visitReferralSourceRid;

    @Column(name = "visit_referral_source_name", length = 100)
    private String visitReferralSourceName;

    @Column(name = "visit_source_type_rid")
    private Integer visitSourceTypeRid;

    @Column(name = "pat_is_ported_wo_visit_data")
    private Integer patIsPortedWoVisitData;

    @Column(name = "visit_old_appt_rid")
    private Integer visitOldApptRid;

    @Column(name = "visit_free_remaining_count")
    private Integer visitFreeRemainingCount;

    @Column(name = "visit_free_visit_valid_till")
    private LocalDate visitFreeVisitValidTill;

    @Column(name = "visit_actual_discharge_datetime")
    private LocalDateTime visitActualDischargeDatetime;

    @Column(name = "visit_actual_mfd_datetime")
    private LocalDateTime visitActualMfdDatetime;

    @Column(name = "visit_is_online")
    private Boolean visitIsOnline;

    @Column(name = "port_visit_id")
    private Integer portVisitId;

    @Column(name = "visit_department_clearance_done")
    private Boolean visitDepartmentClearanceDone;

    @Column(name = "visit_purpose")
    private Integer visitPurpose;

    @Column(name = "visit_referral_code", length = 20)
    private String visitReferralCode;
}
