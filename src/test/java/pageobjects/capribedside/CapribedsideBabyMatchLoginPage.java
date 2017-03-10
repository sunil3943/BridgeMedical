package pageobjects.capribedside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class CapribedsideBabyMatchLoginPage extends IEDriver
{
	private static WebElement element=null;
	
	public static WebElement enterUsername()
	{
		element  = driver.findElement(By.id("UserId"));
		return element;
	}
	public static WebElement enterPassword()
	{
		element  = driver.findElement(By.id("Password"));
		return element;
	}
	public static WebElement clickOnLoginButton()
	{
		element  = driver.findElement(By.id("cmdLogin"));
		return element;
	}
	public static WebElement clickOnClickHereLink()
	{
		element  = driver.findElement(By.id("btnChangePw"));
		return element;
	}
	
	

}
