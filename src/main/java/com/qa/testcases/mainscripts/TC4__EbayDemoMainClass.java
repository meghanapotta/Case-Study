package com.qa.testcases.mainscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qa.testcases.pages.EbayDemoPage;

public class TC4__EbayDemoMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\MyFirstMavenProject\\conf\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		EbayDemoPage ebay = new EbayDemoPage(driver);
		driver.get("https://www.ebay.com/");
		System.out.println(ebay.getClickRegisterLink().getAttribute("href"));
		System.out.println(ebay.getClickRegisterLink().getAttribute("_sp"));
		driver.close();
	}

}
