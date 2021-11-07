package com.mindtree.stepDefinations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.pageObjects.HomePage;
import com.mindtree.reusableComponent.WebDriverHelper;

@RunWith(Cucumber.class)
public class HomePageLandingSD {

	 static WebDriver driver =null;
	
	  @Given("^Launching the specified browser.$")
	    public void launching_the_specified_browser() throws Throwable {
	        
		  WebDriverHelper.launchingBrowser(); 
		  driver = WebDriverHelper.getDriver();
		  
	    }

	    @When("^Hitting the URL \"([^\"]*)\".$")
	    public void hitting_the_url_something(String url) throws Throwable {
	       
	    driver.get(url);
	    	
	    }

		
		@Then("^Redirected at app home page.$") public void
		redirected_at_app_home_page() throws Throwable {
		  
			HomePage hp =  new HomePage(driver); 
			
			Assert.assertTrue(hp.getSignIn().getText().equalsIgnoreCase("SIGN IN"));
			
			System.out.println("Redirected successfully");
		}
		
		
		public static WebDriver getDriver()
		{
			return driver;
		}
		
    }
