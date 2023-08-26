package HybridFrameWork;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Gen_TakeScreen {

	public static void Get_Screen(WebDriver driver) throws IOException, InterruptedException
	{
		String d=new Date().toString().replaceAll(":","-");
		
		TakesScreenshot tss=(TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File trc = new File("C:/Users/Vinu/Desktop/ScreenShots/file77 "+ d+".jpg");
		FileHandler.copy(src, trc);
		Thread .sleep(2000);
		
		
	}
}
