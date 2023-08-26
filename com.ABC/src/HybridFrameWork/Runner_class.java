package HybridFrameWork;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Runner_class extends Base_Class
{
@Test
public void Access() throws IOException, InterruptedException
{
	
	POM_class p=new POM_class(driver);
	p.text().sendKeys("shooes");
	p.text().sendKeys(Keys.ENTER);
	//WebElement all = p.All_Links();
	Gen_TakeScreen.Get_Screen(driver);
}
}
