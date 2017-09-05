package Tools_QA;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Priority {
  @Test(priority = 2)
  public void four()
  {
	  System.out.println("Priority Two for jenkins");
	  Reporter.log("Report-1");
  }
  
  @Test(priority = 1)
  public void three()
  {
	  System.out.println("Priority one for jenkins");
	  Reporter.log("Report-1");
  }
  
  @Test(priority = 3)
  public void six()
  {
	  System.out.println("Priority three for jenkins");
	  Reporter.log("Report-1");
  }
}
