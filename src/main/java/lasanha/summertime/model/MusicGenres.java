package lasanha.summertime.model;

import javax.persistence.*;

@Entity
@Table(name = "Genre")
public class MusicGenres {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer GenreId;

    String GenreName;
}
