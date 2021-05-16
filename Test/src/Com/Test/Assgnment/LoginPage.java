package Com.Test.Assgnment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Com.Test.Functions.GenericFunctions;

public abstract class LoginPage
{
	//public GenericFunctions gf;

	@FindBy(xpath= "//input[@id='email']")
	public static WebElement txt_Email;
	@FindBy(xpath= "//input[@id='pass']")
	public WebElement txt_Password;
	@FindBy(xpath= "//input[@value='Log In")
	public WebElement btn_Login;
	@FindBy(xpath= "//div[text()='Account Settings']")
	public WebElement lnk_AccountSettings;
	@FindBy(xpath= "//span[text()='Log Out']")
	public WebElement lnk_LogOut;
	@FindBy(xpath="//div[@aria-label='Create a post']//div[contains(text(),'Write something here...')]")
	public WebElement txt_PostStatus;
	@FindBy(xpath="//span[text()='Post']/..")
	public WebElement btn_Post;
	
	
	public abstract void loginToFaceBook(WebDriver driver,String strTCID) throws IOException, InterruptedException;
	/*{
	
		WebDriver driver;
		
		gf._setValue(txt_Email, gf.getTestData(strTCID, "UserName"));
		gf._setValue(txt_Password, gf.getTestData(strTCID, "Password"));
		gf._click(btn_Login);
		
	}*/
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	