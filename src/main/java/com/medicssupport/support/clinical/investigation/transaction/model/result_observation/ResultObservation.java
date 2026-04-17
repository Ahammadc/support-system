package com.medicssupport.support.clinical.investigation.transaction.model.result_observation;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "uh_result_observations")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultObservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ro_rid")
    private Integer roRid;

    @Column(name = "ro_rd_rid")
    private Integer roRdRid;

    @Column(name = "ro_observation_name", length = 100)
    private String roObservationName;

    @Column(name = "ro_data_type")
    private Integer roDataType;

    @Column(name = "ro_data_length")
    private Integer roDataLength;

    @Column(name = "ro_group_id")
    private Integer roGroupId;

    @Column(name = "ro_group_name", length = 100)
    private String roGroupName;

    @Column(name = "ro_value", length = 200)
    private String roValue;

    @Column(name = "ro_unit", length = 100)
    private String roUnit;

    @Column(name = "ro_normal_range", length = 1000)
    private String roNormalRange;

    @Column(name = "ro_observation_abnormal")
    private Integer roObservationAbnormal;

    @Column(name = "ro_normal_range_editable")
    private Integer roNormalRangeEditable;

    @Column(name = "ro_possible_values", length = 1000)
    private String roPossibleValues;

    @Column(name = "ro_remarks", length = 200)
    private String roRemarks;

    @Column(name = "ro_ob_rid")
    private Integer roObRid;

    @Column(name = "ro_computed_normal_range", length = 200)
    private String roComputedNormalRange;

    @Column(name = "ro_technology_used", length = 200)
    private String roTechnologyUsed;
}