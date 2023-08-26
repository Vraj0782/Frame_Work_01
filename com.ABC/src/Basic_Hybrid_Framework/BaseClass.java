package Basic_Hybrid_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements Frame_work_const
{
WebDriver driver;
	@BeforeMethod
	public void befor_method()
	{
		System.setProperty(chrome_key,chrome_value);
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(base_url);
		
	}
	@AfterMethod
	public void Aft_method()
	{
		driver.close();
	}
	
	
}
