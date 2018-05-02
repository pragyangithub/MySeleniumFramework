package com.actitime.customertest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.FileDataLib;
import com.actitime.objectRepositorylib.ActiveProjectandCustomer;
import com.actitime.objectRepositorylib.CreateNewCustomer;
import com.actitime.objectRepositorylib.Home;
import com.actitime.objectRepositorylib.OpenTask;

public class CustomerProjectTeat extends BaseClass {

	FileDataLib flib=new FileDataLib();
	
	@Test
	
	public void createCustomerTest() throws Throwable {
		
		//read test data from Excel
		String cName=flib.getExcelData("Sheet1", 1, 2);
		//Step 2:navigate to task page
		Home hPage=PageFactory.initElements(driver, Home.class);
		hPage.navigateToTaskPage();
		
		//Step 3:navigate to Project and Customer Page
		
		OpenTask taskPage=PageFactory.initElements(driver, OpenTask.class);
		taskPage.navigateToProjectAndCustomerPage();
		
		//Step 4:navigate to createNewCustomer Page
		
		ActiveProjectandCustomer aCustPage=PageFactory.initElements(driver, ActiveProjectandCustomer.class);
		aCustPage.navigeteToCreateCustomerPage();
		
		//Step 5:create customer
		
		CreateNewCustomer cPage=PageFactory.initElements(driver,CreateNewCustomer.class);
		
		cPage.createCustomer(cName);
		
	}
	
	
	
	
	
	
@Test
	
	public void createCustomerWithDesc() throws Throwable {
		
		//read test data from Excel
		String cName=flib.getExcelData("Sheet1", 2, 2);
		String cDesc=flib.getExcelData("Sheet1", 2, 3);
		//Step 2:navigate to task page
		Home hPage=PageFactory.initElements(driver, Home.class);
		hPage.navigateToTaskPage();
		
		//Step 3:navigate to Project and Customer Page
		
		OpenTask taskPage=PageFactory.initElements(driver, OpenTask.class);
		taskPage.navigateToProjectAndCustomerPage();
		
		//Step 4:navigate to createNewCustomer Page
		
		ActiveProjectandCustomer aCustPage=PageFactory.initElements(driver, ActiveProjectandCustomer.class);
		aCustPage.navigeteToCreateCustomerPage();
		
		//Step 5:create customer
		
		CreateNewCustomer cPage=PageFactory.initElements(driver,CreateNewCustomer.class);
		
		cPage.createCustomer(cName,cDesc);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
