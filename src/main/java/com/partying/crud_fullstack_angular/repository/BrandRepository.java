package com.partying.crud_fullstack_angular.repository;

import com.partying.crud_fullstack_angular.entity.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
