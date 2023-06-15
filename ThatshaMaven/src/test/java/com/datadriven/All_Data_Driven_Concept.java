package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_Data_Driven_Concept {
	private static void allData() throws IOException {
File file=new File("C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\ThatshaMaven\\Excel\\DataDrivenFile.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet particular_Sheet = wb.getSheetAt(0);
		
		int physicalNumberOfRows = particular_Sheet.getPhysicalNumberOfRows();
		
		for(int i=0;i<physicalNumberOfRows;i++) {
			Row particular_Row = particular_Sheet.getRow(i);
			int physicalNumberOfCells = particular_Row.getPhysicalNumberOfCells();
			
		for(int j=0;j<physicalNumberOfCells;j++) {
			Cell particular_Cell = particular_Row.getCell(j);
			CellType particular_CellType = particular_Cell .getCellType();
			if (particular_CellType.equals(particular_CellType.STRING)) {
				String stringCellValue = particular_Cell.getStringCellValue();
				System.out.println(stringCellValue);
				}
			else if (particular_CellType.equals(particular_CellType.NUMERIC)) {
				double numericCellValue = particular_Cell.getNumericCellValue();
				int value=(int) numericCellValue;//NARROWING TYPE CASTING
				System.out.println( value);
}}}}	
	public static void main(String[] args) throws IOException {
		allData();
	}
}
