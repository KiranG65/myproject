package org.magnitia.kira;


import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.FluentWait;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.IMDBPage;

public class Gluecode {
	 public RemoteWebDriver driver;
	 public Scenario s;
	 
		//Constructor method
	
	public FluentWait<RemoteWebDriver> wait;
		
	 
	 public IMDBPage obj1;
	 
	 @Before
	 public void method1(Scenario s)
	 {
		 this.s=s;
	 }
	 
	 	
	@Given("Launch browser")
	public void launch_browser()throws Exception
	{

		launch_browser();
		obj1 = new IMDBPage(driver,wait);
			
		
	}

	@When("user launches a site {string} site")
	public void user_launches_a_site_site(String url) throws Exception 
	{
	
		{
			obj1.launchSite(driver, url);
		}	
	}

	

	

	

	@Then("user verifies the text")
	public void user_verifies_the_text() 
	{

		
		{
			String x = "December 17,2021 (United States)";
			String y = "India";

			if(x.equals("actual1"))
			{
				System.out.println("Test Passed");
				
			}
			else
			{
				System.out.println("Test fails");
				
			}
			
			if(y.equals("actual2"))
			{
				System.out.println("Test Passed");
				
			}
			else
			{
				System.out.println("Test fails");
			}
	}
	}
	}
