package com.cg.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookStore.model.CustomerInformation;

public interface CustomerDao extends JpaRepository<CustomerInformation, Integer>{

}
