package reporting_tool;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class repo_tool {
@Test
public void run()
{
	ExtentReports rep=new ExtentReports("./Reports/extent_report.html");
	ExtentTest test = rep.startTest("test1");
	test.log(LogStatus.PASS, "pass");
	test.log(LogStatus.FAIL, "fail");
	test.log(LogStatus.SKIP, "skip");
	rep.endTest(test);
	rep.flush();
}
}
