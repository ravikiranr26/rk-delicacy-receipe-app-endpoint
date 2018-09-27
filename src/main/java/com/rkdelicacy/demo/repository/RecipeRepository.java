package com.rkdelicacy.demo.repository;

import com.rkdelicacy.demo.model.Recipes;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecipeRepository extends MongoRepository<Recipes, String> {
    Recipes findByCountryEquals(String country);
}


