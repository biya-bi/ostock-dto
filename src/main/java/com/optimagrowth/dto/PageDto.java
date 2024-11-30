package com.optimagrowth.dto;

import org.springframework.hateoas.CollectionModel;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PageDto<T> extends CollectionModel<T> {
    private final int number;
    private final int size;
    private final int totalPages;
    private final int numberOfElements;
    private final long totalElements;

    public PageDto(Iterable<T> content, int number, int size, int totalPages, int numberOfElements, long totalElements) {
        super(content);
        this.number = number;
        this.size = size;
        this.totalPages = totalPages;
        this.numberOfElements = numberOfElements;
        this.totalElements = totalElements;
    }
}
