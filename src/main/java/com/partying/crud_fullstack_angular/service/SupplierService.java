package com.partying.crud_fullstack_angular.service;

import com.partying.crud_fullstack_angular.entity.Brand;
import com.partying.crud_fullstack_angular.entity.Supplier;

import java.util.List;

public interface SupplierService {

    Supplier save(Supplier supplier);
    List<Supplier> findAll();
    Supplier findById(Integer id);
    void deleteById(Integer id);
    Supplier update(Supplier supplier);

}
