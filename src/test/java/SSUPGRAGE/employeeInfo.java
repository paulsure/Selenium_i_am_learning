package SSUPGRAGE;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class employeeInfo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\poluwagbemiga\\Documents\\SeleniumDrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(""); //Navigate to SSUPGRADE
		
		driver.manage().window().maximize(); //Maximize the window
		
		//<-----------Declare my login details
		
		String Username = "DEMO USER";
		String Password = "";
		
		//<-------------Input the Login Details---------------->
		
		driver.findElement(By.cssSelector("input#P9999_USERNAME")).sendKeys(Username);
		driver.findElement(By.cssSelector("input#P9999_PASSWORD")).sendKeys(Password);
		
		driver.findElement(By.cssSelector("button#B24025698022140901")).click();
		
		Thread.sleep(2000);
		
		//<---------To the Profile----------->
		driver.findElement(By.cssSelector("li#t_TreeNav_0")).click();
		
		driver.findElement(By.xpath("//li[@id='t_TreeNav_1']")).click();
		
		driver.findElement(By.xpath("//span[@class='fa fa fa-user']")).click();
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		//<--------------Go to Work Equipment-------------->
		
		driver.findElement(By.cssSelector("div#SR_R31296626846800217 li#SR_R31297439080800225_tab")).click();
		
		//<-----------Navigate to Edit Description-------------->
		
//		driver.findElement(By.cssSelector("div.a-GV-w-scroll #R31297439080800225_ig_grid_vc_cur")).click();
//		driver.findElement(By.cssSelector("div.a-GV-w-scroll #R31297439080800225_ig_grid_vc_cur")).clear();//clears the field
//		//Enter another value
//		driver.findElement(By.cssSelector("div.a-GV-w-scroll #R31297439080800225_ig_grid_vc_cur")).sendKeys("This is testing the Selenium automation");
		
		driver.findElement(By.xpath("//*[@id=\'R31297439080800225_ig_grid_vc_cur\']")).click();
		driver.findElement(By.cssSelector("//*[@id=\'R31297439080800225_ig_grid_vc_cur\']")).clear(); //clears the field
		driver.findElement(By.cssSelector("//*[@id=\'R31297439080800225_ig_grid_vc_cur\']")).sendKeys("This is testing the Selenium automation");
		
		
		
		
		
		
	}

}
