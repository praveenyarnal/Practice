package Com.Test.AssignmentImpl;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Com.Test.Assgnment.LoginPage;
import Com.Test.Functions.GenericFunctions;

public class LoginPageImpl extends LoginPage {
	GenericFunctions gf=GenericFunctions.getInstance();

	@Override
	public void loginToFaceBook(WebDriver driver,String strTCID) throws IOException, InterruptedException {		
		
		
		driver.navigate().to(gf.getTestData(strTCID, "URL","Login"));
		gf._setValue(txt_Email, gf.getTestData(strTCID, "UserName","Login"));
		gf._setValue(txt_Password, gf.getTestData(strTCID, "Password","Login"));
		gf._click(btn_Login);
		Thread.sleep(2000);
		gf._waitFor(btn_Post);
		 Actions actions = new Actions(driver);
	     actions.moveToElement(txt_PostStatus).perform();
	     gf._click(txt_PostStatus);
	     actions.sendKeys(gf.getTestData(strTCID, "PostComment","FB"));
	     gf._click(btn_Post);
	        
	        

	}

}
