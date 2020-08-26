package lasanha.summertime.services;

import lasanha.summertime.model.Song;
import lasanha.summertime.model.User;

public interface UserService {

    User getUser(Integer id);

    User save(User user);

    User delete(Integer id);

    User matches();

    Song addSong(Integer Id);






}
