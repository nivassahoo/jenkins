package Tools_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Asserts {
	
	public static WebDriver driver;
  @Test
  public void asserts() 
  {
	  driver = new FirefoxDriver();
		driver.get("http://store.demoqa.com/");
		Reporter.log("Application is launched!!");
		driver.findElement(By.className("account_icon")).click();
		driver.findElement(By.id("log")).sendKeys("testuser_1");
		driver.findElement(By.id("pwd")).sendKeys("Test@123");
		WebElement e1 = driver.findElement(By.id("log"));
		String element1 = e1.getAttribute("value");
		Assert.assertEquals(element1, "testuser_2", "FAILED Test");
		System.out.println("Passed");
		  
	  
  }
}
