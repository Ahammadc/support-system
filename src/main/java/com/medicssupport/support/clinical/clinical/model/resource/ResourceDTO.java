package com.medicssupport.support.clinical.clinical.model.resource;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResourceDTO {
    private Integer resRid;
    private String resName;
    private String resType;
    private Integer resEntRid;
    private String resEntName;
    private Integer resSchedCapacity;
    private Integer resUnitRid;
    private Boolean resValid;
    private Integer resSchedInterval;
    private String resQueuePrefix;
    private Integer resContWorkingSlotCount;
    private Integer resReservedSlotCount;
    private Integer portResId;
    private Integer resSequenceNumber;
    private String resCategory;
    private String resSecondaryCategory;
    private String resTertiaryCategory;
    private String resSubcategory;
    private Integer resSchedDuration;
    private Integer tempStaffRid;
}
