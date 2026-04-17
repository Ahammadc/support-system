package com.medicssupport.support.clinical.investigation.master.model.lab_service_details;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LabServiceDetailsDTO {
    private Integer serRid;
    private Integer sampleTypeIndex;
    private Integer resultParameterRid;
    private Integer resultType;
    private Boolean hasObservation;
    private Integer sequenceNo;
    private Integer pageNo;
    private Boolean hasRemarks;
    private String technology;
    private Integer tubeColorIndex;
    private String technicalNotes;
    private Integer showTemplateAsNormalReport;
    private Integer isClinicalObservation;
    private String clinicalObservationCode;
    private Integer isResultsConfidential;
    private Integer isFastingRequired;
    private Integer collectionTimeAfterFood;
    private String loincCode;
    private String autoCalculationFormula;
    private String customReportName;
    private Integer entityRid;
    private Timestamp modDatetime;
    private Integer modUser;
}
