package reporting_tool;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.FileAppender;
import org.apache.log4j.PatternLayout;
import org.testng.annotations.Test;

import freemarker.log.Logger;

public class log_tool {
@Test
public void run() throws IOException
{
	PatternLayout layout=new PatternLayout("%d %c %m %n");
	Appender appender=new FileAppender(layout, "./Reports/log_4j_report.html");
	BasicConfigurator.configure(appender);
	Logger log = Logger.getLogger(this.getClass().getName());
	log.warn("WARNING");
	log.info("any information");
	log.error("error");
	
}
}
