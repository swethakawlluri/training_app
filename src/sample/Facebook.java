package sample;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook 
{
	public WebDriver driver;
	@Test
	public void loginPage() throws Exception{ 
		System.setProperty("webdriver.ie.driver", "E:\\\\Sele docs\\\\Drivers\\\\IEDriverServer.exe");
		
		driver= new InternetExplorerDriver();
		
		driver.get("https://m.facebook.com/reg/?cid=103&refid=8");
		Thread.sleep(3000);
		
		WebElement firstname =driver.findElement(By.xpath(".//*[@id='u_0_f']"));
		WebElement lastname=driver.findElement(By.id("u_0_h"));
		WebElement mobl_email =driver.findElement(By.name("reg_email__"));
		WebElement paswrd=driver.findElement(By.cssSelector("#u_0_r"));
		
		WebElement day_dropdown=driver.findElement(By.xpath(".//*[@id='day']"));
		
		Select s1= new Select(day_dropdown);
		if(s1.isMultiple())
		{
			s1.selectByIndex(0);
			s1.selectByIndex(1);
			s1.selectByIndex(2);
		}
		else {
			s1.selectByIndex(0);
		}
		//l1={s,a,d,f,g} ).    l1={sadfg} l1.gettext=sadfg
		String a,b,c;
		
		
		
		List<WebElement> l1= s1.getOptions();
		System.out.println("No.of Elemnts present in the day dropdown are:"+l1.size());
		System.out.println("Second elemnt in day dropdown is:"+l1.get(1).getText());
		
		for(int i=0;i<=l1.size()-1;i++)
		{
			System.out.println(l1.get(i).getText());
		}
		s1.selectByValue("2");
	System.out.println(s1.getFirstSelectedOption().getText());
		//s1.selectByIndex(0);
		//s1.selectByValue("2");
		//s1.selectByVisibleText("Day");
		
		
		
		if(firstname.isDisplayed()) {
			firstname.sendKeys("swetha");
			
		}
		else {
			System.out.println("failed to identify firstname");
		}
		if(lastname.isDisplayed()) {
			lastname.sendKeys("k");
		}
		else {
			System.out.println("failed to identify lastname");
		}
		if(mobl_email.isDisplayed()) {
			mobl_email.sendKeys("nagasriswetha@gmail.com");
		}
		else {
			System.out.println("failed to identify mobl_email");
		}
		if(paswrd.isDisplayed()) {
			paswrd.sendKeys("12345@swEtha");
		}
		else {
			System.out.println("failed to identify paswrd");
		}
		
		
		driver.close();
		
	}
	
	
}
	
	