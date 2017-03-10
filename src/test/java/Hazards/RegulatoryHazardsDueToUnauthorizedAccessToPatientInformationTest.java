package Hazards;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import capribedsidespecimencepageobjects.CollectSpecimenPage;
import common.CapribedsideNavigation;
import common.Commonfunctionality;
import common.IEDriver;
import common.LoginToCapribedside;
import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_Login;
import pageobjects.capribedside.Capribedside_page_MainPatientPage;
import pageobjects.capribedside.Capribedside_page_SelectPatient;
import pageobjects.capribedside.ExpiredPasswordPage;
import pageobjects.systemManager.LoginSettings;
import pageobjects.systemManager.Sysman_page_Main;
import pageobjects.systemManager.UsersPage;

public class RegulatoryHazardsDueToUnauthorizedAccessToPatientInformationTest extends LoginToCapribedside
{
	String FilePath = "C:\\Temp\\RegulatoryHazardsDueToUnauthorizedAccessToPatientInformationTest.html";
	String TestName = "PatientIdentificationErrorTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","RegulatoryHazardsDueToUnauthorizedAccessToPatientInformationTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	Capribedside_page_MainPatientPage mainPatPage = new Capribedside_page_MainPatientPage();
	Capribedside_page_SelectPatient selectPatient = new Capribedside_page_SelectPatient();
	Commonfunctionality cmfun = new Commonfunctionality();
	Capribedside_page_Login login = new Capribedside_page_Login();
	CollectSpecimenPage colSpec = new CollectSpecimenPage();
	Sysman_page_Main sysMain = new Sysman_page_Main();
	LoginSettings logset = new LoginSettings();
	ExpiredPasswordPage expPass = new ExpiredPasswordPage();
	UsersPage userPage = new UsersPage();
	LoginToCapribedside capribedside = new LoginToCapribedside();
	//Capribedside_page_Login login = new Capribedside_page_Login();
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedsideUrl = "http://10.162.106.174/TransSpec2016010410/capribedside/Login.aspx";
	String patientA = "1010124";
	String patientB = "635201";
	String user2 = "mary";
	String user3 = "ronald";
	String user4 = "john";
	String user5 = "sara";
	
  @Test
  public void regulatoryHazardsTest() throws InterruptedException, IOException 
  {
	  //Actions act = new Actions(driver);
	  //Step 1
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 01 Passed");
	  //Step 2
	  cmfun.scanpatientid(patientA);
	  Thread.sleep(1000);
	  mainPatPage.buttonCollectSpecimens().click();
	  Thread.sleep(1000);
	  colSpec.checkBoxOrderMetabolic().click();
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  Thread.sleep(1000);
	  colSpec.linkLogout().click();
	  Thread.sleep(1000);
	  colSpec.buttonYeslogoutPopup().click();
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 02 Passed");
	  //Step 3
	  Thread.sleep(1000);
	  login.txt_box_username().sendKeys(user2);
	  login.txt_box_password().sendKeys("123");
	  login.button_login().click();
	  Thread.sleep(1000);
	  cmfun.scanpatientid(patientA);
	  Thread.sleep(1000);
	  mainPatPage.buttonCollectSpecimens().click();
	  Thread.sleep(1000);
	  colSpec.checkBoxOrderMetabolic().click();
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  Thread.sleep(1000);
	  colSpec.linkLogout().click();
	  Thread.sleep(2000);
	  colSpec.buttonYeslogoutPopup().click();
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 03 Passed");
	  //Step 4
	  Thread.sleep(1000);
	  login.txt_box_username().sendKeys(user3);
	  login.txt_box_password().clear();
	  login.txt_box_password().sendKeys("123");
	  login.button_login().click();
	  Thread.sleep(1000);
	  cmfun.scanpatientid(patientA);
	  multiScreens.multiScreenShot(iedriver.driver);
	  Thread.sleep(1000);
	  mainPatPage.button_logout().click();
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 04 Passed");
	  //Step 5
	  Thread.sleep(1000);
	  login.txt_box_username().sendKeys(user4);
	  login.txt_box_password().sendKeys("1234");
	  login.button_login().click();
	  Thread.sleep(2000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  Thread.sleep(1000);
	  String errMsg = login.errMsgNoPrivilegeToAccessBridgeMedical().getText();
	  System.out.println(errMsg);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 05 Passed");
	  //step 6
	  Thread.sleep(1000);
	  login.txt_box_username().clear();
	  login.txt_box_username().sendKeys(user5);
	  login.txt_box_password().clear();
	  login.txt_box_password().sendKeys("123");
	  login.button_login().click();
	  Thread.sleep(1000);
	  cmfun.scanpatientid(patientB);
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  Thread.sleep(1000);
	  mainPatPage.button_logout().click();
	  Thread.sleep(1000);
	  driver.close();
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 06 Passed");
	  //Step 7
	  cmfun.login_default(sysmanUrl);
	  Thread.sleep(1000);
	  sysMain.button_LoginSettings().click();
	  Thread.sleep(1000);
	  logset.selectForceChangePassword("every day");
	  Thread.sleep(1000);
	  logset.btnConfirm().click();
	  Thread.sleep(1000);
	  sysMain.linkLogout().click();
	  driver.close();
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 07 Passed");
	  //Stpe 8
	  
	  cmfun.login_default(capribedsideUrl);
	  /*
	  capribedside.preExecutionTest();
	  Thread.sleep(1000);
	  login.txt_box_username().sendKeys("Superuser");
	  Thread.sleep(1000);
	  login.txt_box_password().sendKeys("123");
	  Thread.sleep(1000);
	  login.button_login().click();
	  */
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  Thread.sleep(1000);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 08 Passed");
	  //Stpe 9
	  expPass.textBoxNewPassword().sendKeys("12345");
	  Thread.sleep(1000);
	  expPass.textBoxConfirmPassword().sendKeys("12345");
	  Thread.sleep(1000);
	  expPass.btnOK().click();;
	  multiScreens.multiScreenShot(iedriver.driver);
	  Thread.sleep(2000);
	  mainPatPage.button_logout().click();
	  driver.close();
	  Thread.sleep(2000);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 09 Passed");
	  //Step 10
	  cmfun.login_default(capribedsideUrl);
  }
  @AfterTest
  public void restorChangesTest() throws InterruptedException
  {
	  //Sysman restoring changes..
	  
	  iedriver.callDriver(sysmanUrl);
	  Capribedside_page_Login login = new Capribedside_page_Login();
	  login.txt_box_username().sendKeys("superuser");
	  Thread.sleep(2000);
	  login.txt_box_password().sendKeys("12345");
	  Thread.sleep(2000);
	  login.button_login().click();
	  //Thread.sleep(1000);
	  /*
	  expPass.textBoxNewPassword().sendKeys("12345");
	  Thread.sleep(1000);
	  expPass.textBoxConfirmPassword().sendKeys("12345");
	  Thread.sleep(2000);
	  expPass.btnOK().click();
	  */
	  Thread.sleep(2000);
	  sysMain.button_LoginSettings().click();
	  Thread.sleep(2000);
	  logset.selectForceChangePassword("Never");
	  Thread.sleep(2000);
	  logset.btnConfirm().click();
	  Thread.sleep(2000);
	  sysMain.button_Users().click();
	  Thread.sleep(2000);
	  userPage.editSuperuser().click();
	  Thread.sleep(2000);
	  userPage.textBoxPassword().clear();
	  userPage.textBoxPassword().sendKeys("123");
	  Thread.sleep(2000);
	  userPage.textReenterPassword().clear();
	  userPage.textReenterPassword().sendKeys("123");
	  Thread.sleep(2000);
	  userPage.btnConfirm().click();
	  Thread.sleep(2000);
	  sysMain.linkLogout().click();
	  Thread.sleep(2000);
	  driver.close();
	  
  }
 
}