package com.excella.foodinc;

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
import com.excella.foodinc.data.FoodData;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodIncApplicationTests {

	@MockBean
	FoodService foodService;

	@Autowired
	FoodController foodController;

	@Test
	public void foodController_success() {
		String requestString = "apple";
		Food returnObject = new Food("apple", 95, 0, 0, 5);
		when(foodService.findFood(requestString)).thenReturn(returnObject);

		StepVerifier.create(foodController.getFood(requestString))
				.assertNext(result -> assertThat(result).isEqualToComparingFieldByField(returnObject))
				.verifyComplete();
	}
}
