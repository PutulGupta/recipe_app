package com.example.recepie.recepieapp.service;

import com.example.recepie.recepieapp.commands.RecipeCommand;
import com.example.recepie.recepieapp.domain.Recipe;

import java.util.Set;

public interface RecepieService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);


}
