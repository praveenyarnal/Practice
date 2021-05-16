package com.test.assign;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class test {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\workspace\\Test\\BrowserDriver\\chromedriver.exe");
        //Initialize InternetExplorerDriver Instance.
        WebDriver driver = new FirefoxDriver();
        
		System.out.println("Launching IE browser..");
		//driver.get("www.google.com");
		//driver.manage().window().maximize();
		//driver.get(appURL);
		driver.navigate().to("www.google.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);


	}

}
