package com.example.springbootwebproject.service;

import com.example.springbootwebproject.entity.Product;

public interface ProductServiceInterface {

    Product createProduct(Product product);

    Product readProduct(String productId);

    Product updateProduct(String productId, Product updatedProduct);

    Product deleteProduct(String productId);
}
