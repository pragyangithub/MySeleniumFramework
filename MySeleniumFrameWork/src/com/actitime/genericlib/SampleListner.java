package com.actitime.genericlib;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.actitime.customertest.CustomerTest;

public class SampleListner implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult t) {
		// TODO Auto-generated method stub
		
		String ftestname=t.getMethod().getMethodName();
		System.out.println("=====Failed Test======="+ftestname);
		EventFiringWebDriver edriver=new EventFiringWebDriver(CustomerTest.driver);
		File srcfile=edriver.getScreenshotAs(OutputType.FILE);
		File dstfile=new File("./screenshot/"+ftestname+".png");
		try
		{
			FileUtils.copyFile(srcfile, dstfile);
		}
		catch (IOException e) {
			// TODO: handle exception
		}
		
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	
	
}
