package com.epam.learnspring.controller;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.web.bind.annotation.GetMapping;

public class DogController {
    @GetMapping("/dog")
    public String getDog(){

        return ;
    }
}
