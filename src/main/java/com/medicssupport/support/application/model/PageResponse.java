package com.medicssupport.support.application.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Page;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResponse<T> {
    private List<T> content;
    private int pageNumber;
    private int pageSize;
    private int numberOfPageElements;
    private long totalElements;
    private int totalPages;
    private boolean last;
    private boolean first;
    private boolean empty;

    public PageResponse(Page<T> page) {
        this.content = page.getContent();
        this.pageNumber = page.getNumber();
        this.pageSize = page.getSize();
        this.numberOfPageElements = page.getNumberOfElements();
        this.totalElements = page.getTotalElements();
        this.totalPages = page.getTotalPages();
        this.last = page.isLast();
        this.first = page.isFirst();
        this.empty = page.isEmpty();
    }

    // Generic static method to handle DTO mapping
    public static <S, D> PageResponse<D> from(PageResponse<S> source, List<D> content) {
        PageResponse<D> target = new PageResponse<>();
        target.setPageNumber(source.getPageNumber());
        target.setPageSize(source.getPageSize());
        target.setNumberOfPageElements(source.getNumberOfPageElements());
        target.setTotalElements(source.getTotalElements());
        target.setTotalPages(source.getTotalPages());
        target.setLast(source.isLast());
        target.setFirst(source.isFirst());
        target.setEmpty(source.isEmpty());
        target.setContent(content);
        return target;
    }
}
