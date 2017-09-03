package Tools_QA;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class switch_command__getwindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-switch-windows/");
		String handle = driver.getWindowHandle();
		System.out.println("Original Window handle name is  "+ handle);
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#content > p:nth-child(5) > button")));
		driver.findElement(By.xpath("//*[@id='content']/p[3]/button")).click();
		
		for(String handle1 : driver.getWindowHandles())
		{
			System.out.println("Window handles name  " + handle1);
			driver.switchTo().window(handle1);
		}
		driver.close();
		
		driver.quit();
		
	}

}
