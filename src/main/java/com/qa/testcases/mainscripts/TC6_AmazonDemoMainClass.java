package com.qa.testcases.mainscripts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.qa.testcases.pages.AmazonDemoPage;

public class TC6_AmazonDemoMainClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\MyFirstMavenProject\\conf\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		AmazonDemoPage apage = new AmazonDemoPage(driver);
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		List<WebElement> options = apage.getCategoryList().getOptions();
		System.out.println("total no.of.items in category list is "+ options.size());
		
		for (WebElement ele : options) {
			System.out.println(ele.getText());
			
		}
		
		apage.getCategoryList().selectByVisibleText("Books");
		apage.getSearchInputField().sendKeys("Chethan Bhagat");
		apage.getSearchIcon().click();
		
		List <WebElement> booklist=apage.getSelectBooklist();
		List<WebElement> bookprice=apage.getSelectBookPriceList();
		
		System.out.println("total no.of.items in category list is: " + booklist.size() + " and price list is: " + bookprice.size());
		
		for (WebElement book : booklist)
		{
			System.out.println(book.getText());
			
		}
		for (WebElement price : bookprice) 
		{
			System.out.println(price.getText());
			
		}
		
		Thread.sleep(8000);
		
		apage.getCategoryList().selectByVisibleText("Electronics");
		apage.getSearchIcon().sendKeys("mobile phones");
		apage.getSearchIcon().click();

	}

}
