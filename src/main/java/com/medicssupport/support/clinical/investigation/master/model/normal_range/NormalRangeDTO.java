package com.medicssupport.support.clinical.investigation.master.model.normal_range;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NormalRangeDTO {
    private Integer rid;
    private Integer acRid;
    private Integer paramRid;
    private Integer genderIndex;
    private String lowRange;
    private String highRange;
    private String unit;
    private String rangeDescription;
    private Integer paramType;
    private Boolean isCustomRange;
    private String customRange;
}
