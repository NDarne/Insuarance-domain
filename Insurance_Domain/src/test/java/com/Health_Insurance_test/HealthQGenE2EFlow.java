package com.Health_Insurance_test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.CommonClasses.CommonMethods;
import com.pom_pages.HomePage;

public class HealthQGenE2EFlow {
	static WebDriver driver;
	
      @BeforeClass 
     //@Parameter({"browsername"})  public void oepenBrowser(String browsername) {
     //to open browser on which we need to test webapp 
     public void oepenBrowser() {
    	 driver = CommonMethods.launchBrowser("chrome");
    	 CommonMethods.waitToLoadPage(20);
     }
      @Test
      public void qouteGenSteps() {
    	  HomePage home =new HomePage(driver);
    	  home.open_healthInsurance();
    	  CommonMethods.waitToLoadPage(20);
      }
      /*@AfterClass
      public void closeBrowser() {
    	  driver.quit();
      }*/
}
