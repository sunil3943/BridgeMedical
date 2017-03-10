package common;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.LogStatus;

//import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_AdministerBottles;
import pageobjects.capribedside.Capribedside_page_CombineBottles;
import pageobjects.capribedside.Capribedside_page_DischargeBottles;
import pageobjects.capribedside.Capribedside_page_ReceiveBottles;
import pageobjects.capribedside.Capribedside_page_SelectPatient;
import pageobjects.capribedside.Capribedside_page_StateChange;

public class MilkManagementCommonFunctionality extends IEDriver

{
	Capribedside_page_SelectPatient selectPatient;
	String FilePath = "C:\\Temp\\MilkManagementCommonFunctionality.html";
	String TestName = "PatientIdentificationErrorTest";
//	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","MilkManagementCommonFunctionality");
	IEDriver iedriver = new IEDriver(FilePath, TestName);
	 
	 public void patientNotFoundErrorMsg() throws IOException
	    {
		 selectPatient = PageFactory.initElements(IEDriver.driver, Capribedside_page_SelectPatient.class );
	    	boolean wb = selectPatient.patientNotFoundErrorMsg().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("Patient not found.-Is displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	else
	    	{
	    		System.out.println("Error message for Patient not found. is not displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	
	    }
	 
	 Capribedside_page_ReceiveBottles receiveBottle;
	 public void patientNotMatchErrorMsg() throws IOException
	 {
		 receiveBottle = PageFactory.initElements(IEDriver.driver, Capribedside_page_ReceiveBottles.class );
	    	boolean wb = receiveBottle.patientNotMatchErrorMsg().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("The patient ID you entered does not match the patient ID of the current patient..-Is displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	else
	    	{
	    		System.out.println("Error message 'The patient ID you entered does not match the patient ID of the current patient'. is not displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
		 
	 }
	 public void duplicateBottleErrorMsg() throws IOException
	 {
		 receiveBottle = PageFactory.initElements(IEDriver.driver, Capribedside_page_ReceiveBottles.class );
	    	boolean wb = receiveBottle.duplicateBottleErrorMsg().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("The bottle number 'X' has already been received for this patient (no duplicates allowed).-Is displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	else
	    	{
	    		System.out.println("Error message 'The bottle number 'X' has already been received for this patient (no duplicates allowed)'. is not displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
		 
	 }
	 Capribedside_page_AdministerBottles admBottle;
	 public void bottleConnotBeAdministerForThisPatientErrorMsg() throws IOException
	 {
		 admBottle = PageFactory.initElements(IEDriver.driver, Capribedside_page_AdministerBottles.class );
	    	boolean wb = admBottle.bottleConnotBeAdministerForThisPatientErrorMsg().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("This bottle may not be administered to this patient.-Is displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	else
	    	{
	    		System.out.println("Error message 'This bottle may not be administered to this patient.' is not displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
		 
	 }
	 Capribedside_page_DischargeBottles disBottlePage;
	 public void bottleMayNotBeDischargeToThisPatientErrorMsg() throws IOException
	 {
		 disBottlePage = PageFactory.initElements(IEDriver.driver, Capribedside_page_DischargeBottles.class );
	    	boolean wb = disBottlePage.bottleMayNotBeDischargeToThisPatientErrorMsg().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("This bottle may not be discharged to this patient.-Is displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	else
	    	{
	    		System.out.println("Error message 'This bottle may not be discharged to this patient.' is not displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
		 
	 }
	 Capribedside_page_CombineBottles cmbnPage;
	 public void bottleMayNotBeCombineToThisPatientWarningMsg() throws IOException
	 {
		 cmbnPage = PageFactory.initElements(IEDriver.driver, Capribedside_page_CombineBottles.class );
	    	boolean wb = cmbnPage.bottleMayNotBeCombinedForThisPatienWarnMsg().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("This bottle may not be combined for this patient.-Is displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	else
	    	{
	    		System.out.println("Error message 'This bottle may not be combined for this patient.' is not displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
		 
	 }
	 
	 Capribedside_page_StateChange scPage;
	 public void warningBottleMayNotBezChangedForThisPatient() throws IOException
	 {
		 scPage = PageFactory.initElements(IEDriver.driver, Capribedside_page_StateChange.class );
	    	boolean wb = scPage.warningBottleMayNotBezChangedForThisPatient().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("This bottle may not be changed for this patient.-Is displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
	    	else
	    	{
	    		System.out.println("Error message 'This bottle may not be changed for this patient.' is not displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    	}
		 
	 }
	 
	 public void manualEntryErrorMsg() throws IOException
	 {
		 receiveBottle = PageFactory.initElements(IEDriver.driver, Capribedside_page_ReceiveBottles.class );
	    	boolean wb = receiveBottle.manualEntryErrorMsg().isDisplayed();
	    	if(wb)
	    	{
	    		System.out.println("Manual entry is not allowed. Scan the Patient's ID to continue.-Is displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    		iedriver.extent_Test().log(LogStatus.PASS, "Step 08 Passed");
	    	}
	    	else
	    	{
	    		System.out.println("Error message 'Manual entry is not allowed. Scan the Patient's ID to continue.'- is not displayed");
//	    		multiScreens.multiScreenShot(iedriver.driver);
	    		  iedriver.extent_Test().log(LogStatus.PASS, "Step 08 Passed");
	    	}
		 
	 }
	 


}
