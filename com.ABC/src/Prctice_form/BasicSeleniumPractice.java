package Prctice_form;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Resurce012/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		driver.findElement(By.id("firstName")).sendKeys("Hello");
		driver.findElement(By.id("lastName")).sendKeys("java");
		driver.findElement(By.id("userEmail")).sendKeys("Vinay123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("9019280782");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
	}

}
