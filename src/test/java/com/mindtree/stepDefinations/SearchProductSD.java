package com.mindtree.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.mindtree.pageObjects.SearchBoxPage;

@RunWith(Cucumber.class)
public class SearchProductSD {

	static WebDriver driver=null;
	SearchBoxPage sb;
	
    @Given("^Getting driver from signin page$")
    public void getting_driver_from_signin_page() throws Throwable {
     
    	driver = SigninSD.getDriver();
    }


    @When("^user enters the product as (.+)$")
    public void user_enters_the_product_as(String book) throws Throwable {
         
   	 sb = new SearchBoxPage(driver); 
	 sb.getSearchBox().sendKeys(book);
	 
    }

    @And("^Hit the enter button$")
    public void hit_the_enter_button() throws Throwable {
       
    	sb.getSearchBox().sendKeys(Keys.ENTER);
    }

    public static WebDriver getDriver()
	{
		return driver;
	}
}
