package com.example.recepie.recepieapp.repository;

import com.example.recepie.recepieapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
