package com.test.demo.domain;

public class Ingredient {
    private String naam;
    private int kcal;

    public Ingredient(String naam, int kcal) {
        this.naam = naam;
        this.kcal = kcal;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getKcal() {
        return kcal;
    }

    public void setKcal(int kcal) {
        this.kcal = kcal;
    }
}
