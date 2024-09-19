package com.optimagrowth.dto;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrganizationDto extends RepresentationModel<OrganizationDto> {
    private String name;
    private String contactName;
    private String contactEmail;
    private String contactPhone;
}
