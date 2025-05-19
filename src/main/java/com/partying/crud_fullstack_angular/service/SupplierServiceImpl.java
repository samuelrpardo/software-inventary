package com.partying.crud_fullstack_angular.service;


import com.partying.crud_fullstack_angular.entity.Supplier;
import com.partying.crud_fullstack_angular.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl implements SupplierService {


    @Autowired
    private SupplierRepository supplierRepository;

    public SupplierServiceImpl(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    @Override
    public Supplier save(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    @Override
    public List<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier findById(Integer id) {
        /*
        Brand brand = brandRepository.findById(id).orElseThrow(
                () -> {
                    throw new ResourceNotFoundException();
                }
        );
        */
        return supplierRepository.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        supplierRepository.deleteById(id);
    }

    @Override
    public Supplier update(Supplier supplier) {
        return supplierRepository.save(supplier);
    }
}
