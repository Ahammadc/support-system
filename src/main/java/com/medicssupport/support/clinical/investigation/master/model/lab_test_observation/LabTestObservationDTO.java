package com.medicssupport.support.clinical.investigation.master.model.lab_test_observation;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LabTestObservationDTO {
    private Integer rid;
    private Integer serRid;
    private String observationName;
    private String unit;
    private Integer dataType;
    private String groupName;
    private Integer groupRid;
    private String normalRange;
    private String possibleValues;
    private Integer dataLength;
    private String defaultValue;
    private String notificationHighRange;
    private String notificationLowRange;
    private Integer sequanceNo;
    private Integer isClinicalObservation;
    private String clinicalObservationCode;
    private Integer abnormalIndex;
    private Integer permissibleLowRange;
    private Integer permissibleHighRange;
    private String loincCode;
    private Integer parentRid;
    private Integer recordExist;
    private String technology;
    private String shortName;
    private String obsCode;
    private Integer portId;
    private Integer serParentRid;
    private String gridCode;
    private String gridName;
    private String interpretation;
    private String methodology;
    private Integer entityRid;
    private Timestamp modDatetime;
    private Integer modUser;
    private Boolean isActive;
}
