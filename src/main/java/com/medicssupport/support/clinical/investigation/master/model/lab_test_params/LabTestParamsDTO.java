package com.medicssupport.support.clinical.investigation.master.model.lab_test_params;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LabTestParamsDTO {
    private Integer rid;
    private Integer categoryRid;
    private String name;
    private String unit;
    private String desc;
    private String lowRange;
    private String highRange;
    private Boolean valid;
    private Integer dataType;
    private Integer groupId;
    private Integer length;
    private String rangeDescription;
    private Boolean rangeEditable;
    private String possibleValues;
    private Integer entityRid;
    private String defaultValue;
    private Integer tempNewSerRid;
    private String notificationHighRange;
    private String notificationLowRange;
    private Integer newSerRid;
    private Integer abnormalIndex;
    private Integer permissibleLowRange;
    private Integer permissibleHighRange;
}
