package ua.trening.testing.controller;

import lombok.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PagesController {
    @RequestMapping("/main")
    public String mainPage() {
        return "main";
    }

    @RequestMapping("/reg")
    public String registrationPage() {
        return "reg_page";
    }

    @RequestMapping("/login")
    public String loginPage() {
        return "login_page";
    }

}
