package pageobjects.capribedside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class Capribedside_page_SelectPatient extends IEDriver {
	private static WebElement element = null;
	public WebElement txt_box_patientid()
	{
		element  = driver.findElement(By.id("txtPatientId"));
		return element;
	}
	
	public WebElement ErrorMsg()
	{
		element  = driver.findElement(By.id("errorsLabel"));
		return element;
	}
	public WebElement button_Logout()
	{
		element  = driver.findElement(By.id("header_cmdLogout"));
		return element;
	}
	public WebElement linkMilkMgmt()
	{
		element  = driver.findElement(By.id("header_cmdDonorLink"));
		return element;
	}
	public WebElement linkReports()
	{
		element  = driver.findElement(By.id("header_separatorBarReportsLink"));
		return element;
	}
	public WebElement patientNotFoundErrorMsg()
	{
		element  = driver.findElement(By.id("errorsLabel"));
		return element;
	}
	public WebElement expectingPatientIDErrorMsg()
	{
		element  = driver.findElement(By.id("errorsLabel"));
		return element;
	}
	
}
