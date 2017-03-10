package capribedsidetransfusionpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common.IEDriver;

public class EndTransfusionPage extends IEDriver 
{
	private static WebElement element = null;
	public static WebElement unitNumber()
	{
		element  = driver.findElement(By.id("txtUnitNumber"));
		return element;
	}
	public static WebElement dropDownBloodProduct()
	{
		element  = driver.findElement(By.id("lstBloodProduct"));
		return element;
	}
	//Select blood product...
	public void selectBlodProduct(int a)
	{
		PageFactory.initElements(IEDriver.driver, EndTransfusionPage.class );
    	WebElement wb = EndTransfusionPage.dropDownBloodProduct();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
	}
	public static WebElement buttonContinueUnitProductSection()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement buttonExitUnitProductSection()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
    //Volume Page
	public static WebElement volumeTransferred()
	{
		element  = driver.findElement(By.id("txtVolume"));
		return element;
	}
	public static WebElement dropdownTransfusionReaction()
	{
		element  = driver.findElement(By.id("lstReactions"));
		return element;
	}
	public void selectTransfusionReactionAnswer(String a)
	{
		PageFactory.initElements(IEDriver.driver, EndTransfusionPage.class );
    	WebElement wb = EndTransfusionPage.dropdownTransfusionReaction();
    	Select sel = new Select(wb);
    	sel.selectByValue(a);
	}
	public static WebElement buttonContinueVolumeSection()
	{
		element  = driver.findElement(By.id("Continue"));
		return element;
	}
	public static WebElement buttonExitVolumeSection()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	//Vitals
	public static WebElement vitalsTempTextBoxFar()
	{
		element  = driver.findElement(By.id("_vitals_txtTemperature"));
		return element;
	}
	public static WebElement vitalsTempTextBoxCel()
	{
		element  = driver.findElement(By.id("_vitals_txtAltTemperature"));
		return element;
	}
	public static WebElement vitalsTempSiteTextBox()
	{
		element  = driver.findElement(By.id("_vitals_lstTemperatureSite"));
		return element;
	}
	 public void selectVitalsTempSite(int a) throws InterruptedException
	    {
	    	PageFactory.initElements(IEDriver.driver, EndTransfusionPage.class );
	    	WebElement wb = EndTransfusionPage.vitalsTempSiteTextBox();
	    	Select sel = new Select(wb);
	    	sel.selectByIndex(a);
	    	
	    }
	public static WebElement vitalsHeartRateTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtHeartRate"));
		return element;
	}
	public static WebElement vitalsSystolicBloodPressureTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtSystolic"));
		return element;
	}
	public static WebElement vitalsDiastolicBloodPressureTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtDiastolic"));
		return element;
	}
	public static WebElement vitalsPalpCheckBox()
	{
		element  = driver.findElement(By.id("_vitals_cboxPalp"));
		return element;
	}
	public static WebElement vitalsRespirationTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtRespirations"));
		return element;
	}
	public static WebElement vitalsOxygenSaturationTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtOxygenSaturation"));
		return element;
	}
	public static WebElement vitalsCommentTextBox()
	{
		element  = driver.findElement(By.id("_vitals_txtComment"));
		return element;
	}
	public static WebElement vitalsContinueButton()
	{
		element  = driver.findElement(By.id("_vitals_cont"));
		return element;
	}
	public static WebElement vitalsExitButton()
	{
		element  = driver.findElement(By.id("_vitals_canc"));
		return element;
	}
	
	//Print Report Page
	public static WebElement buttonPrint()
	{
		element  = driver.findElement(By.id("btnPrint" ));
		return element;
	}
	public static WebElement buttonCancelPrint()
	{
		element  = driver.findElement(By.id("btnReturn" ));
		return element;
	}
	
	//Pop up when transfusion is not started
	public static WebElement buttonYesUnitNumberDoesNotMatchRecordedTrans()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdOK" ));
		return element;
	}
	public static WebElement buttonNoUnitNumberDoesNotMatchRecordedTrans()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdCancel" ));
		return element;
	}
	public static WebElement buttonYesBloodProdDoesNotMatchRecordedTrans()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdOK" ));
		return element;
	}
	public static WebElement buttonNoBloodProdDoesNotMatchRecordedTrans()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdCancel" ));
		return element;
	}

	
	
	
	
}
