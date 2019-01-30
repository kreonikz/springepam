package com.epam.learnspring.service;

import org.springframework.stereotype.Service;

@Service
public class DogServiceImpl implements DogService {

    @Override
    public String getName() {
        return "Barbos";
    }
}

