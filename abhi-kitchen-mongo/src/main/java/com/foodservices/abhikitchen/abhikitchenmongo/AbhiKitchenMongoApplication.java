package com.foodservices.abhikitchen.abhikitchenmongo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication


public class AbhiKitchenMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AbhiKitchenMongoApplication.class, args);
	}

}

