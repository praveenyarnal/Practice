package com.testNG.practice;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	// Observe if Data Provider method is outside the class it should be static.
	@DataProvider(name="dataSearch")
	public static Object[][] dataSearch(){
		return new Object[][] {
			{"Ram","Pass1"},
			{"Sham","Pass2"}
			
		};
	}
}
