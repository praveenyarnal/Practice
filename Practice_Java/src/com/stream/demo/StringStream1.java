package com.stream.demo;


public class StringStream1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="Testing the Streams";
		long count=str.chars().filter(e-> (char)e=='e').count();
		System.out.println("The occurence of letter e is "+ count);	
		}

}
