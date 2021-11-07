Feature: Searching of product

Scenario Outline: Successfully searching for the product

Given Getting driver from signin page 
#When user click on the searchbox
When user enters the product as <book>
And Hit the enter button

Examples:
|book|
|GMAT|
|cyber spy|
  
  
  
  
  