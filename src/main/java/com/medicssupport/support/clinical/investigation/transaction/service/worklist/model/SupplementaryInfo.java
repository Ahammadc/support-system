package com.medicssupport.support.clinical.investigation.transaction.service.worklist.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class SupplementaryInfo {
    private String key;
    private String value;
    private String icon;
    private String type;
}
