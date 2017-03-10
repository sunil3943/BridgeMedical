package modulebabymatch;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import common.IEDriver;
import pageobjects.capribedside.CapribedsideBabyMatchPage;

public class BabyMatchCommonFunctionality extends IEDriver
{
	  CapribedsideBabyMatchPage babyMatchPage;
	    //String a = "635201";
	    public void scanBabyMatchPatients(String a)  throws InterruptedException
	    {
	    	//iedriver.scanpatient("635201");
	    	babyMatchPage = PageFactory.initElements(IEDriver.driver, CapribedsideBabyMatchPage.class );
			Actions actions= new Actions(driver);
			actions.keyDown(Keys.ALT).perform();
			babyMatchPage.scanPatientID().sendKeys("[");
			Thread.sleep(1000);
			babyMatchPage.scanPatientID().sendKeys(a);
			Thread.sleep(1000);
			actions.keyDown(Keys.ALT).perform();
			babyMatchPage.scanPatientID().sendKeys("]");
			Thread.sleep(1000);
	    }
	    public void scanBabyMatchRacipient(String b) throws InterruptedException
	    {
	    	babyMatchPage = PageFactory.initElements(IEDriver.driver, CapribedsideBabyMatchPage.class );
			Actions actions= new Actions(driver);
			
			actions.keyDown(Keys.ALT).perform();
			babyMatchPage.scanRacipientID().sendKeys("[");
			Thread.sleep(1000);
			babyMatchPage.scanRacipientID().sendKeys(b);
			Thread.sleep(1000);
			actions.keyDown(Keys.ALT).perform();
			babyMatchPage.scanRacipientID().sendKeys("]");
			Thread.sleep(1000);
	    }
	    
	    BabyMatchSelectPatientPage selectPatient;
	    public void scanSelectPatientId(String a )  throws InterruptedException
	    {
	    	selectPatient = PageFactory.initElements(IEDriver.driver, BabyMatchSelectPatientPage.class );
	    	Actions actions= new Actions(driver);
			actions.keyDown(Keys.ALT).perform();
			selectPatient.scanPatientID().sendKeys("[");
			Thread.sleep(1000);
			selectPatient.scanPatientID().sendKeys(a);
			Thread.sleep(1000);
			actions.keyDown(Keys.ALT).perform();
			selectPatient.scanPatientID().sendKeys("]");
			Thread.sleep(1000);
			
	    }

}
