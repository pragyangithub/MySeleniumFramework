package com.actitime.objectRepositorylib;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class Common {


	@FindBy(linkText="Logout")
	WebElement logoutlnk;
	
	
	
	public void logout() {
		logoutlnk.click();
	}
	
}
