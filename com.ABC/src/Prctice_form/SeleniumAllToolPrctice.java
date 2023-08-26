package Prctice_form;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumAllToolPrctice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Resurce012/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Vinay");
	driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("R");
	driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("Viraj40009@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Male']")).click();
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("9019280782");
	
	driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	
	WebElement Drp1 = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
	Select sle=new Select(Drp1);
	sle.selectByVisibleText("2021");
//
//	Thread.sleep(2000);
//	WebElement Drp2 = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
//		
//	Select sle2=new Select(Drp2);
//	sle2.selectByIndex(8);	
//	Thread.sleep(2000);
//	driver.findElement(By.xpath("//div[text()='19']")).click();
//	
//
//	driver.findElement(By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']")).click();
//	driver.findElement(By.xpath("//div[@class='subjects-auto-complete__control css-yk16xz-control']")).sendKeys("Tester");
	
}
}
