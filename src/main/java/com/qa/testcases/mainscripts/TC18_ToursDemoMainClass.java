package com.qa.testcases.mainscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.qa.testcases.pages.ToursDemoPage;

//import groovyjarjarantlr.collections.List;

public class TC18_ToursDemoMainClass {
	public static void main(String[] args)
	{
		

		System.setProperty("webdriver.chrome.driver", "D:\\MyFirstMavenProject\\conf\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		ToursDemoPage newtourmain=new ToursDemoPage(driver);
		driver.get("http://www.demo.guru99.com/test/newtours/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		newtourmain.getunamefield().sendKeys("mercury");
		newtourmain.getpwdfield().sendKeys("mercury");
		newtourmain.getsubmitbtn().click();
		newtourmain.getflightslink().click();
		List list=driver.findElements(By.name("fromPort"));
		for(int i=0;i<list.size();i++)
		{
			if((((WebElement)list.get(i)).getText()).equals("India"))
			{
			System.out.println("India in departure list");
			}
			else
			{
				System.out.println("India not in departure list");
			}
		}
		driver.close();
		

	}

}
