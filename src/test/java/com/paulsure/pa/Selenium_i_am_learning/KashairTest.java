package com.paulsure.pa.Selenium_i_am_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KashairTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poluwagbemiga\\Documents\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://kashiar.softalliance.com/");
		driver.findElement(By.xpath("//input[@name='phone_number']")).sendKeys("07050364913");
		driver.findElement(By.xpath("//input[@aria-label='Pin Code']")).sendKeys("12345");
		//driver.findElement(By.xpath("//input[@placeholder='Enter pin']")).sendKeys("");
		
		driver.findElement(By.className("v-btn__content")).click(); //getText();
		
		//driver.get
	}

}
