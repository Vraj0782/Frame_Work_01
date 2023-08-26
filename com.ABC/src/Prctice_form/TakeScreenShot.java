package Prctice_form;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShot {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		Date d = new Date();
		String d1 = d.toString();
		String date = d1.replaceAll(":", "-");
		
		System.out.println(date);
		
		System.setProperty("webdriver.chrome.driver", "./Resurce012/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/");
		TakesScreenshot tss = (TakesScreenshot)driver;
	File src = tss.getScreenshotAs(OutputType.FILE);
	File dis = new File("C:/Users/Vinu/Desktop/ScreenShots/file1"+date +".jpg");
	org.openqa.selenium.io.FileHandler.copy(src, dis);
	
	Thread.sleep(3000);
	driver.close();
	}

	

}
