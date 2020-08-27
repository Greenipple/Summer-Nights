package lasanha.summertime.Dao;

import lasanha.summertime.model.Song;
import lasanha.summertime.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public class JpaUserDao extends GenericDao {


            public Set<Song> getSongListByUserId(User user){

                return user.getSongs(user);
            }

    public JpaUserDao() {
        super(User.class);
    }


}
