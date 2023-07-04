package com.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.BaseClass.BaseClass;
import com.Testrunner.TestRunner;
import com.pom.Home_page;
import com.pom.Searchpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Stepdefinition extends BaseClass {
	
	public Home_page hp = new Home_page(driver);
	
	@Given("User launch the url {string}")
	public void user_launch_the_url(String string) {
		url(string);
	   
	}

	@Given("User click on  shop men")
	public void user_click_on_shop_men() {
		hp.getLogin().click();
	    
	}
	
	Searchpage sp = new Searchpage(driver);
	@Given("User to select T-shirt clcik on it")
	public void user_to_select_t_shirt_clcik_on_it() {
		sp.getSearch().click();
	}	
	@When("user click the white_tees")
	public void user_click_on_white_tees() {
		sp.getSearch().click();
	
	}
	@When("user select the polo neck regular t-shirt")
	public void user_select_the_polo_neck_regular_t_shirt() {
		sp.getSearch().click();
	}
	@When("user click on size")
	public void user_click_on_size() {
		sp.getSearch().click();
		
	}
	@When("user select t-shirt add to the cart")
	public void user_select_t_shirt_add_to_the_cart(){
		sp.getSearch().click();
	}
	
	

}
