package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	public WebDriver driver;
	
	//By userid=By.cssSelector("input[id=user_email]");
	//By password=By.cssSelector("input[id=user_password]");
	By userid=By.cssSelector("input#user_email.form-control.input-hg");
	By password=By.cssSelector("input#user_password.form-control.input-hg");
	By clickbtn=By.cssSelector("input[type=submit]");
	By errormsg=By.cssSelector("div.alert.alert-danger.alert-show.mb-5");
	

	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement getUserId()
	{
		return driver.findElement(userid);
	}
	

	public WebElement getPassword()
	{
		return driver.findElement(password);
	}
	
	public WebElement getClickbtn()
	{
		return driver.findElement(clickbtn);
	}
	
	public WebElement getErrormsg()
	{
		return driver.findElement(errormsg);
	}
	
	}
