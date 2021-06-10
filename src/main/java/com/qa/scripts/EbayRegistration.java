package com.qa.scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayRegistration {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\MyFirstSeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.findElement(By.linkText("register")).click();
		WebElement ele = driver.findElement(By.id("firstname"));
		ele.sendKeys("smith");
		//Thread.sleep(2000);
		WebElement ele1 = driver.findElement(By.id("lastname"));
		ele1.sendKeys("kim");
		//Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys("kim@test.com");
		//Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("meghana123");
		//Thread.sleep(2000);
		driver.findElement(By.id("showpassword")).click();
		//Thread.sleep(2000);
		driver.findElement(By.id("EMAIL_REG_FORM_SUBMIT")).click();
		
		driver.close();
		
	}

}
