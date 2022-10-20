package com.testjavadeveloper.fikrizulfikarkusmana.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.testjavadeveloper.fikrizulfikarkusmana.entity.ShoppingCart;

@Repository
public interface ShoppingCartRepository extends JpaRepository<ShoppingCart,Integer> {

}