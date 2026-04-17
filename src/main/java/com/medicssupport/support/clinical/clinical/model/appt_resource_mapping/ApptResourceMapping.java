package com.medicssupport.support.clinical.clinical.model.appt_resource_mapping;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.*;

@Entity
@Table(name = "u_appointment_resource_map") // Replace with actual table name
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApptResourceMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "arm_rid")
    private Integer armRid;

    @Column(name = "arm_appt_rid")
    private Integer armApptRid;

    @Column(name = "arm_resource_rid")
    private Integer armResourceRid;
}