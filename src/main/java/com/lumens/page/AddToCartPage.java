package com.lumens.page;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.lumens.utils.Base;

public class AddToCartPage extends Base  {
	
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
    
    @FindBy(xpath="//a[contains(text(),'Archer Chandelier')]")
    WebElement selectProduct;
    
    @FindBy(xpath="//button[@title='Add to Cart']")
    WebElement addToCart;
    
    @FindBy(xpath="//div[text()='Archer Chandelier added to your cart']")
    WebElement verifyingCartAddedSuccesfullyLogo;
    
    @FindBy(xpath="//a[text()='CHECKOUT']")
    WebElement checkOut;
    
    public  AddToCartPage() {
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
	
	public void selectProductAndAddToCart() {
		selectProduct.click();
		
		 JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();",addToCart );
		
		assertTrue(verifyingCartAddedSuccesfullyLogo.isDisplayed());
		System.out.println("Product Succesfully added to cart");
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try{
			FileHandler.copy(srcfile, new File("C:\\selenium2\\LumensProject\\screenshot\\LumensAddToCart.png"));
			System.out.println("screenshot taken");
		}catch(IOException e){
			e.printStackTrace();
		}
		checkOut.click();
		
	}
	
	
	

}
