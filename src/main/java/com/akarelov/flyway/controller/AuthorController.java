package com.akarelov.flyway.controller;

import com.akarelov.flyway.domain.Author;
import com.akarelov.flyway.dto.AuthorDtoRequest;
import com.akarelov.flyway.service.AuthorService;
import com.akarelov.flyway.service.AuthorServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "author")
public class AuthorController {
    private final AuthorService authorService;

    public AuthorController(AuthorServiceImpl authorService) {
        this.authorService = authorService;
    }

    @PostMapping
    public Author addAuthor(@RequestBody @Valid AuthorDtoRequest dto) {
        return authorService.addAuthor(dto);
    }

    @DeleteMapping
    public Author deleteAuthor(@RequestParam(value = "id") @NotNull Long id) {
        return authorService.deleteAuthor(id);
    }

    @PutMapping
    public Author updateAuthor(@RequestBody @Valid AuthorDtoRequest dto) {
        return authorService.updateAuthor(dto);
    }

    @GetMapping
    public Iterable<Author> getAll() {
        return authorService.getAll();
    }
}
