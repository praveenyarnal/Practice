package com.testNG.practice;

import org.testng.annotations.Test;
//Running single Test with multiple threads
public class ParallelTest {

	@Test(threadPoolSize=3,invocationCount=2,timeOut=1000)
	public void Test1(){
		System.out.println("I'm In Test1 |"+Thread.currentThread().getId());
	}
	
	@Test
	public void Test2(){
		System.out.println("I'm In Test2 |"+Thread.currentThread().getId());
	}
	@Test
	public void Test3(){
		System.out.println("I'm In Test3 |"+Thread.currentThread().getId());
	}
}
