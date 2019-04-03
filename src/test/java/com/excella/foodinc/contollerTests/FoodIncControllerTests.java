package com.excella.foodinc.contollerTests;

import com.excella.foodinc.controllers.FoodController;
import com.excella.foodinc.models.Food;
import com.excella.foodinc.services.FoodService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodIncControllerTests {

	@MockBean
	FoodService foodService;

	@Autowired
	FoodController foodController;

	@Test
	public void foodController_getFoodTest() {
		String requestString = "apple";
		Food ExpectedReturnObject = new Food("apple", 95, 0, 0, 5);
        Mono<Food> monoFood = Mono.just(ExpectedReturnObject);
		when(foodService.findFood("apple")).thenReturn(monoFood);

		StepVerifier.create(foodController.getFood(requestString))
				.assertNext(result -> assertThat(result).isEqualToComparingFieldByField(ExpectedReturnObject))
				.verifyComplete();
	}
}
