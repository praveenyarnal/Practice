package Com.Test.Functions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Com.Test.Settings.Setup;


public class GenericFunctions extends Setup
{
public String s;
    private static GenericFunctions gf = null; 
    private GenericFunctions() 
    { 
       s="hI";
    } 

    public static GenericFunctions getInstance() 
    { 
        if (gf == null) 
            gf = new GenericFunctions(); 
  
        return gf; 
    } 

	public void _click(WebElement element)
	{
		try
		{
			element.click();
		}
		catch(Exception ex)
		{

		}
	}
	public void _setValue(WebElement element,String value)
	{
		if(element.getTagName().equalsIgnoreCase("select"))
		{
			Select selectElement=new Select(element);
			try
			{
			
			selectElement.selectByVisibleText(value);
			}
			catch(Exception ex)
			{
				selectElement.selectByValue(value);
			}
		}
		else
		{
			element.clear();
			element.sendKeys(value);
		}
	}
	public void _waitFor(WebElement element)throws IOException
	{
		WebDriverWait wait=new WebDriverWait(driver,250);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	

	}
	
	public String getConfigDetails(String key)throws IOException
	{
		BufferedReader reader;
		Properties propertices;
		File dirt=new File("@/");
		String strDirPath=dirt.getAbsolutePath().split("\\@")[0];
		String driverConfigPath=strDirPath+"Resource/driverConfig.properties";
		reader=new BufferedReader(new FileReader(driverConfigPath));
		propertices=new Properties();
		propertices.load(reader);
		String strBrowser=propertices.getProperty(key);
		
		return strBrowser;
	}
	
	
	public String getTestData(String strTCID,String strColumn,String SheetName)throws IOException
	{
		FileInputStream fis;
		String strexcelValue="";
		String strExpTCID="";
		try
		{
		File dirt=new File("@/");
		String strDirPath=dirt.getAbsolutePath().split("\\@")[0];
		String driverConfigPath=strDirPath+"Resource/TestData.xlsx";
		fis=new FileInputStream(new File(driverConfigPath));
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(SheetName);
		int colID=findExcelColumn(sheet,strColumn);
		int intTotalrowCount=sheet.getLastRowNum();
		for(int i=1;i<=intTotalrowCount;i++)
		{
			strExpTCID= strexcelValue=sheet.getRow(i).getCell(0).getStringCellValue().trim();
			if(strExpTCID.equalsIgnoreCase(strTCID))
			{
				strexcelValue=sheet.getRow(i).getCell(colID).getStringCellValue().trim();
			break;	
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
		
		return strexcelValue;
	}
	public int findExcelColumn(XSSFSheet sheet,String strcolName)throws IOException
	{
		
		int colNum=0;
		try{
			int TotalNumCol=sheet.getRow(0).getLastCellNum();
			for(int i=0;i<TotalNumCol;i++)
			{
				String strcolNamr=sheet.getRow(0).getCell(i).getStringCellValue().trim();
				if(!strcolNamr.isEmpty()&&strcolNamr.equals(strcolName))
				{
					colNum=i;
					break;
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return colNum;
	}
	
	public int findExcelRow(XSSFSheet sheet,String strRowName)throws IOException
	{
		
		int rowNum=0;
		try{
			int intTotalRowCount=sheet.getLastRowNum();
			for(int i=0;i<intTotalRowCount;i++)
			{
				String strRowNam=sheet.getRow(i).getCell(0).getStringCellValue().trim();
				if(!strRowNam.isEmpty() && strRowNam.equals(strRowName))
				{
					rowNum=i;
					break;
				}
			}
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return rowNum;
	}
	
	public String getDataSetID(String strTCName)throws IOException
	{
		FileInputStream fis;
		String strexcelValue="";
		String strDataSetID="";
		try
		{
		File dirt=new File("@/");
		String strDirPath=dirt.getAbsolutePath().split("\\@")[0];
		String driverConfigPath=strDirPath+"Resource/TestSet.xlsx";
		fis=new FileInputStream(new File(driverConfigPath));
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("Config");
		int intTotalRow=sheet.getLastRowNum();
		int intTestName=findExcelColumn(sheet,"TestSetName");
		int intDataSetID=findExcelColumn(sheet,"DataSet ID");
		for(int i=1;i<=intTotalRow;i++)
		{
			strexcelValue=sheet.getRow(i).getCell(intTestName).getStringCellValue().trim();
			if(strexcelValue.equals(strTCName))
			{
				strDataSetID=sheet.getRow(i).getCell(intDataSetID).getStringCellValue().trim();
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
		
		return strDataSetID;
	}

	


}

