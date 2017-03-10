package com.bridge.poc;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import common.Commonfunctionality;
import common.IEDriver;
//import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_Login;
import pageobjects.capribedside.Capribedside_page_SelectPatient;
import pageobjects.systemManager.Sysman_page_Main;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class BRDGMM_HZD_H1_3CausePatientMisidentification {
  
	String FilePath = "C:\\Temp\\Results_BRDGMM_HZD_H1_3CausePatientMisidentification.htm";
	String TestName = "BRDGMM_HZD_H1_3CausePatientMisidentification";
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	Commonfunctionality fun = new Commonfunctionality();
//	MultiScreenShot multiScreens = new MultiScreenShot("C:\\Temp\\BRDGMM_HZD_H1_3CausePatientMisidentification","Step");
	Capribedside_page_SelectPatient sel = new Capribedside_page_SelectPatient();
	
	
	
	@BeforeClass
	@Parameters({"URL1"})
  public void beforeClass(String URL) throws InterruptedException {
		
		iedriver.extent_Reports();
		iedriver.extent_Test();
		//iedriver.extent_Reports().startTest();
		fun.login_default(URL);	
		iedriver.extent_Test().log(LogStatus.INFO, "Application launched successfully");
		
	  
  }
	
	  @Test
	  @Parameters({"URL2"})
	  public void f(String URL) throws InterruptedException, IOException {
		  //step1
		  fun.scanpatientid( "100");
			Thread.sleep(1000);
			String err=sel.ErrorMsg().getText();
			Assert.assertEquals(err.contains("Patient not found.") , true);
//			multiScreens.multiScreenShot(iedriver.driver);
			iedriver.extent_Test().log(LogStatus.PASS,  "Step 1 Passed Error message " );
			Thread.sleep(3000);
			//step2
			fun.scanpatientid( "635201");
			String actualURL =iedriver.driver.getCurrentUrl();
			Assert.assertEquals(actualURL.contains("http://10.162.106.174/TransSpec2016010301/capribedside/Main.aspx") , true);
//			multiScreens.multiScreenShot(iedriver.driver);
			iedriver.extent_Test().log(LogStatus.PASS,  "Step 2 Passed Main Menu Page displayed " );
			Thread.sleep(3000);
			//step3
			sel.button_Logout().click();
			iedriver.driver.get(URL);
			Capribedside_page_Login.txt_box_username().sendKeys("superuser");
			Capribedside_page_Login.txt_box_password().clear();
			Capribedside_page_Login.txt_box_password().sendKeys("123");
			Capribedside_page_Login.txt_box_password().sendKeys(Keys.ENTER);;
			
			 
			//fun.login_default(URL);
			Sysman_page_Main.button_PrinterBarcodeSettings().click();
			List<WebElement> rows = iedriver.driver.findElements(By.xpath(".//*[@id='dlItems']/tbody/tr/td[2]"));
			String sRowValue = "patient ID/wristband";
			String sColumnValue=null;		
					
					for (int i=0;i<=rows.size()-1;i++){
						String sValue =rows.get(i).getText();
						if(sValue.equals(sRowValue)){
												 
								int f = i+1;
							   iedriver.driver.findElement(By.xpath(".//*[@id='dlItems']/tbody/tr" + "["+i+"]" + "/td[1]//*/i")).click();
								break;
								}
							
							
					}
					Assert.assertEquals(sColumnValue, "DISCHARGED");
	  }
  @AfterClass
  public void afterClass() {
  }

}
