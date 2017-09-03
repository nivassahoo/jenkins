package Tools_QA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowser {
	WebDriver driver;
	
	  @Test
	  public void f()
	  {
		  System.out.println("Inside test metthod now...hurray!!!");
	  }
	  
	  
	 /* @BeforeTest
	  @Parameters(value = {"Browsers"})
	  public void beforeTest(@Optional("Firefox")String Browsers)
	  {
		  if(Browsers.equalsIgnoreCase("Firefox"))
		  {	
			  driver = new FirefoxDriver();
			  driver.get("http://toolsqa.com/selenium-tutorial/");
			  driver.manage().window().maximize();
		  }
		  else if (Browsers.equalsIgnoreCase("Chrome"))
		  {
			  
			  String path = "‪F:\\Career\\chromedriver.exe";
			  System.setProperty("webdriver.chrome.driver", path);
			  driver = new ChromeDriver();
			  driver.get("http://toolsqa.com/selenium-tutorial/");
			  driver.manage().window().maximize();
		  }
		  
	  }*/
	  
	  @Parameters("Browsers")
	  @BeforeClass
	  public void afterTest(String Browsers)
	  {
		  if(Browsers.equalsIgnoreCase("Firefox"))
		  {
			  System.out.println("Firefox");
		  }
		  else if(Browsers.equalsIgnoreCase("Chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver", "F:\\Career\\Chrome Driver\\chromedriver.exe");
			  driver = new ChromeDriver();
			  driver.get("https://www.google.co.in");
			  driver.manage().window().maximize();
		  }
	  }




}
