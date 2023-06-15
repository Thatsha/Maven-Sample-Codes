package com.datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_New_Data_Concept {
	
	public static void main(String[] args) throws IOException {
		
		File file=new File("C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\ThatshaMaven\\Excel\\DataDrivenFile.xlsx");
		
		FileInputStream fis=new FileInputStream(file);
		
		Workbook wb=new XSSFWorkbook(fis);
		
		//wb.createSheet("DataDriven").createRow(0).createCell(0).setCellValue("Students Name");
		wb.getSheet("DataDriven").getRow(0).createCell(1).setCellValue("Age");
		wb.getSheet("DataDriven").createRow(1).createCell(0).setCellValue("Thatsha");
		wb.getSheet("DataDriven").getRow(1).createCell(1).setCellValue(28);
		wb.getSheet("DataDriven").createRow(2).createCell(0).setCellValue("Suba");
		wb.getSheet("DataDriven").getRow(2).createCell(1).setCellValue(34);
		wb.getSheet("DataDriven").createRow(3).createCell(0).setCellValue("Disha");
		wb.getSheet("DataDriven").getRow(3).createCell(1).setCellValue(27);
		
		FileOutputStream fos=new FileOutputStream(file);
		
		wb.write(fos);
		wb.close();
		
		System.out.println("Successfully");
		
		
		
		
	}
	

}
