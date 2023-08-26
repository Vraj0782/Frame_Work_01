package Syncnorization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./Resurce012/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
	driver.findElement(By.id("email")).sendKeys("hi");
	driver.findElement(By.id("pass")).sendKeys("@123");
	driver.findElement(By.name("login")).click();
	driver.close();
	
}
}
