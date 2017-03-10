package capribedsidetransfusionpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import common.Commonfunctionality;
import common.IEDriver;
import pageobjects.capribedside.Capribedside_page_Login;
import pageobjects.capribedside.Capribedside_page_MainPatientPage;
import pageobjects.systemManager.EditRolePage;
import pageobjects.systemManager.RolesPage;
import pageobjects.systemManager.Sysman_page_Main;

public class AdministerDerivativesPage extends IEDriver
{
	private static WebElement element = null;
	public static WebElement dropdownBloodPlasmaDerivative()
	{
		element  = driver.findElement(By.id("lstDerivatives"));
		return element;
	}

	public void selectBloodPlasmaDerivative(String a)
	{
		PageFactory.initElements(IEDriver.driver, 	AdministerDerivativesPage.class );
    	WebElement wb = AdministerDerivativesPage.dropdownBloodPlasmaDerivative();
    	Select sel = new Select(wb);
    	sel.selectByValue(a);
	}
	public static WebElement patientID()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl2_textAttribute"));
		return element;
	}
	public static WebElement patientName()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl3_textAttribute"));
		return element;
	}
	public static WebElement patientBloodType()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl4_listAttribute"));
		return element;
	}
	public void selectPatientBloodType(String a)
	{
		PageFactory.initElements(IEDriver.driver, 	AdministerDerivativesPage.class );
    	WebElement wb = AdministerDerivativesPage.patientBloodType();
    	Select sel = new Select(wb);
    	sel.selectByVisibleText(a);
	}
	public static WebElement manufacturer()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl5_textAttribute"));
		return element;
	}
	public static WebElement lotNumber()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl6_textAttribute"));
		return element;
	}
	
	public static WebElement iuConcentration()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl7_textAttribute"));
		return element;
	}
	public static WebElement dropDownInjectionSite()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl8_listAttribute"));
		return element;
	}
	public void selectInjectionSite(String a)
	{
		PageFactory.initElements(IEDriver.driver, 	AdministerDerivativesPage.class );
    	WebElement wb = AdministerDerivativesPage.dropDownInjectionSite();
    	Select sel = new Select(wb);
    	sel.selectByVisibleText(a);
	}
	public static WebElement serialNumber()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl9_textAttribute"));
		return element;
	}
	public static WebElement volume()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl10_textAttribute"));
		return element;
	}
	public static WebElement Expires()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl11_dateAttribute_foo"));
		return element;
	}
	public static WebElement quantity()
	{
		element  = driver.findElement(By.id("grdAttributes__ctl12_textAttribute"));
		return element;
	}
	
	//Cosignature
	public static WebElement userId()
	{
		element  = driver.findElement(By.id("txtLoginId"));
		return element;
	}
	public static WebElement password()
	{
		element  = driver.findElement(By.id("txtPassword"));
		return element;
	}
		
	public static WebElement buttonContinue()
	{
		element  = driver.findElement(By.id("cmdConfirm"));
		return element;
	}
	public static WebElement buttonExit()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	//Logout process
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
	
	public void admisnisterDerivative(String derivative,String bloodType,String patientID,String patientName,String manufacturer,String lotNo,String iuConcentration,String injectionSite,String serialNumber,String volume,String quantity) throws InterruptedException
	{
		 Capribedside_page_Login login = new Capribedside_page_Login();
		 Sysman_page_Main sysManagerMainPage = new Sysman_page_Main();
		 Commonfunctionality common = new Commonfunctionality();
		 Capribedside_page_MainPatientPage patientMenu = new  Capribedside_page_MainPatientPage();
		 Capribedside_page_MainPatientPage mainPage = new Capribedside_page_MainPatientPage();
		 RolesPage roles = new RolesPage();
		 EditRolePage editRole = new EditRolePage();
		 BrowseTransfusionHistoryPage browseTransHistory = new BrowseTransfusionHistoryPage();
		 AdministerDerivativesPage administerDerivative = new AdministerDerivativesPage();
		 String nextDate = common.nextDate();
		
		  Assert.assertEquals(administerDerivative.dropdownBloodPlasmaDerivative().isEnabled(),true);
		  Thread.sleep(1000);
		  administerDerivative.selectBloodPlasmaDerivative(derivative);
		  Thread.sleep(3000);
		  administerDerivative.patientID().sendKeys(patientID);
		  Thread.sleep(2000);
		  administerDerivative.patientName().sendKeys(patientName);
		  Thread.sleep(2000);
		  administerDerivative.selectPatientBloodType(bloodType);
		  Thread.sleep(2000);
		  administerDerivative.manufacturer().sendKeys(manufacturer);
		  Thread.sleep(2000);
		  administerDerivative.lotNumber().sendKeys(lotNo);
		  Thread.sleep(2000);
		  administerDerivative.iuConcentration().sendKeys(iuConcentration);
		  Thread.sleep(2000);
		  administerDerivative.selectInjectionSite(injectionSite);
		  Thread.sleep(2000);
		  administerDerivative.serialNumber().sendKeys(serialNumber);
		  Thread.sleep(2000);
		  administerDerivative.volume().sendKeys(volume);
		  Thread.sleep(2000);
		  administerDerivative.Expires().sendKeys(nextDate);
		  Thread.sleep(2000);
		  administerDerivative.quantity().sendKeys(quantity);
		  Thread.sleep(2000);
		  administerDerivative.buttonContinue().click(); 
		
	}

}
