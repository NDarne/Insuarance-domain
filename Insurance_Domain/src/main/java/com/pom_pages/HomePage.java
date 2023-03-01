package com.pom_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath="(//i[@class=\"icon-bg homeIconsBg health-insurance\"])[2]") private WebElement healthIcon;
    @FindBy(xpath="//p[text( )='Health']") private WebElement text_HealthIcon;
	//to access all webelement from Homepage creating constructor
	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}
	
	//to open the health insurance qoute page by clicking  on health icon
	public void clickHealthIcon() {
    	healthIcon.click();
    	}
	public void clcikHealthText() {
		text_HealthIcon.click();
	}
}
