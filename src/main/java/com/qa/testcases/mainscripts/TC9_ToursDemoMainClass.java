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
		int dim1 = ele*ele1;
		System.out.println("username is:" + dim1);
		int ele2=newtourmain.getpwdfield().getSize().getHeight();
		int ele3=newtourmain.getpwdfield().getSize().getWidth();
		int dim2= ele2*ele3;
		System.out.println("password is:" + dim2);
		if(dim1 == dim2) {
			System.out.println("Both text field dimensions are same");
		}
		else {
			System.out.println("Both text field dimensions are samenot same");
		}
		
		driver.close();

	}

}
