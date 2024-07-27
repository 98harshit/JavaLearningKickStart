package readAndWrite;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadDataDemo {
	
	public static void main(String[] args) throws IOException {
		
		//Step 1 - create an object of filereader class
		//FileReader f = new FileReader("C:\\Users\\LENOVO\\eclipse-workspace\\new-workspace\\JavaLearningKickStart\\src\\main\\java\\readAndWrite\\TestData.properties");
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\\\src\\\\main\\\\java\\\\readAndWrite\\\\TestData.properties");
		
		//Step 2 - create an object of properties class
		Properties p = new Properties();
		
		//Step 3 - Load the file
		p.load(fis);
		
		//Step 4 - Use get property method to get property
		System.out.println(p.getProperty("website"));
		//System.out.println(System.getProperty("user.dir"));
	}

}
