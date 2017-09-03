package Tools_QA;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import Utility.CaptureScreenshot;

public class AssrtionTest {
	public WebDriver driver;
  @Test
  public void a() 
  {
	  int x = 1;
	  int y=1;
	  Assert.assertEquals(x, y);
  }
  @Test
  public void b()
  {
	  int a=1;
	  int b =1;
	  Assert.assertEquals(a, b);
  }
  @Test
  public void c()
  {
	  int s=1;
	  int d=2;
	  Assert.assertEquals(s, d);
  }
  @Test
  public  void d()
  {
	  int r=1;
	  int t=2;
	  Assert.assertEquals(r, t);
  }
  @AfterMethod
  public void tearDown(ITestResult result)
  {
   
  // Here will compare if test is failing then only it will enter into if condition
  if(result.getStatus()==ITestResult.FAILURE)
  {
 System.out.println("status of result"+result.getStatus());
 System.out.println(ITestResult.FAILURE);
 CaptureScreenshot.getScreenShot(driver, result.getName());
  
 
  }
  }
  
}
