package com.excella.foodinc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.beans.factory.annotation.Autowired;

import reactor.test.StepVerifier;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodIncApplicationTests {

	private static Map<String, Food> foodRepo = new HashMap<>();

	static {
		Food apple = new Food();
		apple.setName("apple");
		apple.setCalories(95);
		apple.setFat(0);
		apple.setProtein(0);
		apple.setCarbs(5);
		foodRepo.put(apple.getName(), apple);

		Food pizza = new Food();
		pizza.setName("pizza");
		pizza.setCalories(200);
		pizza.setFat(20);
		pizza.setProtein(5);
		pizza.setCarbs(30);
		foodRepo.put(pizza.getName(), pizza);
	}
	@Autowired
	private FoodController controller = new FoodController();

	@Test
	public void contextLoads() {
	}

	@Test
	public void getAppleTest() {
		String id = "apple";
		StepVerifier.create(controller.getFood("id")).expectNext(foodRepo.get(id)).verifyComplete();
	}

}

