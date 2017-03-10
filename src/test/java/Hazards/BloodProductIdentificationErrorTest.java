package Hazards;

import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.util.concurrent.TimeUnit;
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
import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import capribedsidetransfusionpageobjects.StartTransfusionPage;
import common.BloodTransfusionCommonFunctionality;
import common.Commonfunctionality;
import common.IEDriver;
import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_AdministerBottles;
import pageobjects.capribedside.Capribedside_page_Login;
import pageobjects.capribedside.Capribedside_page_MainPatientPage;
import pageobjects.systemManager.EditPocPage;
import pageobjects.systemManager.Sysman_page_Main;
import pageobjects.systemManager.Sysman_page_PointsOfCare;


public class BloodProductIdentificationErrorTest 
{
	String FilePath = "C:\\Temp\\BloodProductIdentificationErrorTest.html";
	String TestName = "PatientIdentificationErrorTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","BloodProductIdentificationErrorTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	Commonfunctionality communfunction = new Commonfunctionality();
    Capribedside_page_AdministerBottles cap = new Capribedside_page_AdministerBottles();
    Capribedside_page_Login login = new Capribedside_page_Login();
	Sysman_page_Main sysManagerMainPage = new Sysman_page_Main();
	Sysman_page_PointsOfCare selectPoc = new Sysman_page_PointsOfCare();
	EditPocPage editPoc = new EditPocPage();
	Capribedside_page_MainPatientPage mainPage = new Capribedside_page_MainPatientPage();
	StartTransfusionPage stTransPage = new StartTransfusionPage();
	BloodTransfusionCommonFunctionality btCmn = new BloodTransfusionCommonFunctionality();
    private static ScreenRecorder screenRecorder;
    String uniqueNo= communfunction.uniqueNumber();
    String unitNo = uniqueNo;
    String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedsideUrl = "http://10.162.106.174/TransSpec2016010410/CapriBedside/Login.aspx";
	String superuser = "Superuser";
	String password = "123";
	String secondaryIdentifierOptionNone = "None";
    @BeforeTest
	final void startRecording() throws Throwable
	{
	GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
	this.screenRecorder = new ScreenRecorder(gc,
	new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
	new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,DepthKey, 24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f,KeyFrameIntervalKey, 15 * 60),new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)),null);
	this.screenRecorder.start();
	 iedriver.callDriver(sysmanUrl);
 	  Thread.sleep(1000);
 	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 	  login.login(superuser, password);
 	  Thread.sleep(2000);
 	  sysManagerMainPage.button_PointsOfCare().click();
 	  Thread.sleep(2000);
 	  selectPoc.editPocPeds().click();
	  Thread.sleep(2000);
	  editPoc.linkModifyChecksTransfusionSettings().click();
	  Thread.sleep(2000);
	  boolean b1 = editPoc.checkboxCheckTheOriginalTransfusionOrder().isSelected();
	  if(b1)
	  {
		  Thread.sleep(1000);
		  editPoc.checkboxCheckTheOriginalTransfusionOrder().click(); 
	  }
	  Thread.sleep(3000);
	  editPoc.linkBackModifyChecksTransfusionSettings().click();
	  Thread.sleep(2000);
	  editPoc.selectUtilizeSecondaryIdentifier(secondaryIdentifierOptionNone);
	  Thread.sleep(2000);
	  editPoc.selectYesOrNoForCheckCenterCode("Yes");
	  Thread.sleep(2000);
	  editPoc.buttonConfirm().click();
	  Thread.sleep(2000);
	  selectPoc.close();
	  
	}
	@AfterTest
	final void stopRecording() throws Exception
	{
	this.screenRecorder.stop();
	}
    
  @Test
  public void IdentificationErrorTest() throws Throwable 
  {
	
	
	  iedriver.callDriver(capribedsideUrl);
 	  Thread.sleep(1000);
 	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
 	  login.login(superuser, password);
 	  Thread.sleep(2000); 
 	  communfunction.scanpatientid("635201");
 	  Thread.sleep(2000);
	  Actions act = new Actions(iedriver.driver); 
	 mainPage.startTransfusionButton().click();
	 Thread.sleep(2000);
	 
	 btCmn.scanRacipientPatientID("*635201");
	 //stTransPage.scanRacipientPatientID().sendKeys("(0000)6352-000-1");
	 //act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 btCmn.scanRacipientPatientName("TIMMONS, BABY BOY");
	 Thread.sleep(2000);
	 //btCmn.scanRacipientUnitNumber("123");
	 stTransPage.scanRacipientUnitNumber().sendKeys(unitNo);
	 
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 btCmn.selectPatientBloodType(1);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 stTransPage.racipientContinueButton().click();
	 Thread.sleep(2000);
	 multiScreens.multiScreenShot(iedriver.driver);
	 iedriver.extent_Test().log(LogStatus.PASS, "Step 01 Passed");
	 btCmn.donorCenterCodeDropDown(2);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 stTransPage.donorScanUnitNumber().sendKeys("234");
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 multiScreens.multiScreenShot(iedriver.driver);
	 iedriver.extent_Test().log(LogStatus.PASS, "Step 02 Passed");
	 Thread.sleep(2000);
	 btCmn.donorUnitNumberMissMatchErrorMsg();
	 Thread.sleep(2000);
	 stTransPage.donorScanUnitNumber().clear();
	 Thread.sleep(2000);
	 stTransPage.donorScanUnitNumber().sendKeys(unitNo);
	 act.sendKeys(Keys.ENTER).perform();
	 multiScreens.multiScreenShot(iedriver.driver);
	 iedriver.extent_Test().log(LogStatus.PASS, "Step 03 Passed");
	 Thread.sleep(2000);
	 //btCmn.donorBloodProduct(4);
	 //act.sendKeys(Keys.ENTER).perform();
	 btCmn.scanDonorBloodProduct("=<E0053V003");
	 Thread.sleep(2000);
	 //multiScreens.multiScreenShot(iedriver.driver);
	 iedriver.extent_Test().log(LogStatus.PASS, "Step 04 Passed");
	 btCmn.donorNonExistingBloodProdScanErrorMsg();
	 multiScreens.multiScreenShot(iedriver.driver);
	 Thread.sleep(2000);
	 btCmn.donorBloodProduct(4);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	// multiScreens.multiScreenShot(iedriver.driver);
	 //iedriver.extent_Test().log(LogStatus.PASS, "Step 05 Passed");
	 Thread.sleep(2000);
	 String nextDate = communfunction.nextDate();
	 stTransPage.donorBloodProductExipreDate().sendKeys(nextDate);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 multiScreens.multiScreenShot(iedriver.driver);
	 iedriver.extent_Test().log(LogStatus.PASS, "Step 05 Passed");
	 //stTransPage.donorBloodTypeDropDown(1);
	 btCmn.donorBloodType(4);
	 act.sendKeys(Keys.ENTER).perform();
	 //Thread.sleep(2000);
	 //stTransPage.donorContinueButton().click();
	 Thread.sleep(3000);
	 stTransPage.vitalsTempTextBoxFar().sendKeys("95");
	 
	 //act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(5000);
	// stTransPage.vitalsTempSiteTextBox()
	 btCmn.vitalsTempSite(2);
	 //act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(5000);
	 stTransPage.vitalsHeartRateTextBox().sendKeys("82");
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(5000);
	 stTransPage.vitalsSystolicBloodPressureTextBox().sendKeys("120");
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(5000);
	 stTransPage.vitalsDiastolicBloodPressureTextBox().sendKeys("83");
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(5000);
	 stTransPage.vitalsRespirationTextBox().sendKeys("18");
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(5000);
	 stTransPage.vitalsOxygenSaturationTextBox().sendKeys("92");
	 Thread.sleep(3000);
	 //act.sendKeys(Keys.ENTER).perform();
	 //Thread.sleep(5000);
	 stTransPage.vitalsContinueButton().click();
	 Thread.sleep(3000);
	 stTransPage.vitalsContinueButton().click();
	 Thread.sleep(3000);
	 stTransPage.checksOriginalTransOrderCheckBox().click();
	 Thread.sleep(2000);
	 stTransPage.checksSecondOrderVerificationTextBox().sendKeys("Nancy");
	 Thread.sleep(2000);
	 stTransPage.checksSignedConsentCheckBox().click();
	 Thread.sleep(2000);
	 stTransPage.checksContinueButton().click();
	 Thread.sleep(3000);
	 stTransPage.startStartButton().click();
	 Thread.sleep(3000);
	 stTransPage.printCancelButton().click();
	 Thread.sleep(3000);
	 
	 //Test again for the same Blood Product and Unit Number.
	 mainPage.startTransfusionButton().click();
	 Thread.sleep(2000);
	 btCmn.scanRacipientPatientID("*635201");
	 //stTransPage.scanRacipientPatientID().sendKeys("(0000)6352-000-1");
	 //act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 btCmn.scanRacipientPatientName("TIMMONS, BABY BOY");
	 Thread.sleep(2000);
	 //btCmn.scanRacipientUnitNumber("123");
	 stTransPage.scanRacipientUnitNumber().sendKeys(unitNo);
	 
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 btCmn.selectPatientBloodType(1);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 stTransPage.racipientContinueButton().click();
	 Thread.sleep(3000);
	 btCmn.donorCenterCodeDropDown(2);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 stTransPage.donorScanUnitNumber().sendKeys(unitNo);
	 act.sendKeys(Keys.ENTER).perform();
	 multiScreens.multiScreenShot(iedriver.driver);
	 Thread.sleep(2000);
	 btCmn.donorBloodProduct(4);
	 act.sendKeys(Keys.ENTER).perform();
	 Thread.sleep(2000);
	 btCmn.transfusionisAlreadyInProgressErrorMsg();
	 multiScreens.multiScreenShot(iedriver.driver);
	 Thread.sleep(2000);
	 iedriver.extent_Test().log(LogStatus.PASS, "Step 06 Passed");
	 stTransPage.linkLogout().click();
	 Thread.sleep(2000);
	 stTransPage.btnYesLogoutPopup().click();
	 Thread.sleep(2000);
	 
	 iedriver.extent_Reports().endTest(iedriver.extent_Test());
	 iedriver.extent_Reports().flush();
	 iedriver.extent_Reports().close();
	 
	 
 }
  
	 
	 
	 
	 
	 
	 
	 
}