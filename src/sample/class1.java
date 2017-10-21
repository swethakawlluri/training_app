package sample;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class class1 {

   @Before
   public void connect() throws Exception{
	   System.out.println("Starting the firts class");
   }
	@Test
    public void method1() throws Exception{

		
        //Call take screenshot function

       System.out.println("yes");  
       WebDriver driver ;
       System.setProperty("webdriver.gecko.driver","C:\\Users\\lenovo\\Downloads\\geckodriver.exe");
       DesiredCapabilities capabilities=DesiredCapabilities.firefox();
       capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver(capabilities);
   	//System.setProperty("webdriver.ie.driver","E:\\Sele docs\\Drivers\\IEDriverServer.exe");
  // 	driver = new ChromeDriver();
   	Thread.sleep(1000);
   	driver.manage().window().maximize();
System.out.println("hiiiiiii");
       //goto url
   	

       driver.get("www.facebook.com");


    }

    
	/*System.setProperty("webdriver.firefox.marionette", "E:\\Sele docs\\Drivers\\geckodriver.exe");
	driver= new FirefoxDriver();*/
	/*System.setProperty("webdriver.chrome.driver", "E:\\Sele docs\\homer6.4\\Homer_Release-6.4.0 (2)\\homer-Homer_6.4.0\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();*/ //WebDriverWait wait = new WebDriverWait(driver, 60);
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='nav-link-accountList']/span[1]")));
	
    public static void takeSnapShot(WebDriver webdriver,String fileWithPath) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)webdriver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File(fileWithPath);

                //Copy file at destination

                FileUtils.copyFile(SrcFile, DestFile);

    }

}

 
 

 