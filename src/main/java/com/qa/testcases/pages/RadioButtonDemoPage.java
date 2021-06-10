package com.qa.testcases.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RadioButtonDemoPage {
	WebDriver driver;
	
	@FindBy(xpath ="//*[@id=\"daysofweek\"]/p[3]/input")
	WebElement CheckDefaultButton;
	public WebElement getCheckDefaultButton() {
		return CheckDefaultButton;
	}
	
	@FindBy(xpath="//*[@id=\"daysofweek\"]/p[1]/input")
	WebElement SelectMonday;
	public WebElement getSelectMonday() {
		
		return SelectMonday;
	}
	@FindBy(name="red")
	WebElement ClickRedbtn;
	public WebElement getClickRedbtn(){
		return ClickRedbtn;
	}
	
	@FindBy(name="yellow")
	WebElement CheckYellowBtn;
	public WebElement getCheckYellowBtn(){
		return CheckYellowBtn;
	}
	
	@FindBy(name="orange")
	WebElement CheckOrangeBtn;
	public WebElement getCheckOrangeBtn(){
		return CheckOrangeBtn;
	}
	
	public RadioButtonDemoPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	

}
