package com.actitime.objectRepositorylib;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class ActiveProjectandCustomer {

	@FindBy(xpath="//input[contains(@value,'Show')]")
	WebElement showbtn;
	
	@FindBy(xpath="//input[@value='Create New Customer']")
	WebElement createnewcustomerbtn;
	
	@FindBy(xpath="//input[@value='Create New Project']")
	WebElement createnewprojectbtn;
	
	@FindBy(name="selectedCustomer")
	WebElement customerdrpdwn;
	
	@FindBy(xpath="//input[@value='Delete Selected']")
	WebElement deleteselectedbtn;
	
	@FindBy(xpath="//input[@value='Archive Selected']")
	WebElement achiveselectedbtn;
	
	
	
	
	
	public void navigeteToCreateCustomerPage()
	{
		createnewcustomerbtn.click();
	}
	public void navigeteToCreatepProjectPage()
	{
		createnewprojectbtn.click();
	}
	
}
