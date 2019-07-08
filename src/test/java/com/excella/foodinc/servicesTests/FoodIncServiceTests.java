package com.excella.foodinc.servicesTests;

import com.excella.foodinc.models.Food;
import com.excella.foodinc.services.FoodService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.test.StepVerifier;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodIncServiceTests {

    @Autowired
    FoodService foodService;

    @Test
    public void foodServices_findFoodTest() {
        String requestString = "apple";
        Food expectedReturnObject = new Food("apple", 95, 0, 0, 5);

        StepVerifier.create(foodService.findFood(requestString))
                .assertNext(result -> assertThat(result).isEqualToComparingFieldByField(expectedReturnObject))
                .verifyComplete();
    }
}
