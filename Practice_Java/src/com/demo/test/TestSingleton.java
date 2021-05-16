package com.demo.test;

public class TestSingleton {

	public static void main(String[] args) {

		ExSingleton a= ExSingleton.getInstance();
		ExSingleton b= ExSingleton.getInstance();
		
		a.x=a.x+10;
		System.out.println("The value of x when accessed from b object is "+b.x);
		System.out.println("check if both are same objects "+a.equals(b));
		System.out.println(a+" "+b);
	}

}
