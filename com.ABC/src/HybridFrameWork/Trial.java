package HybridFrameWork;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Trial extends Base_Class
{
@Test
public void lanch_borwser() throws InterruptedException
{
	WebElement ele = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	ele.sendKeys("hello");
	//ele.click();
	Thread.sleep(2000);
	ele.sendKeys(Keys.ENTER);
}
}
