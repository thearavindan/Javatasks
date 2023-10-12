package excelsheet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writeoperation {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("sheet1");
		Object [][] data = {
				{"Name","Age","email"},
				{"John Doe",30,"johndoe@test.com"},
				{"John Doe",28,"johndoe@test.com"},
				{"Bob smith",35,"jacky@examole.com"},
				{"Swapnil",37,"joe@example.com"}
				};
		int rowcount = 0;
		for(Object[] row1 : data) {
			XSSFRow row = sheet.createRow(rowcount++);
			int columncount =0;
			for(Object col : row1) {
				XSSFCell cell = row.createCell(columncount++);
				if(col instanceof String) {
					cell.setCellValue((String)col);
				}else if(col instanceof Integer){
					cell.setCellValue((Integer)col);
				}
				
			}
 			
		}
      try(FileOutputStream output = new FileOutputStream("task13.xlsx")){
    	  book.write(output);
      }
    book.close();  
}
}