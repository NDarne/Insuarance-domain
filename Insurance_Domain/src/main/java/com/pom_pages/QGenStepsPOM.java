package com.pom_pages;

import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QGenStepsPOM {
	@FindBy(xpath="(//i[@class=\"icon-bg homeIconsBg health-insurance\"])[2]") private WebElement healthIcon;
	@FindBy(xpath="(//i[@class=\"checkbox\"])[1]") private WebElement self ;
	@FindBy(xpath ="//input[@type ='submit']") private WebElement continueButton1;
	@FindBy(xpath ="//select[@id='Self']") private WebElement ageDropDown;
	@FindBy(xpath ="//input[@type ='submit']") private WebElement continueButton2;
	@FindBy(xpath ="//input[@name='city']") private WebElement pinCode;
	@FindBy(xpath ="//li[@class='active']") private WebElement city;
    @FindBy(xpath ="//button[@id ='continuecta3']") private WebElement continueButton3;
	@FindBy(xpath ="//*[@id=\"form1\"]/form/div[1]/div[1]/div/label[1]/p") private WebElement checkMale;
    @FindBy(xpath ="//*[@id=\"form1\"]/form/div[1]/div[1]/div/label[2]/p") private WebElement checkFemale;
    @FindBy(xpath ="//input[@type='text']") private WebElement fullName;
    @FindBy(xpath ="//input[@type='tel']") private WebElement moNumber;
	@FindBy(xpath ="//button[@type='submit']") private WebElement continueButton4;
    //@FindBy(xpath ="//i[@class='gender female]") private WebElement checkFemale;
	//@FindBy(xpath ="//i[@class='gender male']") private WebElement checkMale;


	//driver.findElement(By.xpath("//i[@class='gender female']")).click();
   //input[@type='text']
  //button[@type='submit']
 //input[@value='2']
//li[@class='active']
                          

	public QGenStepsPOM(WebDriver driver){
    	PageFactory.initElements(driver, this);
    }
    public void healthInsurance() {
    	healthIcon.click();
    	}
    public void self() {
    	self.click();
    	 }
    public void continueBtn1() {
    	continueButton1.click();
    	   
    }
    
    public void age(WebDriver driver) throws InterruptedException {
    	Actions act = new Actions(driver);
    	act.moveToElement(ageDropDown).click().perform();
    	Thread.sleep(1000);
    	for(int i= 0; i<=12;i++) {
    		Thread.sleep(1000);
    		act.sendKeys(Keys.ARROW_DOWN).perform();
    	}
    	act.click().perform();
    	
    }
    public void continueBtn2() {
    	continueButton2.click();
    	   
    }
     public void enterPinCode(String pin) throws InterruptedException {
    	 pinCode.sendKeys(pin);
    	 Thread.sleep(1000);
    	 city.click();
     }
     public void continueBtn3() {
     	continueButton3.click();
     	   
     }
     public void selectGenderM() {
    	 checkMale.click();
     }
     public void selectGenderF() {
    	 checkFemale.click();
     }
     public void enterFullName(String name) {
    	 fullName.sendKeys(name);
     }
     public void enterMoNumber(String num) {
    	 moNumber.sendKeys(num);
     }
     public void continueBtn4() {
      	continueButton4.click();
      	   
      }


}
