package Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import POM.GoogleHomePage;


public class BaseSetup {

	public static void main(String[] args) {
		
		WebDriver driver;
		 driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		GoogleHomePage.txt_search(driver,"BLAH BLAH!!");

	}

}
