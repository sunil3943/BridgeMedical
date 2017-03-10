package capribedsidetransfusionpageobjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import common.BloodTransfusionCommonFunctionality;
import common.Commonfunctionality;
import common.IEDriver;
//import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_Login;
import pageobjects.capribedside.Capribedside_page_MainPatientPage;
import pageobjects.systemManager.EditRolePage;
import pageobjects.systemManager.RolesPage;
import pageobjects.systemManager.Sysman_page_Main;

public class StartTransfusionPage extends IEDriver
{
	private static WebElement element = null;
	public static WebElement mrnID()
	{
		element  = driver.findElement(By.id("txtSecondaryIdentifier"));
		return element;
	}
	public static WebElement mrnContinue()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement mrnExit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	public static WebElement preCheckVerifyDobCheckBox()
	{
		element  = driver.findElement(By.id("grdChecks__ctl2_checkboxSelect"));
		return element;
	}
	public static WebElement preCheckFilterNumberBox()
	{
		element  = driver.findElement(By.id("grdChecks__ctl3_txtCheck"));
		return element;
	}
	public static WebElement preCheckContinueButton()
	{
		element  = driver.findElement(By.id("Continue"));
		return element;
	}
	public static WebElement preCheckExitButton()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	public static WebElement scanRacipientPatientID()
	{
		element  = driver.findElement(By.id("txtPatientId"));
		return element;
	}
	public static WebElement scanRacipientPatientName()
	{
		element  = driver.findElement(By.id("txtPatientName"));
		return element;
	}
	public static WebElement scanRacipientUnitNumber()
	{
		element  = driver.findElement(By.id("txtUnitNumber"));
		return element;
	}
	public static WebElement racipientBloodTypeDropDown()
	{
		element  = driver.findElement(By.id("lstBloodType"));
		return element;
	}
	public static WebElement racipientCommentTextBox()
	{
		element  = driver.findElement(By.id("txtPatientComment"));
		return element;
	}
	public static WebElement racipientContinueButton()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement racipientExitButton()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	public static WebElement donorCenterCodeDropDown()
	{
		element  = driver.findElement(By.id("lstCenterCode"));
		return element;
	}
	public static WebElement donorScanUnitNumber()
	{
		element  = driver.findElement(By.id("txtUnitNumber"));
		return element;
	}
	public static WebElement donorBloodProductDropDown()
	{
		element  = driver.findElement(By.id("lstBloodProduct"));
		return element;
	}
	public static WebElement donorBloodProductExipreDate()
	{
		element  = driver.findElement(By.id("dpExpirationDate_foo"));
		return element;
	}
	
	public static WebElement donorBloodTypeDropDown()
	{
		element  = driver.findElement(By.id("lstBloodType"));
		return element;
	}
	public static WebElement donorContinueButton()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement donorExitButton()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	//Cosign page...
	public static WebElement cosignBloodBankPermission()
	{
		element  = driver.findElement(By.id("lstBloodBankApproved"));
		return element;
	}
	public static WebElement cosignAgreeBloodTypeSubtitution()
	{
		element  = driver.findElement(By.id("lstUserAgrees"));
		return element;
	}
	public static WebElement cosignReasonForBloodTypeSubtitution()
	{
		element  = driver.findElement(By.id("lstReasons"));
		return element;
	}
	public static WebElement cosignUserIdTextBox()
	{
		element  = driver.findElement(By.id("txtLoginId"));
		return element;
	}
	public static WebElement cosignPasswordTextBox()
	{
		element  = driver.findElement(By.id("txtPassword"));
		return element;
	}
	public static WebElement btnCosignContinue()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement btnCosignExit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	//Cosign Page Hazard
	public static WebElement errMsgCosignUserIdOrPasswordInvalid()
	{
		element  = driver.findElement(By.id("User_LoginId"));
		return element;
	}
	
	//Vitals section
	
	public static WebElement vitalsTempTextBoxFar()
	{
		element  = driver.findElement(By.id("_vitals_txtTemperature"));
		return element;
	}
	public static WebElement vitalsTempTextBoxCel()
	{
		element  = driver.findElement(By.id("_vitals_txtAltTemperature"));
		return element;
	}
	public static WebElement vitalsTempSiteTextBox()
	{
		element  = driver.findElement(By.id("_vitals_lstTemperatureSite"));
		return element;
	}
	public static WebElement vitalsHeartRateTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtHeartRate"));
		return element;
	}
	public static WebElement vitalsSystolicBloodPressureTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtSystolic"));
		return element;
	}
	public static WebElement vitalsDiastolicBloodPressureTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtDiastolic"));
		return element;
	}
	public static WebElement vitalsPalpCheckBox()
	{
		element  = driver.findElement(By.id("_vitals_cboxPalp"));
		return element;
	}
	public static WebElement vitalsRespirationTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtRespirations"));
		return element;
	}
	public static WebElement vitalsOxygenSaturationTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtOxygenSaturation"));
		return element;
	}
	public static WebElement vitalsCommentTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtComment"));
		return element;
	}
	public static WebElement vitalsContinueButton()
	{
		element  = driver.findElement(By.id("_vitals_cont"));
		return element;
	}
	public static WebElement vitalsExitButton()
	{
		element  = driver.findElement(By.id("_vitals_canc"));
		return element;
	}
	public static WebElement checksOriginalTransOrderCheckBox()
	{
		element  = driver.findElement(By.id("grdChecks__ctl2_checkboxSelect"));
		return element;
	}
	public static WebElement checksSecondOrderVerificationTextBox()
	{
		element  = driver.findElement(By.id("grdChecks__ctl3_txtCheck"));
		return element;
	}
	public static WebElement checksSignedConsentCheckBox()
	{
		element  = driver.findElement(By.id("grdChecks__ctl4_checkboxSelect"));
		return element;
	}
	public static WebElement checksContinueButton()
	{
		element  = driver.findElement(By.id("Continue"));
		return element;
	}
	public static WebElement checksExitButton()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	public static WebElement startStartButton()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement startExitButton()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	public static WebElement printPrintButton()
	{
		element  = driver.findElement(By.id("btnPrint"));
		return element;
	}
	public static WebElement printCancelButton()
	{
		element  = driver.findElement(By.id("btnReturn"));
		return element;
	}
	//Alert or Error Messages Donor Section Screen.
	
	public static WebElement donorUnitNumberMissmatchErrorMsg()
	{
		element  = driver.findElement(By.id("StartTransfusionEvent_UnitNumber"));
		return element;
	}
	public static WebElement donorBloodProductErrorMsg()
	{
		element  = driver.findElement(By.id("StartTransfusionEvent_BloodProduct"));
		return element;
	}
	
	public static WebElement transfusionIsAlreadyInProgressErrorMsg()
	{
		element  = driver.findElement(By.id("StartTransfusionEvent_UnitNumber"));
		return element;
	}
	
	//Exit Trans Popup
	public static WebElement buttonYesExitTransPopup()
	{
		element  = driver.findElement(By.id("_modalConfirm_cmdOK"));
		return element;
	}
	
	public static WebElement buttonNoExitTransPopup()
	{
		element  = driver.findElement(By.id("_modalConfirm_cmdCancel"));
		return element;
	}
	
	//Hazards
	//Racipient Page
	public static WebElement errorMsgPatientIDDoesNotMatch()
	{
		element  = driver.findElement(By.id("StartTransfusionEvent_PatientId"));
		return element;
	}
	
	public static WebElement errorMsgPatientNameDoesNotMatch()
	{
		element  = driver.findElement(By.id("StartTransfusionEvent_PatientName"));
		return element;
	}
	
	public static WebElement errorMsgNotValidBarcodeForPatientID()
	{
		element  = driver.findElement(By.id("StartTransfusionEvent_PatientId"));
		return element;
	}
	
	public static WebElement errorMsgNotValidBarcodeForPatientName()
	{
		element  = driver.findElement(By.id(""));
		return element;
	}
	//_modalErrorConfirm_lblTitleHeader
	public static WebElement popupBloodGroupMissMatch()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_lblTitleHeader"));
		return element;
	}
	//_modalErrorConfirm_cmdOK
	public static WebElement btnYesBloodGroupMissMatchPopup()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdOK"));
		return element;
	}
	public static WebElement btnNoBloodGroupMissMatchPopup()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdCancel"));
		return element;
	}
	
	//_modalErrorConfirm_lblTitle
	public static WebElement popupBloodGroupMissMatchTitle()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_lblTitle"));
		return element;
	}
	public static WebElement errMsgNotAuthToChangeBloodGroup()
	{
		element  = driver.findElement(By.id("StartTransfusionEvent_BloodType"));
		return element;
	}
	
	//Donor page Hazards

	public static WebElement popupExpiredBloodProduct()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_lblTitleHeader"));
		return element;
	}
	public static WebElement btnYesExpiredBloodProductPopup()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdOK"));
		return element;
	}
	public static WebElement btnNoExpiredBloodProductPopup()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdCancel"));
		return element;
	}
	public static WebElement popupBloodTypeMissMatch()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_lblTitleHeader"));
		return element;
	}
	public static WebElement btnYesDonorBloodTypeMissMatchPopup()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdOK"));
		return element;
	}
	public static WebElement btnNoDonorBloodTypeMissMatchPopup()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdCancel"));
		return element;
	}
	public static WebElement errMsgDonorBloodTypeIsNotAllowedForPatient()
	{
		element  = driver.findElement(By.id("StartTransfusionEvent_BloodType"));
		return element;
	}
	
	
	
	//Logoutprocess
	
	public static WebElement linkLogout()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
	
	public static WebElement btnYesLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdOK"));
		return element;
	}
	public static WebElement btnNoLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdCancel"));
		return element;
	}
	
	//Common method..
	public void startTransfusion(String unitNo,String racipientPatientID,String patientName) throws InterruptedException, IOException
	  {
		IEDriver iedriver = new IEDriver(); 
		//MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","BrowseTransfusionHistoryTest");
		Capribedside_page_Login login = new Capribedside_page_Login();
		Sysman_page_Main sysManagerMainPage = new Sysman_page_Main();
		Commonfunctionality common = new Commonfunctionality();
		Capribedside_page_MainPatientPage patientMenu = new  Capribedside_page_MainPatientPage();
		Capribedside_page_MainPatientPage mainPage = new Capribedside_page_MainPatientPage();
		StartTransfusionPage stTransPage = new StartTransfusionPage();
		BloodTransfusionCommonFunctionality transCommon = new BloodTransfusionCommonFunctionality();
		RolesPage roles = new RolesPage();
		EditRolePage editRole = new EditRolePage();
		
	     mainPage.startTransfusionButton().click();
	     String nextDate = common.nextDate();
		 Thread.sleep(2000);
		 transCommon.scanRacipientPatientID(racipientPatientID);
		 //stTransPage.scanRacipientPatientID().sendKeys("(0000)6352-000-1");
		 //act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(2000);
		 transCommon.scanRacipientPatientName(patientName);
		 Thread.sleep(2000);
		 //btCmn.scanRacipientUnitNumber("123");
		 Actions act = new Actions(iedriver.driver);
		 stTransPage.scanRacipientUnitNumber().sendKeys(unitNo);
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(2000);
		 transCommon.selectPatientBloodType(1);
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(2000);
		 stTransPage.racipientContinueButton().click();
		 Thread.sleep(2000);
		 //multiScreens.multiScreenShot(iedriver.driver);
		 //iedriver.extent_Test().log(LogStatus.PASS, "Step 01 Passed");
		 transCommon.donorCenterCodeDropDown(2);
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(2000);
		 stTransPage.donorScanUnitNumber().sendKeys(unitNo);
		 act.sendKeys(Keys.ENTER).perform();
		 //multiScreens.multiScreenShot(iedriver.driver);
		 //iedriver.extent_Test().log(LogStatus.PASS, "Step 03 Passed");
		 Thread.sleep(2000);
		 transCommon.donorBloodProduct(4);
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 stTransPage.donorBloodProductExipreDate().sendKeys(nextDate);
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(2000);
		 transCommon.donorBloodType(4);
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 stTransPage.vitalsTempTextBoxFar().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsTempTextBoxFar().sendKeys("95");
		 Thread.sleep(3000);
		 transCommon.vitalsTempSite(2);
		 Thread.sleep(3000);
		 stTransPage.vitalsHeartRateTextBox().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsHeartRateTextBox().sendKeys("82");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 stTransPage.vitalsSystolicBloodPressureTextBox().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsSystolicBloodPressureTextBox().sendKeys("120");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 stTransPage.vitalsDiastolicBloodPressureTextBox().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsDiastolicBloodPressureTextBox().sendKeys("83");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 stTransPage.vitalsRespirationTextBox().clear();
		 Thread.sleep(1000);
		 stTransPage.vitalsRespirationTextBox().sendKeys("18");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(4000);
		 stTransPage.vitalsOxygenSaturationTextBox().clear();
		 Thread.sleep(1000);
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
//		 multiScreens.multiScreenShot(iedriver.driver);
		 stTransPage.printCancelButton().click();
		 Thread.sleep(2000);
	  }
	
	
	
	
	
	
	

}
