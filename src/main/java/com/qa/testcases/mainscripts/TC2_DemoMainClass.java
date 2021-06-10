package com.qa.testcases.mainscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import com.qa.testcases.pages.EbayDemoPage;

public class TC2_DemoMainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\MyFirstMavenProject\\conf\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		EbayDemoPage page = new EbayDemoPage(driver);
		driver.get("https://www.ebay.com/");
		page.getClickRegisterLink().click();
		Thread.sleep(3000);
		WebElement email= page.getEmailField();
		String emailaddress="test@test.com";
		email.sendKeys(emailaddress);
		email.clear();
		Thread.sleep(2000);
		WebElement retypemail = page.getEmailField();
		String retypemailaddress="test@test.com";
		retypemail.sendKeys(retypemailaddress);
		
		if(emailaddress.equals(retypemailaddress)) 
		{
			System.out.println("Two fileds are matched");
		}
		else {
			System.out.println("Two fileds are not matched");
		}
		driver.close();
	}

}
