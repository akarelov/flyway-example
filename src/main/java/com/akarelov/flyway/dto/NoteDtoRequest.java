package com.akarelov.flyway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NoteDtoRequest {
    private Long id;
    @NotBlank
    private String text;
    @NotNull
    private Long authorId;
}
