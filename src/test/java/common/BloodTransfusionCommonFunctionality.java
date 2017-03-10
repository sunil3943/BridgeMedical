package common;

import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import capribedsidetransfusionpageobjects.ChangeBloodTypePage;
import capribedsidetransfusionpageobjects.RapidStartTransfusion;
import capribedsidetransfusionpageobjects.StartTransfusionPage;
//import multiScreenShot.MultiScreenShot;

public class BloodTransfusionCommonFunctionality extends IEDriver
{
	StartTransfusionPage stTransPage;
	String FilePath = "C:\\Temp\\BloodTransfusionCommonFunctionality.html";
	String TestName = "PatientIdentificationErrorTest";
//	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","BloodTransfusionCommonFunctionality");
	IEDriver iedriver = new IEDriver(FilePath, TestName);
	
    //String a = "635201";
    public void scanRacipientPatientID(String a)  throws InterruptedException
    {
    	//iedriver.scanpatient("635201");
    	stTransPage = PageFactory.initElements(IEDriver.driver, 	StartTransfusionPage.class );
		Actions actions= new Actions(driver);
		actions.keyDown(Keys.ALT).perform();
		stTransPage.scanRacipientPatientID().sendKeys("[");
		//Thread.sleep(1000);
		stTransPage.scanRacipientPatientID().sendKeys(a);
		//Thread.sleep(1000);
		actions.keyDown(Keys.ALT).perform();
		stTransPage.scanRacipientPatientID().sendKeys("]");
		//Thread.sleep(1000);
    }
    public void scanRacipientPatientName(String a)  throws InterruptedException
    {
    	//iedriver.scanpatient("635201");
    	stTransPage = PageFactory.initElements(IEDriver.driver, 	StartTransfusionPage.class );
		Actions actions= new Actions(driver);
		actions.keyDown(Keys.ALT).perform();
		stTransPage.scanRacipientPatientName().sendKeys("[");
		//Thread.sleep(1000);
		stTransPage.scanRacipientPatientName().sendKeys(a);
		//Thread.sleep(1000);
		actions.keyDown(Keys.ALT).perform();
		stTransPage.scanRacipientPatientName().sendKeys("]");
		//Thread.sleep(1000);
    }
    public void scanRacipientUnitNumber(String a)  throws InterruptedException
    {
    	//iedriver.scanpatient("635201");
    	stTransPage = PageFactory.initElements(IEDriver.driver, 	StartTransfusionPage.class );
		Actions actions= new Actions(driver);
		actions.keyDown(Keys.ALT).perform();
		stTransPage.scanRacipientUnitNumber().sendKeys("[");
		//Thread.sleep(1000);
		stTransPage.scanRacipientUnitNumber().sendKeys(a);
		//Thread.sleep(1000);
		actions.keyDown(Keys.ALT).perform();
		stTransPage.scanRacipientUnitNumber().sendKeys("]");
		//Thread.sleep(1000);
    }
    
    public void selectPatientBloodType(int a) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, 	StartTransfusionPage.class );
    	WebElement wb = stTransPage.racipientBloodTypeDropDown();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
    //select by visible text
    public void selectPatientBloodTypeVisibleText(String a) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, StartTransfusionPage.class );
    	WebElement wb = stTransPage.racipientBloodTypeDropDown();
    	Select sel = new Select(wb);
    	sel.selectByVisibleText(a);
    	
    }
    public void donorCenterCodeDropDown(int a) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, StartTransfusionPage.class );
    	WebElement wb = stTransPage.donorCenterCodeDropDown();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
    
    public void donorUnitNumberMissMatchErrorMsg() throws IOException
    {
    	
    	stTransPage = PageFactory.initElements(IEDriver.driver, StartTransfusionPage.class );
    	boolean wb = stTransPage.donorUnitNumberMissmatchErrorMsg().isDisplayed();
    	if(wb)
    	{
    		System.out.println("This unit number does not match the unit number on the crossmatch recipient labe-Is displayed");
//    		 multiScreens.multiScreenShot(iedriver.driver);
    	}
    	else
    	{
    		System.out.println("Error message for Unit Number missmatch is not displayed");
//    		multiScreens.multiScreenShot(iedriver.driver);
    	}
    	
    }
    public void donorBloodProduct(int a) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, StartTransfusionPage.class );
    	WebElement wb = stTransPage.donorBloodProductDropDown();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
    public void scanDonorBloodProduct(String a)  throws InterruptedException
    {
    	//iedriver.scanpatient("635201");
    	stTransPage = PageFactory.initElements(IEDriver.driver, StartTransfusionPage.class );
		Actions actions= new Actions(driver);
		actions.keyDown(Keys.ALT).perform();
		stTransPage.donorBloodProductDropDown().sendKeys("[");
		//Thread.sleep(1000);
		stTransPage.donorBloodProductDropDown().sendKeys(a);
		//Thread.sleep(1000);
		actions.keyDown(Keys.ALT).perform();
		stTransPage.donorBloodProductDropDown().sendKeys("]");
		//Thread.sleep(1000);
    }
    
    public void donorBloodType(int a) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, 	StartTransfusionPage.class );
    	WebElement wb = stTransPage.donorBloodTypeDropDown();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
}
    //Donor Blood Product Error Message when Snanned non existing blood product.
    public void donorNonExistingBloodProdScanErrorMsg() throws IOException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, StartTransfusionPage.class );
    	boolean wb = stTransPage.donorBloodProductErrorMsg().isDisplayed();
    	if(wb)
    	{
    		System.out.println("The barcode value you entered 'x' is not a valid blood product.-Is displayed");
//    		multiScreens.multiScreenShot(iedriver.driver);
    	}
    	else
    	{
    		System.out.println("Error message for non existing Blood Product scan is not displayed");
//    		multiScreens.multiScreenShot(iedriver.driver);
    	}
    

}
    public void vitalsTempSite(int a) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, StartTransfusionPage.class );
    	WebElement wb = stTransPage.vitalsTempSiteTextBox();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
    public void transfusionisAlreadyInProgressErrorMsg() throws IOException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, StartTransfusionPage.class );
    	boolean wb = stTransPage.transfusionIsAlreadyInProgressErrorMsg().isDisplayed();
    	if(wb)
    	{
    		System.out.println("This unit number matches a transfusion that was started 'X' by 'Y'.-Is displayed");
//    		multiScreens.multiScreenShot(iedriver.driver);
    	}
    	else
    	{
    		System.out.println("Error message for non existing Blood Product scan is not displayed");
//    		multiScreens.multiScreenShot(iedriver.driver);
    	}
    }
    
    //Cosign Page Drop Down...
    public void cosignBloodBankPermission(String s) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, StartTransfusionPage.class );
    	WebElement wb = stTransPage.cosignBloodBankPermission();
    	Select sel = new Select(wb);
    	sel.selectByVisibleText(s);
    	
    }
    public void cosignAgreeBloodTypeSubtitution(String s) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, StartTransfusionPage.class );
    	WebElement wb = stTransPage.cosignAgreeBloodTypeSubtitution();
    	Select sel = new Select(wb);
    	sel.selectByVisibleText(s);
    	
    }
    public void cosignReasonForBloodTypeSubtitution(int a) throws InterruptedException
    {
    	stTransPage = PageFactory.initElements(IEDriver.driver, StartTransfusionPage.class );
    	WebElement wb = stTransPage.cosignReasonForBloodTypeSubtitution();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
    
    //Rapid Transfusion Commonfunctionality.
    RapidStartTransfusion rapidTrans = new RapidStartTransfusion();
    public void rapidStartDonorCenterCode(int a) throws InterruptedException
    {
    	rapidTrans = PageFactory.initElements(IEDriver.driver, RapidStartTransfusion.class );
    	WebElement wb = rapidTrans.donorCenterCode();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
    public void rapidStartDonorBloodProduct(int a) throws InterruptedException
    {
    	rapidTrans = PageFactory.initElements(IEDriver.driver, RapidStartTransfusion.class );
    	WebElement wb = rapidTrans.donorBloodProductDropDown();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
    
    //Change Blood Type Commonfunctionality..
    ChangeBloodTypePage changeBT = new ChangeBloodTypePage();
    public void changeBTNewBloodType(String s) throws InterruptedException
    {
    	changeBT = PageFactory.initElements(IEDriver.driver, ChangeBloodTypePage.class );
    	WebElement wb = changeBT.newBloodType();
    	Select sel = new Select(wb);
    	sel.selectByVisibleText(s);
    	
    }
    public void changeBTConfirmNewBloodType(String s) throws InterruptedException
    {
    	changeBT = PageFactory.initElements(IEDriver.driver, ChangeBloodTypePage.class );
    	WebElement wb = changeBT.confirmNewBloodType();
    	Select sel = new Select(wb);
    	sel.selectByVisibleText(s);
    	
    }
    public void changeBTReasonForBloodTypeChange(int a) throws InterruptedException
    {
    	changeBT = PageFactory.initElements(IEDriver.driver, ChangeBloodTypePage.class );
    	WebElement wb = changeBT.reasonForBloodTypeChange();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
    	
    }
    
    
    
    
    
}
