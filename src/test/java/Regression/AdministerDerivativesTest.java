package Regression;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import capribedsidetransfusionpageobjects.AdministerDerivativesPage;
import capribedsidetransfusionpageobjects.BrowseTransfusionHistoryPage;
import capribedsidetransfusionpageobjects.EndTransfusionPage;
import capribedsidetransfusionpageobjects.HoldTransfusionPage;
import capribedsidetransfusionpageobjects.StartTransfusionPage;
import common.BloodTransfusionCommonFunctionality;
import common.Commonfunctionality;
import common.IEDriver;
//import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_Login;
import pageobjects.capribedside.Capribedside_page_MainPatientPage;
import pageobjects.systemManager.EditRolePage;
import pageobjects.systemManager.RolesPage;
import pageobjects.systemManager.Sysman_page_Main;

public class AdministerDerivativesTest 
{
	String FilePath = "C:\\Temp\\BrowseTransfusionHistoryTest.html";
	String TestName = "BrowseTransfusionHistoryTest";
//	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","BrowseTransfusionHistoryTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	Capribedside_page_Login login = new Capribedside_page_Login();
	Sysman_page_Main sysManagerMainPage = new Sysman_page_Main();
	Commonfunctionality common = new Commonfunctionality();
	Capribedside_page_MainPatientPage patientMenu = new  Capribedside_page_MainPatientPage();
	Capribedside_page_MainPatientPage mainPage = new Capribedside_page_MainPatientPage();
	RolesPage roles = new RolesPage();
	EditRolePage editRole = new EditRolePage();
	BrowseTransfusionHistoryPage browseTransHistory = new BrowseTransfusionHistoryPage();
	AdministerDerivativesPage administerDerivative = new AdministerDerivativesPage();
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedside = "http://10.162.106.174/TransSpec2016010410/CapriBedside/Login.aspx";
	String superuser = "Superuser";
	String password = "123";
	String user1 = "jj";
	String patientA = "635201";
	
	
  @Test
  public void AdministerDerivativesTest() throws InterruptedException 
  {
	  //Step 1
	  iedriver.callDriver(capribedside);
	  Thread.sleep(1000);
	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  login.txt_box_username().sendKeys(superuser);
	  Thread.sleep(1000);
	  login.txt_box_password().sendKeys(password);
	  Thread.sleep(1000);
	  login.button_login().click();
	  Thread.sleep(1000);
	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  common.scanpatientid(patientA);
	  Thread.sleep(2000);
	  //Step 2
	  patientMenu.administerDerivativeButton().click();
	  Thread.sleep(2000);
	  //Step 4
	  administerDerivative.admisnisterDerivative("Test02","O pos", patientA, "TIMMONS, BABY BOY", "001", "01", "96", "Left Arm", "01", "75", "80");
	  Thread.sleep(2000);
	  //Step 5
	  patientMenu.button_logout().click();
	  login.txt_box_username().sendKeys(user1);
	  Thread.sleep(1000);
	  login.txt_box_password().sendKeys(password);
	  Thread.sleep(1000);
	  login.button_login().click();
	  Thread.sleep(1000);
	  common.scanpatientid(patientA);
	  Thread.sleep(2000);
	  //Step 6
	  patientMenu.administerDerivativeButton().click();
	  Thread.sleep(2000);
	  //Step 07
	  administerDerivative.admisnisterDerivative("Test02","O pos", patientA, "TIMMONS, BABY BOY", "002", "02", "98", "Right Arm", "02", "85", "90");
	  Thread.sleep(2000);
	  //Step 08
	  //Step 09
	  administerDerivative.userId().sendKeys(superuser);
	  Thread.sleep(2000);
	  administerDerivative.password().sendKeys(password);
	  Thread.sleep(2000);
	  administerDerivative.buttonContinue().click();
	  Thread.sleep(2000);
	  //Step 10
	  patientMenu.browseTransfusinHistoryButton().click();
	  Thread.sleep(2000);
	  iedriver.driver.close();
	  
	  /*
	  Assert.assertEquals(administerDerivative.dropdownBloodPlasmaDerivative().isEnabled(),true);
	  Thread.sleep(1000);
	  administerDerivative.selectBloodPlasmaDerivative("Test02");
	  Thread.sleep(3000);
	  administerDerivative.patientID().sendKeys("635201");
	  Thread.sleep(2000);
	  administerDerivative.patientName().sendKeys("TIMMONS, BABY BOY");
	  Thread.sleep(2000);
	  administerDerivative.selectPatientBloodType("O pos");
	  Thread.sleep(2000);
	  administerDerivative.manufacturee().sendKeys("001");
	  Thread.sleep(2000);
	  administerDerivative.lotNumber().sendKeys("01");
	  Thread.sleep(2000);
	  administerDerivative.iuConcentration().sendKeys("96");
	  Thread.sleep(2000);
	  administerDerivative.selectInjectionSite("Left Arm");
	  Thread.sleep(2000);
	  administerDerivative.serialNumber().sendKeys("01");
	  Thread.sleep(2000);
	  administerDerivative.volume().sendKeys("75");
	  Thread.sleep(2000);
	  administerDerivative.Expires().sendKeys(nextDate);
	  Thread.sleep(2000);
	  administerDerivative.quantity().sendKeys("80");
	  Thread.sleep(2000);
	  administerDerivative.buttonContinue().click();
	  */
	  
  }
}
