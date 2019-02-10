package com.epam.learnspring.service.impl;

import com.epam.learnspring.service.CatService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MurzikCatImpl implements CatService {
    @Override
    public String getName() {
        return "Murzik";
    }
}
