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

public class Problem2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		Date d = new Date();
		String d1 = d.toString().replaceAll(":", "-");
		System.out.println(d1);
		System.setProperty("webdriver.chrome.driver", "./Resurce012/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
		for(int i=1;i<=3;i++) {
			JavascriptExecutor jse=(JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);
			TakesScreenshot tss=(TakesScreenshot)driver;
			File src = tss.getScreenshotAs(OutputType.FILE);
			Thread.sleep(1000);
			File dis = new File("C:\\Users\\Vinu\\Desktop\\ScreenShots\\file2"+d1+".jpg");
			FileHandler.copy(src, dis);
			Thread.sleep(3000);
		}
		driver.close();

	}

}
