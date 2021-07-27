package com.lumens.stepdefinition;

import java.util.ArrayList;

import com.lumens.dataprovider.LumensData;
import com.lumens.page.LiveChatLoginPage;

import cucumber.api.java.en.Then;

public class LiveChatLoginStepDefinition  {
	
	LiveChatLoginPage live=new LiveChatLoginPage();
	LumensData exceldata=new LumensData();
	
	@Then("^user should click livechat on homepage and login with valid credentials$")
	public void user_should_click_livechat_on_homepage_and_login_with_valid_credentials() throws Throwable {
		 ArrayList<String> testdata=exceldata.getData("LiveChat");
	    live.liveChatLogin(testdata.get(1), testdata.get(2));
	}

}
