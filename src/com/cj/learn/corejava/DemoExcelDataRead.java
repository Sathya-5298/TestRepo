package com.cj.learn.corejava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DemoExcelDataRead 
{
	public static void main(String[] args) 
	{
		// Object [][] arr2 = readExcelData();
		
		// System.out.println(arr2[1][1]);
		// System.out.println(arr2[0][5]);
		
		 createExcel();
		
	}
	
	public static Object[][] readExcelData()
	{
		File file = new File("C:\\New folder\\ReadExcel.xlsx");

		XSSFWorkbook workBook;
		XSSFSheet sheet;
		Object[][] arr = new Object[0][0];

		try {
			FileInputStream excel = new FileInputStream(file);
			workBook = new XSSFWorkbook(excel);
			sheet = workBook.getSheet("Sheet1");
			int rowStart = sheet.getFirstRowNum();
			int rowLast = sheet.getLastRowNum();
			arr = new Object[rowLast - rowStart + 1][6];
			for (int i = rowStart; i <= rowLast; i++) {
				arr[i][0] = sheet.getRow(i).getCell(0).getStringCellValue();
				arr[i][1] = sheet.getRow(i).getCell(1).getStringCellValue();
				arr[i][2] = sheet.getRow(i).getCell(2).getNumericCellValue();
				arr[i][3] = sheet.getRow(i).getCell(3).getNumericCellValue();
				arr[i][4] = sheet.getRow(i).getCell(4).getStringCellValue();
				arr[i][5] = sheet.getRow(i).getCell(5).getDateCellValue();

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return arr;
	}
	
	public static void createExcel()
	{
		File file = new File("C:\\New folder\\CreateExcel.xlsx");

		XSSFWorkbook workBook = new XSSFWorkbook();
		XSSFSheet sheet = workBook.createSheet("DataSheet");
		
		Row row;
		Cell cell;
		
		for(int i = 0; i <= 9; i++)
		{
			row = sheet.createRow(i);
			for(int j = 0; j <= 9; j++)
			{
				cell = row.createCell(j);
				cell.setCellValue((i+1) * (j+1));
			}
		}
		
		try 
		{
			FileOutputStream fos = new FileOutputStream(file);
			workBook.write(fos);
			fos.close();
			workBook.close();
			
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
}
}
