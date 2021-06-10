package com.qa.testcases.mainscripts;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qa.testcases.pages.ToursDemoPage;

public class TC9_ToursDemoMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\MyFirstMavenProject\\conf\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		ToursDemoPage newtourmain=new ToursDemoPage(driver);
		driver.manage().window().maximize();
		driver.get("http://www.demo.guru99.com/test/newtours/");
		int ele = newtourmain.getunamefield().getSize().getHeight();
		int ele1=newtourmain.getunamefield().getSize().getWidth();
		int size1 = ele*ele1;
		System.out.println("username text field size is:" + size1);
		int ele2=newtourmain.getpwdfield().getSize().getHeight();
		int ele3=newtourmain.getpwdfield().getSize().getWidth();
		int size2= ele2*ele3;
		System.out.println("password text field size is:" + size2);
		if(size1 == size2) {
			System.out.println("Both text field dimensions are same");
		}
		else {
			System.out.println("Both text field dimensions are not same");
		}
		
		driver.close();

	}

}
