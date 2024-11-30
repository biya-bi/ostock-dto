package com.optimagrowth.dto;

import org.springframework.hateoas.CollectionModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageDto<T> extends CollectionModel<T> {
    private int number;
    private int size;
    private int totalPages;

    public PageDto(Iterable<T> content, int number, int size, int totalPages) {
        super(content);
        this.number = number;
        this.size = size;
        this.totalPages = totalPages;
    }
}
