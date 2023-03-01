package com.Health_Insurance_test;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.CommonClasses.CommonMethods;
import com.configuration.PathConfig;
import com.pom_pages.HomePage;

public class HealthSanitySuite {
	static WebDriver driver;
	static HomePage home ;
	@BeforeClass
	public void launchBrowser() {
		driver=CommonMethods.launchBrowser("chome");
		CommonMethods.waitToLoadPage(20);
	   }
	@BeforeMethod
	public void navigateTohHomePage() {
		driver.navigate().to(PathConfig.appUrl);
		CommonMethods.waitToLoadPage(20);
		 home =new HomePage(driver);
	}
    @Test
    //to verify by clicking on health icon button stpes to gen. quotes should be open
    public void validateHealthIcon() throws InterruptedException {
    	//HomePage home = new HomePage(driver);
    	home.clcikHealthText();
    	CommonMethods.waitToLoadPage(30);
        CommonMethods.waitForSecond(2);    	
        String actualTitle = driver.getTitle();
    	String expectedTitle ="PolicyBazaar Health Insurance: Get a 5 Lac health plan @Rs. 373/Month";
        Assert.assertEquals(actualTitle, expectedTitle);
        Reporter.log("After clicking on health icon quote gen step1 page is opening",true);
    }
    @Test
    //to verify by clicking on text under health icon button stpes to gen. quotes should be open
    public void validateTextUnderHealthIcon() throws InterruptedException {
    	//HomePage home = new HomePage(driver);
    	home.clcikHealthText();
    	CommonMethods.waitToLoadPage(20);
    	CommonMethods.waitForSecond(2);
    	String actualTitle = driver.getTitle();
    	String expectedTitle ="PolicyBazaar Health Insurance: Get a 5 Lac health plan @Rs. 373/Month";
        Assert.assertEquals(actualTitle, expectedTitle);
        Reporter.log("After clicking on text under health icon quote gen step1 page is opening",true);
    }
    @Test
    //to verify element present on quote gen step1 page 
    public void toCheckElementPresent() {
    	home.clickHealthIcon();
    	CommonMethods.waitToLoadPage(20);
    	  WebElement allCheckboxes = driver.findElement(By.xpath("//input[@type='checkbox']"));
    	 String str =allCheckboxes.getText();
    	  System.out.println(str);
    }
    
}
