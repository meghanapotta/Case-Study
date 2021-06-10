package com.qa.testcases.mainscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.qa.testcases.pages.RediffDemoPage;

public class TC3_RediffDemoMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","D:\\MyFirstMavenProject\\conf\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.rediff.com/");
				String Homepagetittle=driver.getTitle();
				System.out.println("title of homepage is "+Homepagetittle);
				RediffDemoPage rediffmain=new RediffDemoPage(driver);
				
				rediffmain.getsigninlink().click();
				String loginpage=driver.getTitle();
				System.out.println("title of loginpage is "+loginpage);
				driver.navigate().back();
				String currenthomepage=driver.getTitle();
				System.out.println("current homepage is "+currenthomepage);
				if(currenthomepage.equals(Homepagetittle))
				{
					System.out.println("Home page tittle is same as search");
				}
				else
					System.out.println("Home page is not same");
				driver.navigate().forward();
				String currentloginpage=driver.getTitle();
				System.out.println("current login page is "+currentloginpage);
				if(currentloginpage.equals(loginpage))
				{
					System.out.println("login page tittle is same as search");
				}
				else {
					System.out.println("login page is not same");
				}
				
				driver.close();
		}

}
