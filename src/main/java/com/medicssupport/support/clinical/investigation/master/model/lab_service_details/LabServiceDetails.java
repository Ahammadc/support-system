package com.medicssupport.support.clinical.investigation.master.model.lab_service_details;

import lombok.Data;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "uh_lab_service_details")   // Replace with actual table name
public class LabServiceDetails {

    @Id
    @Column(name = "lsd_ser_rid")
    private Integer serRid;

    @Column(name = "lsd_sample_type_index")
    private Integer sampleTypeIndex;

    @Column(name = "lsd_result_parameter_rid")
    private Integer resultParameterRid;

    @Column(name = "lsd_result_type")
    private Integer resultType;

    @Column(name = "lsd_has_observation")
    private Boolean hasObservation;

    @Column(name = "lsd_sequence_no")
    private Integer sequenceNo;

    @Column(name = "lsd_page_no")
    private Integer pageNo;

    @Column(name = "lsd_has_remarks")
    private Boolean hasRemarks;

    @Column(name = "lsd_technology")
    private String technology;

    @Column(name = "lsd_tube_color_index")
    private Integer tubeColorIndex;

    @Column(name = "lsd_technical_notes", columnDefinition = "TEXT")
    private String technicalNotes;

    @Column(name = "lsd_show_template_as_normal_report")
    private Integer showTemplateAsNormalReport;

    @Column(name = "lsd_is_clinical_observation")
    private Integer isClinicalObservation;

    @Column(name = "lsd_clinical_observation_code")
    private String clinicalObservationCode;

    @Column(name = "lsd_is_results_confidential")
    private Integer isResultsConfidential;

    @Column(name = "lsd_is_fasting_required")
    private Integer isFastingRequired;

    @Column(name = "lsd_collection_time_after_food")
    private Integer collectionTimeAfterFood;

    @Column(name = "lsd_loinc_code")
    private String loincCode;

    @Column(name = "lsd_auto_calculation_formula", columnDefinition = "TEXT")
    private String autoCalculationFormula;

    @Column(name = "lsd_custom_report_name")
    private String customReportName;

    @Column(name = "lsd_entity_rid")
    private Integer entityRid;

    @Column(name = "lsd_mod_datetime")
    private Timestamp modDatetime;

    @Column(name = "lsd_mod_user")
    private Integer modUser;
}
