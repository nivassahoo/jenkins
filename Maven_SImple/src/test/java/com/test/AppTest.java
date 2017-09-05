package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.annotations.Test;


/**
 * Unit test for simple App.
 */
public class AppTest implements ISuiteListener
{
	public static WebDriver driver;
	@Test
	public void method() {
		// TODO Auto-generated method stub
		System.out.println("Inside AppTest Class of com.test");
		System.setProperty("webdriver.chrome.driver", "F:\\Career\\Chrome Driver\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.google.co.in");
		  driver.manage().window().maximize();
	}

	@Override
	public void onFinish(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub
		
	}
}
