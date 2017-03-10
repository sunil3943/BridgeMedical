package syatemmanagertransfusionsettionpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class BloodProductPage extends IEDriver 
{
	private static WebElement element = null;
	public static WebElement editLinkForCRT()
	{
		element  = driver.findElement(By.id("dlItems__ctl6_editLink"));
		return element;
	}
	public static WebElement editLinkForISBTWB()
	{
		element  = driver.findElement(By.id("dlItems__ctl9_editLink"));
		return element;
	}
	public static WebElement linkBack()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}

}
