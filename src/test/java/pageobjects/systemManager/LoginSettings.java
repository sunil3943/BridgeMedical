package pageobjects.systemManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import capribedsidetransfusionpageobjects.ChangeBloodTypePage;
import common.IEDriver;

public class LoginSettings extends IEDriver
{
private static WebElement element = null;
	
	public static WebElement forceChangePassword()
	{
		element  = driver.findElement(By.id("lstPasswordExpiration"));
		return element;
	}
	public void selectForceChangePassword(String s) throws InterruptedException
    {
    	PageFactory.initElements(IEDriver.driver, ChangeBloodTypePage.class );
    	WebElement wb = forceChangePassword();
    	Select sel = new Select(wb);
    	sel.selectByVisibleText(s);
    }
	public static WebElement btnConfirm()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement btnCancel()
	{
		element  = driver.findElement(By.id("btnCancel"));
		return element;
	}
}
