package modulebabymatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class BabyMatchSelectPatientPage extends IEDriver
{   private static WebElement element = null;

	public static WebElement scanPatientID()
	{
		
		element  = driver.findElement(By.id("txtPatientId"));
		return element;
	}
}
