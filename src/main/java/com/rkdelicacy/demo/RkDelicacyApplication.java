package com.rkdelicacy.demo;

import com.rkdelicacy.demo.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@ComponentScan
@SpringBootApplication
public class RkDelicacyApplication {

    @Autowired
    private RecipeRepository recipeRepository;

	public static void main(String[] args) {
		SpringApplication.run(RkDelicacyApplication.class, args);
	}
}
