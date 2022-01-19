package com.test.demo.repository;

import com.test.demo.domain.Ingredient;
import com.test.demo.domain.Sandwich;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class SandwichRepositoryLocal implements SandwichRepository {

    private static final Map<String, Sandwich> datamap = Map.of(
            "BLT", new Sandwich("BLT", List.of(
                    new Ingredient("Bacon", 35),
                    new Ingredient("Lettuce", 80),
                    new Ingredient("Tomato", 12)
            )) , "CLUB", new Sandwich("CLUB", List.of(
                    new Ingredient("Chicken", 90),
                    new Ingredient("Lettuce", 80),
                    new Ingredient("Union", 60),
                    new Ingredient("Bacon", 35)))
    );

    public Sandwich getSandwich(String name){
        return datamap.get(name);
    }

}
