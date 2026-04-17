package com.medicssupport.support.clinical.clinical.model.admission_request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "u_admission_request")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdmissionRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "req_rid")
    private Integer reqRid;

    @Column(name = "req_entity_rid")
    private Integer reqEntityRid;

    @Column(name = "req_unit_rid")
    private Integer reqUnitRid;

    @Column(name = "req_patient_rid")
    private Integer reqPatientRid;

    @Column(name = "req_patient_name")
    private String reqPatientName;

    @Column(name = "req_patient_phone")
    private String reqPatientPhone;

    @Column(name = "req_ref_visit_rid")
    private Integer reqRefVisitRid;

    @Column(name = "req_from_visit_rid")
    private Integer reqFromVisitRid;

    @Column(name = "req_reason", length = 5000)
    private String reqReason;

    @Column(name = "req_reason_index")
    private Integer reqReasonIndex;

    @Column(name = "req_bed_type_rid")
    private Integer reqBedTypeRid;

    @Column(name = "req_patient_category")
    private String reqPatientCategory;

    @Column(name = "req_service_rid")
    private Integer reqServiceRid;

    @Column(name = "req_service_name")
    private String reqServiceName;

    @Column(name = "req_doctor_rid")
    private Integer reqDoctorRid;

    @Column(name = "req_surgeon_rid")
    private Integer reqSurgeonRid;

    @Column(name = "req_days_of_stay")
    private String reqDaysOfStay;

    @Column(name = "req_preferred_service_date")
    private LocalDate reqPreferredServiceDate;

    @Column(name = "req_duration")
    private Integer reqDuration;

    @Column(name = "req_admission_datetime")
    private LocalDateTime reqAdmissionDatetime;

    @Column(name = "req_service_datetime")
    private LocalDateTime reqServiceDatetime;

    @Column(name = "req_service_point_rid")
    private Integer reqServicePointRid;

    @Column(name = "req_remarks")
    private String reqRemarks;

    @Column(name = "req_status")
    private Short reqStatus;

    @Column(name = "req_state")
    private Integer reqState;

    @Column(name = "req_mod_user_rid")
    private Integer reqModUserRid;

    @Column(name = "req_mod_datetime")
    private LocalDateTime reqModDatetime;

    @Column(name = "req_package_rid")
    private Integer reqPackageRid;

    @Column(name = "req_appt_rid")
    private Integer reqApptRid;

    @Column(name = "req_procedure_order_rid")
    private Integer reqProcedureOrderRid;

    @Column(name = "req_eye_type")
    private Boolean reqEyeType;

    @Column(name = "req_discount_request_rid")
    private Float reqDiscountRequestRid;

    @Column(name = "req_advised_by")
    private Integer reqAdvisedBy;

    @Column(name = "req_referral_entity_rid")
    private Integer reqReferralEntityRid;

    @Column(name = "req_fin_voucher_no")
    private String reqFinVoucherNo;

    @Column(name = "req_fin_apprv_rid")
    private Integer reqFinApprvRid;

    @Column(name = "req_fin_remark")
    private String reqFinRemark;

    @Column(name = "req_request_type")
    private Integer reqRequestType;

    @Column(name = "req_speciality_index")
    private Integer reqSpecialityIndex;

    @Column(name = "req_requested_by")
    private Integer reqRequestedBy;

    @Column(name = "req_cancellation_reason")
    private String reqCancellationReason;

    @Column(name = "req_diag_rid")
    private Integer reqDiagRid;

    @Column(name = "req_recorded_user_rid")
    private Integer reqRecordedUserRid;

    @Column(name = "req_recorded_datetime")
    private LocalDateTime reqRecordedDatetime;

    @Column(name = "req_cancelled_by")
    private Integer reqCancelledBy;

    @Column(name = "req_cancellation_datetime")
    private LocalDateTime reqCancellationDatetime;

    @Column(name = "req_proc_req_pi_rid")
    private Integer reqProcReqPiRid;

    @Column(name = "req_ot_slot_no")
    private Integer reqOtSlotNo;

    @Column(name = "req_ot_booking_no")
    private String reqOtBookingNo;

    @Column(name = "req_surgery_date")
    private LocalDate reqSurgeryDate;

    @Column(name = "req_surgery_time")
    private LocalTime reqSurgeryTime;

    @Column(name = "req_pacs_completed")
    private Integer reqPacsCompleted;

    @Column(name = "req_cancelled_from")
    private Short reqCancelledFrom;

    @Column(name = "req_admitting_advance")
    private Double reqAdmittingAdvance;

    @Column(name = "req_booking_advance")
    private Double reqBookingAdvance;

    @Column(name = "req_approved_discount")
    private Double reqApprovedDiscount;
}