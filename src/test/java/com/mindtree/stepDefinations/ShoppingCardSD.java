package com.mindtree.stepDefinations;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.mindtree.pageObjects.AddToCardPage;
import com.mindtree.pageObjects.ShopingCardPage;

@RunWith(Cucumber.class)
public class ShoppingCardSD {

	static WebDriver driver=null;
	
	ShopingCardPage sp;
	AddToCardPage atc;
	
	    @Given("^Getting driver from add to card page$")
	    public void getting_driver_from_add_to_card_page() throws Throwable {
	        
	    	driver = AddToCardSD.getDriver();
	    	
	    }

	    @When("^user click on the shopping cart button$")
	    public void user_click_on_the_shopping_cart_button() throws Throwable {
	    	
	    	Thread.sleep(3000L);
	    	atc = new AddToCardPage(driver);
		    sp = new ShopingCardPage(driver); 
		    Thread.sleep(3000L);
			atc.getShopingCard().click();		
	    }

	    @And("^user click on the veiw cart button$")
	    public void user_click_on_the_veiw_cart_button() throws Throwable {
	       
	    	atc.getViewCart().click();
	    }
	    
	    
	    @Then("^Page title should contains \"([^\"]*)\"$")
	    public void page_title_should_contains_something(String heading) throws Throwable {
	      
	    	System.out.println("going to check title");
	    	
          Assert.assertTrue(sp.getSummuryTitle().getText().contains(heading));  
          System.out.println("done check title");
	    }

	    @And("^Close the Browser$")
	    public void close_the_browser() throws Throwable {
	        
	    	driver.close();
	    }
}

