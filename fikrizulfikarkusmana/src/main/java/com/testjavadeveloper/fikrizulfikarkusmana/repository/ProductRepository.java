package com.testjavadeveloper.fikrizulfikarkusmana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testjavadeveloper.fikrizulfikarkusmana.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
}