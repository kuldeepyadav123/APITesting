package TestUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Propertyclass
{
	
	public static  Properties propertiesmethod(String filepath) throws IOException
	{
		
		File f = new File(filepath);
		
		 FileInputStream fi = new FileInputStream(f);
		Properties pr = new Properties();
		pr.load(fi);
		return pr;
		
		
	}
	
	
}
