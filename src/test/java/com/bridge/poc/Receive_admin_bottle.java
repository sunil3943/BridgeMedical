package com.bridge.poc;

//import java.awt.List;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import common.Commonfunctionality;
import common.IEDriver;
//import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_AdministerBottles;
import pageobjects.capribedside.Capribedside_page_BrowseBottleHistory;
import pageobjects.capribedside.Capribedside_page_DischargeBottles;
import pageobjects.capribedside.Capribedside_page_MainPatientPage;
import pageobjects.capribedside.Capribedside_page_PrepareBottles;
import pageobjects.capribedside.Capribedside_page_ReceiveBottles;



public class Receive_admin_bottle {
	String FilePath = "C:\\Temp\\Sharath.html";
	String TestName = "Recive Bottle";
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
	Commonfunctionality fun = new Commonfunctionality();
	Capribedside_page_AdministerBottles cap = new Capribedside_page_AdministerBottles();
	
	String pat_id ="635203";
	
	String bottle_no= fun.uniqueNumber();
	String onedayago= fun.yestDate();
//	MultiScreenShot multiScreens = new MultiScreenShot("C:\\Temp\\","ScreenShot");
	@BeforeClass
	public void beforeClass() throws InterruptedException, IOException {
		
		
		iedriver.extent_Reports();
		iedriver.extent_Test();
		//iedriver.extent_Reports().startTest();
		String URl = "http://10.162.106.174/TransSpec2016010301/capribedside/login.aspx";
		fun.login_default(URl);	
		iedriver.extent_Test().log(LogStatus.INFO, "Application launched successfully");
		fun.scanpatientid( pat_id);
		Thread.sleep(1000);
		Assert.assertEquals(true, Capribedside_page_MainPatientPage.button_ReceiveBottles().isEnabled());
		
		Capribedside_page_MainPatientPage.button_ReceiveBottles().click();
		//Thread.sleep(3000);
		fun.waitForElement(Capribedside_page_ReceiveBottles.getTextPatientId());
		Capribedside_page_ReceiveBottles.txt_box_BottlePatientID().sendKeys(pat_id);
		Thread.sleep(2000);
		Capribedside_page_ReceiveBottles.txt_box_BottlePatientID().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		Capribedside_page_ReceiveBottles.txt_box_Bottlenumber().sendKeys(bottle_no);
		Capribedside_page_ReceiveBottles.txt_box_Bottlenumber().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		if (Capribedside_page_ReceiveBottles.button_BottlenumberWarningYes().isDisplayed()){
			Capribedside_page_ReceiveBottles.button_BottlenumberWarningYes().click();
		}
		Thread.sleep(3000);
		Capribedside_page_ReceiveBottles.txt_box_CollectedDateTime().clear();
		Capribedside_page_ReceiveBottles.txt_box_CollectedDateTime().sendKeys(onedayago);
		Thread.sleep(1000);
		Capribedside_page_ReceiveBottles.dropDwn_StorageState().selectByValue("Fresh");
		Thread.sleep(2000);
		Capribedside_page_ReceiveBottles.button_Confirm().click();
		Thread.sleep(3000);
		Capribedside_page_ReceiveBottles.button_Warning_popup_Yes().click();
		
		//multiScreens.multiScreenShot(iedriver.driver);
		Thread.sleep(3000);
		Capribedside_page_ReceiveBottles.button_Exit().click();
		Thread.sleep(3000);
			
	  }
	
	@SuppressWarnings("static-access")
	@Test
  public void f() throws InterruptedException, IOException {
		
		//step1 
		Capribedside_page_MainPatientPage.button_PrepareBottles().click();
//		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 1 Passed");
		Thread.sleep(3000);
		Capribedside_page_PrepareBottles.txt_box_BottleNumber().sendKeys(bottle_no);
		Capribedside_page_PrepareBottles.txt_box_BottleNumber().sendKeys(Keys.ENTER);
		//step2
		Assert.assertEquals( Capribedside_page_PrepareBottles.warning_popUp().isDisplayed(),true);
		Thread.sleep(3000);
//		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 2 Passed");
		Thread.sleep(3000);
		//step3
		Capribedside_page_PrepareBottles.button_Warning_popUp_Yes().click();
		Thread.sleep(3000);
		Assert.assertEquals(Capribedside_page_PrepareBottles.txt_Expirationdate().isDisplayed(),true);
//		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 3 Passed");
		Thread.sleep(3000);
		Capribedside_page_PrepareBottles.button_Exit().click();
		//step4
		Thread.sleep(3000);
		Capribedside_page_MainPatientPage.button_AdministerBottles().click();
		Thread.sleep(3000);
		Capribedside_page_AdministerBottles.txt_box_bottlenumber().sendKeys(bottle_no);
		Capribedside_page_AdministerBottles.txt_box_bottlenumber().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		fun.waitForElement(Capribedside_page_AdministerBottles.getWarningPop());
		Assert.assertEquals(Capribedside_page_AdministerBottles.Warning_popup().isDisplayed(),false);
//		multiScreens.multiScreenShot(iedriver.driver);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 4 Passed");
		//multiScreens.multiScreenShot(iedriver.driver);
		Thread.sleep(3000);
		//step5
		Capribedside_page_AdministerBottles.button_Warning_popup_Yes().click();
		Thread.sleep(3000);
//		Assert.assertEquals(Capribedside_page_AdministerBottles.txt_box_Volume().isEnabled(),true);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 5 Passed");
//		multiScreens.multiScreenShot(iedriver.driver);
		Thread.sleep(5000);
		Capribedside_page_AdministerBottles.button_Exit().click();
		Thread.sleep(5000);
		//step6
		Capribedside_page_MainPatientPage.button_DischargeBottles().click();
		Thread.sleep(5000);
		Capribedside_page_DischargeBottles.txt_box_bottlenumber().sendKeys(bottle_no);
		Thread.sleep(2000);
		Capribedside_page_DischargeBottles.txt_box_bottlenumber().sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		Assert.assertEquals(Capribedside_page_DischargeBottles.Warning_popup().isDisplayed(),true);
		iedriver.extent_Test().log(LogStatus.PASS, "Step 6 Passed");
//		multiScreens.multiScreenShot(iedriver.driver);
		Thread.sleep(3000);
		//step7
		fun.waitForElement(Capribedside_page_DischargeBottles.getWarningPop());
		Capribedside_page_DischargeBottles.button_Warning_popup_Yes().click();
		Thread.sleep(3000);
		List<WebElement> rows = iedriver.driver.findElements(By.xpath(".//*[@id='dlBottleHistory']/tbody/tr/td[1]"));

String sRowValue = bottle_no;
String sColumnValue=null;		
		
		for (int i=0;i<=rows.size()-1;i++){
			String sValue =rows.get(i).getText();
			if(sValue.equals(bottle_no)){
			
			/*sValue = iedriver.driver.findElement(By.xpath(".//*[@id='dlBottleHistory']/tbody/tr[" + i + "]/td[1]")).getText();
				if(sValue.equalsIgnoreCase(sRowValue)){
			*/		int f = i+1;
				 sColumnValue= iedriver.driver.findElement(By.xpath(".//*[@id='dlBottleHistory']/tbody/tr" + "["+f+"]" + "/td[5]")).getText();
					break;
					}
				
				
		}
		Assert.assertEquals(sColumnValue, "DISCHARGED");
		iedriver.extent_Test().log(LogStatus.PASS, "Step 7 Passed");
//		multiScreens.multiScreenShot(iedriver.driver);
		Thread.sleep(3000);
		Capribedside_page_DischargeBottles.button_Exit().click();
		Thread.sleep(3000);
		//step8
		Capribedside_page_MainPatientPage.button_BrowseBottleHistory().click();
		Thread.sleep(3000);
		Capribedside_page_BrowseBottleHistory.dropDwn_FinalStatus().selectByValue("DISCHARGED");
		Thread.sleep(3000);
		rows = iedriver.driver.findElements(By.xpath(".//*[@id='dlBottleHistory']/tbody/tr/td[2]"));
		for (int i=0;i<=rows.size()-1;i++){
			String sValue = null;
			sValue = rows.get(i).getText();//iedriver.driver.findElement(By.xpath(".//*[@id='dlBottleHistory']/tbody/tr" + "[+ i + "]" + "/td[2]")).getText();
			if(sValue.equals(bottle_no)){
					int k = i+1;
				 sColumnValue= iedriver.driver.findElement(By.xpath(".//*[@id='dlBottleHistory']/tbody/tr" + "[" + k + "]" + "/td[8]//b[1]")).getText();
				 break;
					}
				
				
		}
		Assert.assertEquals(sColumnValue,"Discharged:");
		iedriver.extent_Test().log(LogStatus.PASS, "Step 8 Passed");
//		multiScreens.multiScreenShot(iedriver.driver);
		Thread.sleep(3000);
		Capribedside_page_BrowseBottleHistory.button_Back().click();
		Thread.sleep(3000);
  }
	
	@AfterMethod
	public void testing(ITestResult result) throws IOException{
		
		if(result.getStatus() == ITestResult.FAILURE){
//		multiScreens.multiScreenShot(iedriver.driver);	
		String img = iedriver.extent_Test().addScreenCapture("C:\\Temp\\ScreenShot_Screenshots\\screenShot4.jpg");
		iedriver.extent_Test().log(LogStatus.FAIL, "Step 4 Failed", img);
		}
	}
  

  @AfterClass
  public void afterClass() throws InterruptedException {
	  
	  iedriver.extent_Reports().endTest(iedriver.extent_Test());
	  iedriver.extent_Reports().flush();
	  iedriver.extent_Reports().close();
	  /*Capribedside_page_MainPatientPage.button_logout().click();
	  Thread.sleep(3000);
	  iedriver.driver.quit();
	  */
	  
  }

}
