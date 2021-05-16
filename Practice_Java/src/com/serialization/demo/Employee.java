package com.serialization.demo;
import java.io.Serializable;

public class Employee implements Serializable {

//	private static final long serialVersionUID = -6470090944414208496L;
	
	private String name;
	private int id;
	transient private int salary;
//	private String password;
	
	@Override
	public String toString(){
		return "Employee{name="+name+",id="+id+",salary="+salary+"}";
	}
	
	//getter and setter methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
	
}
/*Serialization is usually used When the need arises to send your data over network or stored in files. 
By data I mean objects and not text. ... Serialization is the translation of your Java object's 
values/states to bytes to send it over network or save it.*/