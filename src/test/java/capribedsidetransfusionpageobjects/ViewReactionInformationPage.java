package capribedsidetransfusionpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class ViewReactionInformationPage extends IEDriver
{
	private static WebElement element = null;
	//Blood Type Chnage Reasons
	public static WebElement buttonBack()
		{
			element  = driver.findElement(By.id("Button_Cancel"));
			return element;
		}

}
