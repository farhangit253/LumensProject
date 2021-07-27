package com.lumens.page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lumens.utils.Base;

public class TabPage extends Base {
	
	@FindBy(xpath="//a[@class='ltkpopup-close']")
	WebElement popup;
	
	@FindBy(xpath="//div[@class='btn-group dropdown-group']")
	WebElement mouseOverOnAccount;
	
    @FindBy(xpath="//div[@class='dropdown-menu']//a[text()='Sign In']")
	  WebElement signIn;
	    
	@FindBy(id="dwfrm_login_username")
	    WebElement email;
	    
	@FindBy(id="dwfrm_login_password")
	    WebElement password;
	    
	@FindBy(xpath="//button[@name='dwfrm_login_login']")
	    WebElement loginButton;
	
	@FindBy(xpath="//span[@title='Lighting']")
	WebElement mouseOverOnLigtings;
	
	@FindBy(xpath="//a[text()='Ceiling Lights']")
    WebElement navigateToCeilingLights;
    
    @FindBy(xpath="//span[text()='Chandeliers']")
    WebElement navigateToChandeliers;
    
    @FindBy(xpath="//p[text()='Large Chandeliers']")
    WebElement navigateToLargeChandeliers;
    
    public  TabPage() {
    	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		PageFactory.initElements(driver, this);
    }
    
    public void selectSighIn() {
    	popup.click();
    	Actions act=new Actions(driver);
    	act.moveToElement(mouseOverOnAccount).build().perform();
    	signIn.click();
    }
    
    public void login(String username,String Password) {
    	email.sendKeys(username);
    	password.sendKeys(Password);
    	loginButton.click();	
    }
	public void navigatingToLargeChandelier() {
		
		Actions act=new Actions(driver);
       act.moveToElement(mouseOverOnLigtings).build().perform();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].click();", navigateToCeilingLights);
    	
       JavascriptExecutor js1 = (JavascriptExecutor) driver;
       js1.executeScript("arguments[0].click();", navigateToChandeliers);
       
       JavascriptExecutor js2 = (JavascriptExecutor) driver;
       js2.executeScript("arguments[0].click();", navigateToLargeChandeliers);
    	
    		
	}

}
