package com.benbezac.shopperapijpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ShopperApiJpaApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ShopperApiJpaApplication.class, args);
	}
}