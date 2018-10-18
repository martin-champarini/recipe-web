package com.recipe.web.recipeweb.repository;

import com.recipe.web.recipeweb.model.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
