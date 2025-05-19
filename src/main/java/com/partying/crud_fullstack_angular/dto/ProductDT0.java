package com.partying.crud_fullstack_angular.dto;

public class ProductDT0 {
    private String code;
    private String name;
    private String description;
    private int status;
    private int brandid;

    public ProductDT0() {
    }

    public ProductDT0(String code, String name, String description, int status, int brandid) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.status = status;
        this.brandid = brandid;
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

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getBrandid() {
        return brandid;
    }

    public void setBrandid(int brandid) {
        this.brandid = brandid;
    }
}
