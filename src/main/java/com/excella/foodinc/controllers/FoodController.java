package com.excella.foodinc.controllers;


import com.excella.foodinc.models.Food;
import com.excella.foodinc.services.FoodService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

@RestController
public class FoodController {

    @Autowired
    private FoodService foodService;

    @RequestMapping(value="/nutrition")
    public Mono<Food> getFood(@RequestParam(value="food", defaultValue="apple") String name) {
        return foodService.findFood(name);
    }
}