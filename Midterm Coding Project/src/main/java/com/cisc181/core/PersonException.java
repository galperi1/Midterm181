package com.cisc181.core;

public class PersonException extends Exception{

	private Person perp;
	
	public PersonException(String message)
	{
		super(message);
	}
}
