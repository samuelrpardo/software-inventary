package com.partying.crud_fullstack_angular.controller;

import com.partying.crud_fullstack_angular.dto.ProductDT0;
import com.partying.crud_fullstack_angular.entity.Product;
import com.partying.crud_fullstack_angular.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public Product createProduct(@RequestBody ProductDT0 productDT0) {
        return productService.save(productDT0);
    }

    @GetMapping
    public List<Product> findAll() {
        return productService.findAll();
    }

    public Product findById(Integer id) {
        return productService.findById(id);
    }
}
