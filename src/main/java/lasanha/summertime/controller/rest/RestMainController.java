package lasanha.summertime.controller.rest;

import lasanha.summertime.converter.UserDtoToUser;
import lasanha.summertime.dto.UserDto;
import lasanha.summertime.model.User;
import lasanha.summertime.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/")
public class RestMainController {

    UserService userService;
    UserDtoToUser userDtoToUser;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    @Autowired
    public void setUserDtoToUser(UserDtoToUser userDtoToUser) {
        this.userDtoToUser = userDtoToUser;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/signup")
    public String SignUp(@Valid @RequestBody UserDto userDto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "customer/add-update";
        }

        User savedUser = userService.save(userDtoToUser.convert(userDto));

        return "redirect:/";
    }
/*
    @RequestMapping(method = RequestMethod.POST, path = "/login")
    public String SignUp(@RequestBody UserDto userDto) {


    }
*/
}
