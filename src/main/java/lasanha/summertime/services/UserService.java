package lasanha.summertime.services;

import lasanha.summertime.model.Song;
import lasanha.summertime.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User getUser(Integer id);

    User save(User user);

    User delete(Integer id);

    User matches();

    Song addSong(Integer Id);






}
