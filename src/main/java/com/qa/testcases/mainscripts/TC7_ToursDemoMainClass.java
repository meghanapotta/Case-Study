package com.qa.testcases.mainscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qa.testcases.pages.ToursDemoPage;

public class TC7_ToursDemoMainClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\MyFirstMavenProject\\conf\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		ToursDemoPage newtourmain=new ToursDemoPage(driver);
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/test/newtours/");
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		newtourmain.getunamefield().sendKeys("mercury");
		newtourmain.getpwdfield().sendKeys("mercury");
		newtourmain.getsubmitbtn().click();
		Thread.sleep(2000);
		newtourmain.getflightslink().click();
		Thread.sleep(2000);
		newtourmain.getpassengercount().selectByIndex(3);
		Thread.sleep(2000);
		newtourmain.getdeparture().selectByValue("London");
		Thread.sleep(2000);
		newtourmain.getdeparturemonth().selectByValue("6");
		Thread.sleep(2000);
		newtourmain.getdepartureday().selectByValue("14");
		Thread.sleep(2000);
		newtourmain.getarrival().selectByVisibleText("New York");
		Thread.sleep(2000);
		newtourmain.getreturningmonth().selectByVisibleText("July");
		Thread.sleep(2000);
		newtourmain.getreturningday().selectByVisibleText("16");
		Thread.sleep(2000);
		newtourmain.getcontinuebtn().click();

	}

}
