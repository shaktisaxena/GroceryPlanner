package com.de.groceryplanner.dao;

import com.de.groceryplanner.dto.CategoryDto;

public interface CategoryDao {

	CategoryDto findProductById(long id);

	void updateCategory(CategoryDto category);

	void deleteCategory(CategoryDto category);
	
	void saveCategory(CategoryDto category);

}
