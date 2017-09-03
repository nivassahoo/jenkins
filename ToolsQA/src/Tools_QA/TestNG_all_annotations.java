package Tools_QA;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNG_all_annotations {
  
	
  @Test(groups = {"car"})
  public void car1()
  {
	System.out.println("@Car 1");  
  }
  
  @Test(groups = {"car"} )
  public void car2()
  {
	  System.out.println("@Car 2");
  }
  
  @Test(groups = {"car"})
  public void car3()
  {
	  System.out.println("@car 3");
  }
  @Test(groups = {"scooter"} , priority=1)
  public void scooter1()
  {
	  System.out.println("@Scooter");
  }
  
  @Test(groups = {"scooter"},priority = 0)
  public void scooter2()
  {
	  System.out.println("@Scooter1");
  }
  
  @Test(groups = {"bike"})
  public void bike()
  {
	  System.out.println("@Bike");
  }
  @Test(groups = {"bike" , "scooter"}, enabled=false)
  public void scooterbike()
  {
	  System.out.println("@Bike and scooter");
  }
  
  @Test(enabled=false)
  public void test1()
  {
	  System.out.println("@Plain Test Method 1");
  }
  
  @Test(enabled=false)
  public void test2()
  {
	  System.out.println("@Plain Test Method 2");
  }
  
  @BeforeMethod
  public void beforeMethod()
  {
	System.out.println("@Before Method all");  
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("@After Method all");
  }

  @BeforeClass
  public void beforeClass() 
  {
	  System.out.println("@Before Class all");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("@After Class all");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("@Before Test all");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("@After Test all");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("@Before Suite all");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("@After Suite all");
  }

}
