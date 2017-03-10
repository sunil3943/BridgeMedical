package pageobjects.capribedside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class Capribedside_page_CombineBottles extends IEDriver
{
	private static WebElement element = null;
	public static WebElement txt_box_BottleNumber()
	{
		element  = driver.findElement(By.id("txtBottleNumber"));
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
	public static WebElement button_Prepare()
	{
		element  = driver.findElement(By.id("cmdPrepare"));
		return element;
	}	
	public static WebElement button_Exit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	public static WebElement bottleMayNotBeCombinedForThisPatienWarnMsg()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_lblTitleHeader"));
		return element;
	}
	public static WebElement ackButtonBottleMayNotBeCombinedForThisPatienWarnPopup()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdButton3"));
		return element;
	}

	public static WebElement errMsgBottleNotReceived()
	{
		element  = driver.findElement(By.id("errorLabel"));
		return element;
	}
}
