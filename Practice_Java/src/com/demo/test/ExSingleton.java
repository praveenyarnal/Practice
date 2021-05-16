package com.demo.test;

public class ExSingleton {

	public int x=10;
	
	//1. Static Object member
	static ExSingleton instance=null;  
	
	//2. Private constructor to restrict object creation outside the class
	private ExSingleton(){}; 
	//provide Global Access point
	public static ExSingleton getInstance(){
		if(instance==null){
			instance= new ExSingleton();
		}
		return instance;	
	}
	
	//Check that return type is of type the Singleton class
	
}
