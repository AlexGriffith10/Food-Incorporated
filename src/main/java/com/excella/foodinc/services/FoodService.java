package com.excella.foodinc.services;

import java.util.HashMap;
import com.excella.foodinc.models.Food;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import static com.excella.foodinc.data.FoodDataConstants.FOODREPO;

@Service
public class FoodService {

    private HashMap<String, Food> foodRepo = FOODREPO;

    public Mono<Food> findFood(String name){
        return Mono.just(this.foodRepo.get(name));
    }
}