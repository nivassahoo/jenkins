package Tools_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import Utility.CaptureScreenshot;

public class Screenshot_pass_cases {
  
	WebDriver driver;
	
  @Test
  public void takeScreenshot() 
  {
	  driver = new FirefoxDriver();
	  
	  driver.get("http://www.google.com");
	  driver.manage().window().maximize();
	  CaptureScreenshot.getScreenShot(driver, "google");
	  
	  driver.findElement(By.name("q")).sendKeys("nivas");
	  
	  CaptureScreenshot.getScreenShot(driver, "enterKey");
	  
	  /*driver.findElement(By.name("btnK")).click();
	  
	  CaptureScreenshot.getScreenShot(driver, "searchwindow");*/
	  
	  
  }
}
