package Regression;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_Login;
import pageobjects.capribedside.Capribedside_page_MainPatientPage;
import pageobjects.systemManager.EditRolePage;
import pageobjects.systemManager.RolesPage;
import pageobjects.systemManager.Sysman_page_Main;

public class BrowseTransfusionHistoryTest 
{
	String FilePath = "C:\\Temp\\BrowseTransfusionHistoryTest.html";
	String TestName = "BrowseTransfusionHistoryTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","BrowseTransfusionHistoryTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	Capribedside_page_Login login = new Capribedside_page_Login();
	Sysman_page_Main sysManagerMainPage = new Sysman_page_Main();
	Commonfunctionality common = new Commonfunctionality();
	Capribedside_page_MainPatientPage patientMenu = new  Capribedside_page_MainPatientPage();
	Capribedside_page_MainPatientPage mainPage = new Capribedside_page_MainPatientPage();
	StartTransfusionPage stTransPage = new StartTransfusionPage();
	BloodTransfusionCommonFunctionality transCommon = new BloodTransfusionCommonFunctionality();
	RolesPage roles = new RolesPage();
	EditRolePage editRole = new EditRolePage();
	HoldTransfusionPage holdTransPage = new HoldTransfusionPage();
	EndTransfusionPage endTrans = new EndTransfusionPage();
	BrowseTransfusionHistoryPage browseTransHistory = new BrowseTransfusionHistoryPage();
	AdministerDerivativesPage administerDerivative = new AdministerDerivativesPage();
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedside = "http://10.162.106.174/TransSpec2016010410/CapriBedside/Login.aspx";
	String superuser = "Superuser";
	String user2 = "cerner";
	String password = "123";
	String user1 = "rohan";
	String patientA = "635201";
	String racipientPatientID ="*635201";
	String patientName ="TIMMONS, BABY BOY";
	String unitNo= common.uniqueNumber();
	String unitNo2 = common.uniqueNumber2();
	String unitNo3 = common.uniqueNumber3();
    String nextDate = common.nextDate();
	/*
	@BeforeTest
	public void systemManagerPreSettingTest() throws InterruptedException
	{
		
		  iedriver.callDriver(sysmanUrl);
		  Thread.sleep(1000);
		  login.txt_box_username().sendKeys(superuser);
		  Thread.sleep(1000);
		  login.txt_box_password().sendKeys(password);
		  Thread.sleep(1000);
		  login.button_login().click();
		  Thread.sleep(1000);
		  sysManagerMainPage.button_Roles().click();
		  Thread.sleep(2000);
		  roles.editStudentTransfusionist().click();
		  Thread.sleep(2000);
		  boolean b1 = editRole.checkBoxAccessBrowseTransfusionHistory().isSelected();
		  if(b1)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxAccessBrowseTransfusionHistory().click(); 
		  }
		 
		  Thread.sleep(1000);
		  
		  boolean b2 = editRole.checkBoxMayCorrectTransfusion().isSelected();
		  if(b2)
		  {
			  Thread.sleep(1000);
			  editRole.checkBoxMayCorrectTransfusion().click();
		  }
		  Thread.sleep(1000);
		  editRole.buttonConfirm().click();
		  Thread.sleep(2000);
		  iedriver.close();
		  
		  
		  
		
	}*/
  @Test
  public void BrowseTransfusionHistoryTest() throws InterruptedException, IOException
  {
	  
	  //Step 1
	
	 
	  iedriver.callDriver(capribedside);
	  Thread.sleep(1000);
	 
	  //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  
	  login.txt_box_username().sendKeys(user1);
	  Thread.sleep(1000);
	  login.txt_box_password().sendKeys(password);
	  Thread.sleep(1000);
	  login.button_login().click();
	  Thread.sleep(1000);
	  iedriver.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	  common.scanpatientid(patientA);
	  Thread.sleep(2000);
	  Assert.assertEquals(patientMenu.buttonDitheredRrowseTransfusinHistory().isEnabled(),true);
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  patientMenu.button_logout().click();
	  Thread.sleep(1000);
	  //Step 2
	  login.txt_box_username().sendKeys(superuser);
	  Thread.sleep(1000);
	  login.txt_box_password().sendKeys(password);
	  Thread.sleep(1000);
	  login.button_login().click();
	  Thread.sleep(1000);
	  common.scanpatientid(patientA);
	  Thread.sleep(2000);
	  Assert.assertEquals(patientMenu.browseTransfusinHistoryButton().isDisplayed(),true);
	  Thread.sleep(1000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 3
	  
	  //Transfusion 1
	
	
	     stTransPage.startTransfusion(unitNo,racipientPatientID,patientName);
	     Thread.sleep(1000);
		 //Transfusion 2
	     stTransPage.startTransfusion(unitNo2,racipientPatientID,patientName);
	     Thread.sleep(1000);
	     
		 //Transfusion 3
	     stTransPage.startTransfusion(unitNo3,racipientPatientID,patientName);
	     Thread.sleep(1000);
	    
		 
		 //Hold T1
		 mainPage.holdTransfusionButton().click();
		 Thread.sleep(1000);
		 holdTransPage.editboxUnitNumber().sendKeys(unitNo,Keys.ENTER);
		 Thread.sleep(1000);
		 holdTransPage.selectBlodProduct(4);
		 Thread.sleep(1000);
		 holdTransPage.buttonContinue().click();
		 Thread.sleep(1000);
		 String currentDate = common.currentDate();
		 holdTransPage.startHoldDateAndTime().sendKeys(currentDate,Keys.ENTER);
		 Thread.sleep(1000);
		 holdTransPage.selectReasonForHold(1);
		 Thread.sleep(1000);
		 holdTransPage.endHoldDateAndTime().sendKeys(nextDate);
		 Thread.sleep(1000);
		 holdTransPage.buttonContinueHold().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 holdTransPage.buttonCancel().click();
		 Thread.sleep(2000);
		 
		 //End Transfusion t2
		 mainPage.endTransfusionButton().click();
		 Thread.sleep(2000);
		 endTrans.unitNumber().sendKeys(unitNo2,Keys.ENTER);
		 Thread.sleep(2000);
		 endTrans.selectBlodProduct(4);
		 Thread.sleep(1000);
		 endTrans.buttonContinueUnitProductSection().click();
		 Thread.sleep(1000);
		 endTrans.volumeTransferred().sendKeys("50");
		 Thread.sleep(1000);
		 endTrans.selectTransfusionReactionAnswer("No");
		 Thread.sleep(1000);
		 endTrans.buttonContinueVolumeSection().click();
		 Thread.sleep(1000);
		 endTrans.vitalsTempTextBoxFar().clear();
		 Thread.sleep(1000);	
		 endTrans.vitalsTempTextBoxFar().sendKeys("95");
		 Thread.sleep(2000);
		 
		 /*
		 endTrans.selectVitalsTempSite(2);
		 Thread.sleep(3000);
		 endTrans.vitalsHeartRateTextBox().sendKeys("82");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(4000);
		 endTrans.vitalsSystolicBloodPressureTextBox().sendKeys("120");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 endTrans.vitalsDiastolicBloodPressureTextBox().sendKeys("83");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(4000);
		 endTrans.vitalsRespirationTextBox().sendKeys("18");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(4000);
		 endTrans.vitalsOxygenSaturationTextBox().sendKeys("92");
		 Thread.sleep(3000);
		 */
	 
		 //act.sendKeys(Keys.ENTER).perform();
		 //Thread.sleep(5000);
		 endTrans.vitalsContinueButton().click();
		 Thread.sleep(2000);
		 endTrans.vitalsContinueButton().click();
		 Thread.sleep(2000);
		 endTrans.buttonCancelPrint().click();
		 Thread.sleep(2000);
		 
		 //End Transfusion T4
		  //Actions act = new Actions(iedriver.driver);
		 String unitNo4 = common.uniqueNumber();
		 //Thread.sleep(2000);
		 mainPage.endTransfusionButton().click();
		 Thread.sleep(2000);
		 endTrans.unitNumber().sendKeys(unitNo4,Keys.ENTER);
		 Thread.sleep(2000);
		 endTrans.buttonYesUnitNumberDoesNotMatchRecordedTrans().click();
		 Thread.sleep(2000);
		 endTrans.selectBlodProduct(4);
		 Thread.sleep(1000);
		 endTrans.buttonContinueUnitProductSection().click();
		 Thread.sleep(1000);
		 endTrans.buttonYesBloodProdDoesNotMatchRecordedTrans().click();
		 Thread.sleep(1000);
		 endTrans.volumeTransferred().sendKeys("50");
		 Thread.sleep(1000);
		 endTrans.selectTransfusionReactionAnswer("No");
		 Thread.sleep(1000);
		 endTrans.buttonContinueVolumeSection().click();
		 Thread.sleep(1000);
		 /*
		 endTrans.vitalsTempTextBoxFar().clear();
		 Thread.sleep(1000);
		 endTrans.vitalsTempTextBoxFar().sendKeys("95");
		 Thread.sleep(4000);
		 */
		 /*
		 endTrans.selectVitalsTempSite(2);
		 Thread.sleep(3000);
		 endTrans.vitalsHeartRateTextBox().clear();
		 Thread.sleep(1000);
		 endTrans.vitalsHeartRateTextBox().sendKeys("82");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(4000);
		 endTrans.vitalsSystolicBloodPressureTextBox().clear();
		 Thread.sleep(1000);
		 endTrans.vitalsSystolicBloodPressureTextBox().sendKeys("120");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(3000);
		 endTrans.vitalsDiastolicBloodPressureTextBox().clear();
		 Thread.sleep(1000);
		 endTrans.vitalsDiastolicBloodPressureTextBox().sendKeys("83");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(4000);
		 endTrans.vitalsRespirationTextBox().clear();
		 Thread.sleep(1000);
		 endTrans.vitalsRespirationTextBox().sendKeys("18");
		 act.sendKeys(Keys.ENTER).perform();
		 Thread.sleep(4000);
		 */
		 endTrans.vitalsOxygenSaturationTextBox().clear();
		 Thread.sleep(1000);
		 endTrans.vitalsOxygenSaturationTextBox().sendKeys("92");
		 Thread.sleep(3000);
		 //act.sendKeys(Keys.ENTER).perform();
		 //Thread.sleep(5000);
		 endTrans.vitalsContinueButton().click();
		 Thread.sleep(3000);
		 endTrans.vitalsContinueButton().click();
		 Thread.sleep(2000);
		 endTrans.buttonCancelPrint().click();
		 Thread.sleep(2000);
		 
		 //Administer Derivatives...
		 mainPage.administerDerivativeButton().click();
		 Thread.sleep(1000);
		 administerDerivative.selectBloodPlasmaDerivative("Test01");
		 Thread.sleep(2000);
		 administerDerivative.buttonContinue().click();
		 Thread.sleep(2000);
		 mainPage.browseTransfusinHistoryButton().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 4
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo+"')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 5
		 browseTransHistory.buttonReaction().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 6
		 browseTransHistory.buttonVitals().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 7
		 browseTransHistory.buttonChecks().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 8
		 browseTransHistory.buttonHold().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 9
		 browseTransHistory.buttonBackInfoPage().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo3+"')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 
		 //Step 10
		 browseTransHistory.buttonReaction().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 11
		 browseTransHistory.buttonVitals().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 12
		 browseTransHistory.buttonChecks().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 13
		 browseTransHistory.buttonHold().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 14
		 browseTransHistory.buttonBackInfoPage().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo2+"')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 15
		 browseTransHistory.buttonReaction().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 16
		 browseTransHistory.buttonVitals().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 17
		 browseTransHistory.buttonChecks().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 18
		 browseTransHistory.buttonHold().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 19
		 browseTransHistory.buttonBackInfoPage().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[1][td[contains(text(),'Test01')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 20
		 browseTransHistory.buttonBackInfoPage().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 21
		 browseTransHistory.buttonReaction().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 22
		 browseTransHistory.buttonVitals().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 23
		 browseTransHistory.buttonChecks().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		//Step 24
		 browseTransHistory.buttonHold().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 25
		 browseTransHistory.buttonBackInfoPage().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td/a[@class='icon-pencil icon-large']")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 26
		 String currentDate1 = common.currentDate();
		 browseTransHistory.endTransfusionDate().clear();
		 Thread.sleep(1000);
		 browseTransHistory.endTransfusionDate().sendKeys(currentDate1);
		 Thread.sleep(2000);
		 browseTransHistory.volumeTransfused().clear();
		 Thread.sleep(1000);
		 browseTransHistory.volumeTransfused().sendKeys("100");
		 Thread.sleep(2000);
		 browseTransHistory.buttonConfirEditTransm().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 27
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td[4]/Span/a")).click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td[6]/Span/a")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 28
		 
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 29
		 browseTransHistory.buttonBackInfoPage().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[2][td[contains(text(),'Test01')]]/td[1]/a")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 30
		 String currentDate2 = common.currentDate();
		 Thread.sleep(1000);
		 browseTransHistory.administerDateTime().clear();
		 Thread.sleep(1000);
		 browseTransHistory.administerDateTime().sendKeys(currentDate2);
		 Thread.sleep(2000);
		 browseTransHistory.buttonConfirmEditBloodPlasmaDerivative().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 31
		 iedriver.driver.findElement(By.xpath("//tr[1][td[contains(text(),'Test01')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 32
		 
		 
		 browseTransHistory.linkLogout().click();
		 Thread.sleep(1000);
		 login.txt_box_username().sendKeys(user2);
		 Thread.sleep(2000);
		 login.txt_box_password().sendKeys(password);
		 Thread.sleep(2000);
		 login.button_login().click();
		 Thread.sleep(2000);
		 common.scanpatientid(patientA);
		 Thread.sleep(2000);
		  //Assert.assertEquals(patientMenu.browseTransfusinHistoryButton().isDisplayed(),true);
		 Thread.sleep(1000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 mainPage.browseTransfusinHistoryButton().click();
		 Thread.sleep(2000);
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td/a[@class='icon-pencil icon-large']")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 33
		 String currentDate3 = common.currentDate();
		 browseTransHistory.endTransfusionDate().clear();
		 Thread.sleep(1000);
		 browseTransHistory.endTransfusionDate().sendKeys(currentDate3);
		 Thread.sleep(2000);
		 Thread.sleep(2000);
		 browseTransHistory.selectBloodProductEditTrans(5);
		 Thread.sleep(2000);
		 browseTransHistory.volumeTransfused().clear();
		 Thread.sleep(1000);
		 browseTransHistory.volumeTransfused().sendKeys("75");
		 Thread.sleep(2000);
		 browseTransHistory.buttonConfirEditTransm().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 34
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td[4]/Span/a")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 35
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo4+"')]]/td[5]/Span/a")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 36
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo2+"')]]/td[7]/a")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 //Step 37
		 browseTransHistory.checkboxAnaphylaxis().click();
		 Thread.sleep(1000);
		 browseTransHistory.checkboxDyspneaNausea().click();
		 Thread.sleep(1000);
		 browseTransHistory.buttonConfirmPostTransfusion().click();
		 Thread.sleep(2000);
		 Assert.assertEquals(browseTransHistory.headerReactionInstruction().isEnabled(),true);
		 Thread.sleep(1000);
		 // Step 38
		 browseTransHistory.buttonConfirmReactionInstruction().click();
		 Thread.sleep(2000);
		 endTrans.vitalsOxygenSaturationTextBox().clear();
		 Thread.sleep(1000);
		 endTrans.vitalsOxygenSaturationTextBox().sendKeys("92");
		 Thread.sleep(3000);
		 //act.sendKeys(Keys.ENTER).perform();
		 //Thread.sleep(5000);
		 endTrans.vitalsContinueButton().click();
		 Thread.sleep(3000);
		 endTrans.vitalsContinueButton().click();
		 Thread.sleep(2000);
		 browseTransHistory.buttonCancelPostTransfusionReport().click();
		 Thread.sleep(2000);
		 //Step 39
		 iedriver.driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo2+"')]]/td/a/img")).click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		 
		 browseTransHistory.buttonReaction().click();
		 Thread.sleep(2000);
		 multiScreens.multiScreenShot(iedriver.driver);
		
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 iedriver.driver.close();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 			
		 
		 
	  
	  
	  
	  
	  
	  
  }
}
