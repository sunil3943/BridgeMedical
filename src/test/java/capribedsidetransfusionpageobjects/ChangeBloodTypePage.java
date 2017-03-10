package capribedsidetransfusionpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class ChangeBloodTypePage extends IEDriver
{
	private static WebElement element = null;
	public static WebElement newBloodType()
	{
		element  = driver.findElement(By.id("lstNewBloodType"));
		return element;
	}
	public static WebElement confirmNewBloodType()
	{
		element  = driver.findElement(By.id("lstConfirmedBloodType"));
		return element;
	}
	public static WebElement reasonForBloodTypeChange()
	{
		element  = driver.findElement(By.id("lstReasonForChange"));
		return element;
	}
	
	public static WebElement textBoxUserID()
	{
		element  = driver.findElement(By.id("txtLoginId"));
		return element;
	}
	public static WebElement textBoxPassword()
	{
		element  = driver.findElement(By.id("txtPassword"));
		return element;
	}
	public static WebElement btnConfirm()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement btnExit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	public static WebElement currentBloodType()
	{
		element  = driver.findElement(By.id("lblBloodtype_Details"));
		return element;
	}
	//Logout Process
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
