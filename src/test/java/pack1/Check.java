package pack1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class Check {

	Properties prop;
	
	
	@Test
	
	public void a1() throws IOException {
		
		
		
		FileInputStream fis = new FileInputStream("C:\\Users\\Prerna Pandey\\eclipse-workspace\\FileCheck\\resources\\data.properties");
		
		prop = new Properties();
		
		prop.load(fis);
		
		System.out.println(prop.getProperty("Name"));
		
		FileOutputStream f1 = new FileOutputStream("C:\\Users\\Prerna Pandey\\eclipse-workspace\\FileCheck\\resources\\data.properties");
		
		prop.setProperty("Name", "Peeyush");
		
		prop.store(f1, null);
		
			
			
	}
	
	
}
