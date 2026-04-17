package com.medicssupport.support.clinical.clinical.model.admission_request;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdmissionRequestDTO {
    private Integer reqRid;
    private Integer reqEntityRid;
    private Integer reqUnitRid;
    private Integer reqPatientRid;
    private String reqPatientName;
    private String reqPatientPhone;
    private Integer reqRefVisitRid;
    private Integer reqFromVisitRid;
    private String reqReason;
    private Integer reqReasonIndex;
    private Integer reqBedTypeRid;
    private String reqPatientCategory;
    private Integer reqServiceRid;
    private String reqServiceName;
    private Integer reqDoctorRid;
    private Integer reqSurgeonRid;
    private String reqDaysOfStay;
    private LocalDate reqPreferredServiceDate;
    private Integer reqDuration;
    private LocalDateTime reqAdmissionDatetime;
    private LocalDateTime reqServiceDatetime;
    private Integer reqServicePointRid;
    private String reqRemarks;
    private Short reqStatus;
    private Integer reqState;
    private Integer reqModUserRid;
    private LocalDateTime reqModDatetime;
    private Integer reqPackageRid;
    private Integer reqApptRid;
    private Integer reqProcedureOrderRid;
    private Boolean reqEyeType;
    private Float reqDiscountRequestRid;
    private Integer reqAdvisedBy;
    private Integer reqReferralEntityRid;
    private String reqFinVoucherNo;
    private Integer reqFinApprvRid;
    private String reqFinRemark;
    private Integer reqRequestType;
    private Integer reqSpecialityIndex;
    private Integer reqRequestedBy;
    private String reqCancellationReason;
    private Integer reqDiagRid;
    private Integer reqRecordedUserRid;
    private LocalDateTime reqRecordedDatetime;
    private Integer reqCancelledBy;
    private LocalDateTime reqCancellationDatetime;
    private Integer reqProcReqPiRid;
    private Integer reqOtSlotNo;
    private String reqOtBookingNo;
    private LocalDate reqSurgeryDate;
    private LocalTime reqSurgeryTime;
    private Integer reqPacsCompleted;
    private Short reqCancelledFrom;
    private Double reqAdmittingAdvance;
    private Double reqBookingAdvance;
    private Double reqApprovedDiscount;
}
