package com.actitime.objectRepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class CreateNewCustomer {

	
	

	@FindBy(name="name")
	WebElement customernameEdit;
	
	
	@FindBy(name="description")
	WebElement customerdescriptionEdit;
	
	
	@FindBy(id="pre_fill_blank")
	WebElement createblankcusRadiobtn;
	
	@FindBy(id="pre_fill_import_from_existing")
	WebElement importfromexistingRadio;
	
	@FindBy(name="customerImportFromId")
	WebElement customerImportdrpdwn;
	
	
	
	@FindBy(id="project_assignments")
	WebElement projectassignmentsCheck;
	
	@FindBy(id="project_descriptions")
	WebElement projectdescriptionsCheck;
	
	@FindBy(id="task_descriptions")
	WebElement taskdescriptionsCheck;
	
	@FindBy(id="active_customers_action")
	WebElement activeProjandcustomerRadio;
	
	@FindBy(id="add_project_action")
	WebElement createnewprojRadio;
	
	@FindBy(id="add_more_customers_action")
	WebElement addmorecustomersRadio;
	
	@FindBy(name="createCustomerSubmit")
	WebElement createCustomerSubmitbtn;
	
	@FindBy(xpath="//input[@name='createCustomerSubmit']/following-sibling::input ")
	WebElement cancelbtn;
	
	
	
	
public void createCustomer(String customerName)
	
	{
		customernameEdit.sendKeys(customerName);
	
		createCustomerSubmitbtn.click();
	}
	
	public void createCustomer(String customerName,String customerDesc)
	
	{
		customernameEdit.sendKeys(customerName);
		customerdescriptionEdit.sendKeys(customerDesc);
		createCustomerSubmitbtn.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
