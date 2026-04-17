package com.medicssupport.support.clinical.investigation.master.model.lab_test_params;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "phr_lab_test_params")   // Change if actual table name is different
public class LabTestParams {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "param_rid")
    private Integer rid;

    @Column(name = "param_category_rid")
    private Integer categoryRid;

    @Column(name = "param_name")
    private String name;

    @Column(name = "param_unit")
    private String unit;

    @Column(name = "param_desc")
    private String desc;

    @Column(name = "param_low_range")
    private String lowRange;

    @Column(name = "param_high_range")
    private String highRange;

    @Column(name = "param_valid")
    private Boolean valid;

    @Column(name = "param_data_type")
    private Integer dataType;

    @Column(name = "param_group_id")
    private Integer groupId;

    @Column(name = "param_length")
    private Integer length;

    @Column(name = "param_range_description", length = 1000)
    private String rangeDescription;

    @Column(name = "param_range_editable")
    private Boolean rangeEditable;

    @Column(name = "param_possible_values", length = 1000)
    private String possibleValues;

    @Column(name = "param_entity_rid")
    private Integer entityRid;

    @Column(name = "param_default_value")
    private String defaultValue;

    @Column(name = "pltp_temp_new_ser_rid")
    private Integer tempNewSerRid;

    @Column(name = "param_notification_high_range")
    private String notificationHighRange;

    @Column(name = "param_notification_low_range")
    private String notificationLowRange;

    @Column(name = "new_ser_rid")
    private Integer newSerRid;

    @Column(name = "param_abnormal_index")
    private Integer abnormalIndex;

    @Column(name = "param_permissible_low_range")
    private Integer permissibleLowRange;

    @Column(name = "param_permissible_high_range")
    private Integer permissibleHighRange;
}
