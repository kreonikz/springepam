package com.epam.learnspring.service.impl;

import com.epam.learnspring.service.DogService;
import org.springframework.stereotype.Service;

@Service
public class DogServiceImpl implements DogService {

    @Override
    public String getName() {
        return "Barbos";
    }
}

