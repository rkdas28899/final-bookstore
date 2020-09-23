package com.cg.bookStore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bookStore.exception.BookNotFoundException;
import com.cg.bookStore.exception.RecordNotFoundException;
import com.cg.bookStore.model.BookInformation;
import com.cg.bookStore.model.CartInformation;
import com.cg.bookStore.service.BookStoreService;

@RestController
public class BookStoreController {
	
	@Autowired
	public BookStoreService service;
	
	
	@GetMapping("/viewcartbycustomerid/{customerid}")
	public List<CartInformation> viewCartByCustomerId(@PathVariable("customerid") int customerId) {
			return service.viewCartByCustomerId(customerId);
	}
	
	@PostMapping("/addbooktocart/{bookid}/{customerid}/{status}")
	public String addBookToCart(@PathVariable("bookid") int bookId, @PathVariable("customerid")int customerId,
			@PathVariable("status")String status) throws BookNotFoundException {
		return service.addBookToCart(bookId, customerId, status);
	}
	
	@GetMapping("/viewallbooks")
	public List<BookInformation> viewdDiagnosisCentre() throws RecordNotFoundException {
		return service.viewBooks();
	}
	
	@DeleteMapping("/removecartitem/{cartid}")
	public boolean removeCartItem(@PathVariable("cartid") int cartId, HttpServletRequest request) {
		return service.removeCartItem(cartId);
	}
	
	@DeleteMapping("/clearcartbycustomerid/{customerid}")
	public boolean clearCartByCustomerId(@PathVariable("customerid") int customerId, HttpServletRequest request) {
		return service.clearCartByCustomerId(customerId);
	}
	
}
