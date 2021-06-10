package com.qa.testcases.mainscripts;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qa.testcases.pages.MultipleWindowsDemo;

public class TC11_MultiWindowsDemoMainClass {

	public static void main(String[] args) throws InterruptedException
	{
		 System.setProperty("webdriver.chrome.driver","D:\\MyFirstMavenProject\\conf\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			MultipleWindowsDemo  gaccount =new MultipleWindowsDemo(driver);
			driver.get("https://www.google.com/intl/en_in/gmail/about/");
			gaccount.getCreateAccountUrl().click();
			Thread.sleep(2000);
			gaccount.getTermsLink().click(); //2 window
			Thread.sleep(2000);
			gaccount.getPrivacyLink().click();   //3.window
			Thread.sleep(2000);
			Set<String> windowHandles = driver.getWindowHandles();
			Thread.sleep(2000);
			Iterator<String> iterator = windowHandles.iterator();
			while(iterator.hasNext())
			{
				String Wid = iterator.next();
				WebDriver window =driver.switchTo().window(Wid);
				System.out.println(window.getTitle());
				List<WebElement> Links = window.findElements(By.tagName("a"));
				System.out.println("Total no of links present on the window  with id"+Wid+"are:"+Links.size());
			}
			
			driver.quit();

	}

}
