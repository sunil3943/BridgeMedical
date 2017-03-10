package pageobjects.capribedside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class ConfirmPatientPage extends IEDriver
{
	private static WebElement element = null;

	public static WebElement confirmPatientID()
	{
		
		element  = driver.findElement(By.id("txtPatientId"));
		return element;
	}
	public static WebElement continueButton()
	{
		
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement exitButton()
	{
		
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
}
