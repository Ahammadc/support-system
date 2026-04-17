package com.medicssupport.support.clinical.investigation.master.model.lab_test_observation;

import lombok.Data;
import jakarta.persistence.*;
        import java.sql.Timestamp;

@Data
@Entity
@Table(name = "uh_lab_test_observation")  // Change table name if actual name is different
public class LabTestObservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ob_rid")
    private Integer rid;

    @Column(name = "ob_ser_rid")
    private Integer serRid;

    @Column(name = "ob_observation_name")
    private String observationName;

    @Column(name = "ob_unit")
    private String unit;

    @Column(name = "ob_data_type")
    private Integer dataType;

    @Column(name = "ob_group_name")
    private String groupName;

    @Column(name = "ob_group_rid")
    private Integer groupRid;

    @Column(name = "ob_normal_range", length = 1000)
    private String normalRange;

    @Column(name = "ob_possible_values", length = 1000)
    private String possibleValues;

    @Column(name = "ob_data_length")
    private Integer dataLength;

    @Column(name = "ob_default_value")
    private String defaultValue;

    @Column(name = "ob_notification_high_range")
    private String notificationHighRange;

    @Column(name = "ob_notification_low_range")
    private String notificationLowRange;

    @Column(name = "ob_sequance_no")
    private Integer sequanceNo;

    @Column(name = "ob_is_clinical_observation")
    private Integer isClinicalObservation;

    @Column(name = "ob_clinical_observation_code")
    private String clinicalObservationCode;

    @Column(name = "ob_abnormal_index")
    private Integer abnormalIndex;

    @Column(name = "ob_permissible_low_range")
    private Integer permissibleLowRange;

    @Column(name = "ob_permissible_high_range")
    private Integer permissibleHighRange;

    @Column(name = "ob_loinc_code")
    private String loincCode;

    @Column(name = "ob_parent_rid")
    private Integer parentRid;

    @Column(name = "ob_record_exist")
    private Integer recordExist;

    @Column(name = "ob_technology")
    private String technology;

    @Column(name = "ob_short_name")
    private String shortName;

    @Column(name = "ob_obs_code")
    private String obsCode;

    @Column(name = "port_id")
    private Integer portId;

    @Column(name = "ob_ser_parent_rid")
    private Integer serParentRid;

    @Column(name = "ob_grid_code")
    private String gridCode;

    @Column(name = "ob_grid_name", length = 500)
    private String gridName;

    @Column(name = "ob_interpretation", columnDefinition = "TEXT")
    private String interpretation;

    @Column(name = "ob_methodology")
    private String methodology;

    @Column(name = "ob_entity_rid")
    private Integer entityRid;

    @Column(name = "ob_mod_datetime")
    private Timestamp modDatetime;

    @Column(name = "ob_mod_user")
    private Integer modUser;

    @Column(name = "ob_is_active")
    private Boolean isActive;
}
