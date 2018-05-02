package com.actitime.objectRepositorylib;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home {

	@FindBy(xpath="//div[contains(text(),'Time-Track')]")
	WebElement TimeTrackImg;
	
	@FindBy(xpath="//div[text()='Tasks']/..")
	WebElement taskImg;
	
	@FindBy(name="//div[text()='Reports']")
	WebElement reportsImg;
	
	@FindBy(xpath="//div[text()='Users']/..")
	WebElement usersImg;
	
	
	@FindBy(name="//div[text()='Work Schedule']")
	WebElement workScheduleImg;
	
	@FindBy(name="//div[text()='Settings']")
	WebElement settingImg;
	
	@FindBy(linkText="Insert existing tasks")
	WebElement insertexistingtasklnk;
	
	@FindBy(linkText="Create new tasks")
	WebElement createnewtaskslnk;
	
	
	@FindBy(id="usersSelector")
	WebElement usersSelectordrpdwn;
	
	
	
	public void navigateToTaskPage()
	{
		taskImg.click();
	}
	
	public void navigateToUserPage()
	{
		usersImg.click();
	}
	
	
	
	
	
	
	
	
	
	

}
