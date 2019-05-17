package com.SeleniumLearning;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustTets {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
//		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);	
	}

}
