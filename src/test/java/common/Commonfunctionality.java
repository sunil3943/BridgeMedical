package common;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageobjects.capribedside.CapribedsideBabyMatchPage;
import pageobjects.capribedside.Capribedside_page_Login;
import pageobjects.capribedside.Capribedside_page_ReceiveBottles;
import pageobjects.capribedside.Capribedside_page_SelectPatient;



public class Commonfunctionality extends IEDriver 
{
//	String FilePath = "C:\\Temp\\sharathtest\\sharath.htm";
//	String TestName = "Recive Bottle";
    IEDriver iedriver = new IEDriver();
	
	Capribedside_page_Login login;
	Capribedside_page_SelectPatient select_page;
	Capribedside_page_ReceiveBottles rece_page;
	//Receive_admin_bottle admin = new Receive_admin_bottle();
	
	public void call_Driver(String URL) throws InterruptedException{
		
		iedriver.callDriver(URL);
		
	}
	
	@SuppressWarnings("static-access")
	public void login_default(String URL) throws InterruptedException{
		
		iedriver.callDriver(URL);
//		iedriver.extent_Reports();
//		iedriver.extent_Test();
//		iedriver.extent_Test().log(LogStatus.INFO, "Browser launched successfully");
//		iedriver.extent_Test().log(LogStatus.PASS, "Logged In Successfully");
		
		login = PageFactory.initElements(IEDriver.driver, Capribedside_page_Login.class ); 
				
		/*iedriver.driver.get("http://10.162.106.174/TransSpec2016010301/capribedside/login.aspx");
		
		
	
		
		WebDriver newdriver = iedriver.newDriver();
		iedriver.get("http://10.162.106.174/TransSpec2016010301/capribedside/login.aspx");
		
		
		Thread.sleep(10000);
	*/	
	    login.txt_box_username().sendKeys("superuser");
	    login.txt_box_password().clear();
	    login.txt_box_password().sendKeys("123");
	    //login.txt_box_password().sendKeys(Keys.ENTER);
		
		
		
        Thread.sleep(3000);
        login.button_login().click();
       // iedriver.extent_Test().log(LogStatus.INFO, "Bridge Application Launched succesfully");
        //iedriver.extent_Reports().endTest(test);
        //iedriver.extent_Reports().flush();
        //Wait for 5 Sec
		Thread.sleep(1000);
	}
	
	
	public void scanpatientid(String a) throws InterruptedException{
		
		select_page = PageFactory.initElements(IEDriver.driver, Capribedside_page_SelectPatient.class );
		Actions actions= new Actions(driver);
		
		actions.keyDown(Keys.ALT).perform();
		
		select_page.txt_box_patientid().sendKeys("[");
		//Thread.sleep(2000);
		select_page.txt_box_patientid().sendKeys(a);
		//Thread.sleep(1000);
		actions.keyDown(Keys.ALT).perform();
		select_page.txt_box_patientid().sendKeys("]");
		Thread.sleep(1000);
	}
	
	public void receive_bottle() throws InterruptedException
	{
		//Edited-Sayyad
		String URL="http://10.162.106.174/TransSpec2016010407/capribedside/login.aspx";
		iedriver.callDriver(URL);
		rece_page=PageFactory.initElements(IEDriver.driver, Capribedside_page_ReceiveBottles.class );
		
	}
	
			public String uniqueNumber(){
			
			SimpleDateFormat date1 = new SimpleDateFormat("yyyyddMMHHmm");//("MM/dd/yyyy HH:mm");	    
		    Calendar cal = Calendar.getInstance();
		    cal.add(Calendar.DATE, -1);	    		
			String date = date1.format(cal.getTime());				
			return date;
		}
			public String uniqueNumber2(){
				
				SimpleDateFormat date1 = new SimpleDateFormat("yyyyddMMHHmm");//("MM/dd/yyyy HH:mm");	    
			    Calendar cal = Calendar.getInstance();
			    cal.add(Calendar.DATE,0);	    		
				String date = date1.format(cal.getTime());				
				return date;
			}
          public String uniqueNumber3(){
				
				SimpleDateFormat date1 = new SimpleDateFormat("yyyyddMMHHmm");//("MM/dd/yyyy HH:mm");	    
			    Calendar cal = Calendar.getInstance();
			    cal.add(Calendar.DATE,1);	    		
				String date = date1.format(cal.getTime());				
				return date;
			}
          public String donorUniqueNumber3(){
				
				SimpleDateFormat date1 = new SimpleDateFormat("yyMMddHHmm");//("MM/dd/yyyy HH:mm");	    
			    Calendar cal = Calendar.getInstance();
			    cal.add(Calendar.DATE,-2);	    		
				String date = date1.format(cal.getTime());				
				return date;
			}

			public String yestDate(){
			
			SimpleDateFormat date1 = new SimpleDateFormat ("MM/dd/yyyy HH:mm");	    
		    Calendar cal = Calendar.getInstance();
		    cal.add(Calendar.DATE, -1);	    		
			String date = date1.format(cal.getTime());				
			return date;
			
			
		}
			public String nextDate()
			{
				SimpleDateFormat date1 = new SimpleDateFormat ("MM/dd/yyyy HH:mm");	    
			    Calendar cal = Calendar.getInstance();
			    cal.add(Calendar.DATE, +2);	    		
				String date = date1.format(cal.getTime());				
				return date;
				
			}
			public String nextDateByDate()
			{
				SimpleDateFormat date1 = new SimpleDateFormat ("MM/dd/yyyy");	    
			    Calendar cal = Calendar.getInstance();
			    cal.add(Calendar.DATE, +2);	    		
				String date = date1.format(cal.getTime());				
				return date;
				
			}
			public String currentDate()
			{
				SimpleDateFormat date1 = new SimpleDateFormat ("MM/dd/yyyy HH:mm");	    
			    Calendar cal = Calendar.getInstance();
			    cal.add(Calendar.DATE, +0);	    		
				String date = date1.format(cal.getTime());				
				return date;
				
			}
			
	  public void waitForElement(String Locator){
		  
		  System.out.println("Wait method entered");
		  System.out.println(Locator);
		  WebDriverWait wait = new WebDriverWait(iedriver.driver, 1000);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id(Locator)));
		  
	  }
	  
	 
		 /*   
		    CapribedsideBabyMatchPage babyMatchPage;
		    //String a = "635201";
		    public void scanBabyMatchPatients(String a) throws InterruptedException
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
		    */
	  
	  }
		  
	  		
			



