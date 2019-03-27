package com.excella.foodinc.data;

import java.util.HashMap;
import com.excella.foodinc.models.Food;

public class FoodData {

    private HashMap<String, Food> foodRepo;

    public void initialize() {

        this.foodRepo = new HashMap<>();

        Food apple = new Food("apple", 95, 0, 0, 5);
        this.foodRepo.put("apple", apple);

        Food pizza = new Food("pizza", 200, 20, 5, 30);
        this.foodRepo.put("pizza", pizza);
    }
    public HashMap<String, Food> returnFoodData(){
        return foodRepo;
    }
}