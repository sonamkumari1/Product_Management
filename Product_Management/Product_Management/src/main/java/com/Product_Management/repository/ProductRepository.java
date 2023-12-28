package com.Product_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Product_Management.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
