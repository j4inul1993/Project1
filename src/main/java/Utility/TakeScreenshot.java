package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class TakeScreenshot {
	public static void getScreenshot(WebDriver driver,String picturename) throws IOException {
		File folder= new File("./target/Screenshot");
		if (!folder.exists()) {
			folder.mkdir();
		}
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		Files.copy(file, new File(picturename+".png")); 
		
		
	}

}
