package com.epam.learnspring.service;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KnightService {
    private SessionFactory sessionFactory;

    public String getAchievement(String value) {
        return "I've slayed a " + value + "!";
    }

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
