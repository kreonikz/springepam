package com.epam.learnspring.controller;

import com.epam.learnspring.model.Dog;
import com.epam.learnspring.service.DogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class DogController {
    @Autowired
    DogServiceImpl dogServiceImpl;

    @GetMapping("/dog")
    public String getDog(Model model) {
        Dog dog = dogServiceImpl.getDog();
        model.addAttribute("name", dog.getName());
        return "dog";
    }
}
