package lasanha.summertime.Dao;

import lasanha.summertime.model.Song;
import org.springframework.stereotype.Repository;

@Repository
public class JpaSongDao extends GenericDao {

    public JpaSongDao() {
        super(Song.class);
    }
}
