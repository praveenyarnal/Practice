package com.testNG.practice;

import org.testng.annotations.Test;

public class DataProviderDemo2 {

	@Test(dataProvider="dataSearch",dataProviderClass=DataProviderClass.class)
	public void test1(String uname,String passwd){
		System.out.println("uname |"+uname+"| passwd |"+passwd);
	}
}
