package Prctice_form;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takeScreen1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Date d = new Date();
		String date = d.toString().replaceAll(": ","-");
			
		System.setProperty("webdriver.chrome.driver", "./Resurce012/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		//driver.close();
		TakesScreenshot tss=(TakesScreenshot)driver;
		File scr = tss.getScreenshotAs(OutputType.FILE);
		File dis = new File("C:/Users/Vinu/Desktop/ScreenShots/file"+date +".jpg");
	//	driver.close();
		org.openqa.selenium.io.FileHandler.copy(scr, dis);
		//Thread.sleep(2000);
		driver.close();
		}

}
