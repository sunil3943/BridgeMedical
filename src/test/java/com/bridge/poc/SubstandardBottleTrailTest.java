package com.bridge.poc;


import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import common.CapribedsideNavigation;
import common.Commonfunctionality;
import common.IEDriver;
//import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_AdministerBottles;
import pageobjects.capribedside.Capribedside_page_BrowseBottleHistory;
import pageobjects.capribedside.Capribedside_page_DischargeBottles;
import pageobjects.capribedside.Capribedside_page_Login;
import pageobjects.capribedside.Capribedside_page_MainPatientPage;
import pageobjects.capribedside.Capribedside_page_PrepareBottles;
import pageobjects.capribedside.Capribedside_page_ReceiveBottles;
import pageobjects.capribedside.Capribedside_page_SelectPatient;
import pageobjects.donormilk.DonorMilkMainPage;
import pageobjects.donormilk.ReceiveDonorBottlePage;
import pageobjects.systemManager.BreastMilkSettingsPage;
import pageobjects.systemManager.Sysman_page_Main;

public class SubstandardBottleTrailTest extends CapribedsideNavigation 
{
	String FilePath = "C:\\Temp\\SubstandardBottleTrailTest.html";
	String TestName = "SubstandardBottleTrailTest";
//	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","SubstandardBottleTrailTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	Commonfunctionality fun = new Commonfunctionality();
    Capribedside_page_AdministerBottles cap = new Capribedside_page_AdministerBottles();
    DonorMilkMainPage milkManagement = new DonorMilkMainPage();
    ReceiveDonorBottlePage receiveDonorBottle = new ReceiveDonorBottlePage();
    Capribedside_page_MainPatientPage mpage = new Capribedside_page_MainPatientPage();
    BreastMilkSettingsPage milkSet = new BreastMilkSettingsPage();
    Sysman_page_Main sysMain = new Sysman_page_Main();
    String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
    String pat_id ="635201";
    String bottle_no= fun.uniqueNumber();
    String bottle = bottle_no;
    String onedayago= fun.yestDate();
    String uniqueDonorBottleID = fun.donorUniqueNumber3();
    
	@BeforeTest
	public void preSettingTest() throws InterruptedException
	{
		  iedriver.callDriver(sysmanUrl);
		  Capribedside_page_Login login = new Capribedside_page_Login();
		  login.txt_box_username().sendKeys("superuser");
		  Thread.sleep(1000);
		  login.txt_box_password().sendKeys("123");
		  Thread.sleep(1000);
		  login.button_login().click();
		  Thread.sleep(1000);
		  sysMain.button_BreastMilkSettings().click();
		  Thread.sleep(1000);
		  milkSet.textBoxFreshExpTimeLength().clear();
		  milkSet.textBoxFreshExpTimeLength().sendKeys("1");
		  Thread.sleep(2000);
		  milkSet.selectFreshExpTimeUnit("days");
		  Thread.sleep(2000);
		  milkSet.textBoxFrozenExpTimeLength().clear();
		  milkSet.textBoxFrozenExpTimeLength().sendKeys("1");
		  Thread.sleep(2000);
		  milkSet.selectFrozenExpTimeUnit("days");
		  Thread.sleep(1000);
		  milkSet.textBoxThawedExpTimeLength().clear();
		  milkSet.textBoxThawedExpTimeLength().sendKeys("1");
		  Thread.sleep(2000);
		  milkSet.selectThawedExpTimeUnit("days");
		  Thread.sleep(2000);
		  milkSet.btnConfirm().click();
		  Thread.sleep(1000);
		  sysMain.linkLogout().click();
		  Thread.sleep(2000);
		  iedriver.close();
		  
		 
		
	}
  @Test(priority=0)
  public void substandardBottleTest() throws InterruptedException, IOException 
  {
	    //Commonfunctionality fun = new Commonfunctionality();
	    //Capribedside_page_AdministerBottles cap = new Capribedside_page_AdministerBottles();
	    //String pat_id ="635203";
	    //String bottle_no= fun.uniqueNumber();
	    //String bottle = bottle_no;
	    //String onedayago= fun.yestDate();
	  
	 
	    Capribedside_page_MainPatientPage.button_ReceiveBottles().click();
		//Thread.sleep(3000);
		//fun.waitForElement(Capribedside_page_ReceiveBottles.getTextPatientId());
		Capribedside_page_ReceiveBottles.txt_box_BottlePatientID().sendKeys(pat_id);
		Thread.sleep(2000);
		Capribedside_page_ReceiveBottles.txt_box_BottlePatientID().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		Capribedside_page_ReceiveBottles.txt_box_Bottlenumber().sendKeys(bottle);
		Capribedside_page_ReceiveBottles.txt_box_Bottlenumber().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		if (Capribedside_page_ReceiveBottles.button_BottlenumberWarningYes().isDisplayed()){
			Capribedside_page_ReceiveBottles.button_BottlenumberWarningYes().click();
		}
		Thread.sleep(3000);
		Capribedside_page_ReceiveBottles.txt_box_CollectedDateTime().clear();
		Capribedside_page_ReceiveBottles.txt_box_CollectedDateTime().sendKeys(onedayago);
		Thread.sleep(1000);
		Capribedside_page_ReceiveBottles.dropDwn_StorageState().selectByValue("Fresh");
		Thread.sleep(2000);
		Capribedside_page_ReceiveBottles.button_Confirm().click();
		Thread.sleep(3000);
		Capribedside_page_ReceiveBottles.button_Warning_popup_Yes().click();
		
//		multiScreens.multiScreenShot(iedriver.driver);
		Thread.sleep(3000);
		Capribedside_page_ReceiveBottles.button_Exit().click();
		Thread.sleep(3000);
		//driver.close();
		/*
  }
  @Test(priority=1)
  public void prepareExpireBottleTest() throws IOException, InterruptedException
  { 
         */
	// Commonfunctionality fun = new Commonfunctionality();
	 //String bottle_no= fun.uniqueNumber();
	  
	  
	 Capribedside_page_MainPatientPage mpage = new Capribedside_page_MainPatientPage();
	 mpage.button_PrepareBottles().click(); //removed click()
	 Thread.sleep(1000);
//	 multiScreens.multiScreenShot(iedriver.driver);
	 Capribedside_page_PrepareBottles pbtl = new Capribedside_page_PrepareBottles();
	
	 pbtl.txt_box_BottleNumber().sendKeys(bottle,Keys.ENTER);
	 Thread.sleep(1000);
	 
	 //boolean popUp = pbtl.Warning_popUp().isDisplayed();
	 Assert.assertTrue(pbtl.warning_popUp().isDisplayed());
	 /*
	 if(popUp)
	 
	 {
		 System.out.println("Warning Message is Displayed");
		 multiScreens.multiScreenShot(iedriver.driver);
		 pbtl.button_Warning_popUp_Yes().click();
		 Thread.sleep(1000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 
	 }
	 else
	 {
		 System.out.println("Warning Message is Displayed");
	 }
	 /*/
	 
	 iedriver.extent_Test().log(LogStatus.PASS, "Step 01 Passed");
	 pbtl.button_Exit().click();
	 Thread.sleep(1000);
	 //driver.close();
	 /*
	 }
      
     @Test(priority=2)
     public void administerExpireBottleTest() throws IOException, InterruptedException
     {
     */
    	 //Commonfunctionality fun = new Commonfunctionality();
    	// String bottle_no= fun.uniqueNumber();
    	 //Capribedside_page_MainPatientPage mpage = new Capribedside_page_MainPatientPage();
	  
    	 mpage.button_AdministerBottles().click();
    	 Thread.sleep(1000);
    	 Capribedside_page_AdministerBottles ab = new Capribedside_page_AdministerBottles();
    	 ab.txt_box_bottlenumber().sendKeys(bottle,Keys.ENTER);
    	 Thread.sleep(1000);
    	 boolean popUp1 = ab.Warning_popup().isDisplayed();
    	 
    	 if(popUp1)
    	 {
    		 System.out.println("Waring Popup is Displayed");
//    		 multiScreens.multiScreenShot(iedriver.driver);
    		 Thread.sleep(2000);
        	 ab.button_Warning_popup_Yes().click();
    	 }
    	 else
    	 {
    		 System.out.println("Warning Popup is not Displayed");
//    		 multiScreens.multiScreenShot(iedriver.driver);
    	 }
    	
    	 Thread.sleep(1000);
    	 iedriver.extent_Test().log(LogStatus.PASS, "Step 02 Passed");
    	 ab.button_Exit().click();
    	 //driver.close();
    	/* 
    	  }
     @Test(priority=3)
     public void dischargeExpireBottleTest() throws InterruptedException, IOException
     { 
     */
    	//Commonfunctionality fun = new Commonfunctionality();
    	 //String bottle_no= fun.uniqueNumber();
    	 Thread.sleep(2000);
    	 //Capribedside_page_MainPatientPage mpage = new Capribedside_page_MainPatientPage();
    	
    	 mpage.button_DischargeBottles().click();
    	 Thread.sleep(1000);
    	 Capribedside_page_DischargeBottles db = new Capribedside_page_DischargeBottles();
    	 db.txt_box_bottlenumber().sendKeys(bottle,Keys.ENTER);
    	 Thread.sleep(1000);
    	 boolean warPopup = db.Warning_popup().isDisplayed();
    	 
    	 if(warPopup)
    	 {
    		 System.out.println("Warning popup is Displayed");
//    		multiScreens.multiScreenShot(iedriver.driver);
    		 Thread.sleep(1000);
    		 
    		 db.button_Warning_popup_Yes().click();
    		 Thread.sleep(1000);
    		 
    		 db.button_Exit().click();
    		 
    	 }
    	 else
    	 {
    		 System.out.print("Warning popup is not Displayed");
//    		 multiScreens.multiScreenShot(iedriver.driver);
    	 }
    	 
    	 Thread.sleep(2000);
    	 iedriver.extent_Test().log(LogStatus.PASS, "Step 03 Passed");
    	 mpage.button_BrowseBottleHistory().click();
    	 Thread.sleep(1000);
    	 Capribedside_page_BrowseBottleHistory browseBottleHistory = new Capribedside_page_BrowseBottleHistory();
    	 browseBottleHistory.dropDwn_FinalStatus().selectByVisibleText("Discharged");
    	 Thread.sleep(2000);
//    	 multiScreens.multiScreenShot(iedriver.driver);
    	 iedriver.extent_Test().log(LogStatus.PASS, "Step 06 Passed");
    	 browseBottleHistory.button_Back().click();
    	 Thread.sleep(2000);
    	 
    	 mpage.changePatientButton().click();
    	 Thread.sleep(2000);
    	 
    	 Capribedside_page_SelectPatient selectPatient = new Capribedside_page_SelectPatient();
    	 
    	 selectPatient.linkMilkMgmt().click();
    	 Thread.sleep(2000);
    	 milkManagement.receiveDonorBottleButton().click();
    	 Thread.sleep(2000);
    	 receiveDonorBottle.donorBottleNumber().sendKeys("zz"+uniqueDonorBottleID+"-101",Keys.ENTER);
//    	 multiScreens.multiScreenShot(iedriver.driver);
    	 Thread.sleep(2000);
    	 receiveDonorBottle.buttonYesExpireBottleWarning().click();
    	 Thread.sleep(2000);
    	 receiveDonorBottle.kiloCalories().sendKeys("60");
    	 Thread.sleep(2000);
    	 receiveDonorBottle.buttonConfirm().click();
    	 Thread.sleep(2000);
    	 receiveDonorBottle.buttonExit().click();
    	 Thread.sleep(2000);
    	 milkManagement.homeLink().click();
    	 Thread.sleep(2000);
    	 /*
    	 iedriver.extent_Reports().endTest(iedriver.extent_Test());
    	 iedriver.extent_Reports().flush();
    	 iedriver.extent_Reports().close();
    	 /*/
    	 
     }
  @AfterMethod
	public void testing(ITestResult result) throws IOException
  {
		
		if(result.getStatus() == ITestResult.FAILURE)
		{
//		multiScreens.multiScreenShot(iedriver.driver);
	
		String img = iedriver.extent_Test().addScreenCapture("C:\\Temp\\SubstandardBottleTrailTest");
		iedriver.extent_Test().log(LogStatus.FAIL,  img);
		}
		iedriver.extent_Reports().endTest(iedriver.extent_Test());
		 iedriver.extent_Reports().flush();
		 iedriver.extent_Reports().close();
  }
  
}
