package com.ezequiel.cards;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CardRegister {

	@Bean
	public Card cards() {
		return new Card();
	}

}
