package readAndWrite;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteDataDemo {
	
public static void main(String[] args) throws IOException {
		
		//Step 1 - create an object of fileWriter class
		//FileWriter fr = new FileWriter("C:\\Users\\LENOVO\\eclipse-workspace\\new-workspace\\JavaLearningKickStart\\src\\main\\java\\readAndWrite\\TestData.properties");
		FileOutputStream fis = new FileOutputStream(System.getProperty("user.dir")+"\\\\src\\\\main\\\\java\\\\readAndWrite\\\\TestData1.properties");
		
		//Step 2 - create an object of properties class
		Properties p = new Properties();

		//Step 3 - Use set property method to set property
		p.setProperty("url", "rvc");	
		p.store(fis, "Sample comment");
		}


}
