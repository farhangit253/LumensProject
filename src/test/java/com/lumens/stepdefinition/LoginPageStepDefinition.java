package com.lumens.stepdefinition;

import java.util.ArrayList;

import com.lumens.dataprovider.LumensData;
import com.lumens.page.LoginPage;
import com.lumens.utils.Base;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageStepDefinition extends Base {
	
	LoginPage login=new LoginPage();
	LumensData exceldata=new LumensData();
	
	@When("^Mouse over to account and click sign In button$")
	public void mouse_over_to_account_and_click_sign_In_button() throws Throwable {
		login.selectSignIn();
	}

	@Then("^Enter the valid credentials$")
	public void enter_the_valid_credentials() throws Throwable {
		  ArrayList<String> testdata=exceldata.getData("Login");
	      login.login(testdata.get(1), testdata.get(2));
	}


}
