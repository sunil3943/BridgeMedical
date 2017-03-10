package pageobjects.capribedside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class ExpiredPasswordPage extends IEDriver
{
private static WebElement element = null;
	
	public static WebElement textBoxNewPassword()
	{
		element  = driver.findElement(By.id("NewPassword"));
		return element;
	}
	public static WebElement textBoxConfirmPassword()
	{
		element  = driver.findElement(By.id("ConfirmPassword"));
		return element;
	}
	public static WebElement btnOK()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement btnCancel()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
}
