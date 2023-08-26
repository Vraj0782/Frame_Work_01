package Asserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Asserts {
	@Test
	public void Soft() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","./Resurce012/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

				driver.get("https://www.amazon.in/Noise-Launched-Bluetooth-Calling-Tracking/dp/B0BJ72WZQ7/ref=sr_1_1?_encoding=UTF8&content-id=amzn1.sym.431315b1-a020-46ac-b0de-57aa06376fcd&pd_rd_r=981d8f9f-44a0-457f-b4b3-8c83c6c692a5&pd_rd_w=iM1tT&pd_rd_wg=CEJ46&pf_rd_p=431315b1-a020-46ac-b0de-57aa06376fcd&pf_rd_r=5JR9NQCH709HM5FNX2VZ&qid=1691920318&sr=8-1&th=1");
		String title = driver.getTitle();
		System.out.println("title = "+title);
		SoftAssert sat=new SoftAssert();
		sat.assertEquals("title", "Noise Twist Bluetooth Calling Smart Watch with 1.38");
		 Thread.sleep(2000);
		 System.out.println("executed");
		 
	}

}
