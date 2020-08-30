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
import junit.framework.Assert;
import pageObject.LandingPage;
	import pageObject.LoginPage;



	public class validateNavigation extends base{
		
		public static Logger Log= LogManager.getLogger(base.class.getName());
		
		public WebDriver driver;
		
		@BeforeTest
		public void initialize() throws IOException
		{
		
			 driver =initializeDriver();

		}
		
		@Test()
		
		public void HomePageNavigationBar() throws IOException, InterruptedException
		{
			
			driver.get(prop.getProperty("url"));
			System.out.println("Link clicked");
			LandingPage l=new LandingPage(driver);
			Assert.assertTrue(l.getPageNav().isDisplayed());
			Log.error("Did it again!");
			Log.trace("Did it again!");
		
			System.out.println("New comments2");
			System.out.println("New comments3");
			System.out.println("New comments4");
			
			System.out.println("New comments5");
			
			
		}

		@AfterTest
		
		public void teardown()
		{
			driver.close();
			Log.info("Diver closed!");
		}
		
	}


