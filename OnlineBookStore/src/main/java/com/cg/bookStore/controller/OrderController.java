package com.cg.bookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookStore.exception.NullArgumentException;
import com.cg.bookStore.model.OrderInformation;
import com.cg.bookStore.service.BookStoreService;


@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	BookStoreService service;
	
	@PostMapping("/addOrder")
	public ResponseEntity<OrderInformation> addOrder(@RequestBody OrderInformation order) {
		if(order==null) {
			throw new NullArgumentException();
		}
		else {
			service.addOrder(order);
			return new ResponseEntity<OrderInformation>(order, HttpStatus.OK);
		}
	}	
	
	@GetMapping("/searchOrder/{orderId}")
	public ResponseEntity<OrderInformation> viewOrderById(@PathVariable("orderId") Integer id){
		OrderInformation order= service.viewOrderById(id);
		if(order!=null) {
			return new ResponseEntity<OrderInformation>(order, HttpStatus.OK);
		}
		else
			throw new NullArgumentException();
	}
	
	@GetMapping("/viewAllOrder")
	public Iterable<OrderInformation> viewAllOrder(){
		Iterable<OrderInformation> orderList= service.listAllOrder();
		return orderList;
	}
	
	
	@GetMapping("/viewOrderByCustomerId/{customerId}")
	public List<OrderInformation> viewOrderByCustomerId(@PathVariable("customerId") int customerId) {
		return service.viewOrderByCustomerId(customerId);
	}
	
}
