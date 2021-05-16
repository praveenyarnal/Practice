package Com.Test.AssignmentImpl;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import Com.Test.Assgnment.WalletHubRating;
import Com.Test.Functions.GenericFunctions;

public class WalletHubRatingImpl extends WalletHubRating {
	GenericFunctions gf=GenericFunctions.getInstance();
	
	public void verify_Add_ReviewComments(WebDriver driver, String strTCID) throws IOException, InterruptedException 
	{
			driver.navigate().to(gf.getTestData(strTCID, "URL","Login"));
      
	        Actions actions = new Actions(driver);
	        actions.moveToElement(img_fivthStar).perform();
	        gf._click(img_fivthStar);
	        Thread.sleep(2000);
	        gf._click(lst_PolicyType);
	        Thread.sleep(2000);
	        gf._click(lst_HelthIns);
	        Thread.sleep(2000);
	        gf._click(txt_Review); 
			gf._setValue(txt_Review, gf.getTestData(strTCID, "Review","Rating"));
			gf._click(btn_Submit);
			gf._waitFor(btn_GetQuote);
			String strActReviewComment=txt_ReviewComments.getText();
			  Assert.assertEquals(strActReviewComment, gf.getTestData(strTCID, "Review","Rating"));
	}

}
