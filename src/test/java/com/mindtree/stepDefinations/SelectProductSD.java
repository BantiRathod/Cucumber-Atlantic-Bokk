package com.mindtree.stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import java.util.List;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.pageObjects.SelectProductPage;

@RunWith(Cucumber.class)
public class SelectProductSD {

	SelectProductPage sp;
	static WebDriver driver=null;
	List<WebElement> lb;

	    @Given("^Getting driver from search product page$")
	    public void getting_driver_from_search_product_page() throws Throwable {
	        
	    	driver=SearchProductSD.getDriver();
	    }

	    @When("^User find the desired product$")
	    public void user_find_the_desired_product() throws Throwable {
	    
	    	Thread.sleep(5000L);
		    sp = new SelectProductPage(driver);

			lb = sp.getSelectProduct();
	    }

	    
	    @And("^click on it$")
	    public void click_on_it() throws Throwable {
	      
	    	if (lb.size() == 0)
				System.out.println("no books found");

			lb.get(0).click();

			Thread.sleep(5000L);
	    }
	    
	    public static WebDriver getDriver()
		{
			return driver;
		}
}
