package com.cg.bookStore.exception;

public class InvalidQuantityException extends Exception{

	@Override
	public String getMessage() {
		
		return "Invalid quantity added";
	}

	
	
}
