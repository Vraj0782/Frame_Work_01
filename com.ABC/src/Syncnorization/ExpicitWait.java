package Syncnorization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Resurce012/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebDriverWait wait=new  WebDriverWait(driver, 10);
		
	wait.until(ExpectedConditions.urlContains("facebook"));
		wait.until(ExpectedConditions.titleContains("Facebook"));
		WebElement ele = driver.findElement(By.id("pass"));
		wait.until(ExpectedConditions.visibilityOf(ele)).sendKeys("hello");
		driver.findElement(By.id("email")).sendKeys("hi");
		WebElement ele1 = driver.findElement(By.name("login"));
		wait.until(ExpectedConditions.elementToBeClickable(ele1)).click();
		Thread.sleep(2000);
		//driver.close();
	}

}
