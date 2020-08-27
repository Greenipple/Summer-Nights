package lasanha.summertime.services;

import lasanha.summertime.model.Song;
import lasanha.summertime.model.AppUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserService {

    AppUser getUser(Integer id);

    AppUser save(AppUser user);

    void delete(Integer id);

    ArrayList matches(User currentUser);

    Song addSong(Integer Id);








}
