package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	
	By signin=By.xpath("//*[@id=\"homepage\"]/header/div[1]/div/nav/ul/li[4]/a");
	By popupclose=By.xpath("//*[@id=\"homepage\"]/div[4]/div[2]/div/div/div/span/div/div[7]/div/div/div[2]");
	By title= By.cssSelector("div.text-center");
	By pageNavigation= By.cssSelector("ul.nav.navbar-nav.navbar-right");
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}
	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	public WebElement popupclose()
	{
		return driver.findElement(popupclose);
	}
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	public WebElement getPageNav()
	{
		return driver.findElement(pageNavigation);
	}

}
