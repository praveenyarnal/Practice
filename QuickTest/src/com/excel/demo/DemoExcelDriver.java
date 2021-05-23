package com.excel.demo;
import java.util.List;

import com.excel.demo.ExcelDriver;
public class DemoExcelDriver {

	public static void main(String[] args) throws Exception {
		
		ExcelDriver excel = new ExcelDriver();
		excel.openExcelWorkbook("Resource//TestData.xlsx");
		
		String cellData=excel.getCellData("Login", 1, 2);
		System.out.println("Value from Excel "+cellData);
		excel.setCellData("Sheet2", 1, 3, "123");
		List<String> excelData=excel.getAllCellValuesOfRow("Login", 1);
		System.out.println(excelData);
		excel.save();
		
	}
}
