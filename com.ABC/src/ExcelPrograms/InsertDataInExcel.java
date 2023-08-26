package ExcelPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class InsertDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
		
//		FileInputStream file=new FileInputStream("./Excel/Book1.xlsx");
//		Workbook book = WorkbookFactory.create(file);
//		
//		Sheet sh = book.getSheet("sheet1");
//		
//		Row ro = sh.createRow(11);
//		Cell cell = ro.createCell(1);
//		cell.setCellValue("rajajinagar");
//	FileOutputStream fout=new FileOutputStream("./Excel/Book1.xlsx");
//	book.write(fout);
		
		FileInputStream file=new FileInputStream("C:/Users/Vinu/Desktop/excelsheets/Us&Pss.xlsx");
		Workbook book = WorkbookFactory.create(file);
		
		Sheet sh = book.getSheet("A1");
		
		Row ro = sh.createRow(12);
		
		Cell cell = ro.createCell(1);
		
		cell.setCellValue("Rajajinagar");
		FileOutputStream fout=new FileOutputStream("C:/Users/Vinu/Desktop/excelsheets/Us&Pss.xlsx");
		book.write(fout);
		
		
		
	}

}
