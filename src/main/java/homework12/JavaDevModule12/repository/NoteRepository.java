package homework12.JavaDevModule12.repository;

import homework12.JavaDevModule12.entity.Note;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Note, Long> {
}
