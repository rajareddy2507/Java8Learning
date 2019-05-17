package com.SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Selenium {
WebDriver driver;
By email = By.id("email");

@BeforeTest
public void driverInit(){
	System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
	DesiredCapabilities cap = new DesiredCapabilities();
	cap.setCapability("browserName", "Chrome");
	cap.setCapability("platformVersion", "11.0");
	driver= new ChromeDriver(cap);
//	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("http://www.facebook.com");
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);	
}

@Test
public void tilevalidation() throws InterruptedException{
/*	driver.findElement(email).sendKeys("Test");
	Thread.sleep(5000);
	driver.findElement(email).clear();
	driver.findElement(email).sendKeys(Keys.SHIFT, "raja");
	System.out.println("getattribute   " + driver.findElement(email).getAttribute("value"));
	System.out.println("getcss = "+driver.findElement(email).getCssValue("border-color"));
	System.out.println("getsize = ="+driver.findElement(email).getSize());
	System.out.println("gettext =  "+driver.findElement(email).getText());
	System.out.println("get tagname = "+driver.findElement(email).getTagName());
	System.out.println("get locstion = "+ driver.findElement(email).getLocation());
	System.out.println("get currenturl = "+ driver.getCurrentUrl());
	System.out.println("get pagesourecre = " +driver.getPageSource());
	String Currentwindow = driver.getWindowHandle();
	Set<String> x = driver.getWindowHandles();
	System.out.println("widowhandles = "+ x);
for(String z : x){
	if(z.equals(Currentwindow)){
		continue;
	}
	else{
		driver.switchTo().window(z).close();
	}
}
driver.switchTo().window(Currentwindow);
driver.
	String title = driver.getTitle();
	System.out.println(title);

	assertEquals(title, "Facebook - Log In or Sign Up"); */
	
/*	List<WebElement> frames= driver.findElements(By.tagName("iframe"));
	int sizeofframes= frames.size();
	System.out.println(sizeofframes);
	for(WebElement x : frames){
		System.out.println("x = "+ x.toString());
	}*/
/*	Set<Cookie> cookies = driver.manage().getCookies();
	for(Cookie a : cookies){
		System.out.println(a.getName());
	}*/
/*	WebElement logo = driver.findElement(By.linkText("Facebook"));
	String logoname = logo.getText();
	System.out.println(logoname);
	Thread.sleep(3000);*/
	/*WebElement bday = driver.findElement(By.id("day"));
	Select selectbday = new Select(bday);*/
	Thread.sleep(3000);
driver.findElement(By.partialLinkText("Forgot account?")).click();
}
	@AfterTest
	public void tearDown() throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
		
	}
}
