package com.partying.crud_fullstack_angular.service;

import com.partying.crud_fullstack_angular.dto.ProductDT0;
import com.partying.crud_fullstack_angular.entity.Brand;
import com.partying.crud_fullstack_angular.entity.Product;
import com.partying.crud_fullstack_angular.repository.BrandRepository;
import com.partying.crud_fullstack_angular.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    private BrandRepository brandRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(ProductDT0 productDT0) {

        Optional<Brand> brandOptional = brandRepository.findById(productDT0.getBrandid());

        if (!brandOptional.isPresent()) {
            throw new RuntimeException("Brand not found with id: " + productDT0.getBrandid());
            // O maneja este error como prefieras
        }
        Product product = new Product();
        product.setCode(productDT0.getCode());
        product.setName(productDT0.getName());
        product.setDescription(productDT0.getDescription());
        product.setStatus(productDT0.getStatus());
        product.setBrand(brandOptional.get());
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Integer id) {
        return productRepository.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }
}
