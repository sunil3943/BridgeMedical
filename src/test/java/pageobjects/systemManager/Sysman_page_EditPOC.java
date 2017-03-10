package pageobjects.systemManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sysman_page_EditPOC {

	private static WebElement element = null;
	public static WebElement dropDwn_RequireCosignInAdministerBottles(WebDriver driver)
	{
		element  = driver.findElement(By.id("ListRequireCosignAdministerBottles"));
		return element;
	}

}
