package pageobjects.systemManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import capribedsidetransfusionpageobjects.StartTransfusionPage;
import common.IEDriver;

public class BreastMilkSettingsPage extends IEDriver
{
	private static WebElement element = null;
	public static WebElement textBoxFreshExpTimeLength()
	{
		element  = driver.findElement(By.id("txtBottleRefExpHours" ));
		return element;
	}
	public static WebElement textBoxFreshExpTimeLengthUnits()
	{
		element  = driver.findElement(By.id("lstBottleRefExpMode" ));
		return element;
	}
	 public void selectFreshExpTimeUnit(String a) throws InterruptedException
	    {
	        PageFactory.initElements(IEDriver.driver, BreastMilkSettingsPage.class );
	    	WebElement wb = BreastMilkSettingsPage.textBoxFreshExpTimeLengthUnits();
	    	Select sel = new Select(wb);
	    	sel.selectByVisibleText(a);
	    	
	    }
		public static WebElement textBoxFrozenExpTimeLength()
		{
			element  = driver.findElement(By.id("txtBottleFrzExpHours" ));
			return element;
		}
		public static WebElement textBoxFrozenExpTimeLengthUnits()
		{
			element  = driver.findElement(By.id("lstBottleFrzExpMode" ));
			return element;
		}
		 public void selectFrozenExpTimeUnit(String a) throws InterruptedException
		    {
		        PageFactory.initElements(IEDriver.driver, BreastMilkSettingsPage.class );
		    	WebElement wb = BreastMilkSettingsPage.textBoxFrozenExpTimeLengthUnits();
		    	Select sel = new Select(wb);
		    	sel.selectByVisibleText(a);
		    	
		    }
		 public static WebElement textBoxThawedExpTimeLength()
			{
				element  = driver.findElement(By.id("txtBottleThawExpHours" ));
				return element;
			}
			public static WebElement textBoxThawedExpTimeLengthUnits()
			{
				element  = driver.findElement(By.id("lstBottleThawExpMode" ));
				return element;
			}
			 public void selectThawedExpTimeUnit(String a) throws InterruptedException
			    {
			        PageFactory.initElements(IEDriver.driver, BreastMilkSettingsPage.class );
			    	WebElement wb = BreastMilkSettingsPage.textBoxThawedExpTimeLengthUnits();
			    	Select sel = new Select(wb);
			    	sel.selectByVisibleText(a);
			    	
			    }
	 public static WebElement btnConfirm()
		{
			element  = driver.findElement(By.id("cmdOK" ));
			return element;
		}
	 public static WebElement btnCancel()
		{
			element  = driver.findElement(By.id("btnCancel" ));
			return element;
		}
	

}
