package lasanha.summertime.services;

import lasanha.summertime.model.Song;
import lasanha.summertime.model.AppUser;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    AppUser getUser(Integer id);

    AppUser save(AppUser user);

    void delete(Integer id);

    AppUser matches();

    Song addSong(Integer Id);






}
