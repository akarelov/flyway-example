package com.akarelov.flyway.dto;

import com.akarelov.flyway.domain.Author;

import java.time.LocalDate;

public class NoteDtoRequest {
    private long id;
    private String text;
    private Author author;
    private LocalDate date;
}
