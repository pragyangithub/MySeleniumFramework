package com.actitime.objectRepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login {

	
	@FindBy(name="username")
	WebElement usernameEdt;
	
	@FindBy(name="pwd")
	WebElement passwordEdt;
	
	@FindBy(id="loginButton")
	WebElement loginBtn;
	
	
	@FindBy(id="keepLoggedInCheckBox")
	WebElement keepmeloginChk;
	
	

	@FindBy(xpath="//span[text()='Username or Password is invalid. Please try again.']")
	

	private WebElement errormsg;
	
	//ENCAPSULATION
	
	
	//provide read access to test writer
	
	
	public WebElement getUsernameEdt() {
		return usernameEdt;
	}

	public WebElement getPasswordEdt() {
		return passwordEdt;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	public WebElement getKeepmeloginChk() {
		return keepmeloginChk;
	}

	public WebElement getErrorMsg() {
		return errormsg;
	}
	
	
	//overloading method
	public void login(String username,String password)
	{
		usernameEdt.sendKeys(username);
		passwordEdt.sendKeys(password);
		loginBtn.click();
	}
	
	

	public void login()
	{
		usernameEdt.sendKeys("admin");
		passwordEdt.sendKeys("manager");
		loginBtn.click();
	}
	
	
	
	
}
