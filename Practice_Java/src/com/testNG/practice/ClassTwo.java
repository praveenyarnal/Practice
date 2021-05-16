package com.testNG.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassTwo {

	@BeforeClass
	public void beforeClass(){
		System.out.println("beforeClass - ClassTwo");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("beforeMethod - ClassTwo");
	}
	@Test
	public void TestTwo(){
		System.out.println("Running TestTwo - ClassTwo |"+Thread.currentThread().getId());
	}
	@AfterClass
	public void afterClass(){
		System.out.println("AfterClass - ClassTwo");
	}
	@AfterMethod
	public void afterMethod(){
		System.out.println("AfterMethod - ClassTwo");
	}
}
