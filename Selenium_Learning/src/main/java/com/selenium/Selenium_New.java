package com.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static junit.framework.Assert.*;

public class Selenium_New {
	static WebDriver driver;
	@BeforeTest
	public void inti(){
		
	}
	@Test
	public static void sample() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys(Keys.SHIFT, "Just like that");
		String x =	driver.findElement(By.name("q")).getAttribute("value");
		assertEquals("JUST LIKE THAT", x);
	}
	@AfterTest
	public void teardown(){
		driver.quit();
	}
}
