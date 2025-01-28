package com.jtechmind.estore_product_service.service;

import com.jtechmind.estore_product_service.dto.ProductRequestDTO;
import com.jtechmind.estore_product_service.entity.Product;
import com.jtechmind.estore_product_service.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService{

    @Autowired
    ProductRepository productRepository;

    @Override
    public Product createProduct(ProductRequestDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setCategory(dto.getCategory());
        product.setDescription(dto.getDescription());
        return productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProductById(Long id) {
        return Optional.empty();
    }

    @Override
    public Product updateProduct(Long id, ProductRequestDTO dto) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }

    @Override
    public List<Product> getProductsByCategory(String category) {
        return null;
    }

    @Override
    public List<Product> searchProductsByName(String keyword) {
        return null;
    }

    @Override
    public List<Product> getProducts(int page, int size, String sortBy, String sortDirection) {
        return null;
    }
}
