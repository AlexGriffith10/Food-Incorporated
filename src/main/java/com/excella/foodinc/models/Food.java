package com.excella.foodinc.models;

public class Food {

    private String name;
    private int calories;
    private int fat;
    private int protein;
    private int carbs;

    public Food(String name, int calories, int fat, int protein, int carbs) {
        this.name = name;
        this.calories = calories;
        this.fat = fat;
        this.protein = protein;
        this.carbs = carbs;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getProtein() {
        return protein;
    }

    public int getCarbs() {
        return carbs;
    }
}