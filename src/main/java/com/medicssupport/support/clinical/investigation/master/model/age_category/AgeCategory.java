package com.medicssupport.support.clinical.investigation.master.model.age_category;

import lombok.Data;
import jakarta.persistence.*;
import java.sql.Timestamp;

@Data
@Entity
@Table(name = "uh_age_category")   // Change table name if different
public class AgeCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ac_rid")
    private Integer rid;

    @Column(name = "ac_description")
    private String description;

    @Column(name = "ac_from")
    private Float from;

    @Column(name = "ac_to")
    private Float to;

    @Column(name = "ac_unit")
    private String ageUnit;

    @Column(name = "is_ported")
    private Integer isPorted;

    @Column(name = "ac_disp_desc")
    private String dispDesc;

    @Column(name = "ac_valid")
    private Short valid;

    @Column(name = "ac_entity_rid")
    private Integer entityRid;

    @Column(name = "ac_mod_datetime")
    private Timestamp modDatetime;

    @Column(name = "ac_mod_user")
    private Integer modUser;
}

