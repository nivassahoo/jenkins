package Tools_QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class window_handles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		String parentwindow = driver.getWindowHandle();
		System.out.println("Parent window is " + parentwindow);
		WebElement e1 = driver.findElement(By.xpath("//*[@id='button1']"));
		
		for(int i = 0 ; i<3 ; i++)
		{
			WebDriverWait wait = new WebDriverWait(driver, 60);
			wait.until(ExpectedConditions.elementToBeClickable(e1));
			e1.click();
			//Thread.sleep(10000);
		}
		String lastwindow = "";
		for(String handles : driver.getWindowHandles())
{
//	System.out.println("Window handle : " + handles);
	System.out.println("Switching to window : " + handles);
	System.out.println("Navigating to google !");
	driver.switchTo().window(handles);
	driver.get("https://www.google.com");
	lastwindow = handles;
	
}
		driver.switchTo().window(parentwindow);
		driver.close();
		driver.switchTo().window(lastwindow);
}
		
	}


