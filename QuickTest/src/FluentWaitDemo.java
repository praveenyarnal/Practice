import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.google.common.base.Function;

public class FluentWaitDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", 
				"E:\\Java_Practice\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
		
		 FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(500, TimeUnit.MILLISECONDS);
		 wait.withTimeout(50, TimeUnit.SECONDS);
		 wait.ignoring(NoSuchElementException.class);
		 
		 // we are creating Function here which accept webdriver and output as WebElement-
		 WebElement element = wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver driver) {
				 WebElement ele = driver.findElement(By.xpath("//p[@id='demo']"));

				 if (ele.getAttribute("innerHTML").equalsIgnoreCase("Webdriver")) {
					 System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));
					 return ele;
				 }
				// If condition is not true then it will return null and it will keep checking until condition is not true
				 else{
					 System.out.println("Value is >>> " + ele.getAttribute("innerHTML"));
					 return null;
				 }
			}
		 
		 });
		 System.out.println("Final visible status is >>>>> " + element.isDisplayed());
		 driver.close();
		 driver.quit();
	}

}
