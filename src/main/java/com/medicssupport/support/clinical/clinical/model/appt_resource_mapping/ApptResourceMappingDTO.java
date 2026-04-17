package com.medicssupport.support.clinical.clinical.model.appt_resource_mapping;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApptResourceMappingDTO {
    private Integer armRid;
    private Integer armApptRid;
    private Integer armResourceRid;
}
