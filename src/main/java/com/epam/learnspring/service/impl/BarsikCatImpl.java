package com.epam.learnspring.service.impl;

import com.epam.learnspring.service.CatService;
import org.springframework.stereotype.Service;

@Service("barsikCat")
public class BarsikCatImpl implements CatService {
    @Override
    public String getName() {
        return "Barsik";
    }
}