package pageobjects.systemManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class SystemManagerBabyMatchPage extends IEDriver
{
	private static WebElement element = null;
	public static WebElement babyMatchPropmtLocation()
	{
		element  = driver.findElement(By.id("lstBabyMatchPromptForLocation"));
		return element;
	}
	public static WebElement clickConfirmButton()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement clickCancelButton()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}

}
