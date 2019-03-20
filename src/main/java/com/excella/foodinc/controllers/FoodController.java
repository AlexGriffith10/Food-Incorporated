package com.excella.foodinc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FoodController {

    private static Map<String, Food> foodRepo = new HashMap<>();

    static {
        Food apple = new Food();
        apple.setName("apple");
        apple.setCalories(95);
        apple.setFat(0);
        apple.setProtein(0);
        apple.setCarbs(0);
        foodRepo.put(apple.getName(), apple);

        Food pizza = new Food();
        pizza.setName("pizza");
        pizza.setCalories(200);
        pizza.setFat(20);
        pizza.setProtein(5);
        pizza.setCarbs(30);
        foodRepo.put(pizza.getName(), pizza);
    }

    @RequestMapping(value="/nutrition")
    public Food food(@RequestParam(value="food", defaultValue="apple") String name) {
        return foodRepo.get(name);
    }
}