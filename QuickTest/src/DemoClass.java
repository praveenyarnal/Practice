import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoClass {

	public static void main(String[] args) {
		
		try {
			System.setProperty("webdriver.chrome.driver", 
					"E:\\Java_Practice\\Jars\\chromedriver.exe");
			
			WebDriver  Driver= new ChromeDriver();
			
			Driver.get("https://www.facebook.com/");
			
			Thread.sleep(5000);
			
			Driver.close();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
