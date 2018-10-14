package com.de.groceryplanner.dao;

import java.util.List;

import com.de.groceryplanner.dto.ProductDto;

public interface ProductDao {

	List<ProductDto> findAllProducts();
	
	ProductDto findProductById(long id);

	ProductDto findProductByBarcode(String barcode);

	void updateProduct(ProductDto product);

	void deleteProduct(ProductDto product);
	
	void saveProduct(ProductDto product);

}
