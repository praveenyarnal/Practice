package com.listner.demo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListner implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("The Test case "+result.getName()+" is started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("The Test case "+result.getName()+"is Passed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("The Test case "+result.getName()+"is Passed");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("The Test case "+result.getName()+"is Passed");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("The Test case "+context.getName()+"is Just Started");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("The Test case "+context.getName()+"is Just Finished");
	}

}
