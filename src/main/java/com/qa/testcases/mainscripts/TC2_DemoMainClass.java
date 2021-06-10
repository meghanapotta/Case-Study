package com.qa.testcases.mainscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qa.testcases.pages.EbayDemoPage;

public class TC2_DemoMainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\MyFirstMavenProject\\conf\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		EbayDemoPage epage = new EbayDemoPage(driver);
		driver.get("https://www.ebay.com/");
		epage.getRegistrationLink().click();
		Thread.sleep(3000);
		WebElement emailaddress= epage.getEmailField();
		String emailvalue="test@test.com";
		emailaddress.sendKeys(emailvalue);
		emailaddress.clear();
		Thread.sleep(2000);
		WebElement retypemail = epage.getEmailField();
		String retypemailvalue="test@test.com";
		retypemail.sendKeys(retypemailvalue);
		
		if(emailaddress.equals(retypemail)) 
		{
			System.out.println("Two fileds are matched");
		}
		else {
			System.out.println("Two fileds are not matched");
		}
		driver.close();
	}

}
