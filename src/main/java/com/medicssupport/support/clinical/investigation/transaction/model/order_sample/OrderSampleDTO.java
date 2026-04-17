package com.medicssupport.support.clinical.investigation.transaction.model.order_sample;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderSampleDTO {

    private Integer smRid;
    private String smId;
    private Integer smType;
    private String smName;
    private Integer smPtRid;
    private Integer smContainerRid;
    private Integer smResultRid;
    private Integer smSerCenterRid;
    private Integer smDeviceRid;
    private Integer smPriority;
    private Integer smStatus;
    private String smRemarks;
    private Integer smUnitRid;
    private LocalDateTime smDatetime;
    private Integer smModUser;
    private LocalDateTime smModDatetime;
    private Integer smAcceptanceStatus;
    private Integer smState;
    private byte[] smImageBytes;
    private Integer smCreatedUserRid;
    private LocalDateTime smCreatedDatetime;
    private Integer smModUserRid;
    private Integer smInvalidated;
    private Integer smHistoryRefRid;
    private LocalDate smCollectionDate;
    private String smRejectionReason;
    private Integer smRejectedBy;
    private String smContainerColor;
    private LocalDate smSendDateForExtTests;
    private Integer smCollectionStaffRid;
    private Integer smVisitRid;
    private LocalDate smAcceptanceDate;
    private LocalTime smAcceptanceTime;
    private Integer smAcceptanceUserRid;
    private LocalDateTime smCollectionDatetime;
    private LocalTime smCollectionTime;
    private Integer smIsFastingCollection;
    private Integer smEntityRid;
    private String smGridId;
    private String smExtLabId;
    private Integer smIsExtAccepted;
    private Integer smBodyLocationIndex;
    private String smBodyLocation;
}
