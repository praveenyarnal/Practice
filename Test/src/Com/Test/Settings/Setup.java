package Com.Test.Settings;
	
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Com.Test.Functions.GenericFunctions;

public class Setup  {
	public WebDriver driver;
	

		@BeforeSuite
		public void initializeTestBaseSetup() {
			try {
				GenericFunctions gf= GenericFunctions.getInstance();
				String browserType=gf.getConfigDetails("Browser");
				String driverPath=gf.getConfigDetails("DriverPath");
				String url=gf.getConfigDetails("URL");
				setDriver(browserType,driverPath,url);

			} catch (Exception e) {
				System.out.println("Error....." + e.getStackTrace());
			}
		}

		private void setDriver(String browserType,String driverPath,String url) throws IOException {
			switch (browserType) {
			case "chrome":
				driver =  initChromeDriver(driverPath);
				break;
			case "firefox":
				driver =  initFirefoxDriver(driverPath);
				break;
			case "ie":
				driver =  initIEDriver(driverPath,url);
				break;
			default:
				System.out.println("browser : " + browserType + " is invalid, Launching Firefox as browser of choice..");
				driver =  initFirefoxDriver(driverPath);
			}
		}

		public static WebDriver initChromeDriver(String driverPath) throws IOException {
			System.out.println("Launching google chrome with new profile..");
			
			System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
			//driver.navigate().to(appURL);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			return driver;
		}

		public static WebDriver initFirefoxDriver(String appURL){
			System.out.println("Launching Firefox browser..");
			WebDriver driver = new FirefoxDriver();
			//driver.manage().window().maximize();
			driver.navigate().to(appURL);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			return driver;
		}

		public static WebDriver initIEDriver(String driverPath,String appURL){
			
			 System.setProperty("webdriver.ie.driver", driverPath +"IEDriverServer.exe");
             //Initialize InternetExplorerDriver Instance.
             WebDriver driver = new InternetExplorerDriver();
             
			System.out.println("Launching IE browser..");
			driver.get("http://www.google.com");
			//driver.manage().window().maximize();
			//driver.get(appURL);
			///driver.navigate().to(appURL);
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			return driver;
		}

		
		
		 @AfterMethod
		    public void updateResult(Method method,ITestResult testResult) throws IOException 
		 {
			
			 FileInputStream fis;
			 try
			 {
				 GenericFunctions gf= GenericFunctions.getInstance();
		    	String strMethodName=method.getName();
		    	String strDataID=gf.getDataSetID(strMethodName);
		    	File dirt=new File("@/");
				String strDirPath=dirt.getAbsolutePath().split("\\@")[0];
				String driverConfigPath=strDirPath+"Resource/TestSet.xlsx";
				fis=new FileInputStream(new File(driverConfigPath));
				XSSFWorkbook workbook=new XSSFWorkbook(fis);
				XSSFSheet sheet=workbook.getSheet("Config");
				int intTotalRow=sheet.getLastRowNum();
				int intcolNum=gf.findExcelColumn(sheet, "Result");
				for(int i=1;i<=intTotalRow;i++)
				{
					String strexcelValue=sheet.getRow(i).getCell(0).getStringCellValue().trim();
					if(strexcelValue.equals(strMethodName))
					{
						if(testResult.isSuccess())
						{
						
							sheet.getRow(i).createCell(intcolNum).setCellValue("PASS");
						}
						else
						{
							sheet.getRow(i).createCell(intcolNum).setCellValue("FAIL");	
						}
					}
				}
				
				
				FileOutputStream fos=new FileOutputStream(new File(driverConfigPath));
				workbook.write(fos);
				fis.close();
				fos.close();
				}
				catch(Exception ex)
				{
				ex.printStackTrace();	
				}
			}
				
		    
		 
		 @BeforeSuite
		    public void tearDown() {
		    	if(driver!=null) {
		    		driver.quit();
		    	}
		    }
	}


