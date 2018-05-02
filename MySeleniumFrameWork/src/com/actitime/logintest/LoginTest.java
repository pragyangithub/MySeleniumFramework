package com.actitime.logintest;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.actitime.genericlib.FileDataLib;
import com.actitime.objectRepositorylib.Login;

public class LoginTest {

	FileDataLib flib=new FileDataLib();
	WebDriver driver;
	Properties pObj;
	
	@BeforeClass
	
	public void configBC() throws Throwable
	{
		pObj=flib.getPropertyObj();
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	
	@Test
	
	public void verifyInvalidUsernameTest() throws Throwable
	{
		String invalidusername=flib.getExcelData("Sheet1", 3, 2);
		String errormsg=flib.getExcelData("Sheet1", 3, 3);
		driver.get(pObj.getProperty("url"));
		Login lpage=PageFactory.initElements(driver, Login.class);
		//enter invalid username
		
		lpage.getUsernameEdt().sendKeys(invalidusername);
		lpage.getLoginBtn().click();
		String actMsg=lpage.getErrorMsg().getText();
		
		//verify Error msg
		
		Assert.assertEquals(errormsg, actMsg);
		
	}
		@Test
		
		public void verifyInvalidPasswordTest() throws Throwable
		{
			String invalidpassword=flib.getExcelData("Sheet1", 4, 2);
			String errormsg=flib.getExcelData("Sheet1", 4, 3);
			driver.get(pObj.getProperty("url"));
			Login lpage=PageFactory.initElements(driver, Login.class);
			//enter invalid username
			
			lpage.getUsernameEdt().sendKeys(invalidpassword);
			lpage.getLoginBtn().click();
			String actMsg=lpage.getErrorMsg().getText();
			
			//verify Error msg
			
			Assert.assertEquals(errormsg, actMsg);
			
		
	}
		
		
		
@Test
		
		public void clickOnLoginButtonWithoutTestData() throws Throwable
		{
			String errormsg=flib.getExcelData("Sheet1", 5, 2);
			
			driver.get(pObj.getProperty("url"));
			Login lpage=PageFactory.initElements(driver, Login.class);
			//enter invalid username
			
			lpage.getLoginBtn().click();
			String actMsg=lpage.getErrorMsg().getText();
			
			//verify Error msg
			
			Assert.assertEquals(errormsg, actMsg);
			
		
	}


@AfterClass
public void configAC()
{
	driver.close();
}





		
		
		
		
		
		
		
		
		
		
		
		
	
}
