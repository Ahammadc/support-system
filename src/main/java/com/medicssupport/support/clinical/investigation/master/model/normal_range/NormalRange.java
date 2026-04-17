package com.medicssupport.support.clinical.investigation.master.model.normal_range;

import lombok.Data;
import jakarta.persistence.*;

@Data
@Entity
@Table(name = "uh_normal_range")   // Change if the actual table name is different
public class NormalRange {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "nr_rid")
    private Integer rid;

    @Column(name = "nr_ac_rid")
    private Integer acRid;

    @Column(name = "nr_param_rid")
    private Integer paramRid;

    @Column(name = "nr_gender_index")
    private Integer genderIndex;

    @Column(name = "nr_low_range", length = 100)
    private String lowRange;

    @Column(name = "nr_high_range", length = 100)
    private String highRange;

    @Column(name = "nr_unit", length = 25)
    private String unit;

    @Column(name = "nr_range_description", length = 1000)
    private String rangeDescription;

    @Column(name = "nr_param_type")
    private Integer paramType;

    @Column(name = "nr_is_custom_range")
    private Boolean isCustomRange;

    @Column(name = "nr_custom_range", length = 20)
    private String customRange;
}

