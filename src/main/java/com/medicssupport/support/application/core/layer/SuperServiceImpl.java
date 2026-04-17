package com.medicssupport.support.application.core.layer;

import com.medicssupport.support.application.exception.InvalidSearchTypeException;
import com.medicssupport.support.application.model.PageResponse;
import com.medicssupport.support.search.model.SearchData;
import com.medicssupport.support.search.model.SearchRequest;
import com.medicssupport.support.search.service.SearchStrategy;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Slf4j
public abstract class SuperServiceImpl<ENTITY, ID> implements SuperService<ENTITY, ID> {

    private final JpaRepository<ENTITY, ID> repository;
    private final Map<String, SearchStrategy<ENTITY>> searchStrategies;

    protected SuperServiceImpl(JpaRepository<ENTITY, ID> repository, Map<String, SearchStrategy<ENTITY>> searchStrategies) {
        this.repository = repository;
        this.searchStrategies = searchStrategies;
    }

    @Override
    @Transactional(readOnly = true)
    public PageResponse<ENTITY> search(SearchRequest request) {
        if (request.getSearchData() == null || request.getSearchData().isEmpty()) {
            throw new InvalidSearchTypeException("Search data is required.");
        }
        List<SearchData> searchData = request.getSearchData();

        // Get the appropriate strategy
        SearchStrategy<ENTITY> strategy = searchStrategies.get(request.getStrategy());

        log.info("Searching data - Strategy: {}, data: {}", request.getStrategy(), searchData.size());

        int page = request.getPageNumber(), size = request.getPageSize();
        String sortBy = request.getSortBy().isEmpty()? strategy.getDefaultSortField() : request.getSortBy();
        String direction = request.getDirection();
        Sort sort = direction.equalsIgnoreCase("desc")
                ? Sort.by(sortBy).descending()
                : Sort.by(sortBy).ascending();

        Pageable pageable = PageRequest.of(page, size, sort);

        if (strategy == null) {
            String availableTypes = String.join(", ", searchStrategies.keySet());
            throw new InvalidSearchTypeException(
                    "Invalid search type: " + request.getStrategy() +
                            ". Available types: " + availableTypes
            );
        }

        Page<ENTITY> pageData =  strategy.search(searchData, pageable);

        return new PageResponse<>(pageData);
    }

    @Override
    public List<String> getAvailableSearchTypes() {
        return searchStrategies.keySet().stream()
                .sorted()
                .collect(Collectors.toList());
    }

    @Override
    public ENTITY getByRid(ID rid) {
        return repository.findById(rid).orElse(null);
    }

    @Override
    public List<ENTITY> get() {
        return repository.findAll();
    }
}
