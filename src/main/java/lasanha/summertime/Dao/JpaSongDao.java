package lasanha.summertime.Dao;

import org.springframework.stereotype.Repository;

@Repository
public class JpaSongDao extends GenericDao {

    public JpaSongDao(Class modelType) {
        super(modelType);
    }
}
