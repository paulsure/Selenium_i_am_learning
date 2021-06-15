package com.paulsure.pa.Selenium_i_am_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondDemo {

	public static void main(String[] args) {
		
		//We are testing using XPaths rather than IDs.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poluwagbemiga\\Documents\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jumia.com.ng/");
				
		driver.findElement(By.id("fi-q")).sendKeys("iPhones");
		
		//driver.findElement(By.xpath("Button[class='tbn_prim_md-mls-fsho']")).click();
		
		driver.findElement(By.xpath("//button[@class='btn _prim _md -mls -fsh0']")).click();
		
		//driver.findElement(By.xpath("//button[text()='search']"));
				
	}

}
