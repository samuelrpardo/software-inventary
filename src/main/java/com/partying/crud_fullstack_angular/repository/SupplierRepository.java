package com.partying.crud_fullstack_angular.repository;

import com.partying.crud_fullstack_angular.entity.Brand;
import com.partying.crud_fullstack_angular.entity.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SupplierRepository extends JpaRepository<Supplier, Integer> {

}
