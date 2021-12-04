package org.learning.notes.infrastructure.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.learning.notes.infrastructure.entity.Note;

public interface NoteRepository extends JpaRepository<Note, Integer> {
}
