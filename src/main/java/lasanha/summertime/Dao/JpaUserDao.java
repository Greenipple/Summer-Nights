package lasanha.summertime.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class JpaUserDao extends GenericDao {

    public JpaUserDao(Class modelType) {
        super(modelType);
    }


}
