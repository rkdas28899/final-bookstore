package com.cg.bookStore.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.bookStore.model.OrderInformation;

@Repository
public interface OrderDao extends JpaRepository<OrderInformation, Integer>{

}
