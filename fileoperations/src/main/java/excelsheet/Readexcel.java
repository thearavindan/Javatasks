package excelsheet;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcel {
	public static void main(String[] args) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook ("C:\\Users\\Aravind\\eclipse-workspace\\fileoperations\\task13.xlsx");
		XSSFSheet sheet = wb.getSheet("sheet1");
		int rowcount = sheet.getLastRowNum();
		int columncount = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowcount][columncount];
		for(int i=1;i<=rowcount;i++) {
			XSSFRow row = sheet.getRow(i);
			for(int j=0;j<columncount;j++) {
				XSSFCell cell = row.getCell(j);
				data[i-1][j] = cell.getStringCellValue();
				System.out.println(cell.getStringCellValue());
				wb.close();
				
			}
		}
		
		
	}
}
