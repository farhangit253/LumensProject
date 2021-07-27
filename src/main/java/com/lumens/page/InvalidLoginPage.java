package com.lumens.page;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.lumens.utils.Base;

public class InvalidLoginPage extends Base{
	
	
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
	
	@FindBy(xpath="//div[contains(text(),'The password entered is not a valid password.')]")
	WebElement verifyInvalidLoginPage;
	
	    
	          
      public InvalidLoginPage() {
    	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
      PageFactory.initElements(driver, this);
	            
	        }
      public void selectSignIn() {
    	    popup.click();
    	    Actions action = new Actions(driver);
    	    action.moveToElement(mouseOverOnAccount).build().perform();
    	    signIn.click();
    	}

    	   public void login(String emailId, String passWord) {
    		 WebDriverWait wait = new WebDriverWait(driver,30);
    		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("dwfrm_login_username")));
    	     email.sendKeys(emailId);  
    	     WebDriverWait waits = new WebDriverWait(driver,30);
    		 waits.until(ExpectedConditions.visibilityOfElementLocated(By.id("dwfrm_login_password")));
    	    password.sendKeys(passWord);
    	    loginButton.click();
}
    	   public void verifyInvalidloginPage() {
    		   WebDriverWait waits = new WebDriverWait(driver,30);
      		 waits.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'The password entered is not a valid password.')]")));
    		   Assert.assertTrue(verifyInvalidLoginPage.isDisplayed());
    		   System.out.println("Invalid login operation");
    		   File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    			try{
    				FileHandler.copy(srcfile, new File("C:\\selenium2\\LumensProject\\screenshot\\Invalid Login.png"));
    				System.out.println("screenshot taken");
    			}catch(IOException e){
    				e.printStackTrace();
    			}
    	   }
}
