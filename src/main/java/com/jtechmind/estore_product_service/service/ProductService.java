package com.jtechmind.estore_product_service.service;

import com.jtechmind.estore_product_service.dto.ProductRequestDTO;
import com.jtechmind.estore_product_service.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    // 1. Create a new product
    Product createProduct(ProductRequestDTO dto);

    // 2. Retrieve all products
    List<Product> getAllProducts();

    // 3. Retrieve a product by ID
    Optional<Product> getProductById(Long id);

    // 4. Update an existing product
    Product updateProduct(Long id, ProductRequestDTO dto);

    // 5. Delete a product by ID
    void deleteProduct(Long id);

    // 6. Find products by category
    List<Product> getProductsByCategory(String category);

    // 7. Search products by name (partial match)
    List<Product> searchProductsByName(String keyword);

    // 8. Get all products with pagination and sorting
    List<Product> getProducts(int page, int size, String sortBy, String sortDirection);

}
