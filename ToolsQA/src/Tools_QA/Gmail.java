package Tools_QA;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String path ="F:\\Career\\chromedriver.exe";
System.setProperty("webdriver.chrome.driver", path);

WebDriver driver = new ChromeDriver();
driver.get("https://mail.google.com");
driver.findElement(By.id("Email")).sendKeys("nivas.titu@gmail.com");
driver.findElement(By.xpath(".//*[@id='next']")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("9040747104");
driver.findElement(By.xpath(".//*[@id='signIn']")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.xpath("//*[@id=':j2']/div/div")).click();

WebElement w1 = driver.findElement(By.id(":mi"));
WebElement w2 = w1.findElement(By.id(":om"));
w2.sendKeys("nivassahoo.36@gmail.com"+Keys.RETURN);




	}

}
