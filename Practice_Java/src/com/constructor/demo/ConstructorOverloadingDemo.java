package com.constructor.demo;

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
	/*	Parent parent= new Child();
		Child child= new Child();*/
		
		Parent parent1= new Child(10,20);
		Child child1= new Child(10,20);
		
	}
}
class Parent{
	public Parent(){
		System.out.println("Parent Default Constructor called");
	}
	
	public Parent(int a, int b){
		System.out.println("Parent Parameterized Constructor called");
	}
}

class Child extends Parent{

	public Child(){
		System.out.println("Child Default Constructor called");
	}
	
	public Child(int a, int b){
		System.out.println("Child Parameterized Constructor called");
	}
}