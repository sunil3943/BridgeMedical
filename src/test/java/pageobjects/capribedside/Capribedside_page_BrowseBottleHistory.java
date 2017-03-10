package pageobjects.capribedside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import common.IEDriver;

public class Capribedside_page_BrowseBottleHistory extends IEDriver {
	private static WebElement element = null;
	public static Select dropDwn_FinalStatus()
	{
		element = driver.findElement(By.id("FinalStatusFilter"));
		Select drop  = new Select(element);
		return  drop;
}
	
	public static Select dropDwn_StorageState()
	{
		element = driver.findElement(By.id("StorageStateFilter"));
		Select drop  = new Select(element);
		return  drop;
}
	public static WebElement button_Back()
	{
		element = driver.findElement(By.id("Continue"));
		return  element;
	}
	
	public static WebElement sortReceivedColumn()
	{
		element = driver.findElement(By.xpath("//input[@class='sorted']"));
		return  element;
	}
	//dlBottleHistory__ctl2_bottleId
	////a[@href='BrowseBottlePrepPanel.aspx?id=25035364368397']
	public static WebElement verifyDevidedBottle()
	{
		//element = driver.findElement(By.id("dlBottleHistory__ctl2_bottleId"));
		element = driver.findElement(By.xpath("a[@href='BrowseBottlePrepPanel.aspx?id=25035364368397']"));
		return  element;
	}
	public static WebElement editDevidedBottle()
	{
		//element = driver.findElement(c);
		element = driver.findElement(By.id("dlBottleHistory__ctl2_btnCorrectBottles"));
		return  element;
	}

}
