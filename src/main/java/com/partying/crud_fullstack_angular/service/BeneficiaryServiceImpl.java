package com.partying.crud_fullstack_angular.service;


import com.partying.crud_fullstack_angular.entity.Beneficiary;
import com.partying.crud_fullstack_angular.entity.Supplier;
import com.partying.crud_fullstack_angular.repository.BeneficiaryRepository;
import com.partying.crud_fullstack_angular.repository.SupplierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeneficiaryServiceImpl implements BeneficiaryService {


    @Autowired
    private BeneficiaryRepository beneficiaryRepository;

    public BeneficiaryServiceImpl(BeneficiaryRepository beneficiaryRepository) {
        this.beneficiaryRepository = beneficiaryRepository;
    }

    @Override
    public Beneficiary save(Beneficiary beneficiary) {
        return beneficiaryRepository.save(beneficiary);
    }

    @Override
    public List<Beneficiary> findAll() {
        return beneficiaryRepository.findAll();
    }

    @Override
    public Beneficiary findById(Integer id) {
        /*
        Brand brand = brandRepository.findById(id).orElseThrow(
                () -> {
                    throw new ResourceNotFoundException();
                }
        );
        */
        return beneficiaryRepository.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        beneficiaryRepository.deleteById(id);
    }

    @Override
    public Beneficiary update(Beneficiary beneficiary) {
        return beneficiaryRepository.save(beneficiary);
    }
}
