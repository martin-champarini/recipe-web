package com.recipe.web.recipeweb.repository;

import com.recipe.web.recipeweb.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
