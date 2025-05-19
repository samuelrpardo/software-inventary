package com.partying.crud_fullstack_angular.service;

import com.partying.crud_fullstack_angular.entity.Brand;

import java.util.List;

public interface BrandService {

    Brand save(Brand brand);
    List<Brand> findAll();
    Brand findById(Integer id);
    void deleteById(Integer id);
    Brand update(Brand brand);

}
