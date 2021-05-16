package com.demo.test;

import static java.lang.System.*; //static import is used to import all the static members of class 

public class Test {
	final int i;

	Test(int x) {
		i = x;
	}

	public static void main(String[] args) {

		/*
		 * try { out.println("Welcome"); System.out.println("to");
		 * out.println("WCI"); // calling without using System class } catch
		 * (Exception e) {
		 * 
		 * System.out.println(e); }
		 */
		/*
		 * int x=-10; System.out.println(x>>1); int y=10;
		 * 
		 * System.out.println(y>>1);
		 */
		/*
		 * int[] arr1={1,2,3}; int[] arr2={1,2,3};
		 * 
		 * if(arr1.equals(arr2)){ System.out.println("Same"); } else
		 * System.out.println("Not same");
		 */

		Test t1 = new Test(10);
		Test t2 = new Test(20);

		System.out.println(t1.i);
		System.out.println(t2.i);

	}
}
