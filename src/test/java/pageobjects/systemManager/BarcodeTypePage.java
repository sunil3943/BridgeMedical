package pageobjects.systemManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class BarcodeTypePage extends IEDriver
{
	private static WebElement element = null;
	public static WebElement editLinkPatientIDWristband()
	{
		element  = driver.findElement(By.id("dlItems__ctl10_editLink" ));
		return element;
	}
	
	//Edit barcode type page.
	public static WebElement textboxPrefix()
	{
		element  = driver.findElement(By.id("txtExtra" ));
		return element;
	}
	public static WebElement textboxSuffix()
	{
		element  = driver.findElement(By.id("txtExtra3" ));
		return element;
	}
	public static WebElement buttonConfirm()
	{
		element  = driver.findElement(By.id("cmdOK" ));
		return element;
	}
	public static WebElement buttonCancel()
	{
		element  = driver.findElement(By.id("cmdCancel" ));
		return element;
	}
	
	

}
