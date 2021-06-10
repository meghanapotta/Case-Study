package com.qa.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.Ebaypages;

public class EbayMainClass {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\MyFirstSeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Ebaypages epage = new Ebaypages(driver);
		driver.get("https://www.ebay.com/");
		epage.getRegistrationLink().click();
		epage.getFirstName().sendKeys("smith");
		epage.getLastName().sendKeys("kim");
		epage.getEmailField().sendKeys("smith@test.com");
		epage.getPasswordField().sendKeys("meghana123$");
		epage.getShowPassword().click();
		Thread.sleep(2000);
		epage.getClickRegisterButton().click();
		Thread.sleep(2000);
		driver.close();
	}
}
