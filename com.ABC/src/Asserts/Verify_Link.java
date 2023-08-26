package Asserts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.IAssert;

public class Verify_Link {
	@Test
	public void Link() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Resurce012/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		String text = ele.getText();
		System.out.println(text);
	Assert.assertEquals(text, "Forgotten password?");
	Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("hello");
		
			
	}
	
	
	
	

}
