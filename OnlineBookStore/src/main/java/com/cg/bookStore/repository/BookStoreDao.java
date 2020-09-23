package com.cg.bookStore.repository;

import java.util.List;

import com.cg.bookStore.model.BookInformation;
import com.cg.bookStore.model.CartInformation;
import com.cg.bookStore.model.CustomerInformation;
import com.cg.bookStore.model.OrderInformation;


public interface BookStoreDao {
	
	public List<CartInformation> viewCartByCustomerId(int customerId);

	public boolean removeCartItem(CartInformation cart);

	public CartInformation viewCartByCartId(int cartId);

	public boolean updateCartQuantity(CartInformation cart);

	public List<OrderInformation> viewOrderByCustomerId(int customerId);

	public String addBookToCart(CartInformation cart);
	
	public List<BookInformation> viewBooks();
	
	public BookInformation getBook(int bookId);
	
	public void addCustomer(CustomerInformation customer);


}
