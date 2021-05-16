package com.demo.test;

public class Student implements Cloneable {

	int rollNo;
	String name;
	public Student(int rollNo,String name){
		this.rollNo=rollNo;
		this.name= name;
	}
	public Object clone()throws CloneNotSupportedException{
		return super.clone();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"Amith");
		try {
			Student s2=(Student)s1.clone();
			System.out.println(s1.rollNo+" "+s1.name);  
			System.out.println(s2.rollNo+" "+s2.name);  
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
