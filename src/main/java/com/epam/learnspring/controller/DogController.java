package com.epam.learnspring.controller;

import com.epam.learnspring.model.Dog;
import com.epam.learnspring.model.Message;
import com.epam.learnspring.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/dog")
public class DogController {
    @Autowired
    @Value("DOGGGG")
    private Message message;
    @Autowired
    DogService dogService;

    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");
    private Dog dog1 = applicationContext.getBean("dog", Dog.class);

    @GetMapping
    public String getDog(Model model) {
        model.addAttribute("name", dog1.getName());
//        model.addAttribute("name", dogService.getName());
        return "dog";
    }
}
