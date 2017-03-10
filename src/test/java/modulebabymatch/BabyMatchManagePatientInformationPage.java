package modulebabymatch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class BabyMatchManagePatientInformationPage extends IEDriver
{
	private static WebElement element = null;
	public static WebElement editMotherLink()
	{
		element  = driver.findElement(By.id("editMother"));
		return element;
	}
	
	public static WebElement clickOnConfirmButton()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement clickOnExitButton()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement correctMotherField()
	{
		element  = driver.findElement(By.id("txtCorrectMother_Name"));
		return element;
	}
	public static WebElement correctIdField()
	{
		element  = driver.findElement(By.id("txtCorrectMother_ID"));
		return element;
	}
	
	
	
	

}
