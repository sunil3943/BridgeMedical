package pageobjects.capribedside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class CapribedsideBabyMatchPage extends IEDriver

{   
	
	
	private static WebElement element = null;
	public static WebElement scanPatientID()
	{
		element  = driver.findElement(By.id("txtPatientId"));
		return element;
	}
	public static WebElement scanRacipientID()
	{
		element  = driver.findElement(By.id("txtRecipientId"));
		return element;
	}
	
	public static WebElement clickContinueButton()
	{
		element  = driver.findElement(By.id("Continue"));
		return element;
		
	}
	public static WebElement clickCancelButton()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
		
	}
	public static WebElement clickOnConfirmPopupButton()
	{
		element  = driver.findElement(By.id("modalConfirm_cmdOK"));
		return element;
		
	}
	public static WebElement invaliIdAlertMessage()
	{
		element  = driver.findElement(By.id("BabyMatchEvent_PatientId"));
		return element;
		
	}
	public static WebElement matchFailedPopup()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_title"));
		return element;
		
	}
	public static WebElement matchFailedPopupAckButton()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdButton1"));
		return element;
		
	}
	public static WebElement managePatientInfoLink()
	{
		element  = driver.findElement(By.id("header_cmdManagePatientLink"));
		return element;
		
	}
	public static WebElement invalidMatchPopup()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_title"));
		return element;
		
	}
	public static WebElement invalidMatchPopupAckButton()
	{
		element  = driver.findElement(By.id("modalErrorConfirm_cmdButton1"));
		return element;
		
	}
	public static WebElement fromLocationDropDown()
	{
		element  = driver.findElement(By.id("lstFromLocation"));
		return element;
		
	}
	public static WebElement toLocationDropDown()
	{
		element  = driver.findElement(By.id("lstToLocation"));
		return element;
		
	}
	

}
