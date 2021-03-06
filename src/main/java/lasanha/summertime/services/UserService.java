package lasanha.summertime.services;

import lasanha.summertime.dto.LoginDto;
import lasanha.summertime.model.Song;
import lasanha.summertime.model.AppUser;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface UserService {

    AppUser getUser(Integer id);

    AppUser save(AppUser user);

    void delete(Integer id);

    ArrayList matches(AppUser currentUser);

    void addSong(AppUser user, Song song);


    AppUser authenticate(LoginDto loginDto);
}
