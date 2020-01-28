package com.akarelov.flyway.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDtoRequest {
    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private LocalDate startDate;
}
