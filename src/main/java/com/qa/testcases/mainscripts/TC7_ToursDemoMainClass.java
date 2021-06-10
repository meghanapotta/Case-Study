package com.qa.testcases.mainscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qa.testcases.pages.ToursDemoPage;

public class TC7_ToursDemoMainClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\MyFirstMavenProject\\conf\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		ToursDemoPage tours=new ToursDemoPage(driver);
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/test/newtours/");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		tours.getunamefield().sendKeys("mercury");
		tours.getpwdfield().sendKeys("mercury");
		tours.getsubmitbtn().click();
		Thread.sleep(2000);
		tours.getflightslink().click();
		Thread.sleep(2000);
		tours.getpassengercount().selectByIndex(3);
		Thread.sleep(2000);
		tours.getdeparture().selectByValue("Paris");
		Thread.sleep(2000);
		tours.getdeparturemonth().selectByValue("7");
		Thread.sleep(2000);
		tours.getdepartureday().selectByValue("13");
		Thread.sleep(2000);
		tours.getarrival().selectByVisibleText("New York");
		Thread.sleep(2000);
		tours.getreturningmonth().selectByVisibleText("July");
		Thread.sleep(2000);
		tours.getreturningday().selectByVisibleText("19");
		Thread.sleep(2000);
		tours.getcontinuebtn().click();
		System.out.println("Details entered successfully");
		driver.close();

	}

}
