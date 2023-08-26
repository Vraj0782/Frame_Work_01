package Basic_Hybrid_Framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	@FindBy(id="email")
	private WebElement e;
	
	@FindBy(name="email")
	private WebElement e1;
	@FindBy(name="email")
	private WebElement e2;
	
	public PomClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public WebElement un_text()
	{
		return e;
	}
	
	public WebElement pas_text()
	{
		return e1;
	}
	public WebElement log_butt()
	{
		
		return e2;
	}
}
