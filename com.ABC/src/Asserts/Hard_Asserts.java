package Asserts;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Asserts {
	@Test
	public void facebook() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Resurce012/chromedriver.exe");
		WebDriver driver=new ChromeDriver();

				driver.get("https://www.amazon.in/Noise-Launched-Bluetooth-Calling-Tracking/dp/B0BJ72WZQ7/ref=sr_1_1?_encoding=UTF8&content-id=amzn1.sym.431315b1-a020-46ac-b0de-57aa06376fcd&pd_rd_r=981d8f9f-44a0-457f-b4b3-8c83c6c692a5&pd_rd_w=iM1tT&pd_rd_wg=CEJ46&pf_rd_p=431315b1-a020-46ac-b0de-57aa06376fcd&pf_rd_r=5JR9NQCH709HM5FNX2VZ&qid=1691920318&sr=8-1&th=1");
		String title = driver.getTitle();
		System.out.println("title = "+title);
		Assert.assertEquals(title,"Noise Twist Bluetooth Calling Smart Watch with 1.38\" TFT Biggest Display, Up-to 7 Days Battery, 100+ Watch Faces, IP68, Heart Rate Monitor, Sleep Tracking (Jet Black) : Amazon.in: Electronics");
		Thread.sleep(2000);
				
		

	}

}
