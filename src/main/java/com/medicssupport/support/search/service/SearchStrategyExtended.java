package com.medicssupport.support.search.service;

import com.medicssupport.support.application.exception.InvalidSearchValueException;
import com.medicssupport.support.search.model.SearchData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public abstract class SearchStrategyExtended<T> implements SearchStrategy<T> {

    @Override
    public void validate(List<SearchData> searchData, Integer expectedLength) {
        if (searchData == null || searchData.isEmpty()) {
            throw new InvalidSearchValueException("Search data cannot be null or empty");
        }

        if (searchData.size() != expectedLength) {
            throw new InvalidSearchValueException("Search data size is not matching for this search");
        }

        // Remove empty/null values and trim
        for(SearchData data: searchData) {
            if (data.getRequired()) continue;
            List<String> cleanedValues = data.getSearchValues().stream()
                    .filter(value -> value != null && !value.trim().isEmpty())
                    .collect(Collectors.toList());

            if (cleanedValues.isEmpty()) {
                throw new InvalidSearchValueException("All search values are empty or invalid");
            }
        }
    }

    protected List<SearchData> cleanSearchValues(List<SearchData> searchDataList) {
        List<SearchData> cleanedSearchDataList = new ArrayList<SearchData>();
        for (SearchData searchData: searchDataList){

            List<String> cleanValues = searchData.getSearchValues().stream()
                    .filter(value -> value != null && !value.trim().isEmpty())
                    .map(String::trim)
                    .distinct()
                    .collect(Collectors.toList());

            cleanedSearchDataList.add(new SearchData(searchData.getSearchKey(), cleanValues, searchData.getRequired()));
        }

        return cleanedSearchDataList;
    }

    protected Map<String, List<String>> getSearchDataMap(List<SearchData> searchData, int expectedSize) {
        validate(searchData, expectedSize);
        List<SearchData> cleanedData = cleanSearchValues(searchData);

        return cleanedData.stream()
                .collect(Collectors.toMap(
                        SearchData::getSearchKey,
                        SearchData::getSearchValues,
                        (existing, replacement) -> existing
                ));
    }
}
