package com.paulsure.pa.Selenium_i_am_learning;

import javax.xml.xpath.XPath;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KashiarSeleniumScript {

@Test
	public void KashiarLinks() throws InterruptedException {
		/*
		 * The script below is written in Java to aid the ZAP spider to crawl
		 * through all the pages of this app. Hence, the reason the script contains all major (and minor)
		 * links in the Web app. 
		 */
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poluwagbemiga\\eclipse-workspace\\KashiarWebUI\\src\\chromedriver22.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://iecr.softalliance.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Register')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Log In')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Forgot PIN?')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h2[contains(text(),'Kashiar')]")).click(); //Go back to homepage
		
		//Login
		driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("09024884308");
		driver.findElement(By.xpath("//input[@aria-label='Pin Code']")).sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.className("v-btn__content")).click(); //getText();
		Thread.sleep(3000);
		
		//Now it is time to crawl through the links
		driver.findElement(By.xpath("//div[contains(text(),'Setup')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Units of Measurement')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Setup')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Returnable packages')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Setup')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(text(),'Tax/Payment Methods')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(text(),'Users')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Customers')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Discounts')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Stores')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Store Products')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Cash Registers')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Messages')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(text(),'view_module')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Warehouses')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(text(),'view_module')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Storage Status')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(text(),'view_module')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Incoming Receipts')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[contains(text(),'view_module')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[contains(text(),'Move Stock')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[contains(text(),'Reports')]")).click();
		Thread.sleep(3000);
		
		//div[contains(text(),'Reports')]
		
		
		
		driver.close();
		
		
	}
	
	
}
