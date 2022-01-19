package com.test.demo.service;

import com.test.demo.domain.Ingredient;
import com.test.demo.domain.Sandwich;
import com.test.demo.repository.SandwichRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SandwichService {

    @Autowired
    private SandwichRepository repository;

    public int computeKcal(String sandwichName){
        Sandwich sandwich = repository.getSandwich(sandwichName);
        int totalKcal = 0;
        for (Ingredient ingredient :
                sandwich.getIngredients()) {
            totalKcal += ingredient.getKcal();

        }
        return totalKcal;
    }

}
