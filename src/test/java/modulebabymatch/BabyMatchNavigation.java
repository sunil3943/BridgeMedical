package modulebabymatch;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.LogStatus;

import common.Commonfunctionality;
import common.IEDriver;
import multiScreenShot.MultiScreenShot;
import pageobjects.capribedside.Capribedside_page_AdministerBottles;

public class BabyMatchNavigation extends IEDriver
{

	String FilePath = "C:\\Temp\\CapribridgeBabyMatchTest.html";
	String TestName = "PatientIdentificationErrorTest";
	MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","CapribridgeBabyMatchTest");
	IEDriver iedriver = new IEDriver(FilePath, TestName); 
       Commonfunctionality fun = new Commonfunctionality();
	   Capribedside_page_AdministerBottles cap = new Capribedside_page_AdministerBottles();
	//String pat_id ="635203";
	//String bottle_no= fun.uniqueNumber();
	//String onedayago= fun.yestDate();
	  //MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","ScreenShot1");
	  @BeforeClass
	     public void preExecutionTest() throws InterruptedException
	  { 
		iedriver.extent_Reports();
		iedriver.extent_Test();
		//iedriver.extent_Reports().startTest();
		String babyMatchURL = "http://10.162.106.174/TransSpec2016010412/babymatch/Login.aspx";
		fun.login_default(babyMatchURL);	
		//iedriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		iedriver.extent_Test().log(LogStatus.INFO, "Application launched successfully");
		//fun.scanpatientid( pat_id);
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Assert.assertEquals(true, Capribedside_page_MainPatientPage.button_ReceiveBottles().isEnabled());
		  /*//System.setProperty("webdriver.ie.driver", "C:/Users/SC049886/SoftwareData/IEDriverServer_Win32_2.53.0/IEDriverServer.exe");
		  //driver = new InternetExplorerDriver();
		  //driver.manage().window().maximize();
		
		 // driver.get("http://10.162.106.174/TransSpec2016010304/babymatch/Login.aspx");
		  Thread.sleep(2000);
	      //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  CapribedsideBabyMatchLoginPage login;
		  login = PageFactory.initElements(IEDriver.driver, CapribedsideBabyMatchLoginPage.class );
		  Thread.sleep(1000);
		  login.enterUsername().sendKeys("superuser");
		  Thread.sleep(1000);
		   // login.txt_box_password().clear();
		    login.enterPassword().sendKeys("123");
		    Thread.sleep(2000);
		    login.clickOnLoginButton().sendKeys(Keys.ENTER);
		    */
		
	     
	  }

	 @AfterClass
	  public void postExecutionTest() 
	  {
		 //driver.close();
		 iedriver.extent_Reports().endTest(iedriver.extent_Test());
		  iedriver.extent_Reports().flush();
		  iedriver.extent_Reports().close();
	  }

  
}
