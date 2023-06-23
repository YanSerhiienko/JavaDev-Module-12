package homework12.JavaDevModule12.entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "note")
@Entity
@Data
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String content;
}
