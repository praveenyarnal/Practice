package com.demo.test;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<String> list= new ArrayList<>();
		list.add("Praveen");
		list.add("Yarnal");
		list.add("mahalingapur");
		System.out.println(list); 
		list.set(0, "Abhishek");// [Abhishek, Yarnal, mahalingapur]  --> to Replace in specific index-> Update the List
		System.out.println(list);
		list.add(0, "Praveen");  
		System.out.println(list);//[Praveen, Abhishek, Yarnal, mahalingapur]--> Just adds at specified pos and pushes the other elements further
}
}
