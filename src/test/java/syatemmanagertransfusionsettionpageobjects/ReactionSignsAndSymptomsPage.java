package syatemmanagertransfusionsettionpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class ReactionSignsAndSymptomsPage extends IEDriver 
{
	private static WebElement element = null;
	//Blood Type Chnage Reasons
	public static WebElement linkCreateReactionSigns()
		{
			element  = driver.findElement(By.id("cmdCreate"));
			return element;
		}
	public static WebElement textBoxNameCreateReactionSigns()
	{
		element  = driver.findElement(By.id("txtValue"));
		return element;
	}
	public static WebElement textBoxDescriptionCreateReactionSigns()
	{
		element  = driver.findElement(By.id("txtDescription"));
		return element;
	}
	public static WebElement buttonConfirmCreateReactionSigns()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public static WebElement buttonCancelCreateReactionSigns()
	{
		element  = driver.findElement(By.id("cmdCancel"));
		return element;
	}
	public static WebElement linkBack()
	{
		element  = driver.findElement(By.id("cmdOK"));
		return element;
	}
	public void createReactionSignsAndSymptoms(String signName,String description) throws Throwable
	{
		ReactionSignsAndSymptomsPage.linkCreateReactionSigns().click();
		Thread.sleep(2000);
		ReactionSignsAndSymptomsPage.textBoxDescriptionCreateReactionSigns().sendKeys(signName);
		Thread.sleep(2000);
		ReactionSignsAndSymptomsPage.textBoxDescriptionCreateReactionSigns().sendKeys(description);
		Thread.sleep(2000);
		ReactionSignsAndSymptomsPage.buttonConfirmCreateReactionSigns().click();
		Thread.sleep(2000);
	}

}
