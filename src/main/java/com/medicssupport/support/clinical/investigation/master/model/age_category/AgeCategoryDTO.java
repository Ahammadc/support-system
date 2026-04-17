package com.medicssupport.support.clinical.investigation.master.model.age_category;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.sql.Timestamp;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgeCategoryDTO {
    private Integer rid;
    private String description;
    private Float from;
    private Float to;
    private String ageUnit;
    private Integer isPorted;
    private String dispDesc;
    private Short valid;
    private Integer entityRid;
    private Timestamp modDatetime;
    private Integer modUser;
}
