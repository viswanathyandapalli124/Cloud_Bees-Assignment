package com.example.springbootwebproject.controller;

import org.springframework.web.bind.annotation.*;

import com.example.springbootwebproject.entity.Product;
import com.example.springbootwebproject.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Object createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @GetMapping("/{productId}")
    public Object readProduct(@PathVariable String productId) {
        Product product = productService.readProduct(productId);
        return product != null ? product : "Product not found";
    }

    @PutMapping("/{productId}")
    public Object updateProduct(@PathVariable String productId, @RequestBody Product updatedProduct) {
        return productService.updateProduct(productId, updatedProduct) != null ? "Update successful" : "Product not found";
    }

    @DeleteMapping("/{productId}")
    public Object deleteProduct(@PathVariable String productId) {
        return productService.deleteProduct(productId) != null ? "Delete successful" : "Product not found";
    }
}
