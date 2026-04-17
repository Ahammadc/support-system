package com.medicssupport.support.clinical.clinical.model.appointment;

import java.time.LocalDate;
import java.time.LocalTime;
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
@Table(name = "u_appointment") // Replace with actual table name if different
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "appt_rid")
    private Integer apptRid;

    @Column(name = "appt_ent_rid")
    private Integer apptEntRid;

    @Column(name = "appt_unit_rid")
    private Integer apptUnitRid;

    @Column(name = "appt_res_type", length = 1)
    private String apptResType;

    @Column(name = "appt_visit_rid")
    private Integer apptVisitRid;

    @Column(name = "appt_user_num", length = 50)
    private String apptUserNum;

    @Column(name = "appt_type")
    private Integer apptType;

    @Column(name = "appt_status")
    private Integer apptStatus;

    @Column(name = "appt_token", length = 10)
    private String apptToken;

    @Column(name = "appt_token_number")
    private Integer apptTokenNumber;

    @Column(name = "appt_from_date")
    private LocalDate apptFromDate;

    @Column(name = "appt_from_time")
    private LocalTime apptFromTime;

    @Column(name = "appt_arrived_time")
    private LocalTime apptArrivedTime;

    @Column(name = "appt_inprogress_time")
    private LocalTime apptInprogressTime;

    @Column(name = "appt_completed_time")
    private LocalTime apptCompletedTime;

    @Column(name = "appt_billed_time")
    private LocalTime apptBilledTime;

    @Column(name = "appt_order_rid")
    private Integer apptOrderRid;

    @Column(name = "appt_duration")
    private Integer apptDuration;

    @Column(name = "appt_service_rid")
    private Integer apptServiceRid;

    @Column(name = "appt_to_date")
    private LocalDate apptToDate;

    @Column(name = "appt_to_time")
    private LocalTime apptToTime;

    @Column(name = "appt_service_name", length = 256)
    private String apptServiceName;

    @Column(name = "appt_service_point_rid")
    private Integer apptServicePointRid;

    @Column(name = "appt_service_point_name", length = 100)
    private String apptServicePointName;

    @Column(name = "appt_service_provider_rid")
    private Integer apptServiceProviderRid;

    @Column(name = "appt_service_provider_name", length = 100)
    private String apptServiceProviderName;

    @Column(name = "appt_patient_rid")
    private Integer apptPatientRid;

    @Column(name = "appt_patient_name", length = 500)
    private String apptPatientName;

    @Column(name = "appt_patient_phone", length = 150)
    private String apptPatientPhone;

    @Column(name = "appt_patient_mrn", length = 20)
    private String apptPatientMrn;

    @Column(name = "appt_from_datetime")
    private LocalDateTime apptFromDatetime;

    @Column(name = "appt_to_datetime")
    private LocalDateTime apptToDatetime;

    @Column(name = "appt_mod_user_rid")
    private Integer apptModUserRid;

    @Column(name = "appt_mod_datetime")
    private LocalDateTime apptModDatetime;

    @Column(name = "appt_booking_number", length = 50)
    private String apptBookingNumber;

    @Column(name = "appt_visit_status", length = 50)
    private String apptVisitStatus;

    @Column(name = "appt_orders", length = 255)
    private String apptOrders;

    @Column(name = "appt_created_user_rid")
    private Integer apptCreatedUserRid;

    @Column(name = "appt_created_date_time", updatable = false)
    @CreationTimestamp
    private LocalDateTime apptCreatedDateTime;

    @Column(name = "appt_doctor_event_id", length = 100)
    private String apptDoctorEventId;

    @Column(name = "appt_patient_event_id", length = 100)
    private String apptPatientEventId;

    @Column(name = "pat_old_appt_rid")
    private Integer patOldApptRid;

    @Column(name = "appt_payment_id", length = 500)
    private String apptPaymentId;

    @Column(name = "appt_is_video_consultation")
    private Boolean apptIsVideoConsultation;

    @Column(name = "appt_video_consultation_status")
    private Boolean apptVideoConsultationStatus;

    @Column(name = "appt_call_center_booking")
    private Integer apptCallCenterBooking;

    @Column(name = "appt_visit_remarks", length = 500)
    private String apptVisitRemarks;

    @Column(name = "appt_payment_status")
    private Boolean apptPaymentStatus;

    @Column(name = "appt_from_web_appointment")
    private Boolean apptFromWebAppointment;

    @Column(name = "appt_is_recurring")
    private Boolean apptIsRecurring;

    @Column(name = "appt_recurrence_is_indefinite")
    private Boolean apptRecurrenceIsIndefinite;

    @Column(name = "appt_recurrence_root_rid")
    private Integer apptRecurrenceRootRid;

    @Column(name = "appt_reschedule_reason_index")
    private Integer apptRescheduleReasonIndex;

    @Column(name = "appt_cancel_reason_index")
    private Integer apptCancelReasonIndex;
}