package Regression;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import common.Commonfunctionality;
import common.IEDriver;
import modulebabymatch.BabyMatchCommonFunctionality;
import modulebabymatch.BabyMatchManagePatientInformationPage;
import modulebabymatch.BabyMatchNavigation;
import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.CapribedsideBabyMatchPage;
import pageobjects.systemManager.Sysman_page_Main;
import pageobjects.systemManager.SystemManagerBabyMatchPage;


public class CapribridgeBabyMatchTest extends BabyMatchNavigation
{
	String FilePath = "C:\\Temp\\CapribridgeBabyMatchTest.html";
	String TestName = "CapribridgeBabyMatchTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","CapribridgeBabyMatchTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 


	@Test(priority=1)
	public void babyMatchTestPlanTest() throws InterruptedException, IOException
	{
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Pre Setting
		  CapribedsideBabyMatchPage bm = new CapribedsideBabyMatchPage();
		  BabyMatchCommonFunctionality bmcmn = new BabyMatchCommonFunctionality();
		  bm.managePatientInfoLink().click();
		  multiScreens.multiScreenShot(iedriver.driver);
		    Thread.sleep(1000);
		    
		    bmcmn.scanSelectPatientId("635201");
		  multiScreens.multiScreenShot(iedriver.driver);
		    Thread.sleep(2000);
		    
		   
		    BabyMatchManagePatientInformationPage mngPatientInfo = new BabyMatchManagePatientInformationPage();
		    mngPatientInfo.editMotherLink().click();
		  multiScreens.multiScreenShot(iedriver.driver);
		    Thread.sleep(1000);
		    
		    mngPatientInfo.correctMotherField().clear();
		    mngPatientInfo.correctMotherField().sendKeys("Adelle Timmons");
		    Thread.sleep(1000);
		    mngPatientInfo.correctIdField().clear();
		    mngPatientInfo.correctIdField().sendKeys("1010130");
		  
		    Thread.sleep(1000);
		    mngPatientInfo.clickOnConfirmButton().click();
		    Thread.sleep(1000);
		    //MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","ScreenShot2");
		    IEDriver iedriver = new IEDriver();
		    //multiScreens.multiScreenShot(iedriver.driver);
		    //Step 2
		    //BabyMatchCommonFunctionality bmcmn = new BabyMatchCommonFunctionality();
		    bmcmn.scanBabyMatchPatients("635201");
		    multiScreens.multiScreenShot(iedriver.driver);
		    Thread.sleep(3000);
		    //Step 3
		    bmcmn.scanBabyMatchRacipient("1010130");
		    multiScreens.multiScreenShot(iedriver.driver);
		    Thread.sleep(3000);
		 
		    
		    //CapribedsideBabyMatchPage bm = new CapribedsideBabyMatchPage();
		    Thread.sleep(1000);
		    bm.clickContinueButton().click();
		    multiScreens.multiScreenShot(iedriver.driver);
		    Thread.sleep(2000);
		    bm.clickOnConfirmPopupButton().click();
		    Thread.sleep(2000);
		    //Step 4
		    bmcmn.scanBabyMatchPatients("1010130");
		    Thread.sleep(2000);
		    boolean invalidIdAlertMsg = bm.invaliIdAlertMessage().isDisplayed();
		    if(invalidIdAlertMsg)
		    {
		    	System.out.println("This is not a valid infant id.-Error Message is Displayed");
		       multiScreens.multiScreenShot(iedriver.driver);
		    }
		    else
		    {
		    	System.out.println("Error Message is not Displayed");
		    	multiScreens.multiScreenShot(iedriver.driver);
		    }
		    //Step 5
		    Thread.sleep(2000);
		    bmcmn.scanBabyMatchPatients("635201");
		    multiScreens.multiScreenShot(iedriver.driver);
		    Thread.sleep(2000);
		    //Step 6
		    bmcmn.scanBabyMatchRacipient("1010131");
		    multiScreens.multiScreenShot(iedriver.driver);
		    Thread.sleep(2000);
		    
		    boolean warningPopup = bm.matchFailedPopup().isDisplayed();
		    if(warningPopup)
		    {
		    	System.out.println("Match Failed! The patient's id is not associated with the recipient id.-Is Displayed");
		    	multiScreens.multiScreenShot(iedriver.driver);
		    }
		    else
		    {
		    	System.out.println(" Match Failed -Error message is not displayed");
		    	
		    }
		    //Step 7
		    bm.matchFailedPopupAckButton().click();
		    multiScreens.multiScreenShot(iedriver.driver);
		    Thread.sleep(2000);
		    //Step 8
		    bm.managePatientInfoLink().click();
		    multiScreens.multiScreenShot(iedriver.driver);
		    Thread.sleep(1000);
		    
		    bmcmn.scanSelectPatientId("635201");
		    multiScreens.multiScreenShot(iedriver.driver);
		    Thread.sleep(2000);
		    
		   //Step 9
		    //BabyMatchManagePatientInformationPage mngPatientInfo = new BabyMatchManagePatientInformationPage();
		    mngPatientInfo.editMotherLink().click();
		    multiScreens.multiScreenShot(iedriver.driver);
		    Thread.sleep(1000);
		    //Step10
		    mngPatientInfo.correctMotherField().clear();
		    mngPatientInfo.correctMotherField().sendKeys("Toots,Alberta");
		    Thread.sleep(1000);
		    mngPatientInfo.correctIdField().clear();
		    mngPatientInfo.correctIdField().sendKeys("1010132");
		    multiScreens.multiScreenShot(iedriver.driver);
		    Thread.sleep(1000);
		    mngPatientInfo.clickOnConfirmButton().click();
		    Thread.sleep(1000);
		     multiScreens.multiScreenShot(iedriver.driver);
		    //Step 11
		    bmcmn.scanBabyMatchPatients("635201");
		    Thread.sleep(1000);
			 multiScreens.multiScreenShot(iedriver.driver);

		    bmcmn.scanBabyMatchRacipient("1010130");
		    Thread.sleep(1000);
		    
		    boolean matchFailedPopup = bm.matchFailedPopup().isDisplayed();
		    if(matchFailedPopup)
		    {
		    	System.out.println("Match Failed! The patient's id is not associated with the recipient id.-Is Displayed");
		    	multiScreens.multiScreenShot(iedriver.driver);
		    }
		    else
		    {
		    	System.out.println(" Match Failed -Error message is not displayed");
		    	multiScreens.multiScreenShot(iedriver.driver);
		    	
		    }
		    //Step 12
		    bm.matchFailedPopupAckButton().click();
		    Thread.sleep(1000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    
		    //Step 13
		    bmcmn.scanBabyMatchPatients("635201");
		    Thread.sleep(1000);
			multiScreens.multiScreenShot(iedriver.driver);

		    bmcmn.scanBabyMatchRacipient("1010132");
		    Thread.sleep(2000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    
		    bm.clickOnConfirmPopupButton().click();
		    Thread.sleep(2000);
		    
		    //Step 14
		    bmcmn.scanBabyMatchPatients("635204");
		    Thread.sleep(1000);
			multiScreens.multiScreenShot(iedriver.driver);
		    bmcmn.scanBabyMatchRacipient("Nancy");
		    Thread.sleep(1000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    boolean invalidIdAlertMsg2 = bm.invalidMatchPopup().isDisplayed();
		    if(invalidIdAlertMsg2)
		    {
		    	System.out.println("Invalid Match! This ID is not defined as an approved recipient, please contact system administrator.-Error Message is Displayed");
		    	multiScreens.multiScreenShot(iedriver.driver);
		    }
		    else
		    {
		    	System.out.println("Error Message is not Displayed");
		    	multiScreens.multiScreenShot(iedriver.driver);
		    }
		    
		   bm.invalidMatchPopupAckButton().click();
		   Thread.sleep(1000);
		    //Step 15
		    bmcmn.scanBabyMatchPatients("635203");
		    Thread.sleep(1000);
			multiScreens.multiScreenShot(iedriver.driver);
		    bmcmn.scanBabyMatchRacipient("Mark");
		    Thread.sleep(1000);
		    multiScreens.multiScreenShot(iedriver.driver);
		    boolean invalidIdAlertMsg3 = bm.invalidMatchPopup().isDisplayed();
		    if(invalidIdAlertMsg2)
		    {
		    	System.out.println("Invalid Match! This ID is not defined as an approved recipient, please contact system administrator.-Error Message is Displayed");
		    	multiScreens.multiScreenShot(iedriver.driver);
		    }
		    else
		    {
		    	System.out.println("Error Message is not Displayed");
		    	multiScreens.multiScreenShot(iedriver.driver);
		    }
		       bm.invalidMatchPopupAckButton().click();
			   Thread.sleep(1000);
		       driver.close();	
		       Thread.sleep(1000);
			 
		
	}
	
	
	@Test(priority = 2)
	public void sysManagerSettingsTest() throws InterruptedException
	{     
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		   //driver.close();
		   Commonfunctionality fun = new Commonfunctionality();
		   String sysMgrUrl = "http://10.162.106.174/TransSpec2016010412/systemmanager/Login.aspx";
		   fun.login_default(sysMgrUrl);
		   Sysman_page_Main mainMenu = new Sysman_page_Main();
		   mainMenu.button_BabyMatchSettings().click();
		   SystemManagerBabyMatchPage sysMgr = new SystemManagerBabyMatchPage();
		   WebElement wb = sysMgr.babyMatchPropmtLocation();
		   Select sel = new Select(wb);
		   //List<WebElement> lst = sel.getOptions();
		   //System.out.println(lst);
		   sel.selectByValue("True");
		   sysMgr.clickConfirmButton().click();
		   driver.close();
		
	}
	
	@Test(priority = 3)
	public void babyMatchWithLocationTest() throws InterruptedException, IOException
	{
		
		
     //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 Thread.sleep(3000);
		 Commonfunctionality fun = new Commonfunctionality();
		 String babyMatchURL = "http://10.162.106.174/TransSpec2016010412/babymatch/Login.aspx";
		fun.login_default(babyMatchURL);
		//Step 16
		 BabyMatchCommonFunctionality bmcmn = new BabyMatchCommonFunctionality();
		 bmcmn.scanBabyMatchPatients("635201");
		multiScreens.multiScreenShot(iedriver.driver);
		 Thread.sleep(2000);
		 //Step 17
		 CapribedsideBabyMatchPage bmPage = new CapribedsideBabyMatchPage();
		 WebElement wbFromLoc = bmPage.fromLocationDropDown();
		 Select sel1 = new Select(wbFromLoc);
		 sel1.selectByIndex(1);
		 Thread.sleep(1000);
		 WebElement wbToLoc = bmPage.toLocationDropDown();
		 Select sel2 = new Select(wbToLoc);
		 sel2.selectByIndex(2);
		 Actions act = new Actions(driver);
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 
		 bmcmn.scanBabyMatchRacipient("1010132");
		 Thread.sleep(1000);
	     multiScreens.multiScreenShot(iedriver.driver);
		 bmPage.clickContinueButton().click();
		 Thread.sleep(1000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 18
		 bmPage.clickOnConfirmPopupButton().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 19
		 bmcmn.scanBabyMatchPatients("635201");
		//multiScreens.multiScreenShot(iedriver.driver);
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 driver.close();
		
	}
	@Test(priority = 4)
	public void sysManagerSettingsOffLocTest() throws InterruptedException
	{      
		   //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		   //driver.close();
		   Commonfunctionality fun = new Commonfunctionality();
		   String sysMgrUrl = "http://10.162.106.174/TransSpec2016010412/systemmanager/Login.aspx";
		   fun.login_default(sysMgrUrl);
		   Sysman_page_Main mainMenu = new Sysman_page_Main();
		   mainMenu.button_BabyMatchSettings().click();
		   Thread.sleep(3000);
		   SystemManagerBabyMatchPage sysMgr = new SystemManagerBabyMatchPage();
		   WebElement wb = sysMgr.babyMatchPropmtLocation();
		   Select sel = new Select(wb);
		   //List<WebElement> lst = sel.getOptions();
		   //System.out.println(lst);
		   sel.selectByValue("False");
		   sysMgr.clickConfirmButton().click();
		   driver.close();
		
	}
	
	
	
}
		    
		    

		    
		    
		    
		    
		    
		    
		    
		    
		    
