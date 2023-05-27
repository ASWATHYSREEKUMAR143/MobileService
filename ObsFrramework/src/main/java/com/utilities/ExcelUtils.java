package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	public static final String currentDir = System.getProperty("user.dir");
	public static String filePath = currentDir + ".//src/test//resources//MobileserviceTestData.xlsx";
	static String excelPath;

	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static FileInputStream fs;
	static File file = new File(filePath);

	public ExcelUtils() {
		// excelPath=filePath+fileName;
		try {
			workbook = new XSSFWorkbook(filePath);
		} catch (IOException e) {
			throw new RuntimeException("Error during reading file");
		}
		sheet = workbook.getSheetAt(0);
	}

	public static int getRowCount() {
		int rowCount = 0;
		try {

			rowCount = sheet.getPhysicalNumberOfRows();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowCount;
	}

	public static int getColCount() {
		int colCount = 0;
		try {
			colCount = sheet.getRow(0).getLastCellNum();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return colCount;
	}

	public String readStringData(String sheetname, int rowNum, int colnum) {
		try {
			fs = new FileInputStream(file);
			workbook = new XSSFWorkbook(fs);
		} catch (IOException e) {
			throw new RuntimeException("Error during reading file");
		}
		sheet = workbook.getSheet(sheetname);
		String cellValue = sheet.getRow(rowNum - 1).getCell(colnum - 1).getStringCellValue();
		return cellValue;
	}

	public int readIntegerData(String sheetname, int rowNum, int colnum) {
		try {
			fs = new FileInputStream(file);
			workbook = new XSSFWorkbook(fs);
		} catch (IOException e) {
			throw new RuntimeException("Error during reading file");
		}
		sheet = workbook.getSheet(sheetname);
		int cellValue = (int) sheet.getRow(rowNum - 1).getCell(colnum - 1).getNumericCellValue();
		return cellValue;
	}

}
