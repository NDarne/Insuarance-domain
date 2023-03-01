package com.Health_Insurance_test;


import java.io.IOException;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.events.EventException;

import com.baseclasses.NewSession;
import com.configuration.PathConfig;
import com.pom_pages.PolicyPom;
import com.pom_pages.ProposerDetails;
import com.pom_pages.QGenStepsPOM;
import com.pom_pages.medQuesions;

public class Test1 {

	
	public static void main(String[] args) throws InterruptedException, EventException, IOException {
		//open chrome browser
		System.setProperty(PathConfig.chromeKey, PathConfig.chromePath);
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//open url policy bazar
		driver.get(PathConfig.appUrl);
		//to use the properties of quote generation page instanciate QgenestepsPOM class with driver as argument
		 QGenStepsPOM steps = new QGenStepsPOM(driver);
		 Thread.sleep(5000);
		 
        steps.healthInsurance();
		Thread.sleep(2000);
		steps.self();
	    Thread.sleep(1000);
		steps.self();
		Thread.sleep(2000);
		steps.continueBtn1();
		Thread.sleep(5000);
		steps.age(driver);
		steps.continueBtn2();
		Thread.sleep(2000);
		steps.enterPinCode("440005");
		Thread.sleep(5000);
		//steps.continueBtn3();
		
		steps.selectGenderF();
		Thread.sleep(1000);
        steps.selectGenderM();
        Thread.sleep(1000);
        steps.enterFullName("Nitin Nil Mukesh");
        //steps.enterFullName("Sahil Suryavanshi");

        Thread.sleep(1000);
        //steps.enterMoNumber("7862374561");
        steps.enterMoNumber("7896456123");
        Thread.sleep(1000);
       // steps.continueBtn4();
        //driver.get("https://health.policybazaar.com/quotes?encenq=WEE2akZNTEd3YUxNallHd0Rxc0xtZlFkeko2dXlZY0FHZ2RqaGI2L3ZUTT0&enquiryid=NDQ2Mjc4ODU1&gclid=Cj0KCQiAyracBhDoARIsACGFcS7zpqB2O-tzj6A44pO60UT2RygoSdW7lt-jbbk7OO2HyyZP2AccUfgaAk7zEALw_wcB&k=eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCJ9.eyJFbnF1aXJ5SWQiOjQ0NjI3ODg1NSwiRXhwaXJ5VGltZSI6MTY3ODA4OTM1MX0.IFp5dllAIPzFeiQ1i_wWwxbeNzEDaSHT9V2Ca_cFeQYyDG5iQ9MWA3zR7PUiLigo_sbLHJ-HEmxpGHwJFw1WquiV5cF8xxTTe3XlKTRpSPlpm_uffw-U9916xvckmzH448zYAmHr9yHt_G4LAB8bT1oL3VdZFpeNQZnvZoePebU&new=1&pb_campaign=PB_Misspell00Brand&pb_content=home_v12&pb_medium=ppc&pb_source=google_brand&pb_term=Policy%20bazar&pq=health0&profileid=88408884"); 
        driver.get(NewSession.u13);     
        PolicyPom pol = new PolicyPom(driver);
         //Thread.sleep(5000);
         driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
         pol.selectPolicy();
        // driver.get(driver.getCurrentUrl());
       /* WebDriverWait w = new WebDriverWait (driver, Duration.ofSeconds(20));
        w.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[@id=\"product-container\"]/div[5]/div/div[2]"))));
        driver.findElement(By.xpath("//div[@class='pb_exitIntent__box__close']")).click();*/
        //pol.closePopUp();
         Thread.sleep(2000);
         
         pol.addRider();
         Thread.sleep(2000);
         pol.addAddONs();
         Thread.sleep(1000);
         pol.proceedToProposal();
         ProposerDetails pd = new ProposerDetails(driver);
         Thread.sleep(5000);
         //pd.maritalStatusDropDown(driver);
         //pd.textBox("Nil Nitesh Mukesh);

         Thread.sleep(1000);
         pd.textBox(1,"Gst123");
         Thread.sleep(1000);
         pd.textBox(2,"15-01-1991");
         Thread.sleep(1000);
         pd.textBox(3,"76");
         Thread.sleep(1000);
         pd.textBox(4,"Muktai");
         Thread.sleep(1000);
         pd.textBox(5,"Kareem Nagar");
         Thread.sleep(1000);
         pd.textBox(6,"Near Chhatrapati Shahu Maharaj");
         Thread.sleep(1000);
         pd.textBox(9,"test2@xyz.com");
         Thread.sleep(1000);
         pd.textBox(11,"7892130456"); 
         Thread.sleep(1000);
         
         for(int i=0;i<7;i++) {
        	 if(i!=1) {
        	 Thread.sleep(2000);
             pd.allDropDown(driver, i);
        	 }
          }   
         //driver.navigate().refresh();

         //driver.switchTo().alert().accept();
         Thread.sleep(2000);
         // pd.viewPlanButton();
         //Thread.sleep(1000);
         pd.button1();
 		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       // pd.medicalQuesions();

         /* for(int i=1;i<46;i=i+2) {
             Thread.sleep(1000);
            pd.medicalQuesions(i);
         }*/
 		
 		/* pd.medicalQuesions(1);
 		 pd.medicalQuesions(3);
 		 pd.medicalQuesions(5);
 		 pd.medicalQuesions(7);
 		 pd.medicalQuesions(9);
 		 pd.medicalQuesions();*/
 		medQuesions md = new medQuesions();
 		md.medQue(driver);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         pd.button2();
 		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         Thread.sleep(3000);
         pd.selectRelation(driver);
         Thread.sleep(2000);
         pd.selectNominee();
         Thread.sleep(2000);
         pd.payreviewClick();
         Thread.sleep(2000);
         pd.checkBoxClick();
         Thread.sleep(2000);
         pd.selectContinue();
         //Thread.sleep(1000);
        // pd.removeAdd();
         //Thread.sleep(9000);
  		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        pd.proceedToPayment();
         

    }
	  
}
/* for(int i =0; i<=9;i++) {
switch(i) {
case 1: pd.textBox(0,"Jethalal Champaklal Gada");break;
case 2: pd.textBox(1,"Gst123");break;
case 3: pd.textBox(2,"15-01-1991");break;
case 4: pd.textBox(3,"76");break;
case 5: pd.textBox(4,"Kalai");break;
case 6: pd.textBox(5,"Sai Nagar");break;
case 7: pd.textBox(6,"Near Chhatrapati Shahu Maharaj");break;
// case 8: pd.textBox(7,"Amravati");break;
// case 9: pd.textBox(8,"Maharashtra");break;
case 8: pd.textBox(9,"test@xyz.com");break;
//case 11: pd.textBox(10,"6789654321");break;
case  9: pd.textBox(11,"789456123");break;
}

}*/