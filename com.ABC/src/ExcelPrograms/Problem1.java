package ExcelPrograms;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Problem1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream fis=new FileInputStream("./Excel/Book1.xlsx");
Workbook book = WorkbookFactory.create(fis);
Sheet sh = book.getSheet("Sheet1");
Row r = sh.getRow(0);
Cell cell = r.getCell(5);
System.out.println(cell);


 
	}

}
