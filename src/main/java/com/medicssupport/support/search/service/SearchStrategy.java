package com.medicssupport.support.search.service;

import com.medicssupport.support.search.model.SearchData;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface SearchStrategy<T> {
    Page<T> search(List<SearchData> searchData, Pageable pageable);
    void validate(List<SearchData> searchData, Integer expectedLength);
    String getDefaultSortField();
}
