package com.partying.crud_fullstack_angular.repository;

import com.partying.crud_fullstack_angular.entity.Beneficiary;
import com.partying.crud_fullstack_angular.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiaryRepository extends JpaRepository<Beneficiary, Integer> {

}
