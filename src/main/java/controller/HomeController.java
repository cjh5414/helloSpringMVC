package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * Created by jihun on 2017. 2. 15..
 */
@Controller
public class HomeController {
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String showHome() {
        return "home";
    }
}

