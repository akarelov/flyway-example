package com.akarelov.flyway.repository;

import com.akarelov.flyway.domain.Note;
import org.springframework.data.repository.CrudRepository;

public interface NoteRepository extends CrudRepository<Note, Long> {
}
