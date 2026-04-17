package com.medicssupport.support.clinical.investigation.transaction.service.worklist.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SubjectHeader {
    private String id;
    private String title;
    private String subTitle;
    private String indicator;
    private List<SupplementaryInfo> supplementaryInfo;
}
