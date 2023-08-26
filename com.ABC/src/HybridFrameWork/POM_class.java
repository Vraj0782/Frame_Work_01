package HybridFrameWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_class
{
@FindBy(xpath ="//input[@id='twotabsearchtextbox']")
private WebElement text_box;
@FindBy(xpath = "//a")
private WebElement link;
	
public  POM_class(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement text()
{
	return text_box;
}
public WebElement All_Links()
{
	return link;
}
}
