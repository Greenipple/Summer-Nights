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
/*
    @RequestMapping(path = "/resources/{item}.{extension}")
    public String serveResources(@PathVariable String item, @PathVariable String extension) {

        return "resources/" + item + "." + extension;
    }
*/
    @RequestMapping(path = "/user")
    public String showTellMeMore() {
        return "userPage";
    }

}
