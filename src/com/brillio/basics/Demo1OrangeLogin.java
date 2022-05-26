package com.brillio.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo1OrangeLogin {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjali.maheshwari\\Desktop\\Selenium\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver","C:\\Users\\anjali.maheshwari\\Desktop\\Selenium\\msedgedriver.exe");
		//ChromeDriver driver = new ChromeDriver(); // The Driver Variable Will Launch Only Chrome
		
		//WebDriver driver = new ChromeDriver(); // TheWebDriver variable driver can launch any Browser
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebDriver driver1 = new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/"); // Get will load the page on Chrome
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		driver.findElement(By.id("welcome")).click();
		
		// Thread.sleep(5000); //  Not recommended while doing automation
		
		driver.findElement(By.linkText("Logout")).click();
		
		
		
		//By loc = By.id("txtUsername");   // Second way of doing line number 25
		//WebElement ele = driver.findElement(loc);
		//ele.sendKeys("Admin");
		
		//WebElement ele = driver.findElement(By.id("txtUsername")); // Third way of doing
		//ele.sendKeys("Admin");
		
		
		//driver.quit();
		
		
		
	}

}
