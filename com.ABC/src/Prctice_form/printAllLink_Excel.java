package Prctice_form;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class printAllLink_Excel {

	public static void main(String[] args) throws FileNotFoundException {
		System.setProperty("webdriver.chrome.driver", "./Resurce012/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
	 List<WebElement> els = driver.findElements(By.xpath("//a"));
	 int count = els.size();
	 for (WebElement link : els)
	 {
	String att = link.getAttribute("href");
	FileInputStream fis=new FileInputStream("./Excel/Copy1.xlsx");
	
		 
	}
		
		
	}

}
