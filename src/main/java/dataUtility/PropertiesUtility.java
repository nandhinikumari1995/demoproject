package dataUtility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility {
	
	private FileInputStream fis;
	private Properties pobj;
	
	 public PropertiesUtility() {
		 try {
	       fis = new FileInputStream("./src/test/resources/DataStorage/data.properties");
			
			pobj = new Properties();
			pobj.load(fis);
		 }catch(Exception e) {
		  e.printStackTrace();
		   }
		 }
	 
public String getDataFromProperty(String key)	{
	return pobj.getProperty(key);
}

}
