package modulebabymatch;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import common.Commonfunctionality;
import common.IEDriver;

public class NewTrailTest
{
  @Test
  public void trailTest() throws InterruptedException 
  {
	  
	  //public static void daysInStockSelectContract(InternetExplorerDriver driver) {
		    // get the parent handle before clicking on the link
	  WebDriver driver;
	  System.setProperty("webdriver.ie.driver","C:/Users/SC049886/SoftwareData/IEDriverServer_Win32_2.53.0/IEDriverServer.exe");	
	  driver = new InternetExplorerDriver();
	  driver.navigate().to("http://10.162.106.174/TransSpec2016010304/babymatch/Login.aspx");
		    String parentHandle = driver.getWindowHandle();
		    System.out.println("ParentHandle : " + parentHandle);
		    
		    //driver.findElement(
		    //By.xpath(".//*[@id='page-content']/table/tbody/tr[1]/td[1]/a")).click();
		            

		    // get all the window handles and assign it to a set
		    // It will include child window and parentwindow
		    Set<String> windowHandles = driver.getWindowHandles();

		    System.out.println("No of Window Handles: " + windowHandles.size());

		    // remove the parent handle from the set
		    //windowHandles.remove(parentHandle);

		    // the set will contain only the child window now. Switch to child
		    // window and close it.
		    for (String winHandle : driver.getWindowHandles()) {
		        driver.switchTo().window(winHandle);
		        System.out.println("Child Handle : " + winHandle);
		        Commonfunctionality fun = new Commonfunctionality();
				String sysMgrUrl = "http://10.162.106.174/TransSpec2016010304/systemmanager/Login.aspx";
				fun.login_default(sysMgrUrl);
		        driver.close();
		    }

		    // get the window handles again, print the size
		    windowHandles = driver.getWindowHandles();
		    System.out.println("No of Window Handles: " + windowHandles.size());
		    for (String winHandldes : windowHandles) {
		        System.out.println("Active Window : " + winHandldes);
		    }

		    driver.switchTo().window(parentHandle);
		    
		}
		/*
	  //IEDriver driver = new IEDriver();
	  WebDriver driver;
	  System.setProperty("webdriver.ie.driver","C:/Users/SC049886/SoftwareData/IEDriverServer_Win32_2.53.0/IEDriverServer.exe");	
	  driver = new InternetExplorerDriver();
	  driver.navigate().to("http://10.162.106.174/TransSpec2016010304/babymatch/Login.aspx");
	  String originalHandle = driver.getWindowHandle();
	 // WebElement e11 = driver.findElement(By.linkText("Ok"));
	 // JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	  //executor1.executeScript("arguments[0].click();", e11);

	  Thread.sleep(5000L);
      Set<String> s = driver.getWindowHandles(); 
	  Iterator iter = s.iterator();
	  String d11= (String)iter.next();
	  //String d22= (String)iter.next();
	  System.out.println(d11);

	  driver.switchTo().window(d11);   // This is where it is hanging
	  //driver.switchTo().frame("2");
	  Commonfunctionality fun = new Commonfunctionality();
	   String sysMgrUrl = "http://10.162.106.174/TransSpec2016010304/systemmanager/Login.aspx";
	   fun.login_default(sysMgrUrl);
	   driver.quit();

	  //driver.findElement(By.id("id3")).sendKeys("Numeric");
	  //System.out.println("numeric");

        Thread.sleep(10000);
	  //driver.findElement(By.linkText("Save")).click();
	  driver.switchTo().window(originalHandle);
	  ((Navigation) driver).refresh();
	  Thread.sleep(10000);
	  
	  BabyMatchCommonFunctionality bmcmn = new BabyMatchCommonFunctionality();
	  bmcmn.scanBabyMatchPatients("635201");
	  */
  }


