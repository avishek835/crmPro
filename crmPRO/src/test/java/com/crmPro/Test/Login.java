package com.crmPro.Test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.crmPro.Base.crmProBaseFile;
import com.crmPro.Class.LoginClass;
import com.relevantcodes.extentreports.LogStatus;

public class Login extends crmProBaseFile
{
	LoginClass lc;
//	@Test
//	public void loadURL()
//	{
//		lc= PageFactory.initElements(driver, LoginClass.class);
//		lc.loadURL();
//		
//	}
	 @Test(dataProvider="getLogin", priority=1)
	 public void login(String useremail, String userpass)
	 {
		// test.log(LogStatus.INFO, "Logged in");
		 	 lc= PageFactory.initElements(driver, LoginClass.class);
			 lc.setEmail(useremail, userpass);
			//lc.clickOnLoginButton();
			//utilityFile.UtilityFile.takeScreenShot(driver,"E:\\Avishek\\ScreenShot", "ss.png");
			//test.log(LogStatus.INFO, " Screen Shot: "+test.addScreenCapture(utilityFile.UtilityFile.takeScreenShot(driver, "E:\\Avishek\\ScreenShot", "ss.png")));
			//test.log(LogStatus.PASS, "Test Pass");
			//rep.endTest(test);
			//rep.flush();
	 }
}
