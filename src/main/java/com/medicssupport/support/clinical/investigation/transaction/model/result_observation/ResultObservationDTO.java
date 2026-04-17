package com.medicssupport.support.clinical.investigation.transaction.model.result_observation;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResultObservationDTO {

    private Integer roRid;
    private Integer roRdRid;
    private String roObservationName;
    private Integer roDataType;
    private Integer roDataLength;
    private Integer roGroupId;
    private String roGroupName;
    private String roValue;
    private String roUnit;
    private String roNormalRange;
    private Integer roObservationAbnormal;
    private Integer roNormalRangeEditable;
    private String roPossibleValues;
    private String roRemarks;
    private Integer roObRid;
    private String roComputedNormalRange;
    private String roTechnologyUsed;
}
