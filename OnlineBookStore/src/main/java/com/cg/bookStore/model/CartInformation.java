package com.cg.bookStore.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;


@Entity
@Table(name="bookstore_cart")
@DynamicInsert
@DynamicUpdate
public class CartInformation {
	
	@Id
	@Column(name="cart_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="cartIdGenerator")
	@SequenceGenerator(name="cartIdGenerator", initialValue=1000)
	private int cartId;
	
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="status")
	private String status;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="book_id", referencedColumnName = "book_id")
	private BookInformation book=new BookInformation();

	@Column(name="SubTotal")
	private float subTotal;
	
	public float getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(float subTotal) {
		this.subTotal = subTotal;
	}
	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BookInformation getBook() {
		return book;
	}

	public void setBook(BookInformation book) {
		this.book = book;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


}
