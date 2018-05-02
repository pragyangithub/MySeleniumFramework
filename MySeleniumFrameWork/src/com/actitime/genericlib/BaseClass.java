package com.actitime.genericlib;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.actitime.objectRepositorylib.Common;
import com.actitime.objectRepositorylib.Login;

public class BaseClass {
	public  static WebDriver driver;
	FileDataLib fileLib = new FileDataLib();
	Properties pObj;
	
	@BeforeClass
	public void configBC() throws Throwable{
		 pObj = fileLib.getPropertyObj();
		String browserNAme = pObj.getProperty("browser");
		if(browserNAme.equals("firefox")){
		        driver = new FirefoxDriver();
		}else if(browserNAme.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		
	}
	
	@BeforeMethod
	public void configBM() throws IOException{
	
		System.out.println("login");
		
//		String userid = pObj.getProperty("username");
//		String passwd = pObj.getProperty("password");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		driver.get(pObj.getProperty("url"));
		
//		driver.get(url);
		
		Login lPage=PageFactory.initElements(driver, Login.class);
		lPage.login();
		
//		driver.findElement(By.name("username")).sendKeys(userid);
//		driver.findElement(By.name("pwd")).sendKeys(passwd);
//		driver.findElement(By.id("loginButton")).click();
	}
	
	@AfterMethod
	public void configAm(){
	//	driver.findElement(By.xpath("//a[@class='logout']")).click();
		Common cPage=PageFactory.initElements(driver, Common.class);
		cPage.logout();
	}
	
	@AfterClass
	public void configAC(){
		driver.close();
	}
	
	
	
  
}
