package lasanha.summertime.model;

import javax.persistence.*;

@Entity
@Table(name = "songRating")
public class SongRating {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer ratingId;

    Integer rating;

    public Integer getRatingId() {
        return ratingId;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
