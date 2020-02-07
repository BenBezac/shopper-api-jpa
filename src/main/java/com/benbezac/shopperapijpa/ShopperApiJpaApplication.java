package com.benbezac.shopperapijpa;

import com.benbezac.shopperapijpa.model.ShopperElement;
import com.benbezac.shopperapijpa.repository.ShopperElementRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.stream.Stream;

@SpringBootApplication
public class ShopperApiJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopperApiJpaApplication.class, args);
	}

	/* For initialization purpose
	@Bean
	ApplicationRunner init(ShopperElementRepository repository) {

		String[][] data = {
				{"tomate"},
				{"steak"},
				{"lait"}
		};

		return args -> {
			Stream.of(data).forEach(array -> {
				ShopperElement element = new ShopperElement(
						array[0]
				);
				repository.save(element);
			});
			repository.findAll().forEach(System.out::println);
		};
	}*/
}
