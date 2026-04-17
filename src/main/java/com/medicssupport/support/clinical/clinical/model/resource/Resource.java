package com.medicssupport.support.clinical.clinical.model.resource;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "u_resource") // Replace with actual table name
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resource {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "res_rid")
    private Integer resRid;

    @Column(name = "res_name", length = 100)
    private String resName;

    @Column(name = "res_type", length = 1)
    private String resType;

    @Column(name = "res_ent_rid")
    private Integer resEntRid;

    @Column(name = "res_ent_name", length = 255)
    private String resEntName;

    @Column(name = "res_sched_capacity")
    private Integer resSchedCapacity;

    @Column(name = "res_unit_rid")
    private Integer resUnitRid;

    @Column(name = "res_valid")
    private Boolean resValid;

    @Column(name = "res_sched_interval")
    private Integer resSchedInterval;

    @Column(name = "res_queue_prefix", length = 10)
    private String resQueuePrefix;

    @Column(name = "res_cont_working_slot_count")
    private Integer resContWorkingSlotCount;

    @Column(name = "res_reserved_slot_count")
    private Integer resReservedSlotCount;

    @Column(name = "port_res_id")
    private Integer portResId;

    @Column(name = "res_sequence_number")
    private Integer resSequenceNumber;

    @Column(name = "res_category", length = 128)
    private String resCategory;

    @Column(name = "res_secondary_category", length = 100)
    private String resSecondaryCategory;

    @Column(name = "res_tertiary_category", length = 100)
    private String resTertiaryCategory;

    @Column(name = "res_subcategory", length = 128)
    private String resSubcategory;

    @Column(name = "res_sched_duration")
    private Integer resSchedDuration;

    @Column(name = "temp_staff_rid")
    private Integer tempStaffRid;
}