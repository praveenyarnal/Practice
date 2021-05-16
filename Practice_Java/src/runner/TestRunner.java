package runner;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;

public class TestRunner {

	public static void main(String[] args) {
		//Step 1: Create an object of TestNG class -->runner
		TestNG runner=new TestNG();
		
		//Step 2: Create an array list of testNG xml files
		List<String> suiteList= new ArrayList<>();
		suiteList.add("C:\\Users\\HP\\workspace\\Practice_Java\\test-output\\SmokeTest\\testng-failed.xml");
		
		//Step 3: set the runner with the Array list from step 2 
		runner.setTestSuites(suiteList);
		
		//Step 4: Just run
		runner.run();
		
	}

}


