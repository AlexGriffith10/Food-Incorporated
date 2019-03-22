package com.excella.foodinc;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import reactor.test.StepVerifier;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FoodIncApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void getAppleTest() {
		FoodController controller = new FoodController();
		String id = "apple";
		StepVerifier.create(controller).expectNext(controller.getFood(id)).verifyComplete();
	}

}

