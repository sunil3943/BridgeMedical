package pageobjects.capribedside;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.IEDriver;



public class Capribedside_page_Login extends IEDriver {
	private static WebElement element = null;
	
    public static WebElement txt_box_username()
	{
		element  = driver.findElement(By.id("UserId"));
		return element;
	}

	public static WebElement txt_box_password()
	{
		element=driver.findElement(By.id("Password"));
		return element;
	}

	public static WebElement button_login()
	{
		element = driver.findElement(By.id("cmdLogin"));
		return element;

	}
	public static WebElement link_clickhere()
	{
		element = driver.findElement(By.id("btnChangePw"));
		return element;

	}
	//Hazards
	
	public static WebElement errMsgNoPrivilegeToAccessBridgeMedical()
	{
		element = driver.findElement(By.id("errorsLabel"));
		return element;

	}
	
	public void login(String userID,String password) throws Throwable
	{
		Capribedside_page_Login.txt_box_username().sendKeys(userID);
		Thread.sleep(2000);
		Capribedside_page_Login.txt_box_password().sendKeys(password);
		Thread.sleep(2000);
		Capribedside_page_Login.button_login().click();
	}
	
}
