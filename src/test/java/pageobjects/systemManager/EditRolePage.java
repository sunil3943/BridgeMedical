package pageobjects.systemManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class EditRolePage extends IEDriver
{
private static WebElement element = null;
	
    public static WebElement checkBoxAccessBrowseTransfusionHistory()
	{
		element  = driver.findElement(By.id("cBoxListTransfusion_0"));
		return element;
	}
    //cBoxListTransfusion_16
    public static WebElement checkBoxMayCorrectTransfusion()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_16"));
   		return element;
   	}
    public static WebElement checkBoxMayCorrectVitals()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_18"));
   		return element;
   	}
    
    public static WebElement checkBoxMayStartTransfusionWithoutCosignature()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_2"));
   		return element;
   	}
    
    public static WebElement checkBoxMayStartTransfusionWithCosignature()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_3"));
   		return element;
   	} 
    
    public static WebElement checkBoxHoldTransfusion()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_6"));
   		return element;
   	}
    public static WebElement checkBoxMayAccessChangeBloodTypeWithCosignature()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_10"));
   		return element;
   	}
    public static WebElement checkBoxMayAccessChangeBloodTypeWithoutCosignature()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_11"));
   		return element;
   	}
    public static WebElement checkBoxMayStartRapidTransfusionWithCosignature()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_5"));
   		return element;
   	}
    public static WebElement checkBoxMayStartRapidTransfusionWithoutCosignature()
   	{
   		element  = driver.findElement(By.id("cBoxListTransfusion_4"));
   		return element;
   	}
    //Confirm or Cancel
    public static WebElement buttonConfirm()
	{
		element  = driver.findElement(By.id("cmdOKUp" ));
		return element;
	}
	public static WebElement buttonCancel()
	{
		element  = driver.findElement(By.id("btnCancelUp" ));
		return element;
	}

}
