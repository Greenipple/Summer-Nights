package lasanha.summertime.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(path = {"/home", "/", ""})
    public String showHome() {
        return "homePage";
    }

    @RequestMapping(path = "/user/{id}")
    public String showTellMeMore(@PathVariable Integer id) {
        return "userPage";
    }

}
