package Tools_QA;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class FlipKart_Add2Kart {

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
		
		Thread.sleep(6000);
		
		WebElement women = driver.findElement(By.xpath(".//*[@id='container']/div/div/header/div[1]/div/ul/li[3]/a"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(women).perform();
		
		WebElement casualshoes = driver.findElement(By.linkText("Casual Shoes"));
		
		action.moveToElement(casualshoes);
		action.click().perform();
		
	/*	driver.findElement(By.xpath(".//*[@id='products']/div/div[1]/div[1]/div/div[2]/div[1]/a")).click();
		
		
		String title = driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div[7]/div/div[3]/div/div/div[1]")).getText();
		System.out.println("Prdouct Title"+ title);
	//	System.out.println(title);
		
		String price = driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div[7]/div/div[3]/div/div/"
				+ "div[6]/div/div[3]/div[1]/div/div[1]/div/div[1]/div/span")).getText();
		*/
	//	System.out.println(price);
		
		/* click size  */
		
//	driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div[7]/div/div[3]/div/div/div[5]/div[3]/div[2]/div/div/span")).click();
	
	/* click add2kart */
	
/*	WebElement add2kart = driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div[7]/div/div[3]/div/div/div[6]/div/div[3]/div[1]/div/div[2]/div[1]/div[1]/form/input[8]"));
	action.moveToElement(add2kart);
	action.click().perform();
	
	Thread.sleep(6000);*/
	
		
	/* go to view cart */
	
	driver.findElement(By.xpath(".//*[@id='fk-mainhead-id']/div[1]/div/div[2]/div[3]/div[1]/a/span[2]")).click();
	
	
	/* verify the added product is displayed in the view cart */
	
	Thread.sleep(6000);
	WebElement tbody = driver.findElement(By.xpath(".//*[@id='cartpage-cart-tab-content']/table/tbody"));
	List<WebElement> rows = tbody.findElements(By.tagName("tr"));
	List<WebElement> columns = rows.get(0).findElements(By.tagName("td"));
	
	int maxRow = rows.size();
	int maxCol = columns.size();
	int c=0;
	String [] title1 = new String[maxRow];
	String matchname = "Wrangler Skinny Fit Fit Men's Grey Jeans";
	String matchprice = "Rs. 2,397";
	System.out.println("Lets try to search product " + matchname + "with price: " + matchprice);
	 
	for (int i = 1 ; i<=4 ; i++)
	{
		WebElement w1 = driver.findElement(By.xpath(".//*[@id='cartpage-cart-tab-content']/table/tbody/tr["+i+"]/td[1]/table/tbody/tr[1]/td[2]/span"));
		title1[i] = w1.getText();
		System.out.println(title1[i]);
		if(title1[i].equals(matchname))
		{
			String price = driver.findElement(By.xpath(".//*[@id='cartpage-cart-tab-content']/table/tbody/tr["+i+"]/td[3]/div/div[1]")).getText();
			
			if(price.equals(matchprice))
			{
			c++;
			System.out.println("String that matched  " + title1[i] +" having price " + price);
			}
		
		}
	}
	
	Assert.assertEquals(c, 1, "Cart contains more than one of the same product");
	
	System.out.println("Nice Coding DUDE!!");
	
	
	
	/*	WebElement brandShops = driver.findElement(By.linkText("Brand Shops"));
		
		action.moveToElement(brandShops).perform();
		
		WebElement biba = driver.findElement(By.linkText("Biba"));
		
		action.moveToElement(biba);
		action.click().perform();*/
		
		/* adding a product take the title name and price in string */
		
		/*WebElement product1 = driver.findElement(By.xpath(".//*[@id='products']/div/div[1]/div[1]/div/div[1]/a[1]/img"));
		
		product1.click();
		
		String title = driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div[7]/"
				+ "div/div[3]/div/div/div[1]/h1")).getText();
		
		driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div[7]/div/div[3]/div/"
				+ "div/div[5]/div[3]/div[2]/div/div/span")).click();
		
		
		
		String price = driver.findElement(By.xpath(".//*[@id='fk-mainbody-id']/div/div[7]/div/div[3]/div/div/"
				+ "div[6]/div/div[3]/div[1]/div/div[1]/div/div[1]/div/span")).getText();
		
		System.out.println(title+" "+price);*/
				
		
	}
	
}
