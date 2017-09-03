package Tools_QA;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.AfterGroups;

public class TestNG_Single {
 
	@BeforeGroups("Shopping")
	public void beforeGroups() {
		System.out.println("@BeforeGroups");
	}

	@AfterGroups("Shopping")
	public void afterGroups() {
		System.out.println("@AfterGroups");
	}
	
	@BeforeClass
	  public void beforeClass() {
		
	System.out.println("@Before Class");
	  }
	 @AfterClass
	  public void afterClass() {
		 System.out.println("@After Class");
		 
	  }
	 @BeforeMethod
	  public void beforeMethod() {
	 System.out.println("@Before Method"); 
	 }
	 @AfterMethod
	  public void afterMethod() {
		 System.out.println("@AfterMethod");
	  } 
	 
	 
	@Test
  public void runtest1() {
		System.out.println("@test run test1");
  }
  
@Test(groups = "Shopping")
public void runtest2()
{
	System.out.println("@test run test2");
}
 

  

 

}
