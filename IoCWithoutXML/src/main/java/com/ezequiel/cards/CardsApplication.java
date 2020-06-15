package com.ezequiel.cards;

import javax.annotation.Resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class CardsApplication {
	
	  /* Spring IoC Without XML */
	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CardRegister.class);
		context.registerBean("card", Card.class);
		Card myCard = context.getBean("card", Card.class);

		System.out.println(myCard);
	}
}
