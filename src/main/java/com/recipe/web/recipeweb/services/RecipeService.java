package com.recipe.web.recipeweb.services;

import com.recipe.web.recipeweb.commands.RecipeCommand;
import com.recipe.web.recipeweb.domain.Recipe;

import java.util.Set;


public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long l);

    RecipeCommand findCommandById(Long l);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    void deleteById(Long idToDelete);
}
