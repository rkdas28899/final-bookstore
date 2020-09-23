package com.cg.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookStore.model.Admin;

public interface AdminDao extends JpaRepository<Admin, Integer>{

}
