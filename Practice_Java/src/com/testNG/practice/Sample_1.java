package com.testNG.practice;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Sample_1 {

	//--> By default, methods annotated by @Test are executed alphabetically. 
	/*@Test
	public void c_test(){
		Assert.fail();
	}
	@Test
	public void b_test(){
		Assert.assertTrue(true);
	}
	@Test
	public void a_test(){
		throw new SkipException("Skipping a_test using skip exception present in the testNG package");
	}*/
	//--> If you want to alter the order of execution you can make use of priority
	@Test(priority=20)
	public void c_test(){
		System.out.println("From c_test");
		Assert.fail();
		
	}
	@Test(priority=10)
	public void b_test(){
		System.out.println("From b_test");
		Assert.assertTrue(true);
	}
	@Test(priority=30)
	public void a_test(){
		System.out.println("From a_test");
		throw new SkipException("Skipping a_test using skip exception present in the testNG package");
	}
	@Test(enabled=false)
	public void d_test(){
		System.out.println("From d_test");
		
	}
	
}
