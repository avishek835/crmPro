package com.crmPro.Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crmPro.Base.crmProBaseFile;

public class LoginAndHeaderMenuClass extends crmProBaseFile{
	
	WebDriver driver;
	WebDriverWait wait;
	WebElement element;
	 
    public void crmLoginPage(WebDriver driver){ 
            this.driver=driver; 
    }
    
    
    @FindBy(how=How.NAME, using="username") WebElement email;
    @FindBy(how=How.NAME, using="password") WebElement pass;
    @FindBy(how=How.XPATH, using="//*[@id=\"loginForm\"]/div/div/input") WebElement clickLoginButton;
    @FindBy(how=How.XPATH, using="//*[@id='navmenu']/ul") WebElement headerMenu;
   ////a[@href="'+url+'"]
  //input[contains(@class,'noprint') and contains(@id='navmenu') and contains(@class,'mlddm')]
    
    public void setEmail(String useremail, String userpass){
    	 email.sendKeys(useremail);
    	 pass.sendKeys(userpass);
    	 }
//    	 // This method is to set Password in the password text box
//    	 public void setPassword(String strPassword){
//    	 pass.sendKeys(strPassword);
//    	 }
    	 // This method is to click on Login Button
    	 public void clickOnLoginButton(){
    		 clickLoginButton.click();
    	 } 
    	 
    	 
    	 public void getHeaderMenuCount()
    	 {
//    		 System.out.println(driver.toString());
//    		 List<WebElement> count=driver.findElements(By.xpath("//*[@id='navmenu']/ul/li[1]/a"));
//    		 int menuCount=count.size();
//    		 System.out.println(menuCount);
    		 
//    		List<WebElement> menucount= headerMenu.findElements((By) headerMenu);
//    		int count= menucount.size();
//    		 System.out.println(count);
    		 System.out.println("Hello World");
    		 //driver.switchTo().defaultContent(); // you are now outside both frames
    		 //driver.switchTo().frame("mainpanel");
//    		 try {
//    			 wait = new WebDriverWait(driver,10);
//    				element=(WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class=\"headertable\" and @valign='top'and @width='100%']")));
//    			} catch (TimeoutException e) {
//    				wait=new WebDriverWait(driver,10);
//    				element=(WebElement)wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@class=\"headertable\" and @valign='top'and @width='100%']")));
//    				e.printStackTrace();
//    			}
    		 
    		 
    	 }

}
