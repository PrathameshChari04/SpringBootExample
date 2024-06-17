package com.example.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.product.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
}
