package lasanha.summertime.controller.rest;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/")
public class RestMainController {

    @RequestMapping(method = RequestMethod.POST, path = "/signup")
    public String SignUp(@Valid @RequestBody UserDto userDto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "customer/add-update";
        }

        User savedUser = UserService.save(userDtoToUser.convert(userDto));

        return "redirect:/";
    }

    @RequestMapping(method = RequestMethod.POST, path = "/login")
    public String SignUp(@RequestBody UserDto userDto) {


    }

}
