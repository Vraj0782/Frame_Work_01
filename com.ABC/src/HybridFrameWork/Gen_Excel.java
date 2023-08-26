package HybridFrameWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Gen_Excel {
	
public static void main(String[] args) throws EncryptedDocumentException, IOException
{
FileInputStream fis=new FileInputStream("./Excel/Book1.xlsx");
Workbook book = WorkbookFactory .create(fis);
	Sheet sh = book.getSheet("Sheet2");
	
	Row ro = sh.createRow(0);
	Cell cel = ro.createCell(0);
	cel.setCellValue("hii");
	
	
	FileOutputStream fout=new FileOutputStream("./Excel/Book1.xlsx");
	book.write(fout);
}
}
