package com.lumens.stepdefinition;

import com.lumens.utils.Base;

import cucumber.api.java.After;

public class Hooks extends Base {
	
	@After
	public void closeBrowser() {
		driver.close();
	}

}
