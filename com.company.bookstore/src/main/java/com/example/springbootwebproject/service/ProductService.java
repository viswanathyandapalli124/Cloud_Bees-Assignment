package com.example.springbootwebproject.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootwebproject.entity.Product;
import com.example.springbootwebproject.repository.ProductRepository;

@Service
public class ProductService implements ProductServiceInterface {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.saveProduct(product);
    }

    @Override
    public Product readProduct(String productId) {
        return productRepository.findProductById(productId);
    }

    @Override
    public Product updateProduct(String productId, Product updatedProduct) {
        return productRepository.updateProduct(productId, updatedProduct);
    }

    @Override
    public Product deleteProduct(String productId) {
        return productRepository.deleteProduct(productId);
    }

	
}

