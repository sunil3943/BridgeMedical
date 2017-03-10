
package capribedsidetransfusionpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common.IEDriver;

public class RapidStartTransfusion  extends IEDriver
{
	private static WebElement element = null;
	//Donor Page Element
	public static WebElement donorCenterCode()
	{
		element  = driver.findElement(By.id("lstCenterCode"));
		return element;
	}
	
	public static WebElement donorUnitNumber()
	{
		element  = driver.findElement(By.id("txtUnitNumber"));
		return element;
	}
	
	
	public static WebElement donorBloodProductDropDown()
	{
		element  = driver.findElement(By.id("lstBloodProduct"));
		return element;
	}
	public static WebElement bloodProductAttribute()
	{
		element  = driver.findElement(By.id("lblAttributes"));
		return element;
	}
	public static WebElement checkBoxBloodProductAttributeAntiCMVNegative()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl3_checkboxSelect"));
		return element;
	}
	public static WebElement checkBoxBloodProductAttributeIrradiated()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl4_checkboxSelect"));
		return element;
	}
	public static WebElement buttonSaveBloodAttribute()
	{
		element  = driver.findElement(By.id("cmdSave"));
		return element;
	}
	public static WebElement donorBloodProductExipreDate()
	{
		element  = driver.findElement(By.id("dpExpirationDate_foo"));
		return element;
	}
	
	public static WebElement donorBloodTypeDropDown()
	{
		element  = driver.findElement(By.id("lstBloodType"));
		return element;
	}
	public void selectDonorBloodType(String a)
	{
		PageFactory.initElements(IEDriver.driver, RapidStartTransfusion.class );
    	WebElement wb = RapidStartTransfusion.donorBloodTypeDropDown();
    	Select sel = new Select(wb);
    	sel.selectByVisibleText(a);
	}
	public static WebElement donorComments()
	{
		element  = driver.findElement(By.id("txtStartTxComment"));
		return element;
	}
	public static WebElement donorContinueButton()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement donorExitButton()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	//Donor Page Hazards
	public static WebElement errMsgDonorBloodTypeIsNotAllowedForPatient()
	{
		element  = driver.findElement(By.id("StartTransfusionEvent_BloodType"));
		return element;
	}
	public static WebElement popupBloodTypeMissMatch()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_lblTitleHeader"));
		return element;
	}
	public static WebElement btnYesDonorBloodTypeMissMatchPopup()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdOK"));
		return element;
	}
	public static WebElement btnNoDonorBloodTypeMissMatchPopup()
	{
		element  = driver.findElement(By.id("_modalErrorConfirm_cmdCancel"));
		return element;
	}
	
	//Cosign Page
	public static WebElement cosignUserIdTextBox()
	{
		element  = driver.findElement(By.id("txtLoginId"));
		return element;
	}
	public static WebElement cosignPasswordTextBox()
	{
		element  = driver.findElement(By.id("txtPassword"));
		return element;
	}
	public static WebElement btnCosignContinue()
	{
		element  = driver.findElement(By.id("Continue"));
		return element;
	}
	public static WebElement btnCosignExit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	//Cosign Page Hazard
	public static WebElement errMsgCosignUserIdOrPasswordInvalid()
	{
		element  = driver.findElement(By.id("User_LoginId"));
		return element;
	}
	
	//Rapid Start Star Page.
	public static WebElement buttonStartRapidTransfusion()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement buttonExitRapidTransfusion()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	//Rapid Start Print Page.
	public static WebElement buttonPrintRapidTransfusionReport()
	{
		element  = driver.findElement(By.id("btnPrint"));
		return element;
	}
	public static WebElement buttonCancelRapidTransfusionReport()
	{
		element  = driver.findElement(By.id("btnReturn"));
		return element;
	}
	
	
	//Logout process
	public static WebElement linkLogout()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
	
	public static WebElement btnYesLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdOK"));
		return element;
	}
	public static WebElement btnNoLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdCancel"));
		return element;
	}
	
	//Logout method
	public void logoutRapidTransfusion() throws Throwable
	{
		RapidStartTransfusion.linkLogout().click();
		Thread.sleep(2000);
		RapidStartTransfusion.btnYesLogoutPopup().click();
		
		
	}

}
