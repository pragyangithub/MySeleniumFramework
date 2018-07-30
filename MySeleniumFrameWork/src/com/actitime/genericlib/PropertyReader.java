package com.actitime.genericlib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class PropertyReader {
	
	
	public static void reader() 
	{
		try
		{
		Properties pObj=new Properties();
		File f=new File("./testData/config.properties");
		FileInputStream fis=new FileInputStream(f);
		pObj.load(fis);
		
		String browsername=pObj.getProperty("browser");
		System.out.println(browsername);
		}
		catch(Exception ex)
		{
			System.out.println("Reading Failed due to"+ex);
		}

	}
	@Test
	public void read()
	{
		try
		{
			
			reader();
			
			
			
		}
		catch(Exception ex)
		{
			System.out.println("Failed Due to"+ex);
			throw ex;
		}
	}
	

}
