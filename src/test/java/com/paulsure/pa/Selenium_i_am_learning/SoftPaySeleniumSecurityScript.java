package com.paulsure.pa.Selenium_i_am_learning;

import javax.xml.xpath.XPath;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SoftPaySeleniumSecurityScript {

@Test
	public void SoftPay() throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poluwagbemiga\\eclipse-workspace\\KashiarWebUI\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://172.30.50.10/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("goldedgeltd11@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@18");
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/nav[1]/div[2]/div[2]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(2000); //Roles and Permission
		driver.findElement(By.xpath("//header/nav[1]/div[2]/div[2]/ul[1]/li[3]/ul[1]/li[1]/a[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/nav[1]/div[2]/div[2]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(2000); //Roles and Permission
		driver.findElement(By.xpath("//a[contains(text(),'Manage Org Users')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/nav[1]/div[2]/div[2]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(2000); //Roles and Permission
		driver.findElement(By.xpath("//a[contains(text(),'Manage Roles Permissions')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/nav[1]/div[2]/div[2]/ul[1]/li[3]/a[1]")).click();
		Thread.sleep(2000); //Roles and Permission
		driver.findElement(By.xpath("//a[contains(text(),'Manage Users Permissions')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/nav[1]/div[2]/div[2]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(5000);// Banks and Gateways
		driver.findElement(By.xpath("//a[contains(text(),'Manage Authorization Method')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/nav[1]/div[2]/div[2]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(5000);// Banks and Gateways
		driver.findElement(By.xpath("//a[contains(text(),'Manage Bank Accounts')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/nav[1]/div[2]/div[2]/ul[1]/li[4]/a[1]")).click();
		Thread.sleep(5000);// Banks and Gateways
		driver.findElement(By.xpath("//a[contains(text(),'Manage Cards')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/nav[1]/div[2]/div[2]/ul[1]/li[5]/a[1]")).click();
		Thread.sleep(3000); //Surcharge
		driver.findElement(By.xpath("//a[contains(text(),'View Surcharges')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/nav[1]/div[2]/div[2]/ul[1]/li[6]/a[1]")).click();
		Thread.sleep(3000); //Transactions
		driver.findElement(By.xpath("//a[contains(text(),'Manage Approval Paths')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/nav[1]/div[2]/div[2]/ul[1]/li[7]/a[1]")).click();
		Thread.sleep(3500); //Reports
		driver.findElement(By.xpath("//a[contains(text(),'Activity')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/nav[1]/div[2]/div[2]/ul[1]/li[7]/a[1]")).click();
		Thread.sleep(3500); //Reports
		driver.findElement(By.xpath("//a[contains(text(),'Global Worklist')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/nav[1]/div[2]/div[2]/ul[1]/li[8]/a[1]")).click();
		Thread.sleep(3000); //Settings
		driver.findElement(By.xpath("//a[contains(text(),'My Profile')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/nav[1]/div[2]/div[2]/ul[1]/li[8]/a[1]")).click();
		Thread.sleep(3000); //Settings
		driver.findElement(By.xpath("//a[contains(text(),'Manage Api Token')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//header/nav[1]/div[2]/div[2]/ul[1]/li[8]/a[1]")).click();
		Thread.sleep(3000); //Settings
		driver.findElement(By.xpath("//a[contains(text(),'Manage Encryption Key')]")).click();
		Thread.sleep(3000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
}
