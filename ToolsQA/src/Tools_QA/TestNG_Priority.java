package Tools_QA;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Priority {
  @Test(priority = 2)
  public void four()
  {
	  System.out.println("Priority two");
	  Reporter.log("Report-1");
  }
  
  @Test(priority = 1)
  public void three()
  {
	  System.out.println("Priority one");
	  Reporter.log("Report-1");
  }
  
  @Test(priority = 3)
  public void six()
  {
	  System.out.println("Priority three");
	  Reporter.log("Report-1");
  }
}
