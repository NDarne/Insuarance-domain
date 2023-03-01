package com.baseclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Date;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	static WebDriver driver;
	public static String getCurrentDate() {
		Date date = new Date(0); 
		String currentDate = date.toString().replaceAll(":", "_");
		return currentDate;
	}
	public static void getScreenShotForfailTest(String name) throws IOException {
		//FileInputStream file = new FileInputStream("");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);	
		File dest = new File("D:\\All_program\\Insurance_Domain\\target\\Screenshot for fail test"+name+getCurrentDate()+".jpg");
		FileHandler.copy(src, dest);
		}
   
}
