package com.listner.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.listner.demo.TestNGListner.class)
public class MyFirstTestCase {
	@Test
	public void Test1(){
		System.out.println("Running Test 1");
		assertTrue(true);
	}
	@Test
	public void Test2(){
		System.out.println("Running Test 2");
		assertTrue(false);
	}
	
}
