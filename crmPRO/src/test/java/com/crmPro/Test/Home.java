package com.crmPro.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.crmPro.Base.crmProBaseFile;

public class Home extends crmProBaseFile{
	
//	@Test
//	public void loadURL()
//	{
//		driver.get(propX.getProperty("URL"));
//		
//	}
	
	@Test(priority=1)
		public void getCount()
		{
		 List<WebElement> menucount= driver.findElements(By.xpath("//*[@id='navbar-collapse']/ul/li/a"));
		 int count= menucount.size();
		 System.out.println("Count is," +count);
		}
}
