package com.akarelov.flyway.service;

import com.akarelov.flyway.domain.Note;
import com.akarelov.flyway.dto.NoteDtoRequest;
import org.springframework.stereotype.Service;

@Service
public interface NoteService {
    Note addNote(NoteDtoRequest dto);

    Note deleteNote(long id);

    Note updateNote(NoteDtoRequest dto);

    Iterable<Note> getAll();
}
