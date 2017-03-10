package pageobjects.systemManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class UsersPage extends IEDriver 
{
private static WebElement element = null;
	
    public static WebElement editSuperuser()
	{
		element  = driver.findElement(By.id("dlUsers__ctl34_editLink"));
		return element;
	}
    //Superuse/Edit Userr Page Elements
    public static WebElement textBoxPassword()
	{
		element  = driver.findElement(By.id("txtPassword"));
		return element;
	}
    public static WebElement textReenterPassword()
	{
		element  = driver.findElement(By.id("txtConfirmPassword"));
		return element;
	}
    
    public static WebElement btnConfirm()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
    public static WebElement btnCancel()
   	{
   		element  = driver.findElement(By.id("cmdCancel"));
   		return element;
   	}
    //Logout
    public static WebElement linkLogout()
   	{
   		element  = driver.findElement(By.id("header_cmdLogout"));
   		return element;
   	}
    

}
