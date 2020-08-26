package lasanha.summertime.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Genre")
public class MusicGenre {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer GenreId;

    String GenreName;

    @OneToMany(mappedBy = "musicGenre")
    private Set<Song> songs = new HashSet<>();
}
