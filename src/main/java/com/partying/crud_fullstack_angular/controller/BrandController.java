package com.partying.crud_fullstack_angular.controller;

import com.partying.crud_fullstack_angular.entity.Brand;
import com.partying.crud_fullstack_angular.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping
    public Brand save(@RequestBody Brand brand) {
        return brandService.save(brand);
    }

    @GetMapping
    public List<Brand> findAll() {
        return brandService.findAll();
    }

    @GetMapping("/{id}")
    public Brand findById(@PathVariable("id") Integer id) {

        return brandService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        brandService.deleteById(id);
    }

    @PutMapping
    public Brand update(@RequestBody Brand brand) {
        Brand brandBd = brandService.findById(brand.getId());
        brandBd.setName(brand.getName());
        brandBd.setStatus(brand.getStatus());
        return brandService.update(brandBd);
    }
}
