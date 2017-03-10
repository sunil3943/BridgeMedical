package capribedsidetransfusionpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common.BloodTransfusionCommonFunctionality;
import common.Commonfunctionality;
import common.IEDriver;
//import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_Login;
import pageobjects.capribedside.Capribedside_page_MainPatientPage;
import pageobjects.systemManager.Sysman_page_Main;
import syatemmanagertransfusionsettionpageobjects.TransfusionSettingsPage;

public class HoldTransfusionPage extends IEDriver
{
	private static WebElement element = null;
	public static WebElement editboxUnitNumber()
	{
		element  = driver.findElement(By.id("txtUnitNumber" ));
		return element;
	}
	public static WebElement dropDownBlodProduct()
	{
		element  = driver.findElement(By.id("lstBloodProduct" ));
		return element;
	}
	//Exit Pop up
	public static WebElement buttonYesExitHoldPopup()
	{
		element  = driver.findElement(By.id("_modalConfirm_cmdOK" ));
		return element;
	}
	public static WebElement buttonNoExitHoldPopup()
	{
		element  = driver.findElement(By.id("_modalConfirm_cmdCancel" ));
		return element;
	}
	//Select blood product from dropdown.
	public void selectBlodProduct(int a)
	{
		PageFactory.initElements(IEDriver.driver, 	HoldTransfusionPage.class );
    	WebElement wb = HoldTransfusionPage.dropDownBlodProduct();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
	}
	//cmdOK
	public static WebElement buttonContinue()
	{
		element  = driver.findElement(By.id("cmdOK" ));
		return element;
	}
	public static WebElement buttonExit()
	{
		element  = driver.findElement(By.id("cmdCancel" ));
		return element;
	}
	//Hold Section...
	public static WebElement startHoldDateAndTime()
	{
		element  = driver.findElement(By.id("dpStartHold_foo" ));
		return element;
	}
	public static WebElement reasonForHold()
	{
		element  = driver.findElement(By.id("lstReasonForHold" ));
		return element;
	}
	//Select reason
	public void selectReasonForHold(int a)
	{
		PageFactory.initElements(IEDriver.driver, 	HoldTransfusionPage.class );
    	WebElement wb = HoldTransfusionPage.reasonForHold();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
	}
	
	public static WebElement endHoldDateAndTime()
	{
		element  = driver.findElement(By.id("dpEndHold_foo" ));
		return element;
	}
	public static WebElement textboxComment()
	{
		element  = driver.findElement(By.id("txtComment" ));
		return element;
	}
	
	public static WebElement buttonContinueHold()
	{
		element  = driver.findElement(By.id("cmdOK" ));
		return element;
	}
	public static WebElement buttonExitHold()
	{
		element  = driver.findElement(By.id("cmdCancels" ));
		return element;
	}
	
	//Print Report Page
	public static WebElement buttonPrint()
	{
		element  = driver.findElement(By.id("btnPrint" ));
		return element;
	}
	public static WebElement buttonCancel()
	{
		element  = driver.findElement(By.id("btnReturn" ));
		return element;
	}
	
	//Hold Transfusion Method.
	public void holdTransfusion(String unitNo) throws Throwable
	{
		String FilePath = "C:\\Temp\\HoldTransfusionTest.html";
		String TestName = "HoldTransfusionTest";
		//MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","HoldTransfusionTest");
		IEDriver iedriver = new IEDriver(FilePath, TestName);
		Capribedside_page_Login login = new Capribedside_page_Login();
		Sysman_page_Main sysManagerMainPage = new Sysman_page_Main();
		Commonfunctionality common = new Commonfunctionality();
		Capribedside_page_MainPatientPage patientMenu = new  Capribedside_page_MainPatientPage();
		
		StartTransfusionPage stTransPage = new StartTransfusionPage();
		BloodTransfusionCommonFunctionality transCommon = new BloodTransfusionCommonFunctionality();
		TransfusionSettingsPage transfusionSettings = new TransfusionSettingsPage();
		HoldTransfusionPage holdTransPage = new HoldTransfusionPage();
		EndTransfusionPage endTrans = new EndTransfusionPage();
		BrowseTransfusionHistoryPage browseTransHistory = new BrowseTransfusionHistoryPage();
		AdministerDerivativesPage administerDerivative = new AdministerDerivativesPage();
		     patientMenu.holdTransfusionButton().click();
			 Thread.sleep(6000);
			 //multiScreens.multiScreenShot(iedriver.driver);
			 //step 4
			 holdTransPage.editboxUnitNumber().sendKeys(unitNo,Keys.ENTER);
			 Thread.sleep(10000);
			 //multiScreens.multiScreenShot(iedriver.driver);
			 //Step 5
			 holdTransPage.selectBlodProduct(4);
			 Thread.sleep(6000);
			 holdTransPage.buttonContinue().click();
			 Thread.sleep(8000);
			 //multiScreens.multiScreenShot(iedriver.driver);
			 /*
			 //Step 6
			 holdTransPage.buttonExitHold().click();
			 Thread.sleep(1000);
			 holdTransPage.buttonYesExitHoldPopup().click();
			 //Step 7
			 mainPage.holdTransfusionButton().click();
			 Thread.sleep(2000);
			 multiScreens.multiScreenShot(iedriver.driver);
			 holdTransPage.editboxUnitNumber().sendKeys(unitNo,Keys.ENTER);
			 Thread.sleep(2000);
			 multiScreens.multiScreenShot(iedriver.driver);
			 holdTransPage.selectBlodProduct(4);
			 Thread.sleep(1000);
			 holdTransPage.buttonContinue().click();
			 Thread.sleep(2000);
			 multiScreens.multiScreenShot(iedriver.driver);
			 */
			 //Step 8
			 Thread.sleep(10000);
			 String currentDate = common.currentDate();
			 holdTransPage.startHoldDateAndTime().sendKeys(currentDate,Keys.ENTER);
			 Thread.sleep(2000);
			 //multiScreens.multiScreenShot(iedriver.driver);
			 //Step 9
			 holdTransPage.selectReasonForHold(1);
			 Thread.sleep(2000);
			 //multiScreens.multiScreenShot(iedriver.driver);
			 //STep 10
			 //holdTransPage.endHoldDateAndTime().sendKeys(nextDate);
			 //Thread.sleep(1000);
			// holdTransPage.textboxComment().sendKeys("Testing");
			 Thread.sleep(2000);
			 holdTransPage.buttonContinueHold().click();
			 Thread.sleep(2000);
			 //multiScreens.multiScreenShot(iedriver.driver);
			 //Step 11
			 holdTransPage.buttonCancel().click();
			 Thread.sleep(2000);
			 //multiScreens.multiScreenShot(iedriver.driver);
		
	}
	
}
