package common;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class IEDriver   
{
	
	public static WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	public void callDriver(String URL) throws InterruptedException{
	
	System.setProperty("webdriver.ie.driver","c://IEDriverServer_Win32_2.53.1/IEDriverServer.exe");//"C:/Users/SC049886/SoftwareData/IEDriverServer_Win32_2.53.0/IEDriverServer.exe");	
	driver = new InternetExplorerDriver();	
	driver.navigate().to(URL);
	Thread.sleep(1000);
	driver.manage().window().maximize();
	
	
	
	}
	   
	    public IEDriver(){
		
	     }
	
		public IEDriver(String FilePath, String TestName){
				
				
				
				extent = new ExtentReports(FilePath, false);
				test = extent.startTest(TestName);
				
			}
			
			public ExtentReports extent_Reports(){
				
				
				return extent;	
				
			}
			
			public ExtentTest extent_Test(){	
				
				//test = extent.startTest(TestName);
				return test;		
			}
			
			public void close()
			{
				driver.close();
			}

			public WebElement findElement(By arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			public Set findElements(By arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			public void get(String arg0) {
				// TODO Auto-generated method stub
				
			}

			public List<WebElement> getElements(By xpath) {
				// TODO Auto-generated method stub
				return null;
			}

		
		
			
		
			
		

	
	

}
