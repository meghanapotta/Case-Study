package com.qa.testcases.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AmazonDemoPage {
	
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement SearchInputField;
	
	public WebElement getSearchInputField() {
		 return SearchInputField;
	}
	
	@FindBy(id="nav-search-submit-button")
	WebElement SearchIcon;
	
	public WebElement getSearchIcon() {
		return SearchIcon;
	}
	
	@FindBy(name="url")
	WebElement CategoryList;
	
	public Select getCategoryList() {
		
		Select sel=new Select(CategoryList);
		return sel;
	}
	
	@FindAll(@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']"))
	List<WebElement> SelectBooklist;
	 
	public List<WebElement> getSelectBooklist(){
		return SelectBooklist;
	}
	

	@FindAll(@FindBy(xpath="//span[@class='a-price-whole']"))
	List<WebElement> SelectBookPriceList;
	
	public List<WebElement> getSelectBookPriceList(){
		return SelectBookPriceList;
	}
	
	public AmazonDemoPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}    

}
