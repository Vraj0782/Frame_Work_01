package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RunnerClass {

	@Test(enabled = false)
	public void getmethod() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Resurce012/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
		Pom_Script p= new Pom_Script(driver);
		p.Un_text().sendKeys("hi");
		Thread.sleep(2000);
		driver.navigate().refresh();
		p.pas_text().sendKeys("hello");
		Thread.sleep(2000);
		
		Thread.sleep(2000);
		p.log_butt().click();
		
		
		
		
	}
}
