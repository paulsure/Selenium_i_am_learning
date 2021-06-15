package com.paulsure.pa.Selenium_i_am_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poluwagbemiga\\Documents\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("http://www.facebook.com");
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("PaulSure"); //Using the Input and ID attribute hence the use of #
		
		driver.findElement(By.id("pass")).sendKeys("mypassword");
		
		driver.findElement(By.xpath("//button[@data-testid='royal_login_button']")).click();
		
		driver.findElement(By.cssSelector(""));
		
		driver.close();

		//Creating CSS selector for Dynamic Element
		// Using Partial Value of attribute (Symbol *)
		//e.g TagName[Attr1* = 'Partial Value']
		
		// Using starting Value of attribute (Symbol ^)
		//e.g TagName[Attr1^ = 'Starting Value']
		
		// Using ending Value of attribute (Symbol $)
		//e.g TagName[Attr1$ = 'Ending Value']
		
		//Creating CSS with Multiple Attributes
		//AND attribute (No Symbol Required)
		//Syntax : TagName[Attr1='Value1'][Attr2='value2']
		//OR 
		//sYNTAX: TagName[Attr1=Value1], TagName[Attr2='value2']
		
		//driver.findElement(By.xpath(xpathExpression))
	}
	
		
}
