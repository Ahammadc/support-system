package com.medicssupport.support.clinical.investigation.transaction.model.service_order;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "uh_service_orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "so_rid")
    private Integer soRid;

    @Column(name = "so_against_unit_rid")
    private Integer soAgainstUnitRid;

    @Column(name = "so_patient_rid")
    private Integer soPatientRid;

    @Column(name = "so_visit_rid")
    private Integer soVisitRid;

    @Column(name = "so_ordering_unit_rid")
    private Integer soOrderingUnitRid;

    @Column(name = "so_order_no", length = 15)
    private String soOrderNo;

    @Column(name = "so_order_type")
    private Short soOrderType;

    @Column(name = "so_item_id")
    private Integer soItemId;

    @Column(name = "so_item_name", length = 5000)
    private String soItemName;

    @Column(name = "so_start_date")
    private LocalDate soStartDate;

    @Column(name = "so_start_time")
    private LocalTime soStartTime;

    @Column(name = "so_qty")
    private Float soQty;

    @Column(name = "so_status")
    private Short soStatus;

    @Column(name = "so_status_mod_datetime")
    private LocalDateTime soStatusModDatetime;

    @Column(name = "so_processing_unit_rid")
    private Integer soProcessingUnitRid;

    @Column(name = "so_sample_collecting_unit")
    private Integer soSampleCollectingUnit;

    @Column(name = "so_order_date")
    private LocalDateTime soOrderDate;

    @Column(name = "so_attnd_doc_rid")
    private Integer soAttndDocRid;

    @Column(name = "so_order_doc_rid")
    private Integer soOrderDocRid;

    @Column(name = "so_recoded_user_rid")
    private Integer soRecodedUserRid;

    @Column(name = "so_processed_by")
    private Integer soProcessedBy;

    @Column(name = "so_processed_date")
    private LocalDate soProcessedDate;

    @Column(name = "so_processed_time")
    private LocalTime soProcessedTime;

    @Column(name = "so_processing_comments", length = 250)
    private String soProcessingComments;

    @Column(name = "so_priority")
    private Short soPriority;

    @Column(name = "so_result_rid")
    private Integer soResultRid;

    @Column(name = "so_result_datetime")
    private LocalDateTime soResultDatetime;

    @Column(name = "so_schedule_rid")
    private Integer soScheduleRid;

    @Column(name = "so_ser_mode")
    private Short soSerMode;

    @Column(name = "so_cancellation_reason", length = 5000)
    private String soCancellationReason;

    @Column(name = "so_remarks", length = 500)
    private String soRemarks;

    @Column(name = "so_item_category")
    private Integer soItemCategory;

    @Column(name = "so_is_header")
    private Short soIsHeader;

    @Column(name = "so_parent_rid")
    private Integer soParentRid;

    @Column(name = "so_root_parent_id")
    private Integer soRootParentId;

    @Column(name = "so_signed_user_rid")
    private Integer soSignedUserRid;

    @Column(name = "so_co_signed_user_rid")
    private Integer soCoSignedUserRid;

    @Column(name = "so_signed_datetime")
    private LocalDateTime soSignedDatetime;

    @Column(name = "so_recurrence_ID")
    private Integer soRecurrenceID;

    @Column(name = "so_recurrence_Span", length = 20)
    private String soRecurrenceSpan;

    @Column(name = "so_occurences_Total")
    private Integer soOccurencesTotal;

    @Column(name = "so_occur_generated")
    private Integer soOccurGenerated;

    @Column(name = "so_recurrence_text", length = 100)
    private String soRecurrenceText;

    @Column(name = "so_modified_user_rid")
    private Integer soModifiedUserRid;

    @Column(name = "so_modified_datetime")
    private LocalDateTime soModifiedDatetime;

    @Column(name = "so_major_procedure_status")
    private Short soMajorProcedureStatus;

    @Column(name = "so_duration")
    private Integer soDuration;

    @Column(name = "so_service_point")
    private Integer soServicePoint;

    @Column(name = "so_ctxt", length = 25)
    private String soCtxt;

    @Column(name = "so_exception_id")
    private Integer soExceptionId;

    @Column(name = "so_ext_ser_provider_rid")
    private Integer soExtSerProviderRid;

    @Column(name = "so_ext_ser_provider_price")
    private Double soExtSerProviderPrice;

    @Column(name = "so_state")
    private Integer soState;

    @Column(name = "so_detail_text", length = 100)
    private String soDetailText;

    @Column(name = "so_advised_user_rid")
    private Integer soAdvisedUserRid;

    @Column(name = "so_advised_datetime")
    private LocalDateTime soAdvisedDatetime;

    @Column(name = "so_converted_user_rid")
    private Integer soConvertedUserRid;

    @Column(name = "so_converted_datetime")
    private LocalDateTime soConvertedDatetime;

    @Column(name = "so_is_scheduled")
    private Integer soIsScheduled;

    @Column(name = "so_procedure_type")
    private Short soProcedureType;

    @Column(name = "so_display_str", length = 100)
    private String soDisplayStr;

    @Column(name = "so_asso_pd_rid")
    private Integer soAssoPdRid;

    @Column(name = "so_initiated_by")
    private Boolean soInitiatedBy;

    @Column(name = "so_performing_doctor")
    private Integer soPerformingDoctor;

    @Column(name = "so_notify_doctor_on_completion")
    private Boolean soNotifyDoctorOnCompletion;

    @Column(name = "so_price")
    private Float soPrice;

    @Column(name = "so_session_rid")
    private Integer soSessionRid;

    @Column(name = "is_modality_sent")
    private Short isModalitySent;

    @Column(name = "so_est_len_of_stay_in_hospital")
    private Integer soEstLenOfStayInHospital;

    @Column(name = "so_token_no", length = 250)
    private String soTokenNo;

    @Column(name = "so_is_token_number_reassigned")
    private Integer soIsTokenNumberReassigned;

    @Column(name = "so_token_instance_rid")
    private Integer soTokenInstanceRid;

    @Column(name = "so_overdue_datetime")
    private LocalDateTime soOverdueDatetime;

    @Column(name = "so_ordering_pi_rid")
    private Integer soOrderingPiRid;
}