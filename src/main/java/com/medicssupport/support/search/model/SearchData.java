package com.medicssupport.support.search.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class SearchData {

    @NotBlank(message = "Search type is required")
    private String searchKey;

    @NotEmpty(message = "At least one search value is required")
    private List<@NotBlank(message = "Search value cannot be blank") String> searchValues;

    @NotNull
    private Boolean required;

    public SearchData(@NotBlank(message = "Search key is required")
                      String searchKey,
                      @NotEmpty(message = "At least one search value is required")
                      List<@NotBlank(message = "Search value cannot be blank") String> searchValues,
                      Boolean required) {
        this.searchKey = searchKey;
        this.searchValues = searchValues;
        this.required = required;
    }
}
