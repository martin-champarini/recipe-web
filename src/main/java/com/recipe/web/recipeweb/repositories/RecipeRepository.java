package com.recipe.web.recipeweb.repositories;

import com.recipe.web.recipeweb.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {
}
