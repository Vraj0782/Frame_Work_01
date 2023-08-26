package Prctice_form;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakePrac {

	public static void main(String[] args) throws IOException, InterruptedException {
		Date d = new Date();
		String date = d.toString().replace(":", "-");
		System.setProperty("webdriver.chrome.driver", "./Resurce012/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dst = new File("C:/Users/Vinu/Desktop/ScreenShots/file "+ date+ ".jpg");
		FileHandler.copy(src, dst);

		Thread.sleep(2000);
		driver.close();
	}

}
