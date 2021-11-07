package com.mindtree.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@RunWith(Cucumber.class)
@CucumberOptions( features= "features", 
                 glue = "com.mindtree.stepDefinations",  //to tell about stepdefiantions file
                 dryRun = false,                    //NOTE**** FALSE :- FOR OPENING, TRUE :- TO SKIP FEATURE FILES. to cross check that all steps having corresponding methods or not
                 monochrome=true)                       //it is used for remove all unnecessary charactor
public class TestRunner extends AbstractTestNGCucumberTests{

	
}
