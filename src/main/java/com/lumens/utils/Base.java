package com.lumens.utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	 public static  Properties prop;
	 protected static  WebDriver driver;
	
		public  Base() {
			try{
				prop=new Properties();
				FileInputStream fi=new FileInputStream("C:\\selenium2\\LumensProject\\src\\main\\java\\com\\lumens\\properties\\config.properties");
				prop.load(fi);
			}
			catch(Exception e){
				e.printStackTrace();
			}
			
		}
	 
	
	 
	public static void browserInitialization() {
		System.setProperty("webdriver.chrome.driver",prop.getProperty("driverpath"));
		driver=new ChromeDriver(); 
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		
	}
	
	

}
