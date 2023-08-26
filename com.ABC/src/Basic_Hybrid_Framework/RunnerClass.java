package Basic_Hybrid_Framework;

import org.testng.annotations.Test;

public class RunnerClass extends BaseClass
{

	@Test
	public void Lanch() throws InterruptedException
	{
		PomClass p=new PomClass(driver);

		p.un_text().sendKeys("hii");
		Thread.sleep(2000);
		p.pas_text().sendKeys("worls2");
		Thread.sleep(2000);
		p.log_butt().click();
		Thread.sleep(2000);

	}

}
