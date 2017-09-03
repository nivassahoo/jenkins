package Tools_QA;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DependsOn {
  @Test(dependsOnMethods = {"MainPage123"})
  public void OpenBrowsers()
  {
	  System.out.println("Open Browsers");
  }
  
  @Test
  public void MainPage123()
  {
	  System.out.println("Main Page");
  }
  @Test
  public void HomePage1()
  {
	  System.out.println("Home Page");
  }
  @Test
  public void LogIn()
  {
	  System.out.println("Log In");
  }
   
  @Test
  public void LogOut()
  {
	  System.out.println("Log Out");
  }
  @BeforeSuite
  public void beforeSuite() 
  {
	  System.out.println("@Before Suite");
  }

  @AfterSuite
  public void afterSuite()
  {
	  System.out.println("@After Suite");
  }

}
