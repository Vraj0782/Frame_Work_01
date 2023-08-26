package Excelhandler;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Resurce012/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");

		List<WebElement> ele = driver.findElements(By.xpath("//a"));
		int count = ele.size();
		System.out.println(count);
//		for (WebElement wele : ele) {
//			
//			String pri = wele.getAttribute("href");
//			System.out.println(pri);
//		}
		
		for (WebElement link : ele) {
			String att = link.getAttribute("href");
			//String value = att.toString();
		//	System.out.println(value);
			FileInputStream fil=new FileInputStream("./Excel/Book.xlsx");
			Workbook book = WorkbookFactory.create(fil);
			Sheet sh = book.getSheet("Sheet1");
			for(int i=0;i<count;i++)
			{
				Row r = sh.createRow(i);
				Cell cell = r.createCell(0);
				cell.setCellValue(att);
				Thread.sleep(1000);
			}
			FileOutputStream fot=new FileOutputStream("./Excel/Book.xlsx");
			book.write(fot);
			
		}
		

	}

}
