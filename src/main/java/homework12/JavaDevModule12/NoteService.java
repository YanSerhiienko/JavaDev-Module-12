package homework12.JavaDevModule12;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class NoteService {
    Map<Long, Note> dataBase = new HashMap<>();

    public Note add(Note note) {
        long id = note.getId();
        if (dataBase.containsKey(id)) {
            throw new IllegalArgumentException("This note is already existing");
        }
        else {
            id = getMaxId() + 1;
            note.setId(id);
            dataBase.put(id, note);
            return note;
        }
    }

    public void deleteById(long id){
        if (!dataBase.containsKey(id)) {
            throw new IllegalArgumentException("There is no note with such id");
        }
        else {
            dataBase.remove(id);
        }
    }

    public void update(Note note) {
        long id = note.getId();
        if (!dataBase.containsKey(id)) {
            throw new IllegalArgumentException("There is no note with such id");
        }
        dataBase.put(id, note);
    }

    Note getById(long id) {
        if (!dataBase.containsKey(id)) {
            throw new IllegalArgumentException("There is no note with such id");
        }
        return dataBase.get(id);
    }

    private long getMaxId() {
        Map.Entry<Long, Note> maxKeyEntry = dataBase
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByKey()).orElse(null);
        if (maxKeyEntry == null) {
            return 0;
        }
        return maxKeyEntry.getKey();
    }
}
