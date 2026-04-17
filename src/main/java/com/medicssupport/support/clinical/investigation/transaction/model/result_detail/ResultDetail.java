package com.medicssupport.support.clinical.investigation.transaction.model.result_detail;

import com.medicssupport.support.clinical.investigation.transaction.model.order_sample.OrderSample;
import com.medicssupport.support.clinical.investigation.transaction.model.result_observation.ResultObservation;
import com.medicssupport.support.clinical.investigation.transaction.model.result_report_header.ResultReportHeader;
import com.medicssupport.support.clinical.investigation.transaction.model.service_order.ServiceOrder;
import com.medicssupport.support.clinical.investigation.transaction.model.service_report.ServiceReport;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "uh_result_details")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rd_rid")
    private Long rdRid;

    @Column(name = "rd_against_unit_rid")
    private Integer rdAgainstUnitRid;

    @Column(name = "rd_patient_rid")
    private Integer rdPatientRid;

    @Column(name = "rd_visit_rid")
    private Integer rdVisitRid;

    @Column(name = "rd_user_rid")
    private Integer rdUserRid;

    @Column(name = "rd_service_rid")
    private Integer rdServiceRid;

    @Column(name = "rd_service_name")
    private String rdServiceName;

    @Column(name = "rd_ser_type")
    private Integer rdSerType;

    @Column(name = "rd_test_date")
    private LocalDate rdTestDate;

    @Column(name = "rd_ser_center_rid")
    private Integer rdSerCenterRid;

    @Column(name = "rd_entity_rid")
    private Integer rdEntityRid;

    @Column(name = "rd_test_time", length = 8)
    private String rdTestTime;

    @Column(name = "rd_test_param_rid")
    private Integer rdTestParamRid;

    @Column(name = "rd_test_param_value", length = 5000)
    private String rdTestParamValue;

    @Column(name = "rd_order_date")
    private LocalDateTime rdOrderDate;

    @Column(name = "rd_mod_date")
    private LocalDateTime rdModDate;

    @Column(name = "rd_mod_user_rid")
    private Integer rdModUserRid;

    @Column(name = "rd_order_id")
    private Integer rdOrderId;

    @Column(name = "rd_status")
    private Integer rdStatus;

    @Column(name = "rd_sample_id", length = 20)
    private String rdSampleId;

    @Column(name = "rd_sm_rid")
    private Integer rdSmRid;

    @Column(name = "rd_report_id")
    private Integer rdReportId;

    @Column(name = "rd_parent_rid")
    private Integer rdParentRid;

    @Column(name = "rd_root_parent_rid")
    private Integer rdRootParentRid;

    @Column(name = "rd_result_type")
    private Integer rdResultType;

    @Column(name = "rd_sequence_no")
    private Integer rdSequenceNo;

    @Column(name = "rd_param_unit", length = 20)
    private String rdParamUnit;

    @Column(name = "rd_param_range_description", length = 1000)
    private String rdParamRangeDescription;

    @Column(name = "rd_result_abnormal")
    private Integer rdResultAbnormal;

    @Column(name = "rd_group_name", length = 100)
    private String rdGroupName;

    @Column(name = "rd_remarks", length = 200)
    private String rdRemarks;

    @Column(name = "rd_technology_used", length = 200)
    private String rdTechnologyUsed;

    @Column(name = "rd_attachment_rid")
    private Integer rdAttachmentRid;

    @Column(name = "rd_state")
    private Integer rdState;

    @Column(name = "rd_created_user_rid")
    private Integer rdCreatedUserRid;

    @Column(name = "rd_created_datetime")
    private LocalDateTime rdCreatedDatetime;

    @Column(name = "rd_invalidated")
    private Integer rdInvalidated;

    @Column(name = "rd_history_ref_rid")
    private Integer rdHistoryRefRid;

    @Column(name = "rd_is_manual_test")
    private Boolean rdIsManualTest;

    @Column(name = "rd_old_ref_rd_rid")
    private Integer rdOldRefRdRid;

    @Column(name = "rd_dummy_int1")
    private Integer rdDummyInt1;

    @Column(name = "rd_dummy_varchar1", length = 250)
    private String rdDummyVarchar1;

    @Column(name = "rd_report_print_status")
    private Integer rdReportPrintStatus;

    @Column(name = "rd_used_existing_sample")
    private Short rdUsedExistingSample;

    @Column(name = "rd_old_sm_rid")
    private Integer rdOldSmRid;

    @Column(name = "rd_dummy_varchar2", length = 150)
    private String rdDummyVarchar2;

    @Column(name = "rd_dummy_varchar3", length = 150)
    private String rdDummyVarchar3;

    @Column(name = "rd_report_dispatched")
    private Integer rdReportDispatched;

    @Lob
    @Column(name = "rd_result_technical_note")
    private String rdResultTechnicalNote;

    @Column(name = "rd_is_old_report")
    private Integer rdIsOldReport;

    @Column(name = "rd_worksheet_rid")
    private Integer rdWorksheetRid;

    @Column(name = "rd_is_organism_Isolated")
    private Integer rdIsOrganismIsolated;

    @Column(name = "rd_sample_cancellation_reason", length = 500)
    private String rdSampleCancellationReason;

    @Column(name = "rd_result_cancellation_reason", length = 500)
    private String rdResultCancellationReason;

    @Column(name = "rd_declaration_required")
    private Short rdDeclarationRequired;

    @Column(name = "rd_template_rid")
    private Integer rdTemplateRid;

    @Column(name = "rd_equipment_rid")
    private Integer rdEquipmentRid;

    @Column(name = "rd_computed_normal_range", length = 200)
    private String rdComputedNormalRange;

    @Column(name = "rd_processing_entity_rid")
    private Integer rdProcessingEntityRid;

    @Column(name = "rd_modified_datetime", insertable = false, updatable = false)
    private LocalDateTime rdModifiedDatetime;

    @Column(name = "rd_pat_phone", length = 150)
    private String rdPatPhone;

    @Column(name = "rd_consulting_doc_rid")
    private Integer rdConsultingDocRid;

    @Column(name = "rd_consulting_doc_name", length = 100)
    private String rdConsultingDocName;

    @Column(name = "rd_visit_id", length = 20)
    private String rdVisitId;

    @Column(name = "rd_pat_age")
    private Integer rdPatAge;

    @Column(name = "rd_pat_age_unit", length = 10)
    private String rdPatAgeUnit;

    @Column(name = "rd_visit_type_index")
    private Integer rdVisitTypeIndex;

    @Column(name = "rd_visit_type_desc", length = 10)
    private String rdVisitTypeDesc;

    @Column(name = "rd_source_id", length = 20)
    private String rdSourceId;

    @Column(name = "rd_source_name", length = 1500)
    private String rdSourceName;

    @Column(name = "rd_source_type")
    private Short rdSourceType;

    @Column(name = "rd_gender_name", length = 15)
    private String rdGenderName;

    @Column(name = "rd_source_rid")
    private Long rdSourceRid;

    @Column(name = "rd_is_active")
    private Integer rdIsActive;

    @Column(name = "rd_source_email", length = 100)
    private String rdSourceEmail;

    @Column(name = "rd_source_arrival_datetime")
    private LocalDateTime rdSourceArrivalDatetime;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rd_order_id", referencedColumnName = "so_rid", insertable = false, updatable = false)
    private ServiceOrder serviceOrder;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "ro_rd_rid", referencedColumnName = "rd_rid", insertable = false, updatable = false)
    private List<ResultObservation> resultObservation;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rd_sm_rid", referencedColumnName = "sm_rid", insertable = false, updatable = false)
    private OrderSample orderSample;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rd_report_id", referencedColumnName = "rpt_rid", insertable = false, updatable = false)
    private ResultReportHeader resultReportHeader;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rd_rid", referencedColumnName = "sr_rd_rid", insertable = false, updatable = false)
    private ServiceReport serviceReport;

}