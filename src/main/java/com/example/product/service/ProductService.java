package com.example.product.service;

import com.example.product.entities.Product;
import java.util.List;

public interface ProductService {

    Product createProduct(Product product);

    Product getProductById(Long id);

    List<Product> getAllProducts();

    Product updateProduct(Product product);

    void deleteProduct(Long id);
    
} 
