package com.akarelov.flyway.controller;

import com.akarelov.flyway.domain.Note;
import com.akarelov.flyway.dto.NoteDtoRequest;
import com.akarelov.flyway.service.NoteService;
import com.akarelov.flyway.service.NoteServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping(value = "note")
public class NoteController {
    private final NoteService noteService;

    public NoteController(NoteServiceImpl noteService) {
        this.noteService = noteService;
    }

    @PostMapping
    public Note addNote(@RequestBody @Valid NoteDtoRequest dto) {
        return noteService.addNote(dto);
    }

    @DeleteMapping
    public Note deleteNote(@RequestParam @NotNull Long id) {
        return noteService.deleteNote(id);
    }

    @PutMapping
    public Note updateNote(@RequestBody @Valid NoteDtoRequest dto) {
        return noteService.updateNote(dto);
    }

    @GetMapping
    public Iterable<Note> getAll() {
        return noteService.getAll();
    }
}
