package com.paulsure.pa.Selenium_i_am_learning;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementAttribute {

	public static void main(String[] args) throws InterruptedException {
	
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\poluwagbemiga\\Documents\\SeleniumDrivers\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.trivago.com/"); //Navigate to Facebook.com
			
			driver.manage().window().maximize(); //Maximize the window
			
//			driver.findElement(By.id("u_0_2")).click();
//			
//			driver.findElement(By.cssSelector("#day")).click();	
//			
//			Select myMonth = new Select(driver.findElement(By.cssSelector("select#month")));
//			myMonth.selectByValue(value);
			
			driver.findElement(By.cssSelector("button[key = 'checkInButton']")).click();
			
			Thread.sleep(5000);
			
			String expectedMonth = "August 2021";
			String actualMonth = driver.findElement(By.cssSelector("table.cal-month:nth-child(3) #cal-heading-month")).getText().trim();
			System.out.println(actualMonth);
			
			while (!actualMonth.equals(expectedMonth)) {
				Thread.sleep(5000);
				driver.findElement(By.cssSelector("button.cal-btn-next")).click();
				System.out.println(actualMonth);
				actualMonth = driver.findElement(By.cssSelector("table.cal-month:nth-child(3) #cal-heading-month")).getText().trim();
			}
			List<WebElement> Dates = driver.findElements(By.cssSelector("table.cal-month:nth-child(3) td"));
			//System.out.println(Dates.size());
				
			for(WebElement date : Dates) {
				System.out.println(date.getText());
				
				String expectedDay = "14";
				if (date.getText().equals(expectedDay)) {
							date.click();
							System.out.println(date);
				}
			}						
		
	}
}

