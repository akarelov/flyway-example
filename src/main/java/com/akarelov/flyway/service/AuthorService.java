package com.akarelov.flyway.service;

import com.akarelov.flyway.domain.Author;
import com.akarelov.flyway.dto.AuthorDtoRequest;
import org.springframework.stereotype.Service;

@Service
public interface AuthorService {
    Author addAuthor(AuthorDtoRequest dto);

    Author deleteAuthor(long id);

    Author updateAuthor(AuthorDtoRequest dto);

    Iterable<Author> getAll();
}
