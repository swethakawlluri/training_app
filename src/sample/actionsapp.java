package sample;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class actionsapp 
{
	public WebDriver driver;
	@Test
	public void searchPage() throws Exception{ 
		
		//Elemnts
		
		String baseURL="http://beej.us/blog/data/drag-n-drop/";
		//String baseURL1="https://syntelligence.syntelinc.com/Pages/default.aspx";
		
		
		//code
		
		
System.setProperty("webdriver.ie.driver", "E:\\Sele docs\\Drivers\\IEDriverServer.exe");
		
		driver= new InternetExplorerDriver();
		
		driver.get(baseURL);
		Thread.sleep(5000);
		//driver.manage().window().maximize();
		
		
		
		
		WebElement goat0_img =driver.findElement(By.xpath(".//*[@id='goat0']"));
		WebElement goat1_img =driver.findElement(By.xpath(".//*[@id='goat1']"));
		WebElement goat2_img =driver.findElement(By.xpath(".//*[@id='goat2']"));
		WebElement goat3_img =driver.findElement(By.xpath(".//*[@id='goat3']"));
		WebElement dropzone_0 =driver.findElement(By.xpath(".//*[@id='dropzone0']/div"));
		WebElement dropzone_1 =driver.findElement(By.xpath(".//*[@id='dropzone1']/div"));
		//share_dyn_drpdown=.//*[@id='atstbx']/a[5]/a[1]
		//.//*[@id='atic_facebook']
		String firstpage_title=driver.getTitle();
		System.out.println("MY search page title is: "+firstpage_title);
		
		Actions a= new Actions(driver);
		a.dragAndDrop(goat0_img, dropzone_1).perform();
		Thread.sleep(3000);
		System.out.println("done");
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		System.out.println("ok");
		
		a.clickAndHold(goat2_img).perform();
		a.moveToElement(dropzone_0).perform();
		a.release(goat2_img).perform();
		a.contextClick(goat3_img).perform();
		a.doubleClick(dropzone_1);
		a.moveToElement(goat1_img).perform();
		a.sendKeys(Keys.CONTROL,"a");
		
		System.out.println("good");
	}}	