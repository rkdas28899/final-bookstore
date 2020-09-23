package com.cg.bookStore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.bookStore.model.BookInformation;

public interface BookDao extends JpaRepository<BookInformation, Integer>{

}
