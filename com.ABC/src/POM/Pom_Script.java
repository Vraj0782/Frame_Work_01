package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_Script {
	
	// Deceleration
	@FindBy(id="email")
	private WebElement e;
	
	// Initialization
	@FindBy(id="pass")
	private WebElement e1; 
	
	// Utilization
	@FindBy(name="login")
	private WebElement e2;

	public Pom_Script(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
 public WebElement Un_text()
 {
	 return e;
 }
 public WebElement pas_text()
 {
	 return e1;
 }
 public WebElement log_butt()
 {
	 return e2 ;
 }

}
