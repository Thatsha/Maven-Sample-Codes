package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Particular_Data_Driven_Concept {
	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\ThatshaMaven\\Excel\\DataDrivenFile.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		Sheet particular_Sheet = wb.getSheetAt(0);
		
		Row particular_Row = particular_Sheet.getRow(2);
		
		Cell particular_Cell = particular_Row.getCell(0);
		
		CellType particular_CellType = particular_Cell.getCellType();
		
		if (particular_CellType.equals(particular_CellType.STRING)) {
			String stringCellValue = particular_Cell.getStringCellValue();
			System.out.println(stringCellValue);
			}
		else if (particular_CellType.equals(particular_CellType.NUMERIC)) {
			double numericCellValue = particular_Cell.getNumericCellValue();
			int value=(int) numericCellValue;//NARROWING TYPE CASTING
			System.out.println( value);
		}
		
	}

}
