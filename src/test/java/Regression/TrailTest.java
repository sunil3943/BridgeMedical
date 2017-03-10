package Regression;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import capribedsidetransfusionpageobjects.AdministerDerivativesPage;
import capribedsidetransfusionpageobjects.EndTransfusionPage;
import capribedsidetransfusionpageobjects.HoldTransfusionPage;
import capribedsidetransfusionpageobjects.StartTransfusionPage;
import common.BloodTransfusionCommonFunctionality;
import common.CapribedsideNavigation;
import common.Commonfunctionality;
import common.IEDriver;
import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_Login;
import pageobjects.capribedside.Capribedside_page_MainPatientPage;
import pageobjects.systemManager.EditRolePage;
import pageobjects.systemManager.RolesPage;
import pageobjects.systemManager.Sysman_page_Main;

public class TrailTest extends CapribedsideNavigation
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
	AdministerDerivativesPage administerDerivative = new AdministerDerivativesPage();
	String sysmanUrl = "http://10.162.106.174/TransSpec2016010410/systemmanager/Login.aspx";
	String capribedside = "http://10.162.106.174/TransSpec2016010410/CapriBedside/Login.aspx";
	String superuser = "Superuser";
	String password = "123";
	String user1 = "rohan";
	String patientA = "635201";
	String racipientPatientID ="*635201";
	String patientName ="TIMMONS, BABY BOY";
	String unitNo= common.uniqueNumber();
    //String unitNo = uniqueNo;
	String unitNo2 = common.uniqueNumber2();
	String unitNo3 = common.uniqueNumber3();
    String nextDate = common.nextDate();
  @Test
  public void trailTest() throws InterruptedException, IOException
  {
	  stTransPage.startTransfusion(unitNo,racipientPatientID,patientName);
	  Thread.sleep(1000);
	  mainPage.browseTransfusinHistoryButton().click();
	  Thread.sleep(1000);
	  driver.findElement(By.xpath("//tr[td[contains(text(),'"+unitNo+"')]]/td/a/img")).click();
	  Thread.sleep(10000);
	  
  }
}
