package com.testNG.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	
	@Test(dataProvider="dataSource")
	public void login(String uname,String passwd, String info){
		System.out.println("uname |"+uname+"| passwd |"+passwd+"| info "+info);
	}//the number of arguments to the method login  depend on the number of  items passing  
	
	@DataProvider(name="dataSource")
	public Object[][] dataPass(){
		return new Object[][]{
			{"Ram","Pass1","info1"},
			{"Sham","Pass2","info2"},
			//{"Krishna","Pass3","info3"}
		
		};
		
	}
}
