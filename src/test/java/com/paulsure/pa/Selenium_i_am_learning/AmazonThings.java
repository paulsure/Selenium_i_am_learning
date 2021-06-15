package com.paulsure.pa.Selenium_i_am_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonThings {

	public static void main(String[] args) throws InterruptedException{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\poluwagbemiga\\Documents\\SeleniumDrivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
//			driver.navigate().to("https://www.konga.com");
			
//			driver.manage().window().maximize();
			
//			WebElement element = driver.findElement(By.linkText("Phones and Tablets"));
			
			//In order to locate the hover over the Phone and Tablet, we need to use the Selenium Interaction class,
			//
//			Actions action = new Actions (driver);
//			
//			action.moveToElement(element).perform();
//			
//			Thread.sleep(5000);
//						
//			driver.findElement(By.linkText("Android")).click();
			
	//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/a[2]")).click();
			
	//		for Amazon: driver.findElement(By.xpath("//a[@class='ef511_2c5_i']")).click();
			
	//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/a[2]")).click();
			
	//		driver.findElement(By.xpath("//a[@aria-label='top categories recommendations']")).click();
			
//			Thread.sleep(5000);
//						
//			driver.navigate().to("https://swisnl.github.io/jQuery-contextMenu/demo.html");
//			
//			driver.manage().window().maximize();
//			
//			
//			
//			// I want to write a script that will allow me to rightclick on a link
//			
//			WebElement rightClick = driver.findElement(By.xpath("//span[text()= 'right click me']"));
//			
//			action.contextClick(rightClick).perform();
//			action.sendKeys(Keys.ARROW_DOWN).perform();
//			action.sendKeys(Keys.ARROW_DOWN).perform();
//			action.sendKeys(Keys.ARROW_DOWN).perform();
//			action.sendKeys(Keys.RETURN).perform();
			
			
			driver.navigate().to("https://jqueryui.com/droppable/");
			
			driver.manage().window().maximize();
			
			//In order to locate the hover over the Phone and Tablet, we need to use the Selenium Interaction class,
			//
			Actions action = new Actions (driver);
			
			//action.moveToElement(element).perform();
			
			Thread.sleep(5000);
			
			//I am dragging from here    		
        	WebElement From = driver.findElement(By.id("draggable"));
         
         //to drop here		
         WebElement To = driver.findElement(By.id("droppable"));
        		 //("//*[@id='']/"));					
         		
         				

	//Dragged and dropped.		
         action.dragAndDrop(From, To).perform();		
		//	driver.switchTo().alert().accept();
			
			
			
			
			
			
	}

}
