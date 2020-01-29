package com.akarelov.flyway.service;

import com.akarelov.flyway.domain.Author;
import com.akarelov.flyway.dto.AuthorDtoRequest;
import com.akarelov.flyway.exception.ErrorCode;
import com.akarelov.flyway.exception.UserNotExistsException;
import com.akarelov.flyway.repository.AuthorRepository;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author addAuthor(AuthorDtoRequest dto) {
        Author author = new Author();
        author.setAge(dto.getAge());
        author.setFirstName(dto.getFirstName());
        author.setLastName(dto.getLastName());
        return authorRepository.save(author);
    }

    @Override
    public Author deleteAuthor(long id) {
        Author author = authorRepository
                .findById(id)
                .orElseThrow(() -> new UserNotExistsException(ErrorCode.USER_NOT_EXISTS));
        authorRepository.delete(author);
        return author;
    }

    @Override
    public Author updateAuthor(AuthorDtoRequest dto) {
        Author author = authorRepository
                .findById(dto.getId())
                .orElseThrow(() -> new UserNotExistsException(ErrorCode.USER_NOT_EXISTS));
        author.setAge(dto.getAge());
        author.setFirstName(dto.getFirstName());
        author.setLastName(dto.getLastName());
        return authorRepository.save(author);
    }
}
