package capribedsidespecimencepageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class CollectSpecimenPage extends IEDriver
{
	private static WebElement element = null;
	
	public static WebElement checkBoxOrderMetabolic()
	{
		element  = driver.findElement(By.id("DataGrid1__ctl4_checkboxSelect"));
		return element;
	}
	
	public static WebElement buttonChangeDateTime()
	{
		element  = driver.findElement(By.id("btnChangeDateTime"));
		return element;
	}
	public static WebElement buttonExit()
	{
		element  = driver.findElement(By.id("Cancel"));
		return element;
	}
	
	//Exit Popup
	public static WebElement buttonYesExitPopup()
	{
		element  = driver.findElement(By.id("SpecimenExitDialog_cmdOK"));
		return element;
	}
	public static WebElement buttonNoExitPopup()
	{
		element  = driver.findElement(By.id("SpecimenExitDialog_cmdCancel"));
		return element;
	}
	//Logout
	public static WebElement linkLogout()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
	
	public static WebElement buttonYeslogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdOK"));
		return element;
	}
	public static WebElement buttonNologoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdCancel"));
		return element;
	}
	
	
	

}
