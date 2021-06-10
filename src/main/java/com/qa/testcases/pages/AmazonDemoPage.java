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
	
	@FindBy(id="searchDropdownBox")
    WebElement searchdropdown;
    
    public Select getsearchdropdown()
    {
    	Select dropdown=new Select(searchdropdown);
    	return dropdown;
    }
    
    @FindBy(id="twotabsearchtextbox")
    WebElement SearchTextField;
    public WebElement getSearchTextField()
    {
    	return SearchTextField;
    }
    
    @FindBy(id="nav-search-submit-button")
    WebElement searchbtn;
     public WebElement getsearchbtn()
     {
     	return searchbtn;
     }
     
     @FindAll(@FindBy(xpath="//div//span[@class='a-price-whole']"))
     List<WebElement> price;
     
     public List<WebElement> getprice()
     {
    	 return price;
     }
    
    @FindAll(@FindBy(xpath="//span[@class='a-size-medium a-color-base a-text-normal']"))
    List<WebElement> itemname;
    public  List<WebElement> getitemname()
    {
    	return itemname;
    }
    
    public AmazonDemoPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    }
    

}
