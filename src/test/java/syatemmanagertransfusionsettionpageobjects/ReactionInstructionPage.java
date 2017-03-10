package syatemmanagertransfusionsettionpageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.IEDriver;

public class ReactionInstructionPage extends IEDriver
{
	private static WebElement element = null;
	//Blood Type Chnage Reasons
		public static WebElement linkCreateReactionInstruction()
		{
			element  = driver.findElement(By.id("cmdCreate"));
			return element;
		}
		public static WebElement textBoxNameCreateReactionInstruction()
		{
			element  = driver.findElement(By.id("txtValue"));
			return element;
		}
		public static WebElement textBoxDescriptionCreateReactionInstruction()
		{
			element  = driver.findElement(By.id("txtDescription"));
			return element;
		}
		public static WebElement buttonConfirmCreateReactionInstruction()
		{
			element  = driver.findElement(By.id("cmdOK"));
			return element;
		}
		public static WebElement buttonCancelCreateReactionInstruction()
		{
			element  = driver.findElement(By.id("cmdCancel"));
			return element;
		}
		public static WebElement linkBack()
		{
			element  = driver.findElement(By.id("cmdOK"));
			return element;
		}
		
		public void createReactionInstruction(String reactionName,String description) throws Throwable
		{
			ReactionInstructionPage.linkCreateReactionInstruction().click();
			Thread.sleep(2000);
			ReactionInstructionPage.textBoxNameCreateReactionInstruction().sendKeys(reactionName);
			Thread.sleep(2000);
			ReactionInstructionPage.textBoxDescriptionCreateReactionInstruction().sendKeys(description);
			Thread.sleep(2000);
			ReactionInstructionPage.buttonConfirmCreateReactionInstruction().click();
			
		}

}
