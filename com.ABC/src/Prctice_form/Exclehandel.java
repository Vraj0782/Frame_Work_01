package Prctice_form;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exclehandel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fel=new FileInputStream("./Excel/Copy1.xlsx");
				Workbook Book = WorkbookFactory.create(fel);
		Sheet sheet = Book.getSheet("Sheet1");
		Row row = sheet.getRow(0);
		Cell cell = row.getCell(0);
	String value = cell.toString();
	System.out.println(value);
	System.setProperty("webdriver.chrome.driver", "./Resurce012/chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("file:///C:/Users/Vinu/Desktop/Htmlfiles/TextBox.html");
	driver.findElement(By.id("b")).sendKeys(value);

	}

}
