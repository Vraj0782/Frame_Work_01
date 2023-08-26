package HybridFrameWork;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Class implements Final_Data_inter
{ public static WebDriver driver;
@BeforeMethod
public void lanch_bro()
{
	System.setProperty(key, value);
	driver =new ChromeDriver() ;
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(url);
}
@AfterMethod
public void close_bro()
{
	driver.close();

}


}
