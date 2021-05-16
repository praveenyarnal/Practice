package Com.Test.Assgnment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public abstract class WalletHubRating {
	
	@FindBy(xpath= "(//h3[text()='Your Rating']/..//div[@class='rating-box-wrapper']//*[local-name() = 'svg'])[last()]")
	public static WebElement img_fivthStar;
	@FindBy(xpath= "//span[text()='Select...']")
	public WebElement lst_PolicyType;
	@FindBy(xpath= "//li[text()='Health Insurance']")
	public WebElement lst_HelthIns;
	@FindBy(xpath= "//span[text()='//textarea[@class='textarea wrev-user-input validate']")
	public WebElement txt_Review;
	@FindBy(xpath= "//div[text()='Submit']")
	public WebElement btn_Submit;
	@FindBy(xpath= "//span[contains(text(),'Shivaraj B')]/../../..//div[@class='rvtab-ci-content with-links text-select']")
	public WebElement txt_ReviewComments;
	@FindBy(xpath = "//button[text()='Get Quote']")
	public WebElement btn_GetQuote;
	
	public abstract void verify_Add_ReviewComments(WebDriver driver,String strTCID) throws IOException, InterruptedException;

}
