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

public class marrgapp 
{
	public WebDriver driver;
	@Test
	public void searchPage() throws Exception{ 
		
		//Elemnts
		
		String baseURL="http://www.mymarriage.com/";
		String baseURL1="https://syntelligence.syntelinc.com/Pages/default.aspx";
		
		
		//code
		
		
System.setProperty("webdriver.ie.driver", "E:\\Sele docs\\Drivers\\IEDriverServer.exe");
		
		driver= new InternetExplorerDriver();
		
		driver.get(baseURL);
		Thread.sleep(5000);
		
		
		WebElement bride_radiobttn =driver.findElement(By.xpath(".//*[@id='gender-Female']"));
		WebElement Groom_radiobttn =driver.findElement(By.xpath(".//*[@id='gender-Male']"));
		WebElement age_first_drpdown =driver.findElement(By.xpath(".//*[@id='agefrom']"));
		WebElement age_second_drpdown =driver.findElement(By.xpath(".//*[@id='ageto']"));
		WebElement Religion_drpdown =driver.findElement(By.xpath(".//*[@id='community']"));
		WebElement mothertong_drpdown =driver.findElement(By.xpath(".//*[@id='mothertongue']"));
		WebElement education_drpdwn =driver.findElement(By.xpath(".//*[@id='educationlevel']"));
		WebElement email_textbx =driver.findElement(By.xpath(".//*[@id='email']"));
		WebElement searchnow_bttn =driver.findElement(By.xpath(".//*[@id='signin']"));
		WebElement pageheading_field =driver.findElement(By.xpath(".//*[text()='Find your life partner today!']"));
		WebElement caste_drpdwn =driver.findElement(By.xpath(".//*[@id='caste']"));
		String firstpage_title=driver.getTitle();
		System.out.println("MY search page title is: "+firstpage_title);
		String message=pageheading_field.getText();
		System.out.println("MY MESSAGE on the page "+message);
		
		List<WebElement> frames=driver.findElements(By.tagName("iframe"));
		int count=frames.size();
		System.out.println("NO.of frames in this page are :"+count);
		//x frame--->y frame 
		//driver.switchTo().frame(1);
		//operations like clikcing entering valkues selevting 
		//driver.switchTo().defaultContent();
		String value=bride_radiobttn.getAttribute("tabindex");
		//bride_radiobttn.
		System.out.println("value"+value);
		bride_radiobttn.click();
		Select d1= new Select(age_first_drpdown);
		Select d2= new Select(age_second_drpdown);
		Select d3= new Select(Religion_drpdown);
		Select d4= new Select(mothertong_drpdown);
		Select d5= new Select(caste_drpdwn);
		Select d6= new Select(education_drpdwn);
		
		boolean b1=d1.isMultiple();
		System.out.println("is age dropdown is multiple : "+b1);
		d1.selectByIndex(6);
		Thread.sleep(500);
		d2.selectByValue("25");Thread.sleep(500);
		d3.selectByVisibleText("Hindu");Thread.sleep(500);
	
		d4.selectByIndex(1);Thread.sleep(1000);
			
		List<WebElement> option=d4.getAllSelectedOptions();
		System.out.println("Selected OPTION is:"+option.get(0).getText());
		d5.selectByIndex(2);Thread.sleep(500);
		d6.selectByIndex(3);Thread.sleep(500);
		email_textbx.clear();
		email_textbx.sendKeys("nagasriswetha@gmail.com");Thread.sleep(500);
		
		searchnow_bttn.click();
		Thread.sleep(3000);
		String secondpage_title=driver.getTitle();
		System.out.println("MY home page title is: "+secondpage_title);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*WebElement firstname =driver.findElement(By.xpath(".//*[@id='u_0_f']"));
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
		
		
		driver.close();*/
		
	}
	
	
}
	
	