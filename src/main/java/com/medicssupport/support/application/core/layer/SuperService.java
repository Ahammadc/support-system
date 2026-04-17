package com.medicssupport.support.application.core.layer;

import com.medicssupport.support.application.model.PageResponse;
import com.medicssupport.support.search.model.SearchRequest;

import java.util.List;

public interface SuperService<ENTITY, ID> {
    PageResponse<ENTITY> search(SearchRequest request);
    List<String> getAvailableSearchTypes();
    ENTITY getByRid(ID rid);
    List<ENTITY> get();
}
