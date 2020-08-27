package lasanha.summertime.Dao;

import lasanha.summertime.model.AppUser;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDao extends GenericDao<AppUser> {

    public JpaUserDao() {
        super(AppUser.class);
    }


}
