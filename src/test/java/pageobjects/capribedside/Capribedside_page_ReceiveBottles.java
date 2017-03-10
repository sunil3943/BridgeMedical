package pageobjects.capribedside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.IEDriver;

public class Capribedside_page_ReceiveBottles extends IEDriver {
	private static WebElement element = null;
	public static WebElement txt_box_BottlePatientID()
	{
		element  = driver.findElement(By.id("txtPatientId"));
		return element;
	}
	public static WebElement txt_box_Bottlenumber()
	{
		element  = driver.findElement(By.id("txtBottleNumber"));
		return element;
	}
		public static WebElement button_BottlenumberWarningYes()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdOK"));
		return element;
	}
	public static WebElement button_BottlenumberWarningNo()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdCancel"));
		return element;
	}
	public static WebElement txt_box_CollectedDateTime()
	{
		element  = driver.findElement(By.id("dpCollectionDate_foo"));
		return element;
	}
	public static Select dropDwn_StorageState()
	{
		element = driver.findElement(By.id("lstStorageState"));
		Select drop  = new Select(element);
		return  drop;
	}
	public static WebElement txt_box_Comments()
	{
		element  = driver.findElement(By.id("txtComment"));
		return element;
	}
	public static WebElement button_Confirm()
	{
		element  = driver.findElement(By.id("cmdConfirm"));
		return element;
	}
	public static WebElement button_Exit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	public static WebElement Warning_popup(){
		return element = driver.findElement(By.id("modalErrorConfirm_lblBody"));
	}
	
	public static WebElement button_Warning_popup_Yes(){
		return element = driver.findElement(By.id("modalErrorConfirm_cmdOK"));
	}
	public static WebElement button_Warning_popup_No(){
		return element = driver.findElement(By.id("modalErrorConfirm_cmdCancel"));
	}
	
	private static String TextPatientId = " .//span[@id='lblPatientID']";
	
	public static String getTextPatientId() {
		return TextPatientId;
	}
	public static WebElement patientNotMatchErrorMsg()
	{
		return element = driver.findElement(By.id("errorLabel"));
	}
	public WebElement duplicateBottleErrorMsg()
	{
		element  = driver.findElement(By.id("errorLabel"));
		return element;
	}
	//When enabled scan for receive bottle.
	public WebElement manualEntryErrorMsg()
	{
		element  = driver.findElement(By.id("errorLabel"));
		return element;
	}
	
	
	//Receive Bottle Logout popup
	public WebElement buttonYesLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdOK"));
		return element;
	}
	public WebElement buttonNoLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdCancel"));
		return element;
	}
	
	////Logoutprocess
	
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
	
	
	


}
