package lasanha.summertime.Dao;

import lasanha.summertime.model.User;
import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDao extends GenericDao<User> {

    public JpaUserDao() {
        super(User.class);
    }


}
