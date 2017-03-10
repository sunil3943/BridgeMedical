package Regression;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import capribedsidetransfusionpageobjects.RapidStartTransfusion;
import capribedsidetransfusionpageobjects.StartTransfusionPage;
import common.BloodTransfusionCommonFunctionality;
import common.Commonfunctionality;
import common.IEDriver;
import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_Login;
import pageobjects.capribedside.Capribedside_page_MainPatientPage;
import pageobjects.systemManager.EditPocPage;
import pageobjects.systemManager.EditRolePage;
import pageobjects.systemManager.RolesPage;
import pageobjects.systemManager.Sysman_page_Main;
import pageobjects.systemManager.Sysman_page_PointsOfCare;
import syatemmanagertransfusionsettionpageobjects.BloodProductPage;
import syatemmanagertransfusionsettionpageobjects.EditBloodProduct;
import syatemmanagertransfusionsettionpageobjects.TransfusionSettingsPage;

public class RapidTransfusionTest 
{
	String FilePath = "C:\\Temp\\RapidTransfusionTest.html";
	String TestName = "RapidTransfusionTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","RapidTransfusionTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	Capribedside_page_Login login = new Capribedside_page_Login();
	Sysman_page_Main sysManagerMainPage = new Sysman_page_Main();
	Commonfunctionality common = new Commonfunctionality();
	Capribedside_page_MainPatientPage patientMenu = new  Capribedside_page_MainPatientPage();
	StartTransfusionPage stTransPage = new StartTransfusionPage();
	BloodTransfusionCommonFunctionality transCommon = new BloodTransfusionCommonFunctionality();
	RolesPage roles = new RolesPage();
	EditRolePage editRole = new EditRolePage();
	//HoldTransfusionPage holdTransPage = new HoldTransfusionPage();
	TransfusionSettingsPage transSettings = new TransfusionSettingsPage();
	//BrowseTransfusionHistoryPage browseTransHistory = new BrowseTransfusionHistoryPage();
	//AdministerDerivativesPage administerDerivative = new AdministerDerivativesPage();
	//BloodTypeChangeReason reasonChangeBloodType = new BloodTypeChangeReason();
	//ReactionInstructionPage reactionInstruction = new ReactionInstructionPage();
	//ReactionSignsAndSymptomsPage reactionSigns = new ReactionSignsAndSymptomsPage();
	//ViewReactionInformationPage viewReaction = new ViewReactionInformationPage();
	BloodTransfusionCommonFunctionality bloodTransCommnon = new  BloodTransfusionCommonFunctionality();
	Sysman_page_PointsOfCare selectPoc = new Sysman_page_PointsOfCare();
	EditPocPage editPoc = new EditPocPage();
	BloodProductPage bloodProduct = new BloodProductPage();
	EditBloodProduct editBloodProduct = new EditBloodProduct();
	RapidStartTransfusion rapidTransfusion = new RapidStartTransfusion();
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedside = "http://10.162.106.174/TransSpec2016010410/CapriBedside/Login.aspx";
	String superuser = "Superuser";
	String user2 = "jj";
	String password = "123";
	String patientA = "635201";
	String patientB = "1010123";
	//String user1 = "rohan";
	String bloodOpos = "O pos";
	//String bloodApos = "A pos";
    //String bloodOneg = "O neg";
    //String bloodAneg = "A pos";
	String Yes = "Yes";
	String No = "No";
	String unitNo= common.uniqueNumber();
	String unitNo2 = common.uniqueNumber2();
	//String unitNo3 = common.uniqueNumber3();
    String nextDate = common.nextDateByDate();
    /*
	@BeforeTest
	public void systemManagerPreSettingTest() throws Throwable
	{
		
		  iedriver.callDriver(sysmanUrl);
		  Thread.sleep(1000);
		  login.login(superuser, password);
		  Thread.sleep(2000);
		  sysManagerMainPage.button_PointsOfCare().click();
		  Thread.sleep(2000);
		  selectPoc.editPocPeds().click();
		  Thread.sleep(2000);
		  editPoc.selectYesOrNoForCheckCenterCode(Yes);
		  Thread.sleep(2000);
		  editPoc.selectYesOrNoForRequireCosignature(Yes);
		  Thread.sleep(2000);
		  editPoc.selectYesOrNoFordDisplayCommentsInRapidStartTransfusion(Yes);
		  Thread.sleep(2000);
		  editPoc.buttonConfirm().click();
		  Thread.sleep(2000);
		  selectPoc.editPocGenMed().click();
		  Thread.sleep(2000);
		  editPoc.selectYesOrNoForCheckCenterCode(No);
		  Thread.sleep(2000);
		  editPoc.selectYesOrNoForRequireCosignature(Yes);
		  Thread.sleep(2000);
		  editPoc.selectYesOrNoFordDisplayCommentsInRapidStartTransfusion(Yes);
		  Thread.sleep(2000);
		  editPoc.buttonConfirm().click();
		  Thread.sleep(2000);
		  selectPoc.button_Back().click();
		  Thread.sleep(2000);
		  sysManagerMainPage.button_TransfusionSettings().click();
		  Thread.sleep(2000);
		  transSettings.linkBloodProducts().click();
		  Thread.sleep(2000);
		  bloodProduct.editLinkForCRT().click();
		  Thread.sleep(2000);
		  editBloodProduct.selectOptionForExpirationCheck("2");
		  Thread.sleep(2000);
		  editBloodProduct.selectOptionForCompareBloodType(Yes);
		  Thread.sleep(2000);
		  editBloodProduct.selectOptionForISBT_128_BloodProduct(No);
		  Thread.sleep(2000);
		  editBloodProduct.linkBloodProductAttributes().click();
		  Thread.sleep(2000);
		
		 boolean b1 = editBloodProduct.checkboxAntiCMVNegative().isEnabled();
		 if(b1)
		 {
			 editBloodProduct.checkboxAntiCMVNegative().click();
			 Thread.sleep(2000);
		 }
		 else
		 {
			 Thread.sleep(1000);
		 }
		 boolean b = editBloodProduct.checkboxIrradiated().isEnabled();
		 if(b)
		 {
			 editBloodProduct.checkboxIrradiated().click();
			 Thread.sleep(2000);
		 }
		 else
		 {
			 Thread.sleep(1000);
		 }
		 editBloodProduct.linkBack().click();
		 Thread.sleep(2000);
		 editBloodProduct.buttonConfirm().click();
		 Thread.sleep(2000);
		  bloodProduct.editLinkForISBTWB().click();
		  Thread.sleep(2000);
		  editBloodProduct.selectOptionForExpirationCheck("2");
		  Thread.sleep(2000);
		  editBloodProduct.selectOptionForCompareBloodType(Yes);
		  Thread.sleep(2000);
		  editBloodProduct.selectOptionForISBT_128_BloodProduct(Yes);
		  Thread.sleep(2000);
		  editBloodProduct.linkBloodProductAttributes().click();
		  Thread.sleep(2000);
		 boolean b3 = editBloodProduct.checkboxAntiCMVNegative().isEnabled();
		 if(b3)
		 {
			 editBloodProduct.checkboxAntiCMVNegative().click();
			 Thread.sleep(2000);
		 }
		 else
		 {
			 Thread.sleep(1000);
		 }
		 boolean b2 = editBloodProduct.checkboxIrradiated().isEnabled();
		 if(b2)
		 {
			 editBloodProduct.checkboxIrradiated().click();
			 Thread.sleep(2000);
		 }
		 else
		 {
			 Thread.sleep(1000);
		 }
		 editBloodProduct.linkBack().click();
		 Thread.sleep(2000);
		 editBloodProduct.buttonConfirm().click();
		 Thread.sleep(2000);
		 bloodProduct.linkBack().click();
		 Thread.sleep(2000);
		 transSettings.selectOptionForDisplayBloodTypeMismatchQuestion("BOTH");
		 Thread.sleep(2000);
		 transSettings.selectOptionForPropmtForPatientBloodType("true");
		 Thread.sleep(2000);
		 transSettings.selectOptionForExpirationMessage("Stop");
	     Thread.sleep(2000);
		 transSettings.buttonConfirm().click();
		 Thread.sleep(2000);
	     sysManagerMainPage.button_Roles().click();
		  Thread.sleep(2000);
		  roles.editTransfusionist().click();
		  Thread.sleep(2000);
		  boolean b4 = editRole.checkBoxMayStartRapidTransfusionWithCosignature().isSelected();
		  if(!b4)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxMayStartRapidTransfusionWithCosignature().click(); 
		  }
		  else
		 {
				 Thread.sleep(2000);
		 }
		  Thread.sleep(2000);
		  editRole.buttonConfirm().click();
		  Thread.sleep(2000);
		  roles.editStudentTransfusionist().click();
		  Thread.sleep(2000);
		  boolean b5 = editRole.checkBoxMayStartRapidTransfusionWithCosignature().isSelected();
		  if(b5)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxMayStartRapidTransfusionWithCosignature().click(); 
		  }
		  else
		 {
				 Thread.sleep(1000);
		 }
		  boolean b6 = editRole.checkBoxMayStartRapidTransfusionWithoutCosignature().isSelected();
		  if(b6)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxMayStartRapidTransfusionWithoutCosignature().click(); 
		  }
		  else
		 {
				 Thread.sleep(1000);
		 }
		  editRole.buttonConfirm().click();
		  Thread.sleep(2000);
		  iedriver.close();
	}
	*/

  @Test
  public void mainTest() throws Throwable 
  {
      //Step 1
	  iedriver.callDriver(capribedside);
	  Thread.sleep(1000);
	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  login.login(superuser, password);
	  Thread.sleep(2000);
	  common.scanpatientid(patientA);
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 2
	  patientMenu.rapidStartTransfusionButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 3
	  Actions act = new Actions(iedriver.driver);
	  transCommon.rapidStartDonorCenterCode(3);
	  act.sendKeys(Keys.ENTER).perform();
	  //Step 4
	  Thread.sleep(2000);
	  rapidTransfusion.donorUnitNumber().sendKeys(unitNo,Keys.ENTER);
	  Thread.sleep(2000);
	  //Step 5
	  
	  transCommon.rapidStartDonorBloodProduct(5);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  Assert.assertEquals(rapidTransfusion.bloodProductAttribute().isDisplayed(),true);
	  //Step 6
	  rapidTransfusion.checkBoxBloodProductAttributeAntiCMVNegative().click();
	  Thread.sleep(2000);
	  rapidTransfusion.checkBoxBloodProductAttributeIrradiated().click();
	  Thread.sleep(2000);
	  rapidTransfusion.buttonSaveBloodAttribute().click();
	  Thread.sleep(2000);
	  //Step 7
	  rapidTransfusion.donorBloodProductExipreDate().sendKeys(nextDate,Keys.ENTER);
	  Thread.sleep(2000);
	  //Step 8
	  rapidTransfusion.selectDonorBloodType(bloodOpos);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 9
	  rapidTransfusion.donorComments().sendKeys("Test Comment");
	  Thread.sleep(2000);
	  //Step 10
	  rapidTransfusion.donorContinueButton().click();
	  Thread.sleep(2000);
	  
	  //Step 11
	  rapidTransfusion.buttonStartRapidTransfusion().click();
	  Thread.sleep(2000);
	  //Step 12
	  rapidTransfusion.buttonCancelRapidTransfusionReport().click();
	  Thread.sleep(2000);
	  //Step 13
	  rapidTransfusion.logoutRapidTransfusion();
	  Thread.sleep(2000);
	  login.login(user2, password);
	  Thread.sleep(2000);
	  common.scanpatientid(patientB);
	  //Step 14
	  patientMenu.rapidStartTransfusionButton().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 15
	  /*
	  transCommon.rapidStartDonorCenterCode(3);
	  act.sendKeys(Keys.ENTER).perform();
	  */
	  Thread.sleep(2000);
	  rapidTransfusion.donorUnitNumber().sendKeys(unitNo,Keys.ENTER);
	  Thread.sleep(2000);
	  //Step 16
	  
	  transCommon.rapidStartDonorBloodProduct(5);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  Assert.assertEquals(rapidTransfusion.bloodProductAttribute().isDisplayed(),true);
	  //Step 6
	  rapidTransfusion.checkBoxBloodProductAttributeAntiCMVNegative().click();
	  Thread.sleep(2000);
	  rapidTransfusion.checkBoxBloodProductAttributeIrradiated().click();
	  Thread.sleep(2000);
	  rapidTransfusion.buttonSaveBloodAttribute().click();
	  Thread.sleep(2000);
	  //Step 7
	  rapidTransfusion.donorBloodProductExipreDate().sendKeys(nextDate,Keys.ENTER);
	  Thread.sleep(2000);
	  //Step 8
	  rapidTransfusion.selectDonorBloodType(bloodOpos);
	  act.sendKeys(Keys.ENTER).perform();
	  Thread.sleep(2000);
	  //Step 9
	  rapidTransfusion.donorComments().sendKeys("Test Comment");
	  Thread.sleep(2000);
	  //Step 10
	  rapidTransfusion.donorContinueButton().click();
	  Thread.sleep(2000);
	  
	  //Step 11
	  rapidTransfusion.buttonStartRapidTransfusion().click();
	  Thread.sleep(2000);
	  //Step 12
	  rapidTransfusion.buttonCancelRapidTransfusionReport().click();
	  Thread.sleep(2000);
	  //Step 13
	  rapidTransfusion.logoutRapidTransfusion();
	  Thread.sleep(2000);
	  login.login(user2, password);
	  Thread.sleep(2000);
	  common.scanpatientid(patientB);
	  

	  
  }
}
