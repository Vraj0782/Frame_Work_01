package Java.Script.Extractror;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ExcecuteSript {

	public static void main(String[] args) throws InterruptedException, IOException {
		Date d = new Date();
		String date = d.toString().replaceAll(":", "/");
		System.setProperty("webdriver.chrome.driver", "./Resurce012/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
	for(int i=1;i<=3;i++)
	{
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
			}
		Thread.sleep(3000);
		driver.close();
		System.out.println(date);


	}

}
