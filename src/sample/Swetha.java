package sample;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Swetha 
{
	//By.xpath(".//*[text()[contains(.,'Previous Releases')]]
	//By.linkText("Previous Releases")
	public WebDriver driver;
	
	@Test
	public void one() throws InterruptedException 
	{
		System.out.println("Selenium HQ downloads");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\lenovo\\Downloads\\geckodriver.exe");
	      // DesiredCapabilities capabilities=DesiredCapabilities.firefox();
	      // capabilities.setCapability("marionette", true);
	       // driver = new FirefoxDriver(capabilities);
		System.setProperty("webdriver.ie.driver", "E:\\Sele docs\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
			
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumhq.org/download/");
		 Thread.sleep(5000);
			//driver.findElement(By.linkText("Previous Releases")).click();
		 WebElement E1=driver.findElement(By.partialLinkText("Previous"));
		 
		 //driver.findElement(By.name("j_username")).sendKeys("abcd");
		System.out.println(driver.findElement(By.partialLinkText("Previous")).isDisplayed());
		if(driver.findElement(By.partialLinkText("Previous")).isDisplayed())
		{
			driver.findElement(By.partialLinkText("Previous")).click();
			driver.findElement(By.className("sectionDownload push")).sendKeys(Keys.CONTROL,"c");;
			System.out.println("Clicked it");
			
			
	
			}
		else {
			System.out.println("Cannot identify the element with xpath");
		}
		
	//driver.close();
	}	

}
