package lasanha.summertime.services;

import lasanha.summertime.Dao.JpaUserDao;
import lasanha.summertime.dto.LoginDto;
import lasanha.summertime.model.Song;
import lasanha.summertime.model.AppUser;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

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
    public ArrayList matches(AppUser currentUser) {
        int numberUsersReturn = 5;

        //HashMap<Object, Set<Song>> allUsers = new HashMap<>();
        HashMap<Object, Integer> matchedUsersSongCount = new HashMap<>();
        List<Integer> matchedUserSongCountList = new ArrayList<>(matchedUsersSongCount.values());
        ArrayList<User> returnedUsersMatched = new ArrayList<>();

        List<AppUser> users = jpaUserDao.findAll();
        for (AppUser user : users) {
            Integer matchCount = 0;
            if (user == currentUser) {
                continue;
            }
            for (Song currentSong : currentUser.getSongs(currentUser)) {
                for (Song userSong : user.getSongs(user)) {
                    if (currentSong == userSong) {
                        matchCount++;
                    }
                }
            }
            matchedUsersSongCount.put(user, matchCount);
        }
          Collections.sort(matchedUserSongCountList);
        for (int i = 0; i < numberUsersReturn ; i++) {

            returnedUsersMatched.add((User) jpaUserDao.findById(i));
        }

        return returnedUsersMatched;
    }
/*
        for(int i = 0; i < jpaUserDao.findAll().size(); i++) {
            allUsers.put(jpaUserDao.findById(i), jpaUserDao.getSongListByUserId((User) jpaUserDao.findById(i)));
        }


        for ()

        for(int i = 0; i < currentUser.getSongs(currentUser).size(); i++){
            for(int j = 0; j < jpaUserDao.findAll().size(); j++){
                if(currentUser.getSongs(currentUser) == jpaUserDao.getSongListByUserId((User) jpaUserDao.findById(i))){

                    matchedUsersSongCount.put(jpaUserDao.findById(i), matchCount);

                }
            }

        }

    }
*/
    @Override
    public Song addSong(Integer Id) {
        return null;
    }


    @Override
    public Integer authenticate(LoginDto loginDto) {

        for (AppUser user : jpaUserDao.findAll()) {
            if (loginDto.getUserName() == user.getUserName() && loginDto.getPassword() == user.getPassWord()) {
                return user.getId();
            }
        }

        return null;
    }
}

