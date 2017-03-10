package capribedsidereportspageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import capribedsidetransfusionpageobjects.StartTransfusionPage;
import common.IEDriver;

public class SelectReportsPage extends IEDriver
{
	private static WebElement element = null;
	public static WebElement selectReportDropdown()
	{
		element  = driver.findElement(By.id("lstSelReport"));
		return element;
	}
	public static WebElement btnGo()
	{
		element  = driver.findElement(By.id("btnParam"));
		return element;
	}
	
	//Method to get values from the dropdown.
	  public void selectReport(String a) throws InterruptedException
	    {
	    	PageFactory.initElements(IEDriver.driver, SelectReportsPage.class );
	    	WebElement wb = SelectReportsPage.selectReportDropdown();
	    	Select sel = new Select(wb);
	    	sel.selectByVisibleText(a);
	    	
	    }
	  
	  String report1 = "Auto Cancelled Collection";
	  String report2 = "Barcode Utilization for Transfusions by Point Of Care";
	  String report3 = "Barcode Utilization for Transfusions by User";
	  String report4 = "Blood Plasma Derivatives";
	  String report5 = "Blood Type Change";
	  String report6 = "Bottles Administered";
	  String report7 = "Breast Milk Barcode Compliance";
	  String report8 = "Breast Milk Errors";
	  String report9 = "Collection List by Point Of Care";
	  

}
