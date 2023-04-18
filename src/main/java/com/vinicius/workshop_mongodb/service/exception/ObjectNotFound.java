package com.vinicius.workshop_mongodb.service.exception;

public class ObjectNotFound extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public ObjectNotFound (String msg) {
		super(msg);
	}
	

}
