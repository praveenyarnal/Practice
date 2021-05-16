package Analyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int count=0;
	int maxLimit=4;
	@Override
	public boolean retry(ITestResult result) {
		if(count<maxLimit){
			++count;
			return true;		
		}
		return false;
	}

}
