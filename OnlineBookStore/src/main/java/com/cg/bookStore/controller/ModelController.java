package com.cg.bookStore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookStore.model.Admin;
import com.cg.bookStore.model.BookInformation;
import com.cg.bookStore.model.CartInformation;
import com.cg.bookStore.model.CustomerInformation;
import com.cg.bookStore.service.ModelService;


@RestController
public class ModelController {
	
	@Autowired
	ModelService service;
	
	@PostMapping("/addNewCustomer")
	public CustomerInformation addNewCustomer(@RequestBody CustomerInformation customer) {
		return service.addNewCustomer(customer);
	}
	
	@PostMapping("/addNewAdmin")
	public Admin addNewAdmin(@RequestBody Admin admin) {
		return service.addNewAdmin(admin);
	}
	
	@PostMapping("/addNewBook")
	public BookInformation addNewBook(@RequestBody BookInformation book) {
		return service.addNewBook(book);
	}
	
	@PostMapping("/addNewCart")
	public CartInformation addNewCart(@RequestBody CartInformation cart) {
		return service.addNewCart(cart);
	}
	
	@GetMapping("/allCustomer")
	public List<CustomerInformation> getAllCustomers() {
		return service.allCustomer();
	}
	
	@GetMapping("/allAdmin")
	public List<Admin> getAllAdmins() {
		return service.allAdmin();
	}
	
	@GetMapping("/allBook")
	public List<BookInformation> getAllBooks() {
		return service.allBook();
	}
	
	@GetMapping("/allCart")
	public List<CartInformation> getAllCarts() {
		return service.allCart();
	}
}
