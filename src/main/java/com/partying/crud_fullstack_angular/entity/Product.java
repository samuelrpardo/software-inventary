package com.partying.crud_fullstack_angular.entity;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;
    private String code;
    private String name;
    private String description;
    private String um;
    private Integer status;

    @ManyToOne
    @JoinColumn(name = "brandid")
    private Brand brand;

    public Product() {
    }

    public Product(Integer id, String code, String name, String description, String um, Integer status, Brand brand) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.description = description;
        this.um = um;
        this.status = status;
        this.brand = brand;
    }

    public Product(String code, String name, String description, String um, Integer status, Brand brand) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.um = um;
        this.status = status;
        this.brand = brand;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
