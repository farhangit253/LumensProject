package com.lumens.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.utils.Base;

public class LiveChatLoginPage extends Base {
	
	@FindBy(xpath="//a[@class='ltkpopup-close']")
	WebElement popup;
	
	@FindBy(xpath="//div[contains(text(),'Live Chat')]")
	WebElement liveChat;
	
	@FindBy(xpath="//input[@id='txt_4616424']")
	WebElement name;
	
	@FindBy(xpath="//input[@id='txt_4616425']")
	WebElement enterEmail;
	
	@FindBy(xpath="//button[text()='Submit']")
	WebElement submit;
	
	 public LiveChatLoginPage() {
   	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
         PageFactory.initElements(driver, this);
	            
	        }
	

		  
		   public void liveChatLogin(String username,String email) {
			   popup.click();
			   WebDriverWait wait = new WebDriverWait(driver,30);
			   wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Live Chat')]")));
			   JavascriptExecutor js = (JavascriptExecutor) driver;
		       js.executeScript("arguments[0].click();", liveChat);
			   
			   WebDriverWait wait1 = new WebDriverWait(driver,30);
			   wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_4616424']")));
			   name.sendKeys(username);
			   WebDriverWait waits = new WebDriverWait(driver,30);
			   waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='txt_4616425']")));
			   enterEmail.sendKeys(email);
			   
			   submit.click();
			   System.out.println("live chat login succesfull");
			   
			   
		   }

}
