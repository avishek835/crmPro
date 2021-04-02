package com.crmPro.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crmPro.Base.crmProBaseFile;
import com.crmPro.Class.LoginAndHeaderMenuClass;
import com.crmPro.Class.LoginClass;
import com.relevantcodes.extentreports.LogStatus;

public class LoginAndHeaderMenu extends crmProBaseFile{
	
//	@Test
//	public void loadURL()
//	{
//		driver.get(propX.getProperty("URL"));
//		
//	}
	LoginAndHeaderMenuClass lc;
	 @Test(dataProvider="getLogin", priority=1)
	 public void login(String useremail, String userpass)
	 {
		 //test.log(LogStatus.INFO, "Logged in");
		 lc= PageFactory.initElements(driver, LoginAndHeaderMenuClass.class);
			lc.setEmail(useremail, userpass);
			//lc.clickOnLoginButton();
			utilityFile.UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
			//test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(utilityFile.UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
			//test.log(LogStatus.PASS, "Test Pass");
			//rep.endTest(test);
			//rep.flush();
	 }
	 
	 @Test(priority=2)
	 public void getheaderMenuCount()
	 {
		 
		 //LoginAndHeaderMenuClass header= PageFactory.initElements(driver, LoginAndHeaderMenuClass.class);
		 //lc.getHeaderMenuCount();
		 List<WebElement> menucount= driver.findElements(By.xpath("//td[@class=\"headertable\" and @valign='top'and @width='100%']"));
		 int count= menucount.size();
		 System.out.println(count);
	 }
	 
	 
}
