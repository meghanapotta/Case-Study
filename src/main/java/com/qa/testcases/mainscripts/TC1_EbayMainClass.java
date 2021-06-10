package com.qa.testcases.mainscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qa.testcases.pages.EbayDemoPage;

public class TC1_EbayMainClass {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\MyFirstSeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		EbayDemoPage epage = new EbayDemoPage(driver);
		driver.get("https://www.ebay.com/");
		epage.getRegistrationLink().click();
		epage.getFirstName().sendKeys("smith");
		epage.getLastName().sendKeys("kim");
		epage.getEmailField().sendKeys("smithkim@gmail.com");
		epage.getPasswordField().sendKeys("maggi123$");
		epage.getShowPassword().click();
		//Thread.sleep(2000);
		epage.getClickRegisterButton().click();
		Thread.sleep(2000);
		//driver.close();
	}
}
