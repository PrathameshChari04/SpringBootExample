package com.example.product.service.implementation;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.entities.Product;
import com.example.product.repository.ProductRepository;
import com.example.product.service.ProductService;

@Service
public class ProductImplementation implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product getProductById(Long id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        return optionalProduct.get();
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product updateProduct(Product product) {
       Product existingProduct = productRepository.findById(product.getId()).get();
       existingProduct.setName(product.getName());
       existingProduct.setDescription(product.getDescription());
       Product updatedProduct = productRepository.save(existingProduct);
        return updatedProduct;
    }

    @Override
    public void deleteProduct(Long id) {
       productRepository.deleteById(id);
    }
    
}
