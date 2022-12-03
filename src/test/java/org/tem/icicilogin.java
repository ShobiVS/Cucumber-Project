package org.tem;

import org.sam.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class icicilogin extends BaseClass {
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
	    browser();
	    windowMaximize();
	}

	@When("To launch the url")
	public void to_launch_the_url() {
	   launchUrl("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI");
	}

	@When("To pass the valid userID")
	public void to_pass_the_valid_userID() throws InterruptedException {
		icicipojo i=new icicipojo();
		Thread.sleep(3000);
		passtext("5674254", i.getLogIn());
	   
	}

	@When("To pass the valid password")
	public void to_pass_the_valid_password() {
		icicipojo i=new icicipojo();
		passtext("765487", i.getPwd());
	   
	}

	@When("To click the login")
	public void to_click_the_login() {
		icicipojo i=new icicipojo();
		clickBtn(i.getSubmit());
	    
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
		//closeEntireBrowser();
	   
	}



}
