package test;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Analyzer.RetryAnalyzer;
//@Listeners(Analyzer.RetryTransformer.class)
public class SmokeTest {

	@Test(retryAnalyzer=RetryAnalyzer.class)
	public void test1(){
		System.out.println("From Test1");
		Assert.assertTrue(false);
		
	}
	@Test
	public void test2(){
		Assert.assertTrue(false);
	}
	@Test
	public void test3(){
		Assert.assertTrue(false);
	}
}
