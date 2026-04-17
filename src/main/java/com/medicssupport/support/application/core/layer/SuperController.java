package com.medicssupport.support.application.core.layer;

import com.medicssupport.support.application.constants.ApiConstants;
import com.medicssupport.support.application.model.ApiResponse;
import com.medicssupport.support.application.model.PageResponse;
import com.medicssupport.support.search.model.SearchRequest;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Slf4j
public abstract class SuperController<ENTITY, DTO, ID> {

    private final SuperService<ENTITY, ID> service;
    private final BaseConverter<ENTITY, DTO> converter;

    protected SuperController(SuperService<ENTITY, ID> service, BaseConverter<ENTITY, DTO> converter) {
        this.service = service;
        this.converter = converter;
    }

    /**
     * Search data by multiple criteria
     * POST method with Request Body
     */
    @PostMapping(ApiConstants.PATH_SEARCH)
    public ResponseEntity<ApiResponse<PageResponse<DTO>>> search(
            @Valid @RequestBody SearchRequest request) {

        log.info("Received data search request - Data: {}",
                request.getSearchData());

        PageResponse<ENTITY> pageData = service.search(request);
        PageResponse<DTO> pageResponse = PageResponse.from(pageData, converter.toDtoList(pageData.getContent()));

        return ResponseEntity.ok(ApiResponse.success(pageResponse));

    }

    /**
     * Get available search types
     */
    @GetMapping(ApiConstants.PATH_SEARCH_TYPES)
    public ResponseEntity<ApiResponse<List<String>>>getSearchTypes() {
        List<String> searchTypes = service.getAvailableSearchTypes();
        return ResponseEntity.ok(ApiResponse.success(searchTypes));
    }

    @GetMapping
    public List<DTO> get() {
        return converter.toDtoList(service.get());
    }

    @GetMapping(ApiConstants.RID_PATH_VAR)
    public DTO getById(@PathVariable ID rid) {
        return converter.toDto(service.getByRid(rid));
    }
}
