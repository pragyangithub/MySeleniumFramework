package com.actitime.customertest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.genericlib.BaseClass;
import com.actitime.genericlib.FileDataLib;


@Listeners(com.actitime.genericlib.SampleListner.class)
public class CustomerTest extends BaseClass{
	FileDataLib flib=new FileDataLib();
	
	@Test
	public void createCustomerTest() throws Throwable
	{
		String customerName=flib.getExcelData("Sheet1", 1, 2);
		//navigate to task image
				driver.findElement(By.xpath("//div[text()='Tasks']")).click();
				
				
				//navigate to project and customer page
				driver.findElement(By.linkText("Projects & Customers")).click();
				
			
				 driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
					
					//create customer
				
					driver.findElement(By.name("name")).sendKeys(customerName);
					
					driver.findElement(By.id("add_project_action")).click();
					driver.findElement(By.name("createCustomerSubmit")).submit();
					//verify the details
					String actMsg=driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
					boolean stat=actMsg.contains("successxxxfully created");
					Assert.assertTrue(stat);
	}
	
	@Test
	public void createCustomerWithDescriptionTest() throws Throwable
	{
	
		String customerName=flib.getExcelData("Sheet1", 2, 2);
		String customerdesc=flib.getExcelData("Sheet1", 2, 3);
		//navigate to task image
				driver.findElement(By.xpath("//div[text()='Tasks']")).click();
				
				
				//navigate to project and customer page
				driver.findElement(By.linkText("Projects & Customers")).click();
				
			
				 driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
					
					//create customer
				
					driver.findElement(By.name("name")).sendKeys(customerName);
					driver.findElement(By.name("description")).sendKeys(customerdesc);
					
					driver.findElement(By.id("add_project_action")).click();
					driver.findElement(By.name("createCustomerSubmit")).submit();
					//verify the details
					String actMsg=driver.findElement(By.xpath("//span[@class='successmsg']")).getText();
					boolean stat=actMsg.contains("successxxfully created");
					Assert.assertTrue(stat);
	}
}
