package Asserts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basic_lanch {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Resurce012/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}

}
