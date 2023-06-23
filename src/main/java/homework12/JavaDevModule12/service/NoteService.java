package homework12.JavaDevModule12.service;

import homework12.JavaDevModule12.entity.Note;
import homework12.JavaDevModule12.repository.NoteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NoteService {
    private final NoteRepository noteRepository;

    public List<Note> findAll() {
        return noteRepository.findAll();
    }
    public Note save(Note note) {
        return noteRepository.save(note);
    }

    public void deleteById(long id){
        noteRepository.deleteById(id);
    }

    public Note getById(long id) {
        return noteRepository.findById(id).orElse(null);
    }
}
