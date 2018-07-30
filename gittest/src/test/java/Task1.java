

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Task1 {

	public static WebDriver driver;
	@BeforeMethod
	
	public void configBM()
	{
		 driver=new FirefoxDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();
		driver.get("http://live.guru99.com/index.php/");
	}
	@Test
	
	public void VefifyItemInMobileListPage()
	{
		//verify title of the home page
		String expTitle="THIS IS DEMO SITE";
		String Title=driver.findElement(By.xpath("//div[@class='page-title']/h2")).getText();
		String[] arr=Title.split(" ");
		String actTitle=arr[0]+" "+arr[1]+" "+arr[2]+" "+arr[3];
		Boolean stat=actTitle.equalsIgnoreCase(expTitle);
		Assert.assertTrue(stat);
		
		
		//click on the mobile link
		driver.findElement(By.xpath("//a[text()='Mobile']")).click();
		
		
		//verify the title of the mobile page
		String expMobTitle="MOBILE";
		String actMobTitle=driver.findElement(By.xpath("//div[@class='page-title category-title']/h1")).getText();
		
		Boolean mobstat=expMobTitle.equalsIgnoreCase(actMobTitle);
		Assert.assertTrue(mobstat);
		//capuure all the expected product
		String x1="//div[@class='category-products']/ul/li//h2/a";
		
		List<WebElement> lst1=driver.findElements(By.xpath(x1));
		TreeSet<String> set=new TreeSet();
		System.out.println("----------BEFORE--------------");
		for(int i=0;i<lst1.size();i++)
		{
			
			String actVal=lst1.get(i).getText();
			System.out.println(actVal);
			//String arr1=actVal;
			
		set.add(actVal);
		
		
		}
		
		System.out.println("----------EXPECTED--------------");
		for(String s:set)
		{
			System.out.println(s);
		}
		//in the list of all mobile select sortby dropdown as name
		
		String x="//select[@title='Sort By']";
		WebElement wb=driver.findElement(By.xpath(x));
		
		Select sel=new Select(wb);
		List<WebElement> lst=sel.getOptions();
		String expVal="Name";
		for(int i=0;i<lst.size();i++)
		{
			
			String actVal=lst.get(i).getText();
			//System.out.println(actVal);
			
			if(expVal.equals(actVal))
			{
		sel.selectByVisibleText(actVal);
		break;
			}
		
		}
		
		//Verify All the products are sorted by name
		
		//String x1="//div[@class='category-products']/ul/li//h2/a";
		
		List<WebElement> lst2=driver.findElements(By.xpath(x1));

		System.out.println("-----------ACTUAL-------------");
		for(int i=0;i<lst2.size();i++)
		{
			
			String actVal=lst2.get(i).getText();
			System.out.println(actVal);
			
		
		
		}
		for(int i=0;i<lst1.size();i++)
		{
		for(String temp:set)
		{
			//System.out.println(temp+","+lst2.get(i).getText());
			Assert.assertEquals(temp, lst2.get(i).getText());
		i++;
		}
		continue;
		}
		}
		
		
		
	
	
	@AfterMethod
	
	public void configAM()
	{
		driver.close();
	}

}











