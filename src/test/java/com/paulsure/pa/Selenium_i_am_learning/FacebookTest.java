package com.paulsure.pa.Selenium_i_am_learning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookTest {

	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poluwagbemiga\\Documents\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/"); //Navigate to Facebook.com
		
		driver.findElement(By.linkText("Create New Account")).click(); //Click on Create Account
		
		Thread.sleep(5000);
		
		//driver.findElement(By.id("u_i_b")).sendKeys("Ada"); //Enters the First Name
		
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Paul"); //Enter the First Name
		
		//driver.findElement(By.xpath("//input[name='firstname']")).sendKeys("Paul");; //Enter the First Name
		
		driver.findElement(By.xpath("//input[@aria-label='Surname']")).sendKeys("Ada"); //Enter the Surname
		
		driver.findElement(By.id("u_1_g")).sendKeys("p2@mail.com");
		
		//driver.findElement(By.xpath("//select[@title='Day']").
		
		Select selectDay = new Select(driver.findElement(By.id("day")));
		Select selectMonth = new Select(driver.findElement(By.id("month")));
		Select selectYear = new Select(driver.findElement(By.id("year")));
		
		selectDay.selectByVisibleText("8");
		selectMonth.selectByVisibleText("May");
		selectYear.selectByVisibleText("2001");
		
		
		
		
		
		
		
		
	}

}
