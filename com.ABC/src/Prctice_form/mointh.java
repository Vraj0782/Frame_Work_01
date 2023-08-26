package Prctice_form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class mointh {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Resurce012/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.id("dateOfBirthInput")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select sel1=new Select(month);
		sel1.selectByVisibleText("February");
		WebElement year = driver.findElement(By.className("react-datepicker__year-select"));
		Select sel2=new Select(year);
		sel2.selectByVisibleText("1998");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='16']")).click();
		
}
}
