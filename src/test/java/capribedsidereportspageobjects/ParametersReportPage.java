package capribedsidereportspageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class ParametersReportPage extends IEDriver
{
	private static WebElement element = null;
	public static WebElement fromDate()
	{
		element  = driver.findElement(By.id("in_From_foo"));
		return element;
	}
	public static WebElement toDate()
	{
		element  = driver.findElement(By.id("in_To_foo"));
		return element;
	}
	public static WebElement btnDisplay()
	{
		element  = driver.findElement(By.id("btnDisplay"));
		return element;
	}
	public static WebElement btnCancel()
	{
		element  = driver.findElement(By.id("btnDisplay"));
		return element;
	}

}
