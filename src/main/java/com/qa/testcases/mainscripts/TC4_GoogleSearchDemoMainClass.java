package com.qa.testcases.mainscripts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qa.testcases.pages.GoogleSearchDemoPage;

public class TC4_GoogleSearchDemoMainClass {

	public static void main(String[] args) throws InterruptedException {
		
		//1.Open the browser
		System.setProperty("webdriver.chrome.driver", "D:\\MyFirstMavenProject\\conf\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		GoogleSearchDemoPage gpage=new GoogleSearchDemoPage(driver);
		
		//2.launch google url
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		//3.Type automation testing in search field
		gpage.getSearchTextField().sendKeys("Automation testing");
		Thread.sleep(3000);
		List list=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("Autosuggest list is "+list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(((WebElement)list.get(i)).getText());
		}
		
		//4.submit the input
		gpage.getClickSearchButton().click();
		
		//5.check the title is same as search.
		String tittle=driver.getTitle();
		if(tittle.contains("Automation testing"))
		{
			System.out.println("Title is same as search");
		}
		else
			System.out.println("Title is not same");
		
		//6.close the browser
		driver.close();
	}

}