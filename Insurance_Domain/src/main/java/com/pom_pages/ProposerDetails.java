package com.pom_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProposerDetails {
	@FindBy(xpath="//select[@id='maritalstatus']") private WebElement maritialStatus;
	@FindBy(xpath="	//input[@type='text']") private List<WebElement> textBoxes;
	@FindBy(xpath="//select") private List<WebElement> dropDown;
	@FindBy(xpath="//button[text()='PROCEED TO MEDICAL QUESTIONS']") private WebElement infoButton;
    @FindBy(xpath="//button[text()='VIEW PLANS']") private WebElement viewButton;
    @FindBy(xpath="//input[@type='checkbox']") private List<WebElement> queYN;
    @FindBy(xpath="//button[text()='CONTINUE TO NOMINEE SECTION']") private WebElement medButton;
    @FindBy(xpath="//select[@id='relation-88416534']") private WebElement relationDropDown;
    @FindBy(xpath="//input[@type='text']") private WebElement nomineeName;
    @FindBy(xpath="//button[text()='REVIEW & PAY']") private WebElement payreviewButton;
    @FindBy(xpath="//input[@id='declarationInput']") private WebElement checkBox;
    @FindBy(xpath="//button[text()='CONTINUE']") private WebElement continueButton;
    @FindBy(xpath="//button[text()='Proceed to payment']") private WebElement proceedToPay;
    @FindBy(xpath="//a[text()='(-) Remove']") private WebElement removeAddOns;
    @FindBy(xpath="//label[@for='0_8281']") private WebElement no;
  //button[@class='primaryButtonStyle btn']
	public ProposerDetails(WebDriver driver){
		PageFactory.initElements(driver, this);
		
	}
	/*public void maritalStatusDropDown(WebDriver driver) {
		Actions act = new Actions (driver);
		act.moveToElement(maritialStatus).click().perform();
		act.sendKeys(Keys.ARROW_DOWN).click().perform();
		/*Select s = new Select(maritialStatus);
       s.selectByValue("Single");
	} 
	
*/
	
	

	public void textBox(int j,String data) {
			textBoxes.get(j).sendKeys(data);
			}
	public void allDropDown(WebDriver driver,int j) {
		Actions act = new Actions (driver);
		for(int i=0;i<=dropDown.size()-1;i++) {
			if(i==j) {
				if(j==3) {
		                 act.moveToElement(dropDown.get(j)).click().perform();
		                     for(int k=0;k<=5;k++) {
		                                 act.sendKeys(Keys.ARROW_DOWN).perform();
		                                 }
		                      act.click().perform();
			            }else{
				               act.moveToElement(dropDown.get(i)).click().perform();
				               act.sendKeys(Keys.ARROW_DOWN).click().perform();
					        }
			          }
	
		   }
		/*Select s = new Select(maritialStatus);
       s.selectByValue("Single");*/
	}
	public void button1() {
		infoButton.click();
	}
    
	public void viewPlanButton() {
		viewButton.click();
	}
	public void medicalQuesions(int k) throws InterruptedException {
		queYN.get(k).click();
		}
	/*public void medicalQuesions() throws InterruptedException {
		for (int i=0 ; i<=queYN.size()-1;i++) {
			Thread.sleep(2000);
			queYN.get(i).click();
		}
		}*/
	public void button2() {
		medButton.click();
	}
	public void selectRelation(WebDriver driver) {
		//Select s= new Select(relationDropDown);
		//s.selectByVisibleText("Father");
		WebElement relation = driver.findElement(By.xpath("(//label[@class='nonHoverClass'])[1]"));
		Actions act = new Actions(driver);
		act.moveToElement(relation).click().perform();
		act.sendKeys(Keys.ARROW_DOWN).click().perform();
	}
	public void selectNominee() {
		nomineeName.clear();
		nomineeName.sendKeys("Nitin Mukesh");
	}
	public void payreviewClick() {
		payreviewButton.click();
	}
	public void checkBoxClick() {
		checkBox.click();
	}
	public void selectContinue() {
		continueButton.click();
	}
	public void proceedToPayment() {
		proceedToPay.click();
	}
	public void removeAdd() {
		removeAddOns.click();
	}
	public void clickNo() {
		no.click();
	}
}
