package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleHomePage {
	
	static WebElement element = null;
	
	
	public static WebElement searchbox(WebDriver driver)
	{
		element = driver.findElement(By.name("q"));
		return element;
		
	}
	
	public static void txt_search(WebDriver driver , String query)
	{
		
		searchbox(driver).sendKeys(query);
	}

}
