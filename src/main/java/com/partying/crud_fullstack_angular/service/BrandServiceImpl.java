package com.partying.crud_fullstack_angular.service;

import com.partying.crud_fullstack_angular.entity.Brand;
import com.partying.crud_fullstack_angular.exception.ResourceNotFoundException;
import com.partying.crud_fullstack_angular.repository.BrandRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {


    private final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public Brand save(Brand brand) {
        return brandRepository.save(brand);
    }

    @Override
    public List<Brand> findAll() {
        return brandRepository.findAll();
    }

    @Override
    public Brand findById(Integer id) {
        /*
        Brand brand = brandRepository.findById(id).orElseThrow(
                () -> {
                    throw new ResourceNotFoundException();
                }
        );
        */
        return brandRepository.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        brandRepository.deleteById(id);
    }

    @Override
    public Brand update(Brand brand) {
        return brandRepository.save(brand);
    }
}
