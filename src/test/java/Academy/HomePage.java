package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Resources.base;
import pageObject.LandingPage;
import pageObject.LoginPage;



public class HomePage extends base{
	
	public static Logger Log= LogManager.getLogger(base.class.getName());
	
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();

	}
	
	@Test(dataProvider="getData")
	
	public void basePageNavigation(String username, String Password,String text) throws IOException, InterruptedException
	{
		
		driver.get(prop.getProperty("url"));
		System.out.println("Link clicked");
		System.out.println("New comments");
		System.out.println("New comments2");
		System.out.println("New comments2");
		System.out.println("New comments5");
		System.out.println("New comments6");
		
		System.out.println("web app");
		System.out.println("web app");
		//WebElement Login = driver.findElement(By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a"));
		//Login.click();
		LandingPage l=new LandingPage(driver);
		Thread.sleep(1000);
		//l.popupclose().click();
		l.getLogin().click();
		LoginPage lp=new LoginPage(driver);
		lp.getUserId().sendKeys(username);
		lp.getPassword().sendKeys(Password);
		System.out.println(text);
		lp.getClickbtn().click();
		String errorText=lp.getErrormsg().getText();
		System.out.println(errorText);
		//driver.close();
		
	}

	@DataProvider 
	public Object[][] getData()
	{
		Object[][] data= new Object[2][3];
				
		data[0][0]="nonrestricteddata";
		data[0][1]="12345";
		data[0][2]= "Restricted User";
		
		data[1][0]="restricteddata";
		data[1][1]="12345";
		data[1][2]= "Non Restricted User";
		
		return data;
				
				
	}
	@AfterTest
	
	public void teardown()
	{
		driver.close();
	}
	
}
