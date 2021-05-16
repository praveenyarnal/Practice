package com.testNG.practice;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsDemo {

	@BeforeGroups
	public void beforeGroup(){
		System.out.println("Before Group");
	}
	@AfterGroups
	public void afterGroup(){
		System.out.println("After Group");
	}
	@Test(groups={"Regression","ETE"})
	public void func_1(){
		System.out.println("Running in Function 1 with Groups Regression and ETE");
	}
	
	@Test(groups={"Regression"})
	public void func_2(){
		System.out.println("Running in Funciton 2 with Group Regression");
	}
	@Test(groups={"Smoke"})
	public void func_3(){
		System.out.println("Running in Funciton 3 with Group Smoke");
	}
	
	
	
}
