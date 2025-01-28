package com.jtechmind.estore_product_service.controller;

import com.jtechmind.estore_product_service.dto.ProductRequestDTO;
import com.jtechmind.estore_product_service.entity.Product;
import com.jtechmind.estore_product_service.service.ProductService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/")
    public ResponseEntity<List<Product>> getProducts(){
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @PostMapping("/")
    public ResponseEntity<Product> addProduct(@Valid @RequestBody ProductRequestDTO requestDTO){
        return ResponseEntity.ok(productService.createProduct(requestDTO));
    }
}
