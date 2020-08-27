package lasanha.summertime.controller.rest;

import lasanha.summertime.converter.UserDtoToUser;
import lasanha.summertime.converter.UserToUserDto;
import lasanha.summertime.dto.LoginDto;
import lasanha.summertime.dto.UserDto;
import lasanha.summertime.model.AppUser;
import lasanha.summertime.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/")
public class RestMainController {

    UserService userService;
    UserDtoToUser userDtoToUser;
    UserToUserDto userToUserDto;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserDtoToUser(UserDtoToUser userDtoToUser) {
        this.userDtoToUser = userDtoToUser;
    }

    @Autowired
    public void setUserToUserDto(UserToUserDto userToUserDto) {
        this.userToUserDto = userToUserDto;
    }

    @RequestMapping(method = RequestMethod.POST, path = "signup")
    public ResponseEntity SignUp(@Valid @RequestBody UserDto userDto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        AppUser savedUser = userService.save(userDtoToUser.convert(userDto));

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @RequestMapping(method = RequestMethod.POST, path = "/login")
    public ResponseEntity<AppUser> SignIp(@Valid @RequestBody LoginDto loginDto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }

        AppUser appUser = userService.authenticate(loginDto);

        if (appUser == null) {
            return new ResponseEntity(HttpStatus.FORBIDDEN);
        }

        return new ResponseEntity<>(appUser, HttpStatus.OK);
    }


    @RequestMapping(path = "user/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable Integer id) {

        AppUser appUser = userService.getUser(id);

        if (appUser == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity<>(userToUserDto.convert(appUser), HttpStatus.OK);
    }
}
