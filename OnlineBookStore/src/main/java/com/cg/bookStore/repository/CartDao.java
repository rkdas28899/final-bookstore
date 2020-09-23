package com.cg.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookStore.model.CartInformation;

public interface CartDao extends JpaRepository<CartInformation, Integer>{

}
