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
public class GroupContext {
    private String groupName;
    private String identifier;
    private String displayName;
    private String status;
    private List<SupplementaryInfo> supplementaryInfo;
}
