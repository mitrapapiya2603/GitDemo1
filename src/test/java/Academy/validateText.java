package Academy;
	import java.io.IOException;

import org.apache.commons.logging.Log;
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
    import junit.framework.Assert;
    import pageObject.LandingPage;
	import pageObject.LoginPage;



	public class validateText extends base{
		
		public WebDriver driver;
		 public static Logger log =LogManager.getLogger(base.class.getName());
		@BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();
			 log.info("Driver is initialized");
				
			driver.get(prop.getProperty("url"));
			 log.info("Navigated to Home page");
		}
		
		@Test()
		
		public void validateTitleText() throws IOException, InterruptedException
		{
			
		
			//WebElement Login = driver.findElement(By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a"));
			//Login.click();
			LandingPage l=new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(),"FEATURED COURSES123");
		//Assert.assertTrue(condition);
			log.info("Not Successfuly validated text");
			System.out.println("Test done");
			
			
		}
		
		@AfterTest
		
		public void teardown()
		{
			driver.close();
		}

		
	}


