package com.partying.crud_fullstack_angular.service;

import com.partying.crud_fullstack_angular.dto.ProductDT0;
import com.partying.crud_fullstack_angular.entity.Product;

import java.util.List;

public interface ProductService {

    Product save(ProductDT0 productDT0);
    List<Product> findAll();
    Product findById(Integer id);
    void deleteById(Integer id);
    Product update(Product product);
}
