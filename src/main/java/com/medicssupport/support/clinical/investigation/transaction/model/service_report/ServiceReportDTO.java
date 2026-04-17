package com.medicssupport.support.clinical.investigation.transaction.model.service_report;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServiceReportDTO {

    private Integer srRdId;
    private Integer srRdRid;
    private String srRdReport;
    private Integer srTmplRid;
    private Integer srParentRid;
    private Integer srPageNo;
    private String srPageName;
    private Integer srFormBased;
}
