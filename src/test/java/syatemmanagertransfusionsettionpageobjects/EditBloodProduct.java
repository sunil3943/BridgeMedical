package syatemmanagertransfusionsettionpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import common.IEDriver;

public class EditBloodProduct extends IEDriver

{
	private static WebElement element = null;
	public static WebElement textboxCode()
	{
		element  = driver.findElement(By.id("txtCode"));
		return element;
	}
	public static WebElement textboxName()
	{
		element  = driver.findElement(By.id("txtValue"));
		return element;
	}
	public static WebElement textboxDescription()
	{
		element  = driver.findElement(By.id("txtDescription"));
		return element;
	}
	public static WebElement bloodProductSubstitutionChart()
	{
		element  = driver.findElement(By.id("lstChart"));
		return element;
	}
	public static WebElement expirationCheck()
	{
		element  = driver.findElement(By.id("lstExpiration"));
		return element;
	}
	public void selectOptionForExpirationCheck(String a)
	{
		PageFactory.initElements(IEDriver.driver, EditBloodProduct.class );
    	WebElement wb = EditBloodProduct.expirationCheck();
    	Select sel = new Select(wb);
    	sel.selectByValue(a);
	}
	public static WebElement compareBloodType()
	{
		element  = driver.findElement(By.id("ListCompareBloodTypes"));
		return element;
	}
	public void selectOptionForCompareBloodType(String a)
	{
		PageFactory.initElements(IEDriver.driver, EditBloodProduct.class );
    	WebElement wb = EditBloodProduct.compareBloodType();
    	Select sel = new Select(wb);
    	sel.selectByValue(a);
	}
	public static WebElement ISBT_128_BloodProduct()
	{
		element  = driver.findElement(By.id("lstISBT128BloodProduct"));
		return element;
	}
	public void selectOptionForISBT_128_BloodProduct(String a)
	{
		PageFactory.initElements(IEDriver.driver, EditBloodProduct.class );
    	WebElement wb = EditBloodProduct.ISBT_128_BloodProduct();
    	Select sel = new Select(wb);
    	sel.selectByValue(a);
	}
	public static WebElement displayAdditionalBloodTypeMismatchQuestion()
	{
		element  = driver.findElement(By.id("lstDisplayBloodProductQuestion"));
		return element;
	}
	public static WebElement linkBloodProductAttributes()
	{
		element  = driver.findElement(By.id("lnkAttributes"));
		return element;
	}
	//Product Attributes
	public static WebElement checkboxAntiCMVNegative()
	{
		element  = driver.findElement(By.id("dlItems__ctl2_cboxItem"));
		return element;
	}
	public static WebElement checkboxIrradiated()
	{
		element  = driver.findElement(By.id("dlItems__ctl3_cboxItem"));
		return element;
	}
	public static WebElement checkboxHbSNegative()
	{
		element  = driver.findElement(By.id("dlItems__ctl4_cboxItem"));
		return element;
	}
	public static WebElement linkBack()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement buttonConfirm()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement buttonCancel()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	
	


}
