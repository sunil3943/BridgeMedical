package pageobjects.capribedside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class Capribedside_page_StateChange extends IEDriver
{
	private static WebElement element = null;
	public static WebElement txt_box_BottleNumber( )
	{
		element  = driver.findElement(By.id("txtBottleNumber"));
		return element;
	}
	public static WebElement button_Exit( )
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	public static WebElement warningBottleMayNotBezChangedForThisPatient( )
	{
		element  = driver.findElement(By.id("modalErrorConfirm_lblTitleHeader"));
		return element;
	}
	public static WebElement ackButtonBottleMayNotBezChangedForThisPatientPopup( )
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdButton3"));
		return element;
	}
	public static WebElement errMsgBottleNotReceived( )
	{
		element  = driver.findElement(By.id("errorLabel"));
		return element;
	}
	

}
