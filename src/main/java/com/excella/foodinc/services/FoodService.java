package com.excella.foodinc.services;

import java.util.HashMap;

import com.excella.foodinc.data.FoodData;
import com.excella.foodinc.models.Food;

public class FoodService {

    private HashMap<String, Food> foodRepo;

    public void initialize() {

        FoodData food = new FoodData();
        food.initialize();
        this.foodRepo = food.returnFoodData();

    }

    public Food findFood(String name){
        return this.foodRepo.get(name);
    }
}