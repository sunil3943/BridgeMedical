package common;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.relevantcodes.extentreports.LogStatus;

public class LoginToCapribedside extends IEDriver

{
	 //String FilePath = "C:\\Temp\\Sayyad.html";
	 //String TestName = "Recive Bottle";
	 //MultiScreenShot multiScreens = new MultiScreenShot("C:/Temp/","ScreenShot1");
	 IEDriver iedriver = new IEDriver(); 
	 Commonfunctionality fun = new Commonfunctionality();
	  @BeforeClass
	     public void preExecutionTest() throws InterruptedException
	  { 
		iedriver.extent_Reports();
		iedriver.extent_Test();
		//iedriver.extent_Reports().startTest();
		String capribedsideUrl = "http://10.162.106.174/TransSpec2016010410/capribedside/Login.aspx";
		fun.login_default(capribedsideUrl);	
		//iedriver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//iedriver.extent_Test().log(LogStatus.INFO, "Application launched successfully");
		//fun.scanpatientid( pat_id);
		Thread.sleep(1000);
		
		
	     
	  }

	 @AfterClass
	  public void postExecutionTest() 
	  {
		 //iedriver.extent_Reports().endTest(iedriver.extent_Test());
		  //iedriver.extent_Reports().flush();
		  //iedriver.extent_Reports().close();
		// driver.close();
	  }

	 
}
