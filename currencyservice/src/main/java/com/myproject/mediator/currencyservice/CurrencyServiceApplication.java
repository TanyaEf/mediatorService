package com.myproject.mediator.currencyservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CurrencyServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyServiceApplication.class, args);
	}

}
