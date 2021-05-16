package com.testNG.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassOne {

	@BeforeClass
	public void beforeClass(){
		System.out.println("beforeClass - ClassOne");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("beforeMethod - ClassOne");
	}
	@Test
	public void TestOne(){
		System.out.println("Running TestOne - ClassOne |"+Thread.currentThread().getId());
	}
	@AfterClass
	public void afterClass(){
		System.out.println("AfterClass - ClassOne");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("AfterMethod - ClassOne");
	}
	
	
}
