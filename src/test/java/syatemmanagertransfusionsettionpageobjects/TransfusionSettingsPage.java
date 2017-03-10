package syatemmanagertransfusionsettionpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common.IEDriver;
import pageobjects.systemManager.EditPocPage;

public class TransfusionSettingsPage extends IEDriver
{

	private static WebElement element = null;
	public static WebElement displayPreviouslyStartedUnitsInHoldAndEndWithinTheLast()
	{
		element  = driver.findElement(By.id("txtDisplayStartedTransDays"));
		return element;
	}
	public static WebElement displayBloodTypeMismatchQuestion()
	{
		element  = driver.findElement(By.id("lstBloodTypeMismatchQuestions"));
		return element;
	}
	public void selectOptionForDisplayBloodTypeMismatchQuestion(String a)
	{
		PageFactory.initElements(IEDriver.driver, TransfusionSettingsPage.class );
    	WebElement wb = TransfusionSettingsPage.displayBloodTypeMismatchQuestion();
    	Select sel = new Select(wb);
    	sel.selectByValue(a);
	}
	public static WebElement propmtForPatientBloodType()
	{
		element  = driver.findElement(By.id("lstPromptPatientBloodType"));
		return element;
	}
	public void selectOptionForPropmtForPatientBloodType(String a)
	{
		PageFactory.initElements(IEDriver.driver, TransfusionSettingsPage.class );
    	WebElement wb = TransfusionSettingsPage.propmtForPatientBloodType();
    	Select sel = new Select(wb);
    	sel.selectByValue(a);
	}
	public static WebElement expirationMessage()
	{
		element  = driver.findElement(By.id("lstExpirationStop"));
		return element;
	}
	public void selectOptionForExpirationMessage(String a)
	{
		PageFactory.initElements(IEDriver.driver, TransfusionSettingsPage.class );
    	WebElement wb = TransfusionSettingsPage.expirationMessage();
    	Select sel = new Select(wb);
    	sel.selectByValue(a);
	}
	public static WebElement linkBloodProducts()
	{
		element  = driver.findElement(By.xpath("//input[@value='Blood Products']"));
		return element;
	}
	public static WebElement linkBloodTypeChangeReasons()
	{
		element  = driver.findElement(By.xpath("//input[@value='Blood Type Change Reasons']"));
		return element;
	}
	public static WebElement linkReactionInstructions()
	{
		element  = driver.findElement(By.xpath("//input[@value='Reaction Instructions']"));
		return element;
	}
	public static WebElement linkReactionSignsAndSymptoms()
	{
		element  = driver.findElement(By.xpath("//input[@value='Reaction Signs and Symptoms']"));
		return element;
	}
	
	public static WebElement buttonConfirm()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	
	public static WebElement buttonCancel()
	{
		element  = driver.findElement(By.id("btnCancel"));
		return element;
	}
	

}
