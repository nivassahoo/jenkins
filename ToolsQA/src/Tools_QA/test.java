package Tools_QA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[2]/div/div[1]/ul/li[8]/a")).click();
		driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div/"
				+ "div[1]/div/div[4]/div[2]/input")).sendKeys("zizumaniac@gmail.com");
		driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div/"
				+ "div[1]/div/div[4]/div[4]/input")).sendKeys("nivas9036");
		driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div/div[1]/div/div[4]/div[7]/input")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[2]/div/div[2]/div/a/span[2]")).click();
		
		Thread.sleep(6000);
		WebElement tbody = driver.findElement(By.xpath(".//*[@id='cartpage-cart-tab-content']/table/tbody"));
		List<WebElement> rows = tbody.findElements(By.tagName("tr"));
		List<WebElement> columns = rows.get(0).findElements(By.tagName("td"));
		
		int maxRow = rows.size();
		int maxCol = columns.size();
		int c=1;
		String [] title = new String[maxRow];
		String match = "ASIAN Casuals (Navy, Pink)";
		
		for (int i = 1 ; i<=2 ; i++)
		{
			WebElement w1 = driver.findElement(By.xpath(".//*[@id='cartpage-cart-tab-content']/table/tbody/tr["+i+"]/td[1]/table/tbody/tr[1]/td[2]/span"));
			title[i] = w1.getText();
			if(title[i].equals(match))
			{
				c++;
				
			}
			
		}
		
		Assert.assertEquals(c, 1, "Cart contains more than one of the same product");
		
		System.out.println("Nice Coding DUDE!!");
		
		
			
	}

}
