package com.medicssupport.support.clinical.clinical.model.appointment;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppointmentDTO {

    private Integer apptRid;
    private Integer apptEntRid;
    private Integer apptUnitRid;
    private String apptResType;
    private Integer apptVisitRid;
    private String apptUserNum;
    private Integer apptType;
    private Integer apptStatus;
    private String apptToken;
    private Integer apptTokenNumber;
    private LocalDate apptFromDate;
    private LocalTime apptFromTime;
    private LocalTime apptArrivedTime;
    private LocalTime apptInprogressTime;
    private LocalTime apptCompletedTime;
    private LocalTime apptBilledTime;
    private Integer apptOrderRid;
    private Integer apptDuration;
    private Integer apptServiceRid;
    private LocalDate apptToDate;
    private LocalTime apptToTime;
    private String apptServiceName;
    private Integer apptServicePointRid;
    private String apptServicePointName;
    private Integer apptServiceProviderRid;
    private String apptServiceProviderName;
    private Integer apptPatientRid;
    private String apptPatientName;
    private String apptPatientPhone;
    private String apptPatientMrn;
    private LocalDateTime apptFromDatetime;
    private LocalDateTime apptToDatetime;
    private Integer apptModUserRid;
    private LocalDateTime apptModDatetime;
    private String apptBookingNumber;
    private String apptVisitStatus;
    private String apptOrders;
    private Integer apptCreatedUserRid;
    private LocalDateTime apptCreatedDateTime;
    private String apptDoctorEventId;
    private String apptPatientEventId;
    private Integer patOldApptRid;
    private String apptPaymentId;
    private Boolean apptIsVideoConsultation;
    private Boolean apptVideoConsultationStatus;
    private Integer apptCallCenterBooking;
    private String apptVisitRemarks;
    private Boolean apptPaymentStatus;
    private Boolean apptFromWebAppointment;
    private Boolean apptIsRecurring;
    private Boolean apptRecurrenceIsIndefinite;
    private Integer apptRecurrenceRootRid;
    private Integer apptRescheduleReasonIndex;
    private Integer apptCancelReasonIndex;
}
