package com.akarelov.flyway.service;

import com.akarelov.flyway.domain.Author;
import com.akarelov.flyway.domain.Note;
import com.akarelov.flyway.dto.NoteDtoRequest;
import com.akarelov.flyway.exception.ErrorCode;
import com.akarelov.flyway.exception.NoteNotExistsException;
import com.akarelov.flyway.exception.UserNotExistsException;
import com.akarelov.flyway.repository.AuthorRepository;
import com.akarelov.flyway.repository.NoteRepository;
import org.springframework.stereotype.Service;

@Service
public class NoteServiceImpl implements NoteService {
    private final NoteRepository noteRepository;
    private final AuthorRepository authorRepository;

    public NoteServiceImpl(NoteRepository noteRepository, AuthorRepository authorRepository) {
        this.noteRepository = noteRepository;
        this.authorRepository = authorRepository;
    }

    @Override
    public Note addNote(NoteDtoRequest dto) {
        Author author = authorRepository
                .findById(dto.getAuthorId())
                .orElseThrow(() -> new UserNotExistsException(ErrorCode.USER_NOT_EXISTS));
        Note note = new Note();
        note.setText(dto.getText());
        note.setAuthor(author);
        return noteRepository.save(note);
    }

    @Override
    public Note deleteNote(long id) {
        Note note = noteRepository
                .findById(id)
                .orElseThrow(() -> new NoteNotExistsException(ErrorCode.NOTE_NOT_EXISTS));
        noteRepository.delete(note);
        return note;
    }

    @Override
    public Note updateNote(NoteDtoRequest dto) {
        Note note = noteRepository
                .findById(dto.getId())
                .orElseThrow(() -> new NoteNotExistsException(ErrorCode.NOTE_NOT_EXISTS));
        Author author = authorRepository
                .findById(dto.getAuthorId())
                .orElseThrow(() -> new UserNotExistsException(ErrorCode.USER_NOT_EXISTS));
        note.setAuthor(author);
        note.setText(dto.getText());
        return noteRepository.save(note);
    }

    @Override
    public Iterable<Note> getAll() {
        return noteRepository.findAll();
    }
}
