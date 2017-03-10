package capribedsidetransfusionpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common.IEDriver;

public class BrowseTransfusionHistoryPage extends IEDriver
{
	//Info Page
	private static WebElement element = null;
	public static WebElement buttonGeneral()
	{
		element  = driver.findElement(By.id("btnGen"));
		return element;
	}
	public static WebElement buttonReaction()
	{
		element  = driver.findElement(By.id("btnReact"));
		return element;
	}
	public static WebElement buttonVitals()
	{
		element  = driver.findElement(By.id("btnVitals"));
		return element;
	}
	public static WebElement buttonChecks()
	{
		element  = driver.findElement(By.id("btnChecks"));
		return element;
	}
	public static WebElement buttonHold()
	{
		element  = driver.findElement(By.id("btnHolds"));
		return element;
	}
	public static WebElement buttonBackInfoPage()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	
	//Edit Transfusion.
	public static WebElement endTransfusionDate()
	{
		element  = driver.findElement(By.id("dpEndTransDate_foo"));
		return element;
	}
	public static WebElement bloodProduct()
	{
		element  = driver.findElement(By.id("lstBloodProduct"));
		return element;
	}
	public void selectBloodProductEditTrans(int a)
	{
		PageFactory.initElements(IEDriver.driver, 	BrowseTransfusionHistoryPage.class );
    	WebElement wb = BrowseTransfusionHistoryPage.bloodProduct();
    	Select sel = new Select(wb);
    	sel.selectByIndex(a);
	}
	public static WebElement volumeTransfused()
	{
		element  = driver.findElement(By.id("txtVolume"));
		return element;
	}
	public static WebElement buttonConfirEditTransm()
	{
		element  = driver.findElement(By.id("Continue"));
		return element;
	}
	public static WebElement buttonExitEditTrans()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	//Correct Blood Plasma Derivative...
	public static WebElement administerDateTime()
	{
		element  = driver.findElement(By.id("dpDerivativeDateTime_foo"));
		return element;
	}
	public static WebElement buttonConfirmEditBloodPlasmaDerivative()
	{
		element  = driver.findElement(By.id("cmdConfirm"));
		return element;
	}
	public static WebElement buttonExitEditBloodPlasmaDerivative()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	//Logout Process
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
	
	//REaction-Post Transfusion Page
	public static WebElement checkboxElevatedTemp()
	{
		element  = driver.findElement(By.id("lstReactions_0"));
		return element;
	}
	public static WebElement checkboxAnaphylaxis()
	{
		element  = driver.findElement(By.id("lstReactions_1"));
		return element;
	}
	public static WebElement checkboxHypotension()
	{
		element  = driver.findElement(By.id("lstReactions_2"));
		return element;
	}
	public static WebElement checkboxReducedUrinOutput()
	{
		element  = driver.findElement(By.id("lstReactions_3"));
		return element;
	}
	public static WebElement checkboxFailureToClot()
	{
		element  = driver.findElement(By.id("lstReactions_4"));
		return element;
	}
	public static WebElement checkboxDyspneaNausea()
	{
		element  = driver.findElement(By.id("lstReactions_5"));
		return element;
	}
	public static WebElement checkboxUticariaChills()
	{
		element  = driver.findElement(By.id("lstReactions_6"));
		return element;
	}
	public static WebElement buttonConfirmPostTransfusion()
	{
		element  = driver.findElement(By.id("Continue"));
		return element;
	}
	public static WebElement buttonExitPostTransfusion()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	//Post Transfusion Reaction Instruction page.
	public static WebElement headerReactionInstruction()
	{
		element  = driver.findElement(By.id("headerInstructions"));
		return element;
	}
	public static WebElement buttonConfirmReactionInstruction()
	{
		element  = driver.findElement(By.id("Continue"));
		return element;
	}
	public static WebElement buttonExitReactionInstruction()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	//

	public static WebElement buttonBackBrowseTransfusionHistory()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	
	//Report Page
	public static WebElement buttonPrintPostTransfusionReport()
	{
		element  = driver.findElement(By.id("btnPrint"));
		return element;
	}
	public static WebElement buttonCancelPostTransfusionReport()
	{
		element  = driver.findElement(By.id("btnReturn"));
		return element;
	}
	


}
