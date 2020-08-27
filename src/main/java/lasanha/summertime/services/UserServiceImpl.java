package lasanha.summertime.services;

import lasanha.summertime.Dao.JpaUserDao;
import lasanha.summertime.model.Song;
import lasanha.summertime.model.AppUser;
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
    public AppUser getUser(Integer id) {

        return (AppUser) jpaUserDao.findById(id);
    }

    @Transactional
    @Override
    public AppUser save(AppUser user) {

       return jpaUserDao.saveOrUpdate(user);

    }

    @Transactional
    @Override
    public void delete(Integer id) {

        jpaUserDao.delete(id);
    }

    @Override
    public AppUser matches() {
        return null;
    }

    @Override
    public Song addSong(Integer Id) {
        return null;
    }
}
