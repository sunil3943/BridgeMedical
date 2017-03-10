package Hazards;


import static org.monte.media.FormatKeys.EncodingKey;
import static org.monte.media.FormatKeys.FrameRateKey;
import static org.monte.media.FormatKeys.KeyFrameIntervalKey;
import static org.monte.media.FormatKeys.MIME_AVI;
import static org.monte.media.FormatKeys.MediaTypeKey;
import static org.monte.media.FormatKeys.MimeTypeKey;
import static org.monte.media.VideoFormatKeys.CompressorNameKey;
import static org.monte.media.VideoFormatKeys.DepthKey;
import static org.monte.media.VideoFormatKeys.ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE;
import static org.monte.media.VideoFormatKeys.QualityKey;

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import common.CapribedsideNavigation;
import common.Commonfunctionality;
import common.IEDriver;
import multiScreenShot.MultiScreenShot;
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

public class SubstandardBottleTest extends CapribedsideNavigation 
{
	String FilePath = "C:\\Temp\\SubstandardBottleTest.html";
	String TestName = "PatientIdentificationErrorTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","SubstandardBottleTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	Commonfunctionality commonfunctions = new Commonfunctionality();
    Capribedside_page_AdministerBottles administerBottle = new Capribedside_page_AdministerBottles();
    DonorMilkMainPage milkManagement = new DonorMilkMainPage();
    ReceiveDonorBottlePage receiveDonorBottle = new ReceiveDonorBottlePage();
    BreastMilkSettingsPage milkSet = new BreastMilkSettingsPage();
    Sysman_page_Main sysMain = new Sysman_page_Main();
    Capribedside_page_MainPatientPage patientMenu = new Capribedside_page_MainPatientPage();
    Capribedside_page_PrepareBottles prepareBottle = new Capribedside_page_PrepareBottles();
    Capribedside_page_DischargeBottles dischargeBottle = new Capribedside_page_DischargeBottles();
    Capribedside_page_BrowseBottleHistory browseBottleHistory = new Capribedside_page_BrowseBottleHistory();
    Capribedside_page_Login login = new Capribedside_page_Login();
    String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
    String patientA ="635201";
    String bottle_no= commonfunctions.uniqueNumber();
    String bottle = bottle_no;
    String onedayago= commonfunctions.yestDate();
    String uniqueDonorBottleID = commonfunctions.donorUniqueNumber3();
    String donorBottle = "zz"+uniqueDonorBottleID+"-101";
    private static ScreenRecorder screenRecorder;
	@BeforeTest
	public void preSettingTest() throws Throwable
	{
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
    	this.screenRecorder = new ScreenRecorder(gc,
    	new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
    	new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
    	CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,DepthKey, 24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f,KeyFrameIntervalKey, 15 * 60),new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)),null);
    	this.screenRecorder.start();
		  iedriver.callDriver(sysmanUrl);
		 
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
	    Capribedside_page_MainPatientPage.button_ReceiveBottles().click();
		//Thread.sleep(3000);
		//fun.waitForElement(Capribedside_page_ReceiveBottles.getTextPatientId());
		Capribedside_page_ReceiveBottles.txt_box_BottlePatientID().sendKeys(patientA);
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
		
		multiScreens.multiScreenShot(iedriver.driver);
		Thread.sleep(3000);
		Capribedside_page_ReceiveBottles.button_Exit().click();
		Thread.sleep(3000);
	
		patientMenu.button_PrepareBottles().click();
	    Thread.sleep(1000);
	    multiScreens.multiScreenShot(iedriver.driver);
	    prepareBottle.txt_box_BottleNumber().sendKeys(bottle,Keys.ENTER);
	    Thread.sleep(1000);
	    boolean popUp = prepareBottle.warning_popUp().isDisplayed();
	    if(popUp)
	 
	 {
		 System.out.println("Warning Message is Displayed");
		 multiScreens.multiScreenShot(iedriver.driver);
		 prepareBottle.button_Warning_popUp_Yes().click();
		 Thread.sleep(1000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 
	 }
	 else
	 {
		 System.out.println("Warning Message is Displayed");
	 }
	 
	
	     prepareBottle.button_Exit().click();
	     Thread.sleep(1000);
	     patientMenu.button_AdministerBottles().click();
    	 Thread.sleep(2000);
    	 administerBottle.txt_box_bottlenumber().sendKeys(bottle,Keys.ENTER);
    	 Thread.sleep(2000);
    	 boolean popUp1 = administerBottle.Warning_popup().isDisplayed();
    	 
    	 if(popUp1)
    	 {
    		 System.out.println("Waring Popup is Displayed");
    		 multiScreens.multiScreenShot(iedriver.driver);
    		 Thread.sleep(2000);
    		 administerBottle.button_Warning_popup_Yes().click();
    	 }
    	 else
    	 {
    		 System.out.println("Warning Popup is not Displayed");
    		 multiScreens.multiScreenShot(iedriver.driver);
    	 }
    	
    	 Thread.sleep(1000);
    	 administerBottle.button_Exit().click();
    	 Thread.sleep(2000);
    	 patientMenu.button_DischargeBottles().click();
    	 Thread.sleep(2000);
    	 
    	 dischargeBottle.txt_box_bottlenumber().sendKeys(bottle,Keys.ENTER);
    	 Thread.sleep(2000);
    	 boolean warPopup = dischargeBottle.Warning_popup().isDisplayed();
    	 if(warPopup)
    	 {
    		 System.out.println("Warning popup is Displayed");
    		 multiScreens.multiScreenShot(iedriver.driver);
    		 Thread.sleep(2000);
    		 dischargeBottle.button_Warning_popup_Yes().click();
    		 Thread.sleep(2000);
    		 dischargeBottle.button_Exit().click();
    	 }
    	 else
    	 {
    		 System.out.print("Warning popup is not Displayed");
    		 multiScreens.multiScreenShot(iedriver.driver);
    	 }
    	 
    	 Thread.sleep(2000);
    	 patientMenu.button_BrowseBottleHistory().click();
    	 Thread.sleep(2000);
    	
    	 browseBottleHistory.dropDwn_FinalStatus().selectByVisibleText("Discharged");
    	 Thread.sleep(2000);
    	 multiScreens.multiScreenShot(iedriver.driver);
    	 iedriver.extent_Test().log(LogStatus.PASS, "Step 06 Passed");
    	 browseBottleHistory.button_Back().click();
    	 Thread.sleep(2000);
    	 patientMenu.changePatientButton().click();
    	 Thread.sleep(2000);
    	 Capribedside_page_SelectPatient selectPatient = new Capribedside_page_SelectPatient();
    	 selectPatient.linkMilkMgmt().click();
    	 Thread.sleep(2000);
    	 milkManagement.receiveDonorBottleButton().click();
    	 Thread.sleep(2000);
    	 receiveDonorBottle.donorBottleNumber().sendKeys(donorBottle,Keys.ENTER);
    	 multiScreens.multiScreenShot(iedriver.driver);
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
    	 //
    	 commonfunctions.scanpatientid(patientA);
    	 patientMenu.button_PrepareBottles().click();
 	    Thread.sleep(2000);
 	    multiScreens.multiScreenShot(iedriver.driver);
 	    prepareBottle.txt_box_BottleNumber().sendKeys(donorBottle,Keys.ENTER);
 	    Thread.sleep(2000);
 	    boolean donorpopUp = prepareBottle.donorWarning_popUp().isDisplayed();
 	    if(donorpopUp)
 	 
 	 {
 		 System.out.println("Warning donor popup is displayed is Displayed");
 		 multiScreens.multiScreenShot(iedriver.driver);
 		 Thread.sleep(2000);
 		 prepareBottle.buttondonorWarningpopUpYes().click();
 		 Thread.sleep(2000);
 		 multiScreens.multiScreenShot(iedriver.driver);
 		 prepareBottle.buttondonorWarningpopUpYes().click();
 		 
 	 }
 	 else
 	 {
 		 System.out.println("Warning Message is not Displayed");
 	 }
 	 
 	
 	     prepareBottle.button_Exit().click();
 	     Thread.sleep(2000);
 	     patientMenu.button_AdministerBottles().click();
     	 Thread.sleep(2000);
     	 administerBottle.txt_box_bottlenumber().sendKeys(donorBottle,Keys.ENTER);
     	 Thread.sleep(2000);
     	 
     	 boolean donorBottleErrorMag = administerBottle.donorBottleErrorMessage().isDisplayed();
     	 
     	 if(donorBottleErrorMag)
     	 {
     		 System.out.println("Error message : "+donorBottleErrorMag+" Is displayed.");
     		 Thread.sleep(2000);
     		 multiScreens.multiScreenShot(iedriver.driver);
     		 
     	 }
     	 else
     	 {
     		 System.out.println("Warning Popup is not Displayed");
     		 Thread.sleep(2000);
     		 multiScreens.multiScreenShot(iedriver.driver);
     	 }
     	 Thread.sleep(1000);
     	 administerBottle.button_Exit().click();
     	 Thread.sleep(2000);
     	 patientMenu.button_DischargeBottles().click();
     	 Thread.sleep(2000);
     	 
     	 dischargeBottle.txt_box_bottlenumber().sendKeys(donorBottle,Keys.ENTER);
     	 Thread.sleep(2000);
     	 boolean donorwarPopup = dischargeBottle.Warning_popup().isDisplayed();
     	 if(donorwarPopup)
     	 {
     		 System.out.println("Warning popup is Displayed");
     		 Thread.sleep(2000);
     		 multiScreens.multiScreenShot(iedriver.driver);
     		 dischargeBottle.button_Warning_popup_Yes().click();
     		 Thread.sleep(2000);
     		 multiScreens.multiScreenShot(iedriver.driver);
     		 dischargeBottle.button_Warning_popup_Yes().click();
     		 Thread.sleep(2000);
     		 dischargeBottle.button_Exit().click();
     	 }
     	 else
     	 {
     		 System.out.print("Warning popup is not Displayed");
     		 multiScreens.multiScreenShot(iedriver.driver);
     	 }
     	 
     	 Thread.sleep(2000);
     	 patientMenu.button_BrowseBottleHistory().click();
     	 Thread.sleep(2000);
     	
     	 browseBottleHistory.dropDwn_FinalStatus().selectByVisibleText("Discharged");
     	 Thread.sleep(2000);
    	 //
    	 iedriver.extent_Reports().endTest(iedriver.extent_Test());
    	 iedriver.extent_Reports().flush();
    	 iedriver.extent_Reports().close();
    	 
    	 
     }
  @AfterTest
  public void postTest() throws Throwable
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
	  milkSet.textBoxFreshExpTimeLength().sendKeys("3");
	  Thread.sleep(2000);
	  milkSet.selectFreshExpTimeUnit("days");
	  Thread.sleep(2000);
	  milkSet.textBoxFrozenExpTimeLength().clear();
	  milkSet.textBoxFrozenExpTimeLength().sendKeys("3");
	  Thread.sleep(2000);
	  milkSet.selectFrozenExpTimeUnit("days");
	  Thread.sleep(1000);
	  milkSet.textBoxThawedExpTimeLength().clear();
	  milkSet.textBoxThawedExpTimeLength().sendKeys("3");
	  Thread.sleep(2000);
	  milkSet.selectThawedExpTimeUnit("days");
	  Thread.sleep(2000);
	  milkSet.btnConfirm().click();
	  Thread.sleep(1000);
	  sysMain.linkLogout().click();
	  Thread.sleep(2000);
	  iedriver.close();
	  this.screenRecorder.stop();
  }
}
