package com.partying.crud_fullstack_angular.controller;

import com.partying.crud_fullstack_angular.entity.Beneficiary;
import com.partying.crud_fullstack_angular.entity.Supplier;
import com.partying.crud_fullstack_angular.service.BeneficiaryService;
import com.partying.crud_fullstack_angular.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/beneficiary")
public class BeneficiaryController {

    @Autowired
    private BeneficiaryService beneficiaryService;

    public BeneficiaryController(BeneficiaryService beneficiaryService) {
        this.beneficiaryService = beneficiaryService;
    }

    @PostMapping
    public Beneficiary save(@RequestBody Beneficiary beneficiary) {
        return beneficiaryService.save(beneficiary);
    }

    @GetMapping
    public List<Beneficiary> findAll() {
        return beneficiaryService.findAll();
    }

    @GetMapping("/{id}")
    public Beneficiary findById(@PathVariable("id") Integer id) {
        return beneficiaryService.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        beneficiaryService.deleteById(id);
    }

    @PutMapping
    public Beneficiary update(@RequestBody Beneficiary beneficiary) {
        Beneficiary beneficiaryBd = beneficiaryService.findById(beneficiary.getId());
        beneficiaryBd.setName(beneficiary.getName());
        beneficiaryBd.setStatus(beneficiary.getStatus());
        return beneficiaryService.update(beneficiaryBd);
    }
}
