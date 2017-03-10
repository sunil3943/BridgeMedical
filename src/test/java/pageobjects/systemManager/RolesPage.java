package pageobjects.systemManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class RolesPage extends IEDriver
{
private static WebElement element = null;

public static WebElement editRapidStartOnly()
              {
                             element  = driver.findElement(By.id("dlRoles__ctl15_editLink"));
                             return element;
              }
    
    public static WebElement editStudentTransfusionist()
              {
                             element  = driver.findElement(By.id("dlRoles__ctl19_editLink"));
                             return element;
              }
    public static WebElement editSystemAdminister()
    {
                             element  = driver.findElement(By.id("dlRoles__ctl20_editLink"));
                             return element;
              }
    public WebElement editTransfusionSupervisor()
    {
                             element  = driver.findElement(By.id("dlRoles__ctl21_editLink"));
                             return element;
              }
    public static WebElement editTransfusionist()
              {
                             element  = driver.findElement(By.id("dlRoles__ctl22_editLink"));
                             return element;
              }
    public static WebElement linkLogout()
              {
                             element  = driver.findElement(By.id("header_cmdLogout"));
                             return element;
              }


}
