package com.optimagrowth.dto;

import org.springframework.hateoas.RepresentationModel;

import lombok.Data;

@Data
public class OrganizationDto extends RepresentationModel<OrganizationDto> {
    private final String name;
    private final String contactName;
    private final String contactEmail;
    private final String contactPhone;
}
