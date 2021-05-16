package Analyzer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class RetryTransformer implements IAnnotationTransformer{

	@Override
	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		// TODO Auto-generated method stub
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
	}

}
//  Steps to run the failed test cases 
//1. Create a RetryAnalyzer class which implements IRetryAnalyzer Interface
//2. Include retry overridden method in RetryAnalyzer class. The Method has The object of ITestResult 
//& logic with maxLimit & Count  Finaly it returns the boolean value
//3. Register the RetryAnalyzer class in RetryTrnasformer class
//   using overridden method setRetryAnalyzer method.
//4. use the attribute retryAnalyzer for @Test and set the RetryAnalyzer class 

//3. 