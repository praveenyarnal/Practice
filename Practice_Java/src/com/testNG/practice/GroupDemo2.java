package com.testNG.practice;

import org.testng.annotations.Test;

public class GroupDemo2 {

	
	@Test(groups={"Regression"})
	public void func_4(){
		System.out.println("Running in Funciton 4 with Group Regression in Another class GroupDemo2");
	}
}
