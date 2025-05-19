package com.partying.crud_fullstack_angular.service;

import com.partying.crud_fullstack_angular.entity.Beneficiary;
import com.partying.crud_fullstack_angular.entity.Supplier;

import java.util.List;

public interface BeneficiaryService {

    Beneficiary save(Beneficiary beneficiary);
    List<Beneficiary> findAll();
    Beneficiary findById(Integer id);
    void deleteById(Integer id);
    Beneficiary update(Beneficiary  beneficiary);

}
