package com.medicssupport.support.clinical.investigation.transaction.model.service_order;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceOrderDTO {

    private Integer soRid;
    private Integer soAgainstUnitRid;
    private Integer soPatientRid;
    private Integer soVisitRid;
    private Integer soOrderingUnitRid;
    private String soOrderNo;
    private Short soOrderType;
    private Integer soItemId;
    private String soItemName;
    private LocalDate soStartDate;
    private LocalTime soStartTime;
    private Float soQty;
    private Short soStatus;
    private LocalDateTime soStatusModDatetime;
    private Integer soProcessingUnitRid;
    private Integer soSampleCollectingUnit;
    private LocalDateTime soOrderDate;
    private Integer soAttndDocRid;
    private Integer soOrderDocRid;
    private Integer soRecodedUserRid;
    private Integer soProcessedBy;
    private LocalDate soProcessedDate;
    private LocalTime soProcessedTime;
    private String soProcessingComments;
    private Short soPriority;
    private Integer soResultRid;
    private LocalDateTime soResultDatetime;
    private Integer soScheduleRid;
    private Short soSerMode;
    private String soCancellationReason;
    private String soRemarks;
    private Integer soItemCategory;
    private Short soIsHeader;
    private Integer soParentRid;
    private Integer soRootParentId;
    private Integer soSignedUserRid;
    private Integer soCoSignedUserRid;
    private LocalDateTime soSignedDatetime;
    private Integer soRecurrenceID;
    private String soRecurrenceSpan;
    private Integer soOccurencesTotal;
    private Integer soOccurGenerated;
    private String soRecurrenceText;
    private Integer soModifiedUserRid;
    private LocalDateTime soModifiedDatetime;
    private Short soMajorProcedureStatus;
    private Integer soDuration;
    private String soCtxt;
    private Integer soExceptionId;
    private Integer soExtSerProviderRid;
    private Double soExtSerProviderPrice;
    private Integer soState;
    private String soDetailText;
    private Integer soAdvisedUserRid;
    private LocalDateTime soAdvisedDatetime;
    private Integer soConvertedUserRid;
    private LocalDateTime soConvertedDatetime;
    private Integer soIsScheduled;
    private Short soProcedureType;
    private String soDisplayStr;
    private Integer soAssoPdRid;
    private Boolean soInitiatedBy;
    private Integer soPerformingDoctor;
    private Boolean soNotifyDoctorOnCompletion;
    private Float soPrice;
    private Integer soSessionRid;
    private Short isModalitySent;
    private Integer soEstLenOfStayInHospital;
    private String soTokenNo;
    private Integer soIsTokenNumberReassigned;
    private Integer soTokenInstanceRid;
    private LocalDateTime soOverdueDatetime;
    private Integer soOrderingPiRid;
}
