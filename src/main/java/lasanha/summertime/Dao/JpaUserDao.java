package lasanha.summertime.Dao;

import lasanha.summertime.model.AppUser;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public class JpaUserDao extends GenericDao<AppUser> {


            public Set<Song> getSongListByUserId(User user){

                return user.getSongs(user);
            }

    public JpaUserDao() {
        super(AppUser.class);
    }


}
