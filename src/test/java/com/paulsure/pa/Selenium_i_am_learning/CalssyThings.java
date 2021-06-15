package com.paulsure.pa.Selenium_i_am_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalssyThings {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poluwagbemiga\\Documents\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/"); //Navigate to Facebook.com
		
		driver.manage().window().maximize(); //Maximize the windowa
		
		//Navigate to the dropdown 
		
		driver.findElement(By.cssSelector("i.hm-icon")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("a[data-ref-tag='nav_em_1_1_1_6']")).click();
		
		//driver.close();
		
		
		
		
//		
//		driver.findElement(By.linkText("Create New Account")).click(); //Click on Create Account
//		
//		Thread.sleep(5000);
//		
//		//driver.findElement(By.id("u_i_b")).sendKeys("Ada"); //Enters the First Name

	}

}