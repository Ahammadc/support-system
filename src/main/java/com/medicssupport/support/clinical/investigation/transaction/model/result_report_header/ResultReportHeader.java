package com.medicssupport.support.clinical.investigation.transaction.model.result_report_header;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "uh_result_report_header")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultReportHeader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rpt_rid")
    private Integer rptRid;

    @Column(name = "rpt_date")
    private LocalDateTime rptDate;

    @Column(name = "rpt_signed_date_time")
    private LocalDateTime rptSignedDateTime;

    @Column(name = "rpt_user_id")
    private Integer rptUserId;

    @Column(name = "rpt_user_name", length = 50)
    private String rptUserName;

    @Column(name = "rpt_type")
    private Short rptType;

    @Column(name = "rpt_unit")
    private Integer rptUnit;

    @Column(name = "rpt_signed_user_id")
    private Integer rptSignedUserId;

    @Column(name = "rpt_signed_user_name", length = 50)
    private String rptSignedUserName;

    @Column(name = "rpt_report_no", length = 20)
    private String rptReportNo;

    @Column(name = "rpt_result_description", length = 1000)
    private String rptResultDescription;

    @Column(name = "rpt_status")
    private Short rptStatus;

    @Column(name = "rpt_issued_user_rid")
    private Integer rptIssuedUserRid;

    @Column(name = "rpt_issued_user_name", length = 50)
    private String rptIssuedUserName;

    @Column(name = "rpt_issue_datetime")
    private LocalDateTime rptIssueDatetime;

    @Column(name = "rpt_checked_user_rid")
    private Integer rptCheckedUserRid;

    @Column(name = "rpt_checked_user_name", length = 50)
    private String rptCheckedUserName;

    @Column(name = "rpt_state")
    private Integer rptState;

    @Column(name = "rpt_entity_rid")
    private Integer rptEntityRid;

    @Column(name = "rpt_history_ref_rid")
    private Integer rptHistoryRefRid;

    @Column(name = "rpt_mod_datetime")
    private LocalDateTime rptModDatetime;

    @Column(name = "rpt_mod_user_rid")
    private Integer rptModUserRid;

    @Column(name = "rpt_invalidated")
    private Integer rptInvalidated;

    @Column(name = "rpt_patient_waiting")
    private Integer rptPatientWaiting;

    @Column(name = "rpt_report_seen")
    private Integer rptReportSeen;

    @Column(name = "rpt_comments", length = 1000)
    private String rptComments;

    @Column(name = "rpt_is_panic_report")
    private Short rptIsPanicReport;

    @Column(name = "rpt_is_counseling_done")
    private Short rptIsCounselingDone;

    @Column(name = "rpt_doc_temp_rid")
    private Integer rptDocTempRid;

    @Column(name = "rpt_document_rid")
    private Long rptDocumentRid;
}