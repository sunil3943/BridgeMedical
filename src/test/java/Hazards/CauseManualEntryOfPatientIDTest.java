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

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import capribedsidespecimencepageobjects.CollectSpecimenPage;
import capribedsidetransfusionpageobjects.StartTransfusionPage;
import common.Commonfunctionality;
import common.IEDriver;
import common.LoginToCapribedside;
import common.MilkManagementCommonFunctionality;
import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_MainPatientPage;
import pageobjects.capribedside.Capribedside_page_ReceiveBottles;
import pageobjects.capribedside.Capribedside_page_SelectPatient;
import pageobjects.capribedside.ConfirmPatientPage;
import pageobjects.systemManager.EditPocPage;
import pageobjects.systemManager.Sysman_page_Main;
import pageobjects.systemManager.Sysman_page_PointsOfCare;

public class CauseManualEntryOfPatientIDTest extends LoginToCapribedside
{
	String FilePath = "C:\\Temp\\CauseManualEntryOfPatientIDTest.html";
	String TestName = "CauseManualEntryOfPatientIDTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","CauseManualEntryOfPatientIDTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	Capribedside_page_SelectPatient selPatient = new Capribedside_page_SelectPatient();
	Capribedside_page_MainPatientPage mainPatPage = new Capribedside_page_MainPatientPage();
	ConfirmPatientPage conPatPage = new ConfirmPatientPage();
	StartTransfusionPage transPage = new StartTransfusionPage();
	CollectSpecimenPage colSpecPage = new CollectSpecimenPage();
	Capribedside_page_ReceiveBottles recBotPage = new Capribedside_page_ReceiveBottles();
	Commonfunctionality commonfunctions = new Commonfunctionality();
	EditPocPage peds = new EditPocPage();
	String patientA = "635201";
	String patientB = "635202";
	String sysMgrUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedsideUrl = "http://10.162.106.174/TransSpec2016010410/Capribedside/Login.aspx";
	private static ScreenRecorder screenRecorder;
	 @BeforeTest
		final void startRecording() throws Throwable
		{
		GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
		this.screenRecorder = new ScreenRecorder(gc,
		new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
		new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
		CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,DepthKey, 24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f,KeyFrameIntervalKey, 15 * 60),new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)),null);
		this.screenRecorder.start();
		}
  @Test(priority=0)
  public void manualEntryOfPatientIDTest() throws InterruptedException, IOException 
  {
	  
	  selPatient.txt_box_patientid().sendKeys(patientA,Keys.ENTER);
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 01 Passed");
	  mainPatPage.startTransfusionButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 02 Passed");
	  Thread.sleep(1000);
	  conPatPage.confirmPatientID().sendKeys(patientA);
	  Thread.sleep(1000);
	  conPatPage.continueButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 03 Passed");
	  Thread.sleep(2000);
	  transPage.startExitButton().click();
	  Thread.sleep(2000);
	  transPage.buttonYesExitTransPopup().click();
	  Thread.sleep(2000);
	  mainPatPage.buttonCollectSpecimens().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 04 Passed");
	  Thread.sleep(2000);
	  colSpecPage.buttonExit().click();
	  Thread.sleep(2000);
	  colSpecPage.buttonYesExitPopup().click();
	  Thread.sleep(2000);
	  mainPatPage.changePatientButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 05 Passed");
	  
	  selPatient.txt_box_patientid().sendKeys(patientB,Keys.ENTER);
	  Thread.sleep(2000);
	//multiScreens.multiScreenShot(iedriver.driver);
	  mainPatPage.button_ReceiveBottles().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 06 Passed");
	  conPatPage.confirmPatientID().sendKeys(patientB);
	  Thread.sleep(2000);
	  conPatPage.continueButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 07 Passed");
	  recBotPage.linkLogout().click();
	  //mainPatPage.button_logout().click();
	  Thread.sleep(2000);
	  recBotPage.btnYesLogoutPopup().click();
	  //recBotPage.buttonYesLogoutPopup().click();
	  driver.close();
	  Thread.sleep(2000);
	    
	  commonfunctions.login_default(sysMgrUrl);
	  Thread.sleep(2000);
	  Sysman_page_Main mainMenu = new Sysman_page_Main();
	  mainMenu.button_PointsOfCare().click();
	  Thread.sleep(2000);
	  Sysman_page_PointsOfCare pocPage = new Sysman_page_PointsOfCare();
	  pocPage.linkEditPeds().click();
	  Thread.sleep(2000);
	  
	  WebElement wb = peds.requireScanInRecieveBtl();
	  Select sel = new Select(wb);
	  Thread.sleep(2000);
	  sel.selectByValue("Yes");
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 08 Passed");
	  peds.buttonConfirm().click();
	  Thread.sleep(2000);
	  driver.close();
	  Thread.sleep(2000);
	  //LoginToCapribedside login = new LoginToCapribedside();
	 // login.preExecutionTest();
	  commonfunctions.login_default(capribedsideUrl);
	  Thread.sleep(2000);
	  selPatient.txt_box_patientid().sendKeys(patientA,Keys.ENTER);
	  //multiScreens.multiScreenShot(iedriver.driver);
	  Thread.sleep(2000);
	  mainPatPage.button_ReceiveBottles().click();
	  Thread.sleep(2000);
	  conPatPage.confirmPatientID().sendKeys(patientA);
	  Thread.sleep(2000);
	  conPatPage.continueButton().click();
	  Thread.sleep(2000);
	  recBotPage.txt_box_BottlePatientID().sendKeys(patientA,Keys.ENTER);
	  Thread.sleep(2000);
	  
	  MilkManagementCommonFunctionality cmnMilk = new MilkManagementCommonFunctionality();
	  cmnMilk.manualEntryErrorMsg();
	  recBotPage.txt_box_BottlePatientID().clear();
	  commonfunctions.scanpatientid(patientA);
	  Thread.sleep(2000);
	  //iedriver.extent_Test().log(LogStatus.PASS, "Step 09 Passed");
	  //recBotPage.
	  recBotPage.linkLogout().click();
	  //mainPatPage.button_logout().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 09 Passed");
	  recBotPage.btnYesLogoutPopup().click();
	  //recBotPage.buttonYesLogoutPopup().click();
	  Thread.sleep(2000);
	  driver.close();
	  iedriver.extent_Reports().endTest(iedriver.extent_Test());
	  iedriver.extent_Reports().flush();
	  iedriver.extent_Reports().close();
	
	  
  }
 
	  
  
  @AfterTest()
  public void systemManagerPostSettingsTest() throws InterruptedException, IOException
  {
	  
	  commonfunctions.login_default(sysMgrUrl);
	  Sysman_page_Main mainMenu = new Sysman_page_Main();
	  mainMenu.button_PointsOfCare().click();
	  Thread.sleep(1000);
	  Sysman_page_PointsOfCare pocPage = new Sysman_page_PointsOfCare();
	  pocPage.linkEditPeds().click();
	  Thread.sleep(2000);
	 // PedsPocPage peds = new PedsPocPage();
	  WebElement wb = peds.requireScanInRecieveBtl();
	  Select sel = new Select(wb);
	  Thread.sleep(2000);
	  sel.selectByValue("No");
	  Thread.sleep(2000);
	  peds.buttonConfirm().click();
	  Thread.sleep(2000);
	  driver.close();
	  Thread.sleep(2000);
	  this.screenRecorder.stop();
	  
	 
  }

  
  
	  
}

	  
  
  
  

