package com.qa.scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","D:\\MyFirstSeleniumProject\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String str=driver.getTitle();
		//str.toUpperCase();
		String str1=str.toUpperCase();
		if(str.equals(str1)) {
			System.out.println("uppercase");
		}
		else {
			System.out.println(str1);
		}
           driver.close();
	}

}
