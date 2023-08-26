package reporting_tool;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hpsf.Property;
import org.testng.annotations.Test;

public class prop {
@Test
public  void pro() throws FileNotFoundException, IOException
{
	Properties p=new Properties();
	p.load(new FileInputStream("./p.properties"));
	String uri = p.getProperty("url");
	System.out.println(uri);
	String nam = p.getProperty("un");
	System.out.println(nam);
	
}
}
