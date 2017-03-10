package Hazards;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import capribedsidereportspageobjects.ParametersReportPage;
import capribedsidereportspageobjects.SelectReportsPage;
import common.Commonfunctionality;
import common.IEDriver;
import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_AdministerBottles;
import pageobjects.capribedside.Capribedside_page_BrowseBottleHistory;
import pageobjects.capribedside.Capribedside_page_CombineBottles;
import pageobjects.capribedside.Capribedside_page_DischargeBottles;
import pageobjects.capribedside.Capribedside_page_Login;
import pageobjects.capribedside.Capribedside_page_MainPatientPage;
import pageobjects.capribedside.Capribedside_page_PrepareBottles;
import pageobjects.capribedside.Capribedside_page_ReceiveBottles;
import pageobjects.capribedside.Capribedside_page_SelectPatient;
import pageobjects.capribedside.Capribedside_page_StateChange;
import pageobjects.capribedside.SelectPrinterPage;
import pageobjects.systemManager.BreastMilkSettingsPage;
import pageobjects.systemManager.Sysman_page_Main;

public class ReleaseOfUnsuitableBreastMilkTest   
{
	
	String FilePath = "C:\\Temp\\PatientCareCompromisedDueToReleaseOfUnsuitableProductTest.html";
	String TestName = "PatientIdentificationErrorTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","PatientCareCompromisedDueToReleaseOfUnsuitableProductTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	
	
	Capribedside_page_MainPatientPage patientPage = new Capribedside_page_MainPatientPage();
	Capribedside_page_SelectPatient selectPatient = new Capribedside_page_SelectPatient();
	Commonfunctionality cmnfun = new Commonfunctionality();
	Capribedside_page_ReceiveBottles recBottle = new Capribedside_page_ReceiveBottles();
	Sysman_page_Main sysMain = new Sysman_page_Main();
	BreastMilkSettingsPage milkSet = new BreastMilkSettingsPage();
	Capribedside_page_Login login = new Capribedside_page_Login();
	Capribedside_page_StateChange state = new Capribedside_page_StateChange();
	Capribedside_page_CombineBottles combine = new Capribedside_page_CombineBottles();
	Capribedside_page_PrepareBottles prepare = new Capribedside_page_PrepareBottles();
	Capribedside_page_AdministerBottles admin = new Capribedside_page_AdministerBottles();
	Capribedside_page_DischargeBottles discharge = new Capribedside_page_DischargeBottles();
	Capribedside_page_BrowseBottleHistory browse = new Capribedside_page_BrowseBottleHistory();
	SelectPrinterPage printer = new SelectPrinterPage();
	SelectReportsPage reports = new SelectReportsPage();
	ParametersReportPage parameter = new ParametersReportPage();
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedsideUrl = "http://10.162.106.174/TransSpec2016010410/capribedside/Login.aspx";
	String patientId = "635201";
	String bottle1= cmnfun.uniqueNumber();
	String bottle2 = cmnfun.uniqueNumber2();
	String bottle3 = cmnfun.uniqueNumber3();
	String yestDate = cmnfun.yestDate();
	String present = cmnfun.currentDate();
	String report7 = "Breast Milk Barcode Compliance";
	
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
		  
		 
		
	}
	

  @Test
  public void mainTest() throws InterruptedException, IOException
  {
	  //Step 1
	  iedriver.callDriver(capribedsideUrl);
	  
	  login.txt_box_username().sendKeys("superuser");
	  Thread.sleep(1000);
	  login.txt_box_password().sendKeys("123");
	  Thread.sleep(1000);
	  login.button_login().click();
	  Thread.sleep(2000);
	  cmnfun.scanpatientid("635201");
	  Thread.sleep(2000);
	  patientPage.button_ReceiveBottles().click();
	  Thread.sleep(2000);
	  recBottle.txt_box_BottlePatientID().sendKeys(patientId);
	  Thread.sleep(2000);
	  recBottle.txt_box_BottlePatientID().sendKeys(Keys.ENTER);
	  Thread.sleep(5000);
	  recBottle.txt_box_Bottlenumber().sendKeys(bottle1);
	  recBottle.txt_box_Bottlenumber().sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  if (recBottle.button_BottlenumberWarningYes().isDisplayed())
		{
			recBottle.button_BottlenumberWarningYes().click();
		}
		Thread.sleep(3000);
	 recBottle.txt_box_CollectedDateTime().clear();
	 recBottle.txt_box_CollectedDateTime().sendKeys(yestDate);
	 Thread.sleep(1000);
	 recBottle.dropDwn_StorageState().selectByValue("Fresh");
	 Thread.sleep(2000);
	 recBottle.button_Confirm().click();
	 Thread.sleep(3000);
	 //Remove this step
	 
	 //recBottle.button_Exit().click();
	 Thread.sleep(3000);
		//Bottle 2
	 
	 recBottle.txt_box_BottlePatientID().sendKeys(patientId);
	  Thread.sleep(2000);
	  recBottle.txt_box_BottlePatientID().sendKeys(Keys.ENTER);
	  Thread.sleep(5000);
	  recBottle.txt_box_Bottlenumber().sendKeys(bottle2);
	  recBottle.txt_box_Bottlenumber().sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  if (recBottle.button_BottlenumberWarningYes().isDisplayed())
		{
			recBottle.button_BottlenumberWarningYes().click();
		}
		Thread.sleep(3000);
	 recBottle.txt_box_CollectedDateTime().clear();
	 recBottle.txt_box_CollectedDateTime().sendKeys(yestDate);
	 Thread.sleep(1000);
	 recBottle.dropDwn_StorageState().selectByValue("Fresh");
	 Thread.sleep(2000);
	 recBottle.button_Confirm().click();
	 Thread.sleep(3000);
	 //Bottle 3
	 /*
	 recBottle.txt_box_BottlePatientID().sendKeys(patientId);
	  Thread.sleep(2000);
	  recBottle.txt_box_BottlePatientID().sendKeys(Keys.ENTER);
	  Thread.sleep(5000);
	  recBottle.txt_box_Bottlenumber().sendKeys(bottle3);
	  recBottle.txt_box_Bottlenumber().sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  if (recBottle.button_BottlenumberWarningYes().isDisplayed())
		{
			recBottle.button_BottlenumberWarningYes().click();
		}
		Thread.sleep(3000);
	 recBottle.txt_box_CollectedDateTime().clear();
	 recBottle.txt_box_CollectedDateTime().sendKeys(collectDate);
	 Thread.sleep(1000);
	 recBottle.dropDwn_StorageState().selectByValue("Fresh");
	 Thread.sleep(2000);
	 recBottle.button_Confirm().click();
	 Thread.sleep(3000);
	 multiScreens.multiScreenShot(iedriver.driver);
	 */
	 recBottle.button_Exit().click();
	 Thread.sleep(3000);
	 
	 //Step 2
	 patientPage.button_StateChange().click();
	 Thread.sleep(2000);
	 
	 state.txt_box_BottleNumber().sendKeys("54321",Keys.ENTER);
	 multiScreens.multiScreenShot(iedriver.driver);
	 Thread.sleep(2000);
	 String errMsg = state.errMsgBottleNotReceived().getText();
	 System.out.println(errMsg);
	 //Step 3
	 state.txt_box_BottleNumber().clear();
	 state.txt_box_BottleNumber().sendKeys(bottle1,Keys.ENTER);
	 multiScreens.multiScreenShot(iedriver.driver);
	 Thread.sleep(2000);
	 //Step 4
	 state.button_Exit().click();
	 Thread.sleep(2000);
	 patientPage.button_CombineBottles().click();
	 Thread.sleep(2000);
	 combine.txt_box_BottleNumber().sendKeys("54321",Keys.ENTER);
	 multiScreens.multiScreenShot(iedriver.driver);
	 Thread.sleep(2000);
	 String errMsg2 = combine.errMsgBottleNotReceived().getText();
	 System.out.println(errMsg);
	 //Step 5
	 combine.txt_box_BottleNumber().clear();
	 combine.txt_box_BottleNumber().sendKeys(bottle2,Keys.ENTER);
	 multiScreens.multiScreenShot(iedriver.driver);
	 Thread.sleep(2000);
	 //Step 6
	 combine.button_Exit().click();
	 Thread.sleep(2000);
	 patientPage.button_PrepareBottles().click();
	 Thread.sleep(2000);
	 prepare.txt_box_BottleNumber().sendKeys("87654",Keys.ENTER);
	 multiScreens.multiScreenShot(iedriver.driver);
	 Thread.sleep(2000);
	 String errMsg3 = prepare.errMsgBottleNotReceived().getText();
	 System.out.println(errMsg3);
	 //Step 7
	 prepare.txt_box_BottleNumber().clear();
	 prepare.txt_box_BottleNumber().sendKeys(bottle1,Keys.ENTER);
	 Thread.sleep(2000);
	 //prepare.button_Warning_popUp_Yes().click();
	 //Thread.sleep(2000);
	 prepare.thawDate().clear();
	 prepare.thawDate().sendKeys(present,Keys.ENTER);
	 Thread.sleep(2000);
	 prepare.button_Confirm().click();
	 Thread.sleep(2000);
	 prepare.txt_box_BottleNumber().sendKeys(bottle2,Keys.ENTER);
	 Thread.sleep(2000);
	 prepare.button_Confirm().click();
	 Thread.sleep(2000);
	 prepare.txt_box_BottleNumber().sendKeys(bottle3,Keys.ENTER);
	 Thread.sleep(2000);
	 prepare.button_Confirm().click();
	 Thread.sleep(2000);
	 multiScreens.multiScreenShot(iedriver.driver);
	 //Step 8
	 prepare.button_Exit().click();
	 Thread.sleep(2000);
	 patientPage.button_AdministerBottles().click();
	 Thread.sleep(2000);
	 admin.txt_box_bottlenumber().sendKeys("8700",Keys.ENTER);
	 multiScreens.multiScreenShot(iedriver.driver);
	 Thread.sleep(2000);
	 String errMsg4 = admin.errMsgBottleNotReceived().getText();
	 System.out.println(errMsg4);
	 //Step 9
	 admin.txt_box_bottlenumber().clear();
	 admin.txt_box_bottlenumber().sendKeys(bottle1,Keys.ENTER);
	 Thread.sleep(2000);
	 //prepare.button_Warning_popUp_Yes().click();
	 //Thread.sleep(2000);
	 multiScreens.multiScreenShot(iedriver.driver);
	 Thread.sleep(2000);
	 //Step 10
	 admin.button_Exit().click();
	 Thread.sleep(2000);
	 patientPage.button_DischargeBottles().click();
	 Thread.sleep(2000);
	 discharge.txt_box_bottlenumber().sendKeys("8701",Keys.ENTER);
	 multiScreens.multiScreenShot(iedriver.driver);
	 Thread.sleep(2000);
	 String errMsg5 = discharge.errMsgBottleNotReceived().getText();
	 System.out.println(errMsg5);
	 //Step 11
	 discharge.txt_box_bottlenumber().clear();
	 discharge.txt_box_bottlenumber().sendKeys(bottle1,Keys.ENTER);
	 multiScreens.multiScreenShot(iedriver.driver);
	 Thread.sleep(4000);
	 //Step 12	
	 discharge.button_Exit().click();
	 Thread.sleep(2000);
	 
	 patientPage.button_PrepareBottles().click();
	 Thread.sleep(2000);
	 prepare.txt_box_BottleNumber().sendKeys(bottle2,Keys.ENTER);
	 Thread.sleep(2000);
	 prepare.button_Divide().click();
	 Thread.sleep(2000);
	 prepare.btnPrintDivideBottle().click();
	 Thread.sleep(3000);
	 printer.btnPrint().click();
	 Thread.sleep(7000);
	 prepare.button_Exit().click();
	 Thread.sleep(2000);
	 
	 //Step 13
	 patientPage.button_BrowseBottleHistory().click();
	 multiScreens.multiScreenShot(iedriver.driver);
	 Thread.sleep(3000);
	 browse.editDevidedBottle().click();
	 //browse.verifyDevidedBottle().click();
	 multiScreens.multiScreenShot(iedriver.driver);
	 Thread.sleep(2000);
	 //Step 14
	 browse.button_Back().click();
	 Thread.sleep(2000);
	 patientPage.changePatientButton().click();
	 Thread.sleep(2000);
	 selectPatient.linkReports().click();
	 Thread.sleep(1000);
	 reports.selectReport(report7);
	 Thread.sleep(3000);
	 reports.btnGo().click();
	 Thread.sleep(2000);
	 parameter.fromDate().sendKeys(yestDate);
	 Thread.sleep(1000);
	 parameter.btnDisplay().click();
	 
	 
      
	 
	 
	
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
  }
  /*
  @AfterTest
  public void restoreSettingsTest() throws InterruptedException
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
	  milkSet.textBoxFreshExpTimeLength().sendKeys("6");
	  Thread.sleep(2000);
	  milkSet.selectFreshExpTimeUnit("hours");
	  Thread.sleep(2000);
	  milkSet.btnConfirm().click();
	  Thread.sleep(1000);
	  sysMain.linkLogout().click();
	  Thread.sleep(2000);
	  iedriver.close();
	  
  }
  /*/
  @AfterClass
  public void afterClassTest()
  {
	  iedriver.close();
  }
 
}
