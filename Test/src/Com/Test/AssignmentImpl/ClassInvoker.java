package Com.Test.AssignmentImpl;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Com.Test.Assgnment.LoginPage;

public class ClassInvoker{
	
	public void LogintoFaceBook(WebDriver driver,String strTCID ) throws IOException, InterruptedException
	{
		LoginPageImpl login=new LoginPageImpl();
		login.loginToFaceBook(driver,strTCID);	
	}
	public void verify_Add_ReviewComments(WebDriver driver,String strTCID ) throws IOException, InterruptedException
	{
		WalletHubRatingImpl lightAccount=new WalletHubRatingImpl();
		lightAccount.verify_Add_ReviewComments(driver, strTCID);	
	}

}
