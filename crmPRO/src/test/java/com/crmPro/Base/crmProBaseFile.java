package com.crmPro.Base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import screenRecording.ScreenRecordingUtil;
import utilityFile.UtilityFile;



public class crmProBaseFile {
	public Properties propX;
	
	protected WebElement element;
	protected WebDriverWait wait;
	protected JavascriptExecutor jse;
	protected WebDriver driver;
	protected String s;
	
	protected ExtentReports rep=UtilityFile.getInstance();
	protected ExtentTest test;
		
	protected crmProBaseFile(){
	UtilityFile up= new UtilityFile();
	propX=up.getProp();
	}
	
	
	@BeforeClass
	public void setup() throws Exception
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setExperimentalOption("useAutomationExtension", false);
		chromeOptions.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		// driver = new ChromeDriver(chromeOptions);
		//ScreenRecordingUtil.startRecording("navigation_FeatureTest");
		//test=rep.startTest("Open Browser");
		String browserName = propX.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			//WebDriverManager.chromedriver().setup();
			String chromeDriverPath = propX.getProperty("CHROMEPATH");
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver=new ChromeDriver(chromeOptions);
			
		}else if(browserName.equals("firefox"))
			{
				//WebDriverManager.firefoxdriver().setup();
			String firefoxDriverPath = propX.getProperty("FIREFOXPATH");
			System.setProperty("webdriver.gecko.driver", firefoxDriverPath);
				driver=new FirefoxDriver();
			}
		//test.log(LogStatus.INFO, "Browser opened");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(propX.getProperty("URL"));
		
	}
	
	
	
	@AfterClass
	public void teardown() throws Exception
	{
		driver.close();
		//ScreenRecordingUtil.stopRecording();
	}
	
	@DataProvider(name="getLogin")
	 
	 public Object[][] getLogin() {
			Object[][] arrayObject = getExcelData("E:\\SELENIUM\\crmPRO\\src\\test\\java\\crmProTestData.xls","Login");
			return arrayObject;
	}
	
	
	
	
	
	 public String[][] getExcelData(String fileName, String sheetName) 
	 {
			String[][] arrayExcelData = null;
			try {
				FileInputStream fs = new FileInputStream(fileName);
				Workbook wb = Workbook.getWorkbook(fs);
				Sheet sh = wb.getSheet(sheetName);

				int totalNoOfCols = sh.getColumns();
				int totalNoOfRows = sh.getRows();
				
				arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
				
				for (int i= 1 ; i < totalNoOfRows; i++) 
				{
					for (int j=0; j < totalNoOfCols; j++) 
					{
						arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
					}
				}
				fs.close();
				} catch (FileNotFoundException e) 
						{
							e.printStackTrace();
						} catch (IOException e) 
								{
									e.printStackTrace();
									//e.printStackTrace();
								} catch (BiffException e) 
										{
											e.printStackTrace();
										}
			return arrayExcelData;
		}


}
