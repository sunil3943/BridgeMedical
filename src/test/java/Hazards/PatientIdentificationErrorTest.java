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

import java.awt.AWTException;
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
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import capribedsidetransfusionpageobjects.StartTransfusionPage;
import common.Commonfunctionality;
import common.IEDriver;
import common.LoginToCapribedside;
import common.MilkManagementCommonFunctionality;
import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_AdministerBottles;
import pageobjects.capribedside.Capribedside_page_MainPatientPage;
import pageobjects.capribedside.Capribedside_page_SelectPatient;
import pageobjects.capribedside.ConfirmPatientPage;

public class PatientIdentificationErrorTest extends LoginToCapribedside
{
	String FilePath = "C:\\Temp\\PatientIdentificationErrorTest.html";
	String TestName = "PatientIdentificationErrorTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","PatientIdentificationErrorTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	Commonfunctionality fun = new Commonfunctionality();
    Capribedside_page_AdministerBottles cap = new Capribedside_page_AdministerBottles();
    Capribedside_page_MainPatientPage mainPatPage = new Capribedside_page_MainPatientPage();
    ConfirmPatientPage conPat = new ConfirmPatientPage();
    StartTransfusionPage stTrans = new StartTransfusionPage();
    Capribedside_page_SelectPatient selectPatient = new Capribedside_page_SelectPatient();
    //IEDriver iedriver = new IEDriver();
    String patientA="635201";
    String patientB = "635202";
    String patientNameA = "TIMMONS, BABY BOY";
    /*
    private static ScreenRecorder screenRecorder;
    @BeforeTest
    public void preTest() throws IOException, AWTException
    {
    	GraphicsConfiguration gc = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice().getDefaultConfiguration();
    	this.screenRecorder = new ScreenRecorder(gc,
    	new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey, MIME_AVI),
    	new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
    	CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,DepthKey, 24, FrameRateKey, Rational.valueOf(15),QualityKey, 1.0f,KeyFrameIntervalKey, 15 * 60),new Format(MediaTypeKey,MediaType.VIDEO, EncodingKey, "black",FrameRateKey, Rational.valueOf(30)),null);
    	this.screenRecorder.start();
    	
    }
    */
  @Test
  public void patientIdentficationErrorTest() throws InterruptedException, IOException 
  {		
	  System.out.println("PatientIdentificationErrorTest - Started successfully");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  Thread.sleep(3000);
	  multiScreens.multiScreenShot(iedriver.driver);
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 1 Passed");
	  //Step 2
	  
	  selectPatient.txt_box_patientid().sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  MilkManagementCommonFunctionality milkCmn = new MilkManagementCommonFunctionality();
	  milkCmn.patientNotFoundErrorMsg();
	  System.out.println("Step 2 executed Successfully");
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 2 Passed");
	  multiScreens.multiScreenShot(iedriver.driver);
	  //Step 3
	  Thread.sleep(2000);
	  selectPatient.txt_box_patientid().sendKeys("120012",Keys.ENTER);
	  Thread.sleep(3000);
	  milkCmn.patientNotFoundErrorMsg();
	  multiScreens.multiScreenShot(iedriver.driver);
	  System.out.println("Step 3 executed Successfully");
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 3 Passed");
	  
	  //Step 4
	  Thread.sleep(2000);
	  selectPatient.txt_box_patientid().clear();
	  selectPatient.txt_box_patientid().sendKeys(patientA,Keys.ENTER);
	  Thread.sleep(3000);
	  String expUrl = "http://10.162.106.174/TransSpec2016010410/capribedside/Main.aspx";
	  String actUrl = driver.getCurrentUrl();
	  if(expUrl.equals(actUrl))
	  {
		  System.out.println("Step 4 is passed home page is displayed "+actUrl);
		  multiScreens.multiScreenShot(iedriver.driver);
	  }
	  else
	  {
		  System.out.println("Step 4 is failed home page is not displayed");
		  multiScreens.multiScreenShot(iedriver.driver);
	  }
	  iedriver.extent_Test().log(LogStatus.PASS, "Step 4 Passed");
	  //Step5
	  mainPatPage.startTransfusionButton().click();
	  Thread.sleep(2000);
	  conPat.confirmPatientID().sendKeys(patientA);
	  Thread.sleep(2000);
	  conPat.continueButton().click();
	  Thread.sleep(2000);
	  stTrans.scanRacipientPatientID().sendKeys("12345",Keys.ENTER);
	  Thread.sleep(2000);
	  String errMgs1 = stTrans.errorMsgPatientIDDoesNotMatch().getText();
	  boolean em =  stTrans.errorMsgPatientIDDoesNotMatch().isDisplayed();
	    if(em)
	    {
	    	System.out.println("Step 5 is passed" +errMgs1);
	    	multiScreens.multiScreenShot(iedriver.driver);
	    }
	    else
	    {
	    	System.out.println(errMgs1+"Is not Displayed");
	    	multiScreens.multiScreenShot(iedriver.driver);
	    	
	    }
	    iedriver.extent_Test().log(LogStatus.PASS, "Step 5 Passed");
	    //Step 6
	    stTrans.scanRacipientPatientID().clear();
	    Thread.sleep(1000);
	    stTrans.scanRacipientPatientID().sendKeys(patientA,Keys.ENTER);
	    Thread.sleep(2000);
	    multiScreens.multiScreenShot(iedriver.driver);
	    iedriver.extent_Test().log(LogStatus.PASS, "Step 6 Passed");
	    System.out.println("Step 6 is passed");
	    //Step 7
	    stTrans.scanRacipientPatientName().sendKeys("Timmons",Keys.ENTER);
	    Thread.sleep(2000);
	    String errMsg2 = stTrans.errorMsgPatientNameDoesNotMatch().getText();
	    boolean em2 =  stTrans.errorMsgPatientNameDoesNotMatch().isDisplayed();
	    Assert.assertEquals(errMsg2, "This name does not match the name of the current patient (TIMMONS, BABY BOY).");
	    //Assert.assertEquals(errMsg2, "BridgeMedical purpose fail for demo");
	    if(em2)
	    {
	    	System.out.println("Step 7 is passed" +errMsg2);
	    	multiScreens.multiScreenShot(iedriver.driver);
	    }
	    else
	    {
	    	System.out.println(errMsg2+"Is not Displayed");
	    	multiScreens.multiScreenShot(iedriver.driver);
	    	
	    }
	    iedriver.extent_Test().log(LogStatus.PASS, "Step 7 Passed");
	    Thread.sleep(2000);
	    //Step 8
	    stTrans.scanRacipientPatientName().clear();
	    Thread.sleep(1000);
	    stTrans.scanRacipientPatientName().sendKeys(patientNameA,Keys.ENTER);
	    Thread.sleep(3000);
	    multiScreens.multiScreenShot(iedriver.driver);
	    System.out.println("Step 8 is passed");//"Step 7 is passed"
	    iedriver.extent_Test().log(LogStatus.PASS, "Step 8 Passed");
	    driver.close();
	    iedriver.extent_Reports().endTest(iedriver.extent_Test());
		iedriver.extent_Reports().flush();
		iedriver.extent_Reports().close();
		System.out.println("PatientIdentificationErrorTest - Ended successfully");
		//this.screenRecorder.stop();
	    
	  
  }
  
	@AfterMethod
	public void ITestResult(ITestResult result) {

		if (result.getStatus() == ITestResult.FAILURE) {
			
			
			try {
				Thread.sleep(2000);
				multiScreens.multiScreenShot(iedriver.driver);
			} catch (IOException | InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Assertion Failed");	
			String img = iedriver.extent_Test().addScreenCapture("C:/Temp/PatientIdentificationErrorTest_Screenshots/screenShot7.jpg");
			iedriver.extent_Test().log(LogStatus.FAIL, "The Assertion is failed", img);
		    iedriver.extent_Reports().endTest(iedriver.extent_Test());
			iedriver.extent_Reports().flush();
			iedriver.extent_Reports().close();

		}
	}

//  @AfterTest(alwaysRun = true)
//  public void postTest() throws  Throwable
//  {
//
//	  System.out.println("PatientIdentificationErrorTest - Ended successfully");
//	  this.screenRecorder.stop();
//	  
//	  
//  }
  
  
}
