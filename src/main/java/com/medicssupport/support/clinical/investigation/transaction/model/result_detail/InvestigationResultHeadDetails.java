package com.medicssupport.support.clinical.investigation.transaction.model.result_detail;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class InvestigationResultHeadDetails {
    private String code;
    private String name;
    private Integer serviceType;
    private Boolean hasIssue;
    private String screenName;
    private Boolean allConditionsPassed;
}
