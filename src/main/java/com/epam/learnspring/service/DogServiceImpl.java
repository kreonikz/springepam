package com.epam.learnspring.service;

import com.epam.learnspring.Repository.DogRepository;
import com.epam.learnspring.model.Dog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DogServiceImpl implements DogService {
    @Autowired
    DogRepository dogRepository;

    @Override
    public Dog getDog() {
        return new Dog();
    }
}

