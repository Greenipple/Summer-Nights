package lasanha.summertime.converter;

import lasanha.summertime.dto.UserDto;
import lasanha.summertime.model.User;
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

        public User convert(UserDto userDto){

            User user = (userDto.getId() != null? userService.getUser(userDto.getId()): new User());

            user.setUserName(userDto.getUserName());
            user.setPassWord(userDto.getPassword());
            user.setAge(userDto.getAge());
            user.setEmail(userDto.getEmail());

            return user;
        }
}
