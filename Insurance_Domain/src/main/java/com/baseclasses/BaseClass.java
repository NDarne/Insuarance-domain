package com.baseclasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.configuration.PathConfig;

public class BaseClass {
                 static WebDriver driver;
            public static WebDriver openBrowser(String browsertype) {
            	if(browsertype.equalsIgnoreCase("chrome")) {
            		System.out.println("Chrome is launching");
            		usingChrome();
            	}
            	else if(browsertype.equalsIgnoreCase("firefox")) {
            		System.out.println("Firefox is launching");
            		usingFirefox();
                   }else {
                	   System.out.println("Launching chrome as default");
               		   usingChrome();
                   }
            	return driver;
            }
      public static WebDriver usingChrome() {
    	  driver =new ChromeDriver();
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	  driver.manage().deleteAllCookies();
    	  driver.get(PathConfig.appUrl);
    	  return driver;
      }
      
      public static WebDriver usingFirefox() {
    	  driver= new FirefoxDriver();
    	  driver.manage().window().maximize();
    	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
    	  driver.manage().deleteAllCookies();
          driver.get(PathConfig.appUrl);
    	  return driver;
    	  
      }
}
