package lasanha.summertime.services;

import lasanha.summertime.Dao.JpaUserDao;
import lasanha.summertime.model.Song;
import lasanha.summertime.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    JpaUserDao jpaUserDao;

    @Autowired
    public void setJpaUserDao(JpaUserDao jpaUserDao) {
        this.jpaUserDao = jpaUserDao;
    }

    @Override
    public User getUser(Integer id) {

        return (User) jpaUserDao.findById(id);
    }

    @Transactional
    @Override
    public User save(User user) {

       return jpaUserDao.saveOrUpdate(user);

    }

    @Transactional
    @Override
    public void delete(Integer id) {

        jpaUserDao.delete(id);
    }

    @Override
    public User matches() {
        return null;
    }

    @Override
    public Song addSong(Integer Id) {
        return null;
    }
}
