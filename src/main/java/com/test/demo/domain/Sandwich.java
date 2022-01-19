package com.test.demo.domain;

import java.util.Collection;

public class Sandwich {
    private String name;
    private Collection<Ingredient> ingredients;

    public Sandwich(String name, Collection<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Collection<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
