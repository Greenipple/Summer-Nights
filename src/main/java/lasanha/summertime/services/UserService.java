package lasanha.summertime.services;

import lasanha.summertime.model.Song;
import lasanha.summertime.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserService {

    User getUser(Integer id);

     void save(User user);

    void delete(Integer id);

    ArrayList matches(User currentUser);

    Song addSong(Integer Id);








}
