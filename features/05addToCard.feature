Feature: Adding to the cart

Scenario: Adding the product to the cart

Given Getting driver from selecting product page 
When User click on the Add to cart button
Then Book should be added
