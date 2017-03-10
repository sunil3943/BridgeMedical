package pageobjects.systemManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class Sysman_page_PointsOfCare extends IEDriver
{
	private static WebElement element = null;
	public static WebElement editPocPeds()
	{
		element  = driver.findElement(By.id("dlPoc__ctl13_editLink"));
		return element;
	}
	public static WebElement editPocGenMed()
	{
		element  = driver.findElement(By.id("dlPoc__ctl10_editLink"));
		return element;
	}
	public static WebElement txt_box_SearchPOC()
	{
		element  = driver.findElement(By.id("listSearch_txtSearchList"));
		return element;
	}
	public static WebElement button_Searchbutton()
	{
		element  = driver.findElement(By.id("listSearch_imgSearchList"));
		return element;
	}
	public static WebElement button_Create()
	{
		element  = driver.findElement(By.id("cmdCreate"));
		return element;
	}
	public static WebElement button_Back()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement linkEditPeds()
	{
		element  = driver.findElement(By.id("dlPoc__ctl13_editLink"));
		return element;
	}
	


}
