package com.qa.scripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.pages.GooglePage;

public class GoogleMainClass {
	public static void main(String args[]) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\MyFirstSeleniumProject\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		GooglePage gpage = new GooglePage(driver);
		driver.get("https://www.google.com/");
		
		gpage.getSearchTextField().sendKeys("automation testing");
		gpage.getClickSearchButton().click();
		
		//String title = driver.getTitle();
		//if(title.contains("automation testing"))

		boolean title = driver.getTitle().contains("automation testing");
		if(title) {
			System.out.println("Search item and title item are matched");
		}
		else {
			System.out.println("Search item and title item are not matched");
		}
		driver.close();
	}
}
