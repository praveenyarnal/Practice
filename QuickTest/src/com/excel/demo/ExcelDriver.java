package com.excel.demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDriver {

	// To read from a file
	private InputStream fileReader;
	
	//To write into a file
	private OutputStream fileWriter;
	
	//Create a workbook
	private Workbook excelWorkbook;
	
	//Default Name for a file
	private String excelFileName; 
	
	//filename - Complete path including filename
	public void createExcelWorkbook(String filename)throws Exception{
		
		filename = filename.trim();
		
		if(filename.isEmpty()){
			System.out.println("Invalid filename");
			throw new Exception("Invalid filename");
		}
		
		if(new File(filename).exists()){
			throw new Exception("File already exists");
		}
		
		if(filename.endsWith("xlsx")){
			excelWorkbook=new XSSFWorkbook();
		}
		else if (filename.endsWith("xls")) {
			excelWorkbook=new HSSFWorkbook();
		}
		else {
			throw new Exception("Invalid File Extension...");
		}
		fileWriter=new FileOutputStream(filename);
		
		excelWorkbook.write(fileWriter);
		
		fileWriter.close();
		
		excelWorkbook.close();
		
	}
	public void openExcelWorkbook(String filename) throws Exception{
		
		
		filename = filename.trim();
		
		if(filename.isEmpty()){
			throw new Exception("File Name not specified");
		}
		
		if(! (new File(filename)).exists()){
			throw new Exception("File doesnot exist.. ");
		}
		
		//Reading data from an excel sheet
		fileReader = new FileInputStream(filename);
		
		//Assigning sheet name to a global variable
		excelFileName = filename;
		
		//Representing or converting raw data read from an excel into excel workbook format
		excelWorkbook = WorkbookFactory.create(fileReader);
	
}
	
	public String getCellData(String sheetName, int iRow, int iCell) throws Exception{
		sheetName = sheetName.trim();
		
		if(sheetName.isEmpty()){
			throw new Exception("Sheet name not specified..");
		}
		
		Sheet oSheet;
		
		oSheet = excelWorkbook.getSheet(sheetName);
		
		if(oSheet == null){
			throw new Exception("Sheet doesnot exist...");
		}
		
		if(iRow < 1 || iCell < 1){
			throw new Exception("Row and cell Index start from 1");
		}
		
		Row oRow;
		
		oRow = oSheet.getRow(iRow-1);
		if(oRow == null ){
			return "";
		} 
		
		Cell oCell;
		
		oCell = oRow.getCell(iCell-1);
		
		if(oCell == null ){
			return "";
		} else {
			
			if(oCell.getCellType() == CellType.NUMERIC){
				
				return String.valueOf(oCell.getNumericCellValue());
		
			} else {
			return oCell.getStringCellValue();
		}
			
		}

}

//----------------------------------------------------------------------------

public void setCellData(String sheetName, int iRow, int iCell, String sValue) throws Exception{

		sheetName = sheetName.trim();
		
		if(sheetName.isEmpty()){
			throw new Exception("Sheet name not specified..");
		}
		
		Sheet oSheet;
		
		oSheet = excelWorkbook.getSheet(sheetName);
		
		if(oSheet == null){
			throw new Exception("Sheet doesnot exist...");
		}
		
		if(iRow < 1 || iCell < 1){
			throw new Exception("Row and cell Index start from 1");
		}
		
		Row oRow;
		
		oRow = oSheet.getRow(iRow-1);
		
		if(oRow == null){
			
			oSheet.createRow(iRow-1);
			oRow = oSheet.getRow(iRow-1);
		} 
		
		Cell oCell;
		
		oCell = oRow.getCell(iCell-1);
		
		if(oCell == null ){
			oRow.createCell(iCell-1);
			oCell = oRow.getCell(iCell-1);
		} 
		oCell.setCellValue(sValue);
}

	public List<String> getAllCellValuesOfRow(String sheetName,int rowNum) throws Exception {
		List<String> data=new ArrayList<>();
		Sheet oSheet=excelWorkbook.getSheet(sheetName);
		if(rowNum < 1 ){
			throw new Exception("Row and cell Index start from 1");
		}
		
		Row oRow;
		
		oRow = oSheet.getRow(rowNum-1);
		if(oRow == null ){
			return data;
		} 
		for (Cell oCell : oRow) {

			if (oCell.getCellType() == CellType.NUMERIC) {

				data.add(String.valueOf(oCell.getNumericCellValue()));

			} else {
				data.add(oCell.getStringCellValue());
			}
		}

		return data;

	}
	public void save() throws Exception{
		
		fileWriter = new FileOutputStream(excelFileName);
		excelWorkbook.write(fileWriter);
		fileWriter.close();
	
}
}
