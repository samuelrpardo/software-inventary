package com.partying.crud_fullstack_angular.controller;

import com.partying.crud_fullstack_angular.entity.Supplier;
import com.partying.crud_fullstack_angular.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/supplier")
public class SupplierController {

    @Autowired
    private SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @PostMapping
    public Supplier save(@RequestBody Supplier supplier) {
        return supplierService.save(supplier);
    }

    @GetMapping
    public List<Supplier> findAll() {
        return supplierService.findAll();
    }

    @GetMapping("/{id}")
    public Supplier findById(@PathVariable("id") Integer id) {

        return supplierService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        supplierService.deleteById(id);
    }

    @PutMapping
    public Supplier update(@RequestBody Supplier supplier) {
        Supplier supplierBd = supplierService.findById(supplier.getId());
        supplierBd.setName(supplier.getName());
        supplierBd.setStatus(supplier.getStatus());
        return supplierService.update(supplierBd);
    }
}
