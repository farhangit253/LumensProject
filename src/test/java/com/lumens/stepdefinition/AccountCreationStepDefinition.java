package com.lumens.stepdefinition;

import java.util.ArrayList;

import com.lumens.dataprovider.LumensData;
import com.lumens.page.AccountCreationPage;
import com.lumens.utils.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class AccountCreationStepDefinition extends Base {
	LumensData excelData=new LumensData();
	AccountCreationPage account=new AccountCreationPage();
	
	@Given("^user able to open browser and enter url$")
	public void user_able_to_open_browser_and_enter_url() throws Throwable {
		Base.browserInitialization();
	}

	@Then("^user able to mouseover on account and select my account$")
	public void user_able_to_mouseover_on_account_and_select_my_account() throws Throwable {
		account.AccountCreationPage();
	    account.mouseOverOnAccountAndClickMyAccount();
	}

	@Then("^user able to fill details for account creation$")
	public void user_able_to_fill_details_for_account_creation() throws Throwable {
		account.AccountCreationPage();
		ArrayList<String> testdata=excelData.getData("user1");
	    account.fillDetails(testdata.get(1), testdata.get(2),
	    		testdata.get(3), testdata.get(4), testdata.get(5), testdata.get(6));
	}

	@Then("^user able to click createaccount button$")
	public void user_able_to_click_createaccount_button() throws Throwable {
		account.AccountCreationPage();
	   account.createAccount();
	}
}
