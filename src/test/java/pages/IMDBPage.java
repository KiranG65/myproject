package pages;


import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class IMDBPage
{
	RemoteWebDriver driver;
	FluentWait<RemoteWebDriver> wait;
	
	@FindBy(xpath="//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[10]/div[2]/ul/li[1]/div/ul/li/a") 
	public WebElement Releasedate;
	
	@FindBy(xpath="//*[@id=\"__next\"]/main/div/section[1]/div/section/div/div[1]/section[10]/div[2]/ul/li[2]/div/ul/li/a") 
	public WebElement Countryoforigin;
	
	
	//Constructor method
	public IMDBPage(RemoteWebDriver driver, FluentWait<RemoteWebDriver> wait )
	{
		PageFactory.initElements(driver,this);
		this.driver=driver;
		this.wait=wait;
	}
	
	//operational methods
	
	
	public void getrd()
	{
		
	String actual1 = wait.until(ExpectedConditions.visibilityOf(Releasedate)).getText();
	
	
	}
	
	public void getcoo()
	{
		

		String actual2 = wait.until(ExpectedConditions.visibilityOf(Countryoforigin)).getText();
		
	}
	public void launchSite(RemoteWebDriver driver, String url) throws Exception
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void launch_browser()throws Exception
	{

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			
		
	}
	
	 
	