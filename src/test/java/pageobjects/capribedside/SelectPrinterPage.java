package pageobjects.capribedside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class SelectPrinterPage extends IEDriver 
{
	private static WebElement element = null;
	public static WebElement btnPrint()
	{
		element  = driver.findElement(By.id("DialogConfirmPrinter_cmdOK"));
		return element;
	}
	public static WebElement btnCancel()
	{
		element  = driver.findElement(By.id("DialogConfirmPrinter_cmdCancel"));
		return element;
	}
	public static WebElement selectAutomationPrinter()
	{
		element  = driver.findElement(By.xpath("//a[@href='SelectPrinter.aspx?PrinterId=XXVA06-19-5134']"));
		return element;
	}

}
