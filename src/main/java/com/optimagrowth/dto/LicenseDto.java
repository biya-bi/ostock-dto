package com.optimagrowth.dto;

import org.springframework.hateoas.RepresentationModel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LicenseDto extends RepresentationModel<LicenseDto> {
    private String description;
    private String productName;
    private String licenseType;
    private String comment;
}
