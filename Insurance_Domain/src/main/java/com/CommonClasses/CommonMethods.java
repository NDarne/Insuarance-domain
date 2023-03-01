package com.CommonClasses;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.baseclasses.BaseClass;

public class CommonMethods {
	private static final Duration Duration = null;
	static WebDriver driver;
	private static WebDriverWait wait;
   //this method is use to open a perticular browser 
	public static WebDriver launchBrowser(String browsertype) {
		driver = BaseClass.openBrowser(browsertype);
		return driver;  }
	
	//this method to load a webpage for perticular second
	public static void waitToLoadPage(int second) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(second));
	}
	//this method is to wait for a specific second 
	public static void waitForSecond(int second) throws InterruptedException {
		Thread.sleep(second*1000);
	}
	
	//this method to check if element is present/dispalyed or not
	public static void visibilityOfElement(WebElement element) {
		if (element.isDisplayed()) {
			System.out.println(element +": is present on page ");
		}else {
			System.out.println("element is not presrent");
		}
	}
    // this method is use to clcik on element by xpath
    public static void  clickOnElementByXpath(String elementXpath,Duration timeout) {
    	wait = new WebDriverWait(driver,timeout);
    	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(elementXpath)));
    	WebElement element = driver.findElement(By.xpath(elementXpath));
    	wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }
	
    // this method is use to clcik element if present by using xpath 
     public static void clickOnElementIfPresenetXpath(String xpathExpression,Duration timeout) {
    	wait = new WebDriverWait(driver,timeout);
    	WebElement element = driver.findElement(By.xpath(xpathExpression));
    	if(element.isDisplayed()) {
    		wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    	}else {
    		System.out.println("Element is not displayed \n check the xpath :"+xpathExpression+" is correct");
    	}
    }
     
    // this method is use to clcik on element if present by using Id
     public static void clickOnElementIfPresentId(String locatorsId, Duration timeout) {
    	 wait = new WebDriverWait(driver,timeout);
    	 WebElement element = driver.findElement(By.id(locatorsId));
    	 if(element.isDisplayed()) {
    		 wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    	 }else {
     		System.out.println("Element is not displayed \n check the Locators Id :"+locatorsId+" is correct");
              }
     }
	
	
}
