package com.recipe.web.recipeweb.repository;

import com.recipe.web.recipeweb.model.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, Long> {
}
