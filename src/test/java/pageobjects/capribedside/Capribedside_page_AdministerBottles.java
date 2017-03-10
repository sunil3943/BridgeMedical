package pageobjects.capribedside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class Capribedside_page_AdministerBottles extends IEDriver {
	private static WebElement element = null;
	public static WebElement txt_box_bottlenumber()
	{
		element  = driver.findElement(By.id("txtBottleNumber"));
		return element;
	}
	public static WebElement txt_box_Volume()
	{
		element  = driver.findElement(By.id("txtVolume"));
		return element;
	}
	
	public static WebElement Warning_popup()
	{
		element  = driver.findElement(By.id("divModalErrorConfirm"));
		return element;
	}

	public static WebElement button_Warning_popup_Yes()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdButton1"));
		return element;
	}
	public static WebElement button_Warning_popup_No()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdCancel"));
		return element;
	}
	public static WebElement donorBottleErrorMessage()
	{
		element  = driver.findElement(By.id("errorLabel"));
		return element;
	}
	public static WebElement button_Exit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	public static WebElement button_Confirm()
	{
		element  = driver.findElement(By.id("cmdConfirm"));
		return element;
	}
	
	private static String warningPop = ".//span[text()='Warning:']";
	public static String getWarningPop() {
		return warningPop;
	}
	public static WebElement bottleConnotBeAdministerForThisPatientErrorMsg()
	{
		element  = driver.findElement(By.id("errorLabel"));
		return element;
	}
	//Hazards
	public static WebElement errMsgBottleNotReceived()
	{
		element  = driver.findElement(By.id("errorLabel"));
		return element;
	}
	
	

}
