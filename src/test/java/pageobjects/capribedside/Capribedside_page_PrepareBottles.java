package pageobjects.capribedside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class Capribedside_page_PrepareBottles extends IEDriver {

	private static WebElement element = null;
	public static WebElement txt_box_BottleNumber()
	{
		element  = driver.findElement(By.id("txtBottleNumber"));
		return element;
	}
	public static WebElement txt_Expirationdate()
	{
		element  = driver.findElement(By.id("lblExpireDate"));
		return element;
	}
	
	public static WebElement thawDate()
	{
		element  = driver.findElement(By.id("dpThawDate_foo"));
		return element;
	}
	public static WebElement button_Divide()
	{
		element  = driver.findElement(By.id("cmdDivide"));
		return element;
	}
	public static WebElement checkbox_AddFortifiers()
	{
		element  = driver.findElement(By.id("cmdFortifiers_uncheckedImage"));
		return element;
	}
	public static WebElement checkbox_CancelFortifiers()
	{
		element  = driver.findElement(By.id("cmdFortifiers_checkedImage"));
		return element;
	}
	public static WebElement checkbox_Dispose()
	{
		element  = driver.findElement(By.id("cbDispose"));
		return element;
	}
	public static WebElement checkbox_ReprintLabel()
	{
		element  = driver.findElement(By.id("cbReprintLabel"));
		return element;
	}
	public static WebElement txt_box_Comments()
	{
		element  = driver.findElement(By.id("txtComment"));
		return element;
	}
	public static WebElement button_Confirm()
	{
		element  = driver.findElement(By.id("cmdDone"));
		return element;
	}
	public static WebElement button_Exit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	//Hazards...
	public static WebElement warning_popUp()
	{
		element  = driver.findElement(By.id("divModalErrorConfirm"));
		return element;
	}
	public static WebElement button_Warning_popUp_Yes()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdButton1"));
		return element;
	}
	public static WebElement button_Warning_popUp_No()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdCancel"));
		return element;
	}
	public static WebElement donorWarning_popUp()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_modalErrorConfirmPopup"));
		return element;
	}
	public static WebElement buttondonorWarningpopUpYes()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdButton1"));
		return element;
	}
	public static WebElement buttondonorWarningpopUpNo()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdCancel"));
		return element;
	}
	public static WebElement errMsgBottleNotReceived()
	{
		element  = driver.findElement(By.id("errorLabel"));
		return element;
	}
	//Divide Bottle Page
	public static WebElement btnPrintDivideBottle()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement btnCancelDivideBottle()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	
	
}
