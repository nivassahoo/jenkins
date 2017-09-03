package Tools_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Reports {
  
	public static WebDriver driver;
	
	@Test
  public void reporting() {
		
		driver = new FirefoxDriver();
		driver.get("http://store.demoqa.com/");
		Reporter.log("Application is launched!!");
		driver.findElement(By.className("account_icon")).click();
		driver.findElement(By.id("log")).sendKeys("testuser_1");
		driver.findElement(By.id("pwd")).sendKeys("Test@123");
		Reporter.log("Username and Password entered");
		driver.findElement(By.id("login")).click();
		Reporter.log("User logged in :)");
  }
}
