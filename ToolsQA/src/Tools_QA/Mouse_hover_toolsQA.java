package Tools_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_hover_toolsQA {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		/*driver.get("http://store.demoqa.com/");
		
		WebElement w1 = driver.findElement(By.xpath(".//*[@id='menu-item-33']/a"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(w1).perform();
		
		WebElement w2 = driver.findElement(By.xpath(".//*[@id='menu-item-36']/a"));
		
		action.moveToElement(w2);
		action.click();
		action.perform();*/
		
		driver.get("http://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[2]/div/div[1]/ul/li[8]/a")).click();
		driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div/"
				+ "div[1]/div/div[4]/div[2]/input")).sendKeys("zizumaniac@gmail.com");
		driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div/"
				+ "div[1]/div/div[4]/div[4]/input")).sendKeys("nivas9036");
		driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div/div[1]/div/div[4]/div[7]/input")).click();
		Thread.sleep(10000);
		
		WebElement women = driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[3]/a"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(women).perform();
		
		WebElement brandShops = driver.findElement(By.linkText("Brand Shops"));
		
		action.moveToElement(brandShops).perform();
		
		WebElement biba = driver.findElement(By.linkText("Biba"));
		
		action.moveToElement(biba);
		action.click().perform();
		
		
	}

}
