package syatemmanagertransfusionsettionpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class BloodTypeChangeReason extends IEDriver
{
	private static WebElement element = null;
	//Blood Type Chnage Reasons
		public static WebElement linkCreateBloodTypeChangeReasons()
		{
			element  = driver.findElement(By.id("cmdCreate"));
			return element;
		}
		public static WebElement textboxCodeCreateReason()
		{
			element  = driver.findElement(By.id("txtCode"));
			return element;
		}
		public static WebElement textboxNameCreateReason()
		{
			element  = driver.findElement(By.id("txtValue"));
			return element;
		}
		public static WebElement textboxDescriptionCreateReason()
		{
			element  = driver.findElement(By.id("txtDescription"));
			return element;
		}
		public static WebElement buttonConfirmCreateReason()
		{
			element  = driver.findElement(By.id("cmdOK"));
			return element;
		}
		public static WebElement buttonCancelCreateReason()
		{
			element  = driver.findElement(By.id("cmdCancel"));
			return element;
		}
		public static WebElement linkBack()
		{
			element  = driver.findElement(By.id("cmdOK"));
			return element;
		}
		
		//Method to create Reason for blood type change.
		public void createReasonForBloodTypeChange(String code,String name,String description) throws InterruptedException
		{
			BloodTypeChangeReason.textboxCodeCreateReason().sendKeys(code);
			Thread.sleep(2000);
			BloodTypeChangeReason.textboxNameCreateReason().sendKeys(name);
			Thread.sleep(2000);
			BloodTypeChangeReason.textboxDescriptionCreateReason().sendKeys(description);
			Thread.sleep(2000);
			BloodTypeChangeReason.buttonConfirmCreateReason().click();
			
		}

}
