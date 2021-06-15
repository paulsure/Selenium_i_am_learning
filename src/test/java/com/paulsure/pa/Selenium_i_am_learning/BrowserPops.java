package com.paulsure.pa.Selenium_i_am_learning;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserPops {

	public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\poluwagbemiga\\Documents\\SeleniumDrivers\\chromedriver21.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://investor.pypl.com/home/default.aspx");
			
			driver.findElement(By.cssSelector("a#_ctrl0_ctl51_hrefwebsiteRecording")).click();
			
			String parentWindow = driver.getWindowHandle();
			
			Set<String> windows = driver.getWindowHandles();
			for (String window : windows) {
				if (!window.equals(parentWindow)) {
					driver.switchTo().window(window);
					System.out.println(window);
				}
			}
			
			driver.findElement(By.cssSelector("[href='https://learn.q4inc.com/demo]")).click();
			
			//Let's get back to our parent window now
			
			driver.switchTo().window(parentWindow);
			
			driver.findElement(By.xpath("//a[text()='Learn More']")).click();
			
	}

}
