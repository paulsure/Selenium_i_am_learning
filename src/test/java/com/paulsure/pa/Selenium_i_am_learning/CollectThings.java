package com.paulsure.pa.Selenium_i_am_learning;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


	public class CollectThings {

		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\poluwagbemiga\\Documents\\SeleniumDrivers\\chromedriver.exe");
		
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize(); //Maximize the windows
		
			driver.get("https://www.facebook.com/"); //Navigate to Facebook.com
			
//			List<WebElement> links = driver.findElements(By.cssSelector("a"));
//			System.out.println(links.size());
//			for(WebElement link : links) {
//				System.out.println(link.getText());
//				System.out.println(link.getAttribute("href"));
//				System.out.println("----------------------------");
//			} Trying to only get the links with the above code
			
			List<WebElement> links = driver.findElements(By.cssSelector("a"));
			System.out.println(links.size());
			for(WebElement link : links) {
				String LinkWithoutText = link.getText();
				if(!LinkWithoutText.trim().isEmpty()) {
					System.out.println(link.getText());
					System.out.println(link.getAttribute("href"));
					System.out.println("----------------------------");
				}
			}
				
			
			driver.close();
			
		
		

	}

}
