package Tools_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Paytm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://paytm.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='user-detail']/div/div[3]/div[3]/div/span/a[1]")).click();
		
		WebElement frame = driver.findElement(By.xpath("//*[@id='ng-app']/head/iframe"));
		
	//	List<WebElement> iframes = driver.findElements(By.tagName("iframe"));
		
		
		driver.switchTo().frame(2);
		WebElement e1 = driver.findElement(By.xpath(".//*[@id='input_0']"));
		e1.sendKeys("nivas.titu@gmail.com");
		WebElement e2 = driver.findElement(By.xpath("//*[@id='input_1']"));
		e2.sendKeys("9040747104");
		driver.findElement(By.xpath("//*[@id='loginForm']/div/md-content/button[1]/img")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='input_3']")).sendKeys("9677165029");
		
		WebDriverWait wait = new WebDriverWait(driver , 5);
		
		
		
		
		

	}


}

