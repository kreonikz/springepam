package com.epam.learnspring.controller;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/user")
    public String getUserInfo(Model model) {
        model.addAttribute("name", "Prosto user");
        return "user";
    }

    @RequestMapping("/admin")
    public String getAdminInfo(Model model) {
        model.addAttribute("name", " Admin user");
        return "admin";
    }

    @RequestMapping("/password/{password}")
    public String getPassword(@PathVariable("password") String password, Model model) {
       model.addAttribute("password", password);
       model.addAttribute("passwordAfterEncode", new BCryptPasswordEncoder().encode(password));
        return "password";

    }
}
