package com.epam.learnspring.controller;

import com.epam.learnspring.model.Cat;
import com.epam.learnspring.service.CatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CatController {

    @Autowired
    private CatService catService;

    // initialization beans from ioc.xml
    private ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ioc.xml");
    private Cat barsik = applicationContext.getBean("cat", Cat.class);

    @RequestMapping("/cat")
    public String getCatInfo(Model model) {
        model.addAttribute("name", catService.getName());
        model.addAttribute("nameFromXml", barsik.getName());
        return "cat";
    }
}
