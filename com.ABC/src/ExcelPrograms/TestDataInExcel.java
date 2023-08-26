package ExcelPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
//		FileInputStream fil=new FileInputStream("C:\\\\Users\\\\Vinu\\\\Desktop\\\\Un&Pass.xlsx");
//		Workbook book = WorkbookFactory.create(fil);
//		Sheet sh = book.getSheet("A1");
//		Row ro = sh.getRow(1);
//		Cell cell = ro.getCell(1);
//		String value = cell.toString();
//		System.out.println();
		
		
		FileInputStream file=new FileInputStream("C:\\Users\\Vinu\\Desktop\\Un&Pass.xlsx");
		Workbook book = WorkbookFactory.create(file);
		Sheet sh = book.getSheet("A1");
		for (int i=0;i<8;i++) {
		Row row = sh.getRow(i);
		Cell cell = row.getCell(0);
		String value = cell.toString();
		Thread.sleep(1000);
		System.out.println(value);
		}
		
		
	}

}
