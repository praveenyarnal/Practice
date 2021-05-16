package com.testNG.practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationOrder {

	@BeforeSuite
	public void beforeSuite(){
		System.out.println(" before suite");
	}
	@BeforeTest
	public void beforeTest(){
		System.out.println(" before Test");
	}
	@BeforeGroups
	public void beforeGroup(){
		System.out.println(" before Groups");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println(" before Class");
	}
	@BeforeMethod
	public void beforeMethod(){
		System.out.println(" before method");
	}
	@Test()
	public void testMethod(){
		System.out.println(" the acutal Test ");
	}
	@Test()
	public void testMethod_2(){
		System.out.println(" the acutal Test_2 ");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println(" after Method");
	}
	@AfterClass
	public void afterClass(){
		System.out.println(" After class");
	}
	@AfterGroups
	public void afterGroups(){
		System.out.println(" After Groups");
	}
	@AfterTest
	public void afterTest(){
		System.out.println(" after Test");
	}
	@AfterSuite
	public void afterSuite(){
		System.out.println(" after suite");
	}
}
//@BeforeTest : It will call Only once, before Test method. @BeforeMethod It will call Every time before Test Method.