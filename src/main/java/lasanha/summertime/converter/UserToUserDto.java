package lasanha.summertime.converter;


import lasanha.summertime.dto.UserDto;
import lasanha.summertime.model.AppUser;
import lasanha.summertime.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserToUserDto {

    private UserService userService;

    @Autowired
    public void setUserService(UserService userService){
        this.userService = userService;
    }


    public void convert(AppUser user){

        UserDto userDto = new UserDto();
        userDto.setUserName(user.getUserName());
        userDto.setPassword(user.getPassWord());
        userDto.setAge(user.getAge());
        userDto.setEmail(user.getEmail());

    }
}
