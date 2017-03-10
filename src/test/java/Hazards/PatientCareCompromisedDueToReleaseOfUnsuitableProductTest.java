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
import java.util.concurrent.TimeUnit;

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

import capribedsidetransfusionpageobjects.ChangeBloodTypePage;
import capribedsidetransfusionpageobjects.RapidStartTransfusion;
import capribedsidetransfusionpageobjects.StartTransfusionPage;
import common.BloodTransfusionCommonFunctionality;
import common.Commonfunctionality;
import common.IEDriver;
import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_Login;
import pageobjects.capribedside.Capribedside_page_MainPatientPage;
import pageobjects.capribedside.Capribedside_page_SelectPatient;
import pageobjects.systemManager.EditRolePage;
import pageobjects.systemManager.RolesPage;
import pageobjects.systemManager.Sysman_page_Main;
import syatemmanagertransfusionsettionpageobjects.TransfusionSettingsPage;

public class PatientCareCompromisedDueToReleaseOfUnsuitableProductTest 
{
	String FilePath = "C:\\Temp\\PatientCareCompromisedDueToReleaseOfUnsuitableProductTest.html";
	String TestName = "PatientIdentificationErrorTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","PatientCareCompromisedDueToReleaseOfUnsuitableProductTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	Capribedside_page_MainPatientPage mainPatPage = new Capribedside_page_MainPatientPage();
	Capribedside_page_SelectPatient selectPatient = new Capribedside_page_SelectPatient();
	Commonfunctionality commonfunctions = new Commonfunctionality();
	StartTransfusionPage stTrans = new StartTransfusionPage();
	BloodTransfusionCommonFunctionality btCmn = new  BloodTransfusionCommonFunctionality();
	Capribedside_page_Login login = new Capribedside_page_Login();
	ChangeBloodTypePage changeBT = new ChangeBloodTypePage();
	Sysman_page_Main systeManagerMenuPage = new Sysman_page_Main();
	EditRolePage editRole = new EditRolePage();
	RolesPage roles = new RolesPage();
	TransfusionSettingsPage transfusionSettings = new TransfusionSettingsPage();
	String patientA = "635201";
	String patientNameA = "TIMMONS, BABY BOY";
	String uniqueNo= commonfunctions.uniqueNumber();
    String unitNo = uniqueNo; 
    String bloodOpos = "O pos";
    String bloodApos = "A pos";
    String bloodAneg = "A neg";
    String bloodBpos = "B pos";
    String yestDate = commonfunctions.yestDate();
    String oldDate =  yestDate;
    String nextDate = commonfunctions.nextDate();
    String capribedsideUrl = "http://10.162.106.174/TransSpec2016010410/capribedside/Login.aspx";
	String systemManagerUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String user1 = "Superuser";
	String user2 ="transsup";
	String user3 ="cerner";
	String user4 ="rapidstartonly";
	String user5 ="jj";
	String password = "123";
	String WarnContinue = "Warn";
    private static ScreenRecorder screenRecorder;
    @BeforeTest
	final void preSettingsTest() throws Throwable
	{
	GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
	this.screenRecorder = new ScreenRecorder(gc,
	new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
	new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,DepthKey, 24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f,KeyFrameIntervalKey, 15 * 60),new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)),null);
	this.screenRecorder.start();
	commonfunctions.login_default(systemManagerUrl);
	Thread.sleep(2000);
	systeManagerMenuPage.button_TransfusionSettings().click();
	Thread.sleep(2000);
	transfusionSettings.selectOptionForExpirationMessage(WarnContinue);
	Thread.sleep(2000);
	transfusionSettings.buttonConfirm().click();
	Thread.sleep(2000);
	systeManagerMenuPage.button_Roles().click();
	Thread.sleep(2000);
	roles.editTransfusionSupervisor().click();
	Thread.sleep(2000);
	boolean b0 = editRole.checkBoxMayAccessChangeBloodTypeWithCosignature().isSelected();
	if(!b0)
	{
		 editRole.checkBoxMayAccessChangeBloodTypeWithCosignature().click();
		 Thread.sleep(2000);
	}
	else
	{
		Thread.sleep(2000);
	}
	editRole.buttonConfirm().click();
	Thread.sleep(2000);
	roles.editRapidStartOnly().click();
	Thread.sleep(2000);
	boolean b1 = editRole.checkBoxMayStartRapidTransfusionWithoutCosignature().isSelected();
	if(b1)
	{
		editRole.checkBoxMayStartRapidTransfusionWithoutCosignature().click();
		Thread.sleep(2000);
	}
	else
	{
		Thread.sleep(2000);
	}
	boolean b2 = editRole.checkBoxMayStartRapidTransfusionWithCosignature().isSelected();
	if(!b2)
	{
		editRole.checkBoxMayStartRapidTransfusionWithCosignature().click();
		Thread.sleep(2000);
	}
	else
	{
		Thread.sleep(2000);
	}
	editRole.buttonConfirm().click();
	Thread.sleep(2000);
	roles.editTransfusionist().click();
	Thread.sleep(2000);
	
	boolean b3 = editRole.checkBoxMayStartTransfusionWithoutCosignature().isSelected();
	if(b3)
	{
		editRole.checkBoxMayStartTransfusionWithoutCosignature().click();
	}
	else
	{
		Thread.sleep(2000);
	}
	boolean b4 = editRole.checkBoxMayStartTransfusionWithCosignature().isSelected();
	if(!b4)
	{
		editRole.checkBoxMayStartTransfusionWithCosignature().click();
	}
	else
	{
		Thread.sleep(2000);
	}
	editRole.buttonConfirm().click();
	Thread.sleep(2000);
	roles.linkLogout().click();
	Thread.sleep(1000);
	
	
	
	
	}
  @Test
  public void PatientCareCompromisedDueToReleaseOfUnsuitableProductTest() throws InterruptedException, IOException 
  {
	  
	  //Step 1
	  commonfunctions.login_default(capribedsideUrl);
	  Actions act = new Actions(iedriver.driver);
	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  Thread.sleep(2000);
	  commonfunctions.scanpatientid(patientA);
	  Thread.sleep(2000);
	  mainPatPage.startTransfusionButton().click();
	  Thread.sleep(1000);
	  stTrans.scanRacipientPatientID().sendKeys("12345",Keys.ENTER);
	  Thread.sleep(1000);
	  String errMsg1 = stTrans.errorMsgPatientIDDoesNotMatch().getText();
	  boolean b = stTrans.errorMsgPatientIDDoesNotMatch().isDisplayed();
	  if(b)
	  {
		  System.out.println("Error message"+errMsg1+"is displayed");
		  multiScreens.multiScreenShot(iedriver.driver);
	  }
	  else
	  {
		  System.out.println("Error message"+errMsg1+"is not displayed");
		  multiScreens.multiScreenShot(iedriver.driver);
		  
	  }
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 01 Passed");
	  //Step 2
	  stTrans.scanRacipientPatientID().clear();
	  Thread.sleep(1000);
	  btCmn.scanRacipientPatientID("12345");
	  Thread.sleep(1000);
	  String errMsg2 = stTrans.errorMsgNotValidBarcodeForPatientID().getText();
	  boolean b2 = stTrans.errorMsgNotValidBarcodeForPatientID().isDisplayed();
	  if(b2)
	  {
		  System.out.println("Error message"+errMsg2+"is displayed");
		  multiScreens.multiScreenShot(iedriver.driver);
	  }
	  else
	  {
		  System.out.println("Error message"+errMsg2+"is not displayed");
		  multiScreens.multiScreenShot(iedriver.driver);
		  
	  }
	  stTrans.scanRacipientPatientID().clear();
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 02 Passed");
	  Thread.sleep(1000);
	  //Step 03
	  stTrans.scanRacipientPatientID().sendKeys(patientA,Keys.ENTER);
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 03 Passed");
	  //Step 4
	  Thread.sleep(1000);
	  stTrans.scanRacipientPatientName().sendKeys(patientNameA,Keys.ENTER);
	  Thread.sleep(1000);
	  stTrans.scanRacipientUnitNumber().sendKeys(unitNo,Keys.ENTER);
	  Thread.sleep(1000);
	  btCmn.selectPatientBloodTypeVisibleText(bloodAneg);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(1000);
	  //String popupWarn = stTrans.popupBloodGroupMissMatchTitle().getText();
	  boolean b3 = stTrans.popupBloodGroupMissMatch().isDisplayed();
	  if(b3)
	  {
		  System.out.println("Warning popup Is displayed");
		  multiScreens.multiScreenShot(iedriver.driver);
	  }
	  else
	  {
		  
			System.out.println("Warning popup Is not displayed");
			multiScreens.multiScreenShot(iedriver.driver);
		  
	  }
	  Thread.sleep(1000);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 04 Passed");
	  //Step 5
	  stTrans.btnNoBloodGroupMissMatchPopup().click();
	  Thread.sleep(1000);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 05 Passed");
	  //Step 6
	  btCmn.selectPatientBloodTypeVisibleText(bloodApos);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(1000);
	  String popupWarn2 = stTrans.popupBloodGroupMissMatch().getText();
	  boolean b4 = stTrans.popupBloodGroupMissMatch().isDisplayed();
	  if(b4)
	  {
		  System.out.println("Warning popup "+popupWarn2+"Is displayed");
		  multiScreens.multiScreenShot(iedriver.driver);
	  }
	  else
	  {
		  
			  System.out.println("Warning popup"+popupWarn2+"Is not displayed");
			  multiScreens.multiScreenShot(iedriver.driver);
		  
	  }
	  Thread.sleep(1000);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 06 Passed");
	  //Step 7
	  stTrans.btnNoBloodGroupMissMatchPopup().click();
	  Thread.sleep(2000);
	  stTrans.linkLogout().click();
	  Thread.sleep(2000);
	  stTrans.btnYesLogoutPopup().click();
	  Thread.sleep(1000);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 07 Passed");
	  //Step 8
	  login.txt_box_username().sendKeys(user5);
	  login.txt_box_password().sendKeys(password);
	  login.button_login().click();
	  Thread.sleep(2000);
	  commonfunctions.scanpatientid(patientA);
	  Thread.sleep(2000);
	  mainPatPage.startTransfusionButton().click();
	  Thread.sleep(2000);
	  stTrans.scanRacipientPatientID().sendKeys(patientA,Keys.ENTER);
	  Thread.sleep(2000);
	  stTrans.scanRacipientPatientName().sendKeys(patientNameA,Keys.ENTER);
	  Thread.sleep(2000);
	  stTrans.scanRacipientUnitNumber().sendKeys(unitNo,Keys.ENTER);
	  Thread.sleep(2000);
	  btCmn.selectPatientBloodTypeVisibleText(bloodBpos);
	  act.sendKeys(Keys.ENTER).perform();
	  String errMsg3 = stTrans.errMsgNotAuthToChangeBloodGroup().getText();
	  boolean b5 = stTrans.errMsgNotAuthToChangeBloodGroup().isDisplayed();
	  if(b5)
	  {
		  System.out.println("Warning popup"+errMsg3+" Is displayed");
		  multiScreens.multiScreenShot(iedriver.driver);
	  }
	  else
	  {
		  
			  System.out.println("Warning popup"+errMsg3+" Is not displayed");
			  multiScreens.multiScreenShot(iedriver.driver);
		  
	  }
	  Thread.sleep(1000);
	  
	  Thread.sleep(2000);
	  stTrans.linkLogout().click();
	  Thread.sleep(2000);
	  stTrans.btnYesLogoutPopup().click();
	  Thread.sleep(2000);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 08 Passed");
	  //Step 9
	  login.txt_box_username().sendKeys(user1);
	  Thread.sleep(2000);
	  login.txt_box_password().sendKeys(password);
	  Thread.sleep(2000);
	  login.button_login().click();
	  Thread.sleep(2000);
	  commonfunctions.scanpatientid(patientA);
	  Thread.sleep(2000);
	  mainPatPage.startTransfusionButton().click();
	  Thread.sleep(2000);
	  stTrans.scanRacipientPatientID().sendKeys(patientA,Keys.ENTER);
	  Thread.sleep(2000);
	  stTrans.scanRacipientPatientName().sendKeys(patientNameA,Keys.ENTER);
	  Thread.sleep(2000);
	  stTrans.scanRacipientUnitNumber().sendKeys(unitNo,Keys.ENTER);
	  Thread.sleep(2000);
	  btCmn.selectPatientBloodTypeVisibleText(bloodOpos);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  stTrans.racipientContinueButton().click();
	  Thread.sleep(2000);
	  btCmn.donorCenterCodeDropDown(1);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);

	  stTrans.donorScanUnitNumber().sendKeys(unitNo,Keys.ENTER);
	  Thread.sleep(2000);
	  btCmn.donorBloodProduct(4);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  stTrans.donorBloodProductExipreDate().sendKeys(oldDate,Keys.ENTER); 
	  Thread.sleep(2000);
	  boolean b6 = stTrans.popupExpiredBloodProduct().isDisplayed();
	  if(b6)
	  {
		  System.out.println("Warning popup Is displayed");
		  multiScreens.multiScreenShot(iedriver.driver);
	  }
	  else
	  {
		  
			  System.out.println("Warning popup Is not displayed");
			 multiScreens.multiScreenShot(iedriver.driver);
		  
	  }
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 09 Passed");
	  //Step 10
	  stTrans.btnYesExpiredBloodProductPopup().click();
	  Thread.sleep(2000);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 10 Passed");
      //Stpe 11
	  btCmn.donorBloodType(14);
	  act.sendKeys(Keys.ENTER).perform();
	  String errMsg7 = stTrans.errMsgDonorBloodTypeIsNotAllowedForPatient().getText();
	  multiScreens.multiScreenShot(iedriver.driver);
	  System.out.println(errMsg7);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 11 Passed");
	  //Step 12
	  btCmn.selectPatientBloodTypeVisibleText(bloodBpos);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 12 Passed");
	  //Step 13
	  stTrans.btnYesDonorBloodTypeMissMatchPopup().click();
	  Thread.sleep(2000);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 13 Passed");
	  //Step 14
	  stTrans.btnCosignContinue().click();
	  Thread.sleep(2000);
	  String errMsg4 = stTrans.errMsgCosignUserIdOrPasswordInvalid().getText();
	  boolean b7 = stTrans.errMsgCosignUserIdOrPasswordInvalid().isDisplayed();
	  if(b7)
	  {
		  System.out.println("Warning popup"+errMsg4+" Is displayed");
		 multiScreens.multiScreenShot(iedriver.driver);
	  }
	  else
	  {
		  
			  System.out.println("Warning popup"+errMsg4+" Is not displayed");
			 multiScreens.multiScreenShot(iedriver.driver);
		  
	  }
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 14 Passed");
	  //Step 15
	  Thread.sleep(2000);
	  btCmn.cosignBloodBankPermission("Yes");
	  Thread.sleep(2000);
	  btCmn.cosignAgreeBloodTypeSubtitution("Yes");
	  Thread.sleep(2000);
	  btCmn.cosignReasonForBloodTypeSubtitution(1);
	  Thread.sleep(2000);
      stTrans.cosignUserIdTextBox().sendKeys(user3);
      stTrans.cosignPasswordTextBox().sendKeys(password);
      Thread.sleep(2000);
      multiScreens.multiScreenShot(iedriver.driver);
      stTrans.btnCosignContinue().click();
      Thread.sleep(3000);
      iedriver.extent_Test().log(LogStatus.PASS, "Step 15 Passed");
      //Step 16
      stTrans.linkLogout().click();
      Thread.sleep(2000);
      stTrans.btnYesLogoutPopup().click();
      Thread.sleep(2000); 
      iedriver.extent_Test().log(LogStatus.PASS, "Step 16 Passed");
      //Step 17...
      login.txt_box_username().sendKeys(user4);
      login.txt_box_password().sendKeys(password);
      login.button_login().click();
  	  Thread.sleep(2000);
  	  commonfunctions.scanpatientid(patientA);
  	  Thread.sleep(2000);
  	  mainPatPage.rapidStartTransfusionButton().click();
  	  Thread.sleep(2000);
  	RapidStartTransfusion rapidTrans = new RapidStartTransfusion();
  	btCmn.rapidStartDonorCenterCode(1);
  	act.sendKeys(Keys.ENTER).perform();
  	Thread.sleep(2000);
  	rapidTrans.donorUnitNumber().sendKeys(unitNo,Keys.ENTER);
  	Thread.sleep(2000);
  	btCmn.rapidStartDonorBloodProduct(4);
  	act.sendKeys(Keys.ENTER).perform();
  	Thread.sleep(2000);
  	rapidTrans.donorBloodProductExipreDate().sendKeys(nextDate,Keys.ENTER);
  	Thread.sleep(2000);
  	btCmn.donorBloodType(14);
  	act.sendKeys(Keys.ENTER).perform();
  	String errMsg5 = rapidTrans.errMsgDonorBloodTypeIsNotAllowedForPatient().getText();
    multiScreens.multiScreenShot(iedriver.driver);
  	System.out.println(errMsg5);
  	iedriver.extent_Test().log(LogStatus.PASS, "Step 17 Passed");
  	//Step 18
  	btCmn.selectPatientBloodTypeVisibleText(bloodBpos);
  	act.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	iedriver.extent_Test().log(LogStatus.PASS, "Step 18Passed");
	//Step 19
	stTrans.btnYesDonorBloodTypeMissMatchPopup().click();
	Thread.sleep(2000);
	iedriver.extent_Test().log(LogStatus.PASS, "Step 19 Passed");
	rapidTrans.donorContinueButton().click();
	//Step 20
	rapidTrans.btnCosignContinue().click();
	Thread.sleep(2000);
	multiScreens.multiScreenShot(iedriver.driver);
	String errMsg6 = rapidTrans.errMsgCosignUserIdOrPasswordInvalid().getText();
	System.out.println(errMsg6);
	Thread.sleep(2000);
	iedriver.extent_Test().log(LogStatus.PASS, "Step 20 Passed");
	//Step 21
	rapidTrans.cosignUserIdTextBox().sendKeys(user3);
	Thread.sleep(2000);
	rapidTrans.cosignPasswordTextBox().sendKeys(password);
	Thread.sleep(2000);
	 multiScreens.multiScreenShot(iedriver.driver);
	rapidTrans.btnCosignContinue().click();
	Thread.sleep(2000);
	 multiScreens.multiScreenShot(iedriver.driver);
	iedriver.extent_Test().log(LogStatus.PASS, "Step 21 Passed");
	//Step 22
	rapidTrans.linkLogout().click();
	Thread.sleep(2000);
     rapidTrans.btnYesLogoutPopup().click();
     Thread.sleep(2000);
     login.txt_box_username().sendKeys(user2);
     Thread.sleep(2000);
     login.txt_box_password().sendKeys(password);
     Thread.sleep(2000);
     login.button_login().click();
 	 Thread.sleep(2000);
 	 commonfunctions.scanpatientid(patientA);
 	 Thread.sleep(2000);
 	 mainPatPage.changeBloodTypeButton().click();
 	 Thread.sleep(2000);
 	 multiScreens.multiScreenShot(iedriver.driver);
 	 iedriver.extent_Test().log(LogStatus.PASS, "Step 22 Passed");
 	  //Step 23
 	  btCmn.changeBTNewBloodType(bloodBpos);
 	  Thread.sleep(2000);
 	  btCmn.changeBTConfirmNewBloodType(bloodBpos);
 	  Thread.sleep(2000);
 	  btCmn.changeBTReasonForBloodTypeChange(2);
 	  Thread.sleep(2000);
 	  changeBT.textBoxUserID().sendKeys(user3);
 	  act.sendKeys(Keys.ENTER).perform();
 	  Thread.sleep(3000);
 	  changeBT.textBoxPassword().sendKeys(password);
 	  Thread.sleep(2000);
 	 
 	  changeBT.btnConfirm().click();
 	  Thread.sleep(2000);
 	  changeBT.linkLogout().click();
 	 multiScreens.multiScreenShot(iedriver.driver);
 	 iedriver.extent_Test().log(LogStatus.PASS, "Step 23 Passed");
 	  //Step 24
 	 login.txt_box_username().sendKeys(user5);
	  login.txt_box_password().sendKeys(password);
	  login.button_login().click();
	  Thread.sleep(2000);
	  commonfunctions.scanpatientid(patientA);
	  Thread.sleep(2000);
	  stTrans.linkLogout().click();
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 24 Passed");
	  iedriver.extent_Reports().endTest(iedriver.extent_Test());
	  iedriver.extent_Reports().flush();
	  iedriver.extent_Reports().close();
	  
	 
	  
	  
  }
  @AfterTest
  public void postTestSettings() throws  Throwable
  {
	  //Restting the Chnages..
	  System.out.println("Resetting the Blood Type Changes");
	  Actions act = new Actions(iedriver.driver);
	  //commonfunctions.login_default(capribedsideUrl);
	  iedriver.driver.get(capribedsideUrl);
	  Thread.sleep(2000);
	  login.login(user2, password);
	  Thread.sleep(2000);
	  /*
	  login.txt_box_username().sendKeys(user2);
	  Thread.sleep(2000);
	  login.txt_box_password().sendKeys(password);
	  Thread.sleep(2000);
	  login.button_login().click();
	  Thread.sleep(2000);
	  */
   	  commonfunctions.scanpatientid(patientA);
	 	  Thread.sleep(2000);
	 	  mainPatPage.changeBloodTypeButton().click();
	 	  Thread.sleep(2000);
	 	  btCmn.changeBTNewBloodType(bloodOpos);
	 	  Thread.sleep(2000);
	 	  btCmn.changeBTConfirmNewBloodType(bloodOpos);
	 	  Thread.sleep(2000);
	 	  btCmn.changeBTReasonForBloodTypeChange(2);
	 	  Thread.sleep(2000);
	 	  changeBT.textBoxUserID().sendKeys("cerner");
	 	  act.sendKeys(Keys.ENTER).perform();
	 	  Thread.sleep(2000);
	 	  changeBT.textBoxPassword().sendKeys("123");
	 	  Thread.sleep(2000);
	 	  changeBT.btnConfirm().click();
	 	  Thread.sleep(2000);
	 	  changeBT.linkLogout().click();
	  iedriver.driver.close();
	  Thread.sleep(2000);
	  this.screenRecorder.stop();
  }
}

