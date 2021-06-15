package com.paulsure.pa.Selenium_i_am_learning;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Windows {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poluwagbemiga\\Documents\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		
		driver.findElement(By.id("u_7_8")).click();
		
		
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			driver.switchTo().window(window);
			System.out.println(window);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			System.out.println();	
			System.out.println("-------------------------");
		
			
			if (driver.getCurrentUrl().equals("https://twitter.com/")) {
			//if(driver.getCurrentUrl().equals("https://www.facebook.com/")){
			driver.findElement(By.xpath("//span[text=('Sign up')]")).click();
			Thread.sleep(5000);
			} 
			else if (driver.getCurrentUrl().equals("https://youtube.com/")) {
			driver.findElement(By.linkText("Jerry John Rawlings, in his own words- BBC Africa")).click();
			Thread.sleep(5000);
			}
			driver.findElement(By.linkText("Handling Multiple Browser Windows (Tabs)")).click();
			System.out.println();
			}
		driver.close();
	}
}

