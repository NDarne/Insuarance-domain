package com.pom_pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PolicyPom {
      @FindBy(xpath="//div[@class='pb_exitIntent__box__close']") WebElement popUp;
      @FindBy(xpath="(//button[@class='primaryMainCta'])[1]") private WebElement policySelector;
      @FindBy(xpath="//span[text()='VIEW RIDERS']")private WebElement viewRider;
      @FindBy(xpath="(//button[@class])[1]") private WebElement rider1;
      @FindBy(xpath="//span[text()='VIEW ADD-ONS']")private WebElement viewAddONs;
      @FindBy(xpath="(//button[@class])[4]") private WebElement addOns1;
      @FindBy(xpath="//button[text()='Proceed to proposal']") private WebElement buttonP2P;

  public PolicyPom(WebDriver driver){
	PageFactory.initElements(driver, this);
     }
   public void selectPolicy() {
	   policySelector.click();
   }
   public void closePopUp() {
	   popUp.click();
   }
   public void addRider() throws InterruptedException {
	   viewRider.click();
	   Thread.sleep(2000);
	   rider1.click();
   }
   public void addAddONs() throws InterruptedException {
	   viewAddONs.click();
	   Thread.sleep(2000);
	   addOns1.click();
   }
   public void proceedToProposal() {
	   buttonP2P.click();
   }
}