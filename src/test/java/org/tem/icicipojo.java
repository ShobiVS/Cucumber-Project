package org.tem;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.sam.BaseClass;


public class icicipojo extends BaseClass{
	public icicipojo() {
		PageFactory.initElements(driver, this);
	}
	 
	@FindBy(xpath="//input[@name='DUMMY1']")
    private WebElement logIn;
	
	@FindBy(xpath="//input[@name='AuthenticationFG.ACCESS_CODE']")
	private WebElement pwd;
	
	@FindBy(xpath="//input[@name='Action.VALIDATE_CREDENTIALS']")
	private WebElement submit;

	public WebElement getLogIn() {
		return logIn;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
}
