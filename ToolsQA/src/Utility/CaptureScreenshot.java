package Utility;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenshot
{

	public static void getScreenShot(WebDriver driver , String fileName)
	{
		
		try {
			TakesScreenshot ts = (TakesScreenshot)driver;
			
	
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			FileUtils.copyFile(source, new File("./ScreenShot/"+fileName+".Png"));
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.getMessage();
		}
		 
		
		
	}
	
}
