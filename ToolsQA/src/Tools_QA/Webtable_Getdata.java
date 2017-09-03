package Tools_QA;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Webtable_Getdata { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://toolsqa.com/automation-practice-table/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<6;j++)
			{
				WebElement cellvalues = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+i+"]/td["+j+"]"));
				System.out.println(cellvalues.getText());
			}
		}
		
		for(int i=1;i<=6;i++)
		{
			String cellheader=driver.findElement(By.xpath(".//*[@id='content']/table/thead/tr/th["+i+"]")).getText();
			System.out.println(cellheader);
		}
		
		
		
	}

}
