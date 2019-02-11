package com.epam.learnspring.controller;

import com.epam.learnspring.service.KnightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// localhost:8080/knight/*
@RequestMapping("/knight")
public class KnightController {

    KnightService knightService;

    @Autowired
    public void setKnightService(KnightService knightService) {
        this.knightService = knightService;
    }

    public KnightService getKnightService() {
        return knightService;
    }

    @RequestMapping("/info")
    public String getKnightInfo(Model model) {
        model.addAttribute("action", knightService.getAchievement("dragon"));
        return "knight";
    }


}
