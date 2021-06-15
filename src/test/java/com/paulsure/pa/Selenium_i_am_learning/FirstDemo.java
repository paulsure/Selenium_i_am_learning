package com.paulsure.pa.Selenium_i_am_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poluwagbemiga\\Documents\\SeleniumDrivers\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\poluwagbemiga\\Documents\\SeleniumDrivers\\geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		//WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.facebook.com");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().forward();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().refresh();
		
		driver.navigate().to("https://linkedin.com/in/thepaulsure");
		
		System.out.println(driver.getTitle());
		
		driver.navigate().to("https://www.actitime.com/");
		
		driver.findElement(By.linkText("Try Free")).click();
		
		System.out.println(driver.getCurrentUrl());
		
		
		//driver.findElement(By.linkText("Try free"));
		
		driver.findElement(By.id("first-name")).sendKeys("Paul");
		driver.findElement(By.id("last-name")).sendKeys("Sure");
		driver.findElement(By.id("email")).sendKeys("wewewe@mail.com");
		driver.findElement(By.id("company")).sendKeys("Wesure");
		//driver.findElement(By.linkText("Start Free Trial")).click();
		
		System.out.println(driver.getTitle());
		
		
		
	}

}
