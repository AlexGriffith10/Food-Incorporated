package com.excella.foodinc.data;

import com.excella.foodinc.models.Food;

import java.util.HashMap;

public final class FoodDataConstants {

    public static final HashMap<String, Food> FOODREPO = new HashMap<String, Food>()
    {{
        put("pizza", new Food("pizza", 200, 20, 5, 30));
        put("apple", new Food("apple", 95, 0, 0, 5));
    }};
}
