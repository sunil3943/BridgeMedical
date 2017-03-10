package pageobjects.donormilk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import capribedsidetransfusionpageobjects.StartTransfusionPage;
import common.IEDriver;

public class ReceiveDonorBottlePage extends IEDriver
{
	private static WebElement element = null;
	public WebElement donorBottleNumber()
	{
		element  = driver.findElement(By.id("txtDonorMilkNumber"));
		return element;
	}
	
	public WebElement expireDate()
	{
		element  = driver.findElement(By.id("txtExpireDate"));
		return element;
	}

	public WebElement kiloCalories()
	{
		element  = driver.findElement(By.id("txtCalories"));
		return element;
	}
	public WebElement buttonConfirm()
	{
		element  = driver.findElement(By.id("cmdDone"));
		return element;
	}
	public WebElement buttonExit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	//Expire Bottle Confirma Popup

	public static WebElement buttonYesExpireBottleWarning(){
		return element = driver.findElement(By.id("modalErrorConfirm_cmdOK"));
	}
	public static WebElement buttonNoExpireBottleWarning(){
		return element = driver.findElement(By.id("modalErrorConfirm_cmdCancel"));
	}
	
	//Logout...
	public static WebElement linkLogout()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
	public static WebElement btnYesLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdOK"));
		return element;
	}
	public static WebElement btnNoLogoutPopup()
	{
		element  = driver.findElement(By.id("header__modalConfirm_cmdCancel"));
		return element;
	}
	
	
	//Scan to receive bottle...
	 public void scanDonorBottleID(String a)  throws InterruptedException
	    {
	    	//iedriver.scanpatient("635201");
		    ReceiveDonorBottlePage receiveDonorBottle;
		    receiveDonorBottle = PageFactory.initElements(IEDriver.driver, 	ReceiveDonorBottlePage.class );
			Actions actions= new Actions(driver);
			actions.keyDown(Keys.ALT).perform(); 
			receiveDonorBottle.donorBottleNumber().sendKeys("[");
			//Thread.sleep(1000);
			receiveDonorBottle.donorBottleNumber().sendKeys(a);
			//Thread.sleep(1000);
			actions.keyDown(Keys.ALT).perform();
			receiveDonorBottle.donorBottleNumber().sendKeys("]");
			//Thread.sleep(1000);
	    }
	 
	
	
}
