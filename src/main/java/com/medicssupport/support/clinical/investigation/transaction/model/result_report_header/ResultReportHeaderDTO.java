package com.medicssupport.support.clinical.investigation.transaction.model.result_report_header;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultReportHeaderDTO {

    private Integer rptRid;
    private LocalDateTime rptDate;
    private LocalDateTime rptSignedDateTime;
    private Integer rptUserId;
    private String rptUserName;
    private Short rptType;
    private Integer rptUnit;
    private Integer rptSignedUserId;
    private String rptSignedUserName;
    private String rptReportNo;
    private String rptResultDescription;
    private Short rptStatus;
    private Integer rptIssuedUserRid;
    private String rptIssuedUserName;
    private LocalDateTime rptIssueDatetime;
    private Integer rptCheckedUserRid;
    private String rptCheckedUserName;
    private Integer rptState;
    private Integer rptEntityRid;
    private Integer rptHistoryRefRid;
    private LocalDateTime rptModDatetime;
    private Integer rptModUserRid;
    private Integer rptInvalidated;
    private Integer rptPatientWaiting;
    private Integer rptReportSeen;
    private String rptComments;
    private Short rptIsPanicReport;
    private Short rptIsCounselingDone;
    private Integer rptDocTempRid;
    private Long rptDocumentRid;
}
