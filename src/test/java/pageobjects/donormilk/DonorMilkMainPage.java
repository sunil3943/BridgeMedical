package pageobjects.donormilk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class DonorMilkMainPage extends IEDriver
{
	private static WebElement element = null;
	public WebElement receiveDonorBottleButton()
	{
		element  = driver.findElement(By.id("cmdReceiveBottles_cmdButton"));
		return element;
	}
	public WebElement printDonorLabelsButton()
	{
		element  = driver.findElement(By.id("cmdPrintMilkLabels_cmdButton"));
		return element;
	}
	public WebElement reserveOrReleaseButton()
	{
		element  = driver.findElement(By.id("cmdReserveOrRelease_cmdButton"));
		return element;
	}
	public WebElement combineDonorMilkButton()
	{
		element  = driver.findElement(By.id("cmdCombineDonorMilk_cmdButton"));
		return element;
	}
	public WebElement cbrowseBottleHistoryButton()
	{
		element  = driver.findElement(By.id("cmdBrowseBottleHistory_cmdButton"));
		return element;
	}
	public WebElement availablePatientBottleButton()
	{
		element  = driver.findElement(By.id("cmdMilkAvailabilityByPatient_cmdButton"));
		return element;
	}
	public WebElement stateChangeButton()
	{
		element  = driver.findElement(By.id("cmdStateChange_cmdButton"));
		return element;
	}
	public WebElement printFormulaLabelsButton()
	{
		element  = driver.findElement(By.id("cmdPrintFormulaLabels_cmdButton"));
		return element;
	}
	public WebElement browseFormulaBottleHistoryButton()
	{
		element  = driver.findElement(By.id("cmdBrowseFormulaHistory_cmdButton"));
		return element;
	}
	public WebElement homeLink()
	{
		element  = driver.findElement(By.id("header_cmdHomeLink"));
		return element;
	}
	public WebElement logOutLink()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
	public WebElement helpLink()
	{
		element  = driver.findElement(By.id("header_cmdHelp"));
		return element;
	}

}
