package com.rkdelicacy.demo.controller;

import java.util.List;

import com.rkdelicacy.demo.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import com.rkdelicacy.demo.model.Recipes;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/recipes")
public class ReceipeController {

    @Autowired
    private RecipeRepository recipeRepository;

    @RequestMapping("/all")
    public List<Recipes> getAll() {
        return recipeRepository.findAll();
    }

    @RequestMapping("{country}")
    public Recipes getReceipeDetails(@PathVariable("country") String country) {
        return recipeRepository.findByCountryEquals(country);
    }
}
