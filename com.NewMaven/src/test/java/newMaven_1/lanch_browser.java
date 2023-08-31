package newMaven_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lanch_browser {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.findElement(By.id("email")).sendKeys("hello");
		driver.findElement(By.name("pass")).sendKeys("Bye");
		driver.findElement(By.name("login")).click();

	}

}
