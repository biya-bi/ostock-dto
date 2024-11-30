package com.optimagrowth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageDto<T> {
    private Iterable<T> content;
    private int number;
    private int size;
    private int totalPages;
}
