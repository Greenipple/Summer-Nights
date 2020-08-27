package lasanha.summertime.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping(path = {"/home", "/", ""})
    public String showHome() {
        return "/WEB-INF/templates/homePage.html";
    }

    @RequestMapping(path = "/resources/{item}")
    public String serveResources(@PathVariable String item) {
        return "/WEB-INF/templates/resources/" + item;
    }

    @RequestMapping(path = "/user/{id}")
    public String showTellMeMore(@PathVariable Integer id) {
        return "userPage";
    }

}
