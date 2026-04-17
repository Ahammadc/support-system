package com.medicssupport.support.search.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class SearchRequest {

    private List<SearchData> searchData;
    private String strategy;
    private int pageNumber = 0;
    private int pageSize = 1000;
    private String sortBy;
    private String direction = "asc";

    public SearchRequest(List<SearchData> searchData, int pageNumber, int pageSize, String sortBy, String direction) {
        this.searchData = searchData;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.sortBy = sortBy;
        this.direction = direction;
    }
}
