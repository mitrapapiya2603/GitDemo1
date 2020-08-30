package Resources;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class base {
	
	public  WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		
	 prop= new Properties();
	FileInputStream fis=new FileInputStream("C:\\Papiya_Sony_Vio\\Selenium\\WebDriver\\E2EProject\\src\\main\\java\\Resources\\data.properties");

	prop.load(fis);
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);

	if(browserName.equals("chrome"))
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Papiya_Sony_Vio\\Selenium\\Drivers Selenium\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
			//execute in chrome driver
		
	}
	else if (browserName.equals("firefox"))
	{
		 //driver= new FirefoxDriver();
		//firefox code
	}
	else if (browserName.equals("IE"))
	{
//		IE code
	}
driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
return driver;
}
	
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		//String destinationFile = System.getProperty("C:\\Papiya_Sony_Vio\\Selenium\\WebDriver\\E2EProject\\logs.png")	;	
		String destinationFile =System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	
	}
	
}


