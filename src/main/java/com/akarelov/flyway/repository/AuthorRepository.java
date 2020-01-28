package com.akarelov.flyway.repository;

import com.akarelov.flyway.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
