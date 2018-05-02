package com.actitime.objectRepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTask {

	
	
	
	
	@FindBy(linkText="Completed Tasks")
	WebElement completedTaskslnk;
	
	@FindBy(linkText="Projects & Customers")
	WebElement projectsCustomerslnk;
	
	@FindBy(linkText="Archives")
	WebElement archiveslnk;
	
	
	@FindBy(linkText="Open Tasks")
	WebElement opentaskslnk;
	
	
	@FindBy(xpath="//input[@value='Create New Tasks']")
	WebElement createnewtaskbtn;
	
	
	
	@FindBy(id="cpSelector.cpButton.contentsContainer")
	WebElement customerandprojectdropdown;
	
	
	
	@FindBy(xpath="//input[@class='controlBorder']")
	WebElement filtertaskbynameEdt;
	
	
	@FindBy(id="tasksFilterSubmitButton")
	WebElement applyfilterbtn;
	
	
	
	@FindBy(xpath="//input[@value='Delete Selected Tasks']")
	WebElement deleteSelectedtasks;
	
	
	@FindBy(xpath="//input[@value='Complete Selected Tasks']")
	WebElement completeSelectedtasks;
	
	
	
	
	
	
	
	public void navigateToProjectAndCustomerPage()
	{
		projectsCustomerslnk.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
