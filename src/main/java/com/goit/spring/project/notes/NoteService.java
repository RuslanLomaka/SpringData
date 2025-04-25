package com.goit.spring.project.notes;

import java.util.List;

public interface NoteService {
    List<Note> listAll();

    void add(Note note);

    void deleteById(long id);

    void update(Note note);

    Note getById(long id);
}
