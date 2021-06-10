package com.qa.testcases.mainscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.testcases.pages.ToursDemoPage;

public class TC8_ToursDemoMainClass {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\MyFirstMavenProject\\conf\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			ToursDemoPage Tours=new ToursDemoPage(driver);
			driver.get("http://demo.guru99.com/test/newtours/");
			Tours.getunamefield().sendKeys("mercury");
			Tours.getpwdfield().sendKeys("mercury");
			Tours.getsubmitbtn().click();
			Tours.getflightslink().click();
			String ele1 = Tours.getdeparture().getFirstSelectedOption().getText();
			System.out.println(ele1);
			String ele2 = Tours.getarrival().getFirstSelectedOption().getText();
			System.out.println(ele2);
			if(ele1.equals(ele2)) {
				System.out.println("Both locations are same");
			}
			else {
				System.out.println("Both locations are different");
			}
			driver.close();
		}
}
