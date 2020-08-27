package lasanha.summertime.converter;

import lasanha.summertime.dto.UserDto;
import lasanha.summertime.model.AppUser;
import lasanha.summertime.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

    @Component
    public class UserDtoToUser {

        private UserService userService;

        @Autowired
        public void setUserService(UserService userService){
            this.userService = userService;
        }

        public AppUser convert(UserDto userDto){

            AppUser user = (userDto.getId() != null? userService.getUser(userDto.getId()): new AppUser());

            user.setUserName(userDto.getUserName());
            user.setPassWord(userDto.getPassword());
            user.setAge(userDto.getAge());
            user.setEmail(userDto.getEmail());

            return user;
        }
}
