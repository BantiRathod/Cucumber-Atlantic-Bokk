package com.mindtree.stepDefinations;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.mindtree.pageObjects.HomePage;
import com.mindtree.pageObjects.SignInPage;

@RunWith(Cucumber.class)
public class SigninSD {
	
	    static WebDriver driver=null;
	    HomePage hp;
	    SignInPage sp;
	

	    @Given("^Getting driver from homepage of the application.$")
	    public void getting_driver_from_homepage_of_the_application() throws Throwable {
	       
	    	driver = HomePageLandingSD.getDriver();
	    }

	    @When("^user click on SigIn$")
	    public void user_click_on_sigin() throws Throwable {
	    	  hp = new  HomePage(driver);
	    	
	    	  
	    	 hp.getSignIn().click();
	    }

	    @And("^User enters Email as (.+) and Password as (.+)$")
	    public void user_enters_email_as_and_password_as(String email, String password) throws Throwable {
	    	 sp= new SignInPage(driver);
             sp.getUserName().sendKeys(email);
             sp.getPassword().sendKeys(password);
             
	    }

	    @And("^Click on Login$")
	    public void click_on_login() throws Throwable {
	       
	    	sp.getSignInSmmitButton().click();
	    	
	    }

	    public static WebDriver getDriver()
		{
			return driver;
		}
	    
	}

