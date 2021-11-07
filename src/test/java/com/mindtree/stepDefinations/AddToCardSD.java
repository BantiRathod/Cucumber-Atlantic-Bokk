package com.mindtree.stepDefinations;


import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageObjects.AddToCardPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class AddToCardSD {

	static WebDriver driver=null;
	  AddToCardPage atc;
	
    @Given("^Getting driver from selecting product page$")
    public void getting_driver_from_selecting_product_page() throws Throwable {
         
    	driver = SelectProductSD.getDriver();
    	
    }

    @When("^User click on the Add to cart button$")
    public void user_click_on_the_add_to_cart_button() throws Throwable {
        
           atc = new AddToCardPage(driver);
           atc.getAddToCard().click();
    	
    }
    
    @Then("^Book should be added$")
    public void book_should_be_added() throws Throwable {
       
       Assert.assertTrue(atc.getTitleAfterAdding().getText().contains("You added"));
    }
    
    public static WebDriver getDriver()
  	{
  		return driver;
  	}
}

