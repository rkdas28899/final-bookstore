package com.cg.bookStore.service;

import java.util.List;

import com.cg.bookStore.exception.BookNotFoundException;
import com.cg.bookStore.exception.InvalidQuantityException;
import com.cg.bookStore.exception.RecordAlreadyPresentException;
import com.cg.bookStore.exception.RecordNotFoundException;
import com.cg.bookStore.model.BookInformation;
import com.cg.bookStore.model.CartInformation;
import com.cg.bookStore.model.OrderInformation;

public interface BookStoreService {

	public List<CartInformation> viewCartByCustomerId(int customerId);

	public String addBookToCart(int bookId, int customerId, String status)  throws BookNotFoundException;

	public boolean removeCartItem(int cartId);

	public boolean clearCartByCustomerId(int customerId);

	public String updateCart(int cartId,int quantity) throws InvalidQuantityException ;
	
	public OrderInformation addOrder(OrderInformation order) throws RecordAlreadyPresentException;
	
	public OrderInformation viewOrderById(int id);
	
	public Iterable<OrderInformation> listAllOrder();
	
	public List<OrderInformation> viewOrderByCustomerId(int customerId);
	
	public List<BookInformation> viewBooks() throws RecordNotFoundException;


}
