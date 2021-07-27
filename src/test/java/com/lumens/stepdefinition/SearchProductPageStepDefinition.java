package com.lumens.stepdefinition;

import java.util.ArrayList;

import com.lumens.dataprovider.LumensData;
import com.lumens.page.SearchProductPage;

import cucumber.api.java.en.Then;

public class SearchProductPageStepDefinition {
	LumensData exceldata=new LumensData();
	SearchProductPage search=new SearchProductPage();
	
	@Then("^user should enter the product name and able to search that product in search bar$")
	public void user_should_enter_the_product_name_and_able_to_search_that_product_in_search_bar() throws Throwable {
	    
		 ArrayList<String> testdata=exceldata.getData("SearchProduct");
		 search.searchProduct(testdata.get(1));
	}


}
