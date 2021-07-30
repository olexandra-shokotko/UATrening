package ua.trening.testing.controller;

import lombok.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import ua.trening.testing.entity.Person;
import ua.trening.testing.repository.PersonRepository;

import java.util.List;

@Controller
public class PagesController {
    @RequestMapping("/main")
    public String mainPage(@RequestParam(value = "lang", required = false) String lang, Model model) {
        model.addAttribute("lang", lang);
        return "main";
    }

    @RequestMapping("/reg")
    public String registrationPage(@RequestParam(value = "lang", required = false) String lang, Model model) {
        model.addAttribute("person", new Person());
        model.addAttribute("lang", lang);
        return "reg_page";
    }

    @RequestMapping("/login")
    public String loginPage(@RequestParam(value = "lang", required = false) String lang, Model model) {
        model.addAttribute("lang", lang);
        return "login_page";
    }

    @Autowired
    private PersonRepository personRepository;

    @PostMapping("/process_register")
    public String processRegister(Person person) {
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        String encodedPassword = passwordEncoder.encode(person.getPassword());
        person.setPassword(encodedPassword);

        personRepository.save(person);

        return "register_success";
    }

    @GetMapping("/persons")
    public String listAll(Model model) {
        List<Person> listPersons = personRepository.findAll();
        model.addAttribute("listPersons", listPersons);
        return "persons";
    }
}
