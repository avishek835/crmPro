package com.crmPro.Class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.crmPro.Base.crmProBaseFile;

public class LoginClass extends crmProBaseFile{
	
	WebDriver driver;
	 
    public void crmLoginPage(WebDriver driver){ 
            this.driver=driver; 
    }
    @FindBy(how=How.NAME, using="username") WebElement email;
    @FindBy(how=How.NAME, using="password") WebElement pass;
    @FindBy(how=How.XPATH, using="//*[@id=\"loginForm\"]/div/div/input") WebElement clickLoginButton;
    
   
    public void setEmail(String useremail, String userpass){
    	 email.sendKeys(useremail);
    	 s=email.getAttribute("value");
    	 System.out.println(s);
    	 
    	 pass.sendKeys(userpass);
    	 s=pass.getAttribute("value");
    	 System.out.println(s);
    	 
    	 }
//    	 // This method is to set Password in the password text box
//    	 public void setPassword(String strPassword){
//    	 pass.sendKeys(strPassword);
//    	 }
    	 // This method is to click on Login Button
    	 public void clickOnLoginButton(){
    		 clickLoginButton.click();
    	 } 
    	 
//    	 public void loadURL()
//    		{
//    			driver.get(propX.getProperty("URL"));
//    			
//    		}
}
