Feature: View Cart

Scenario: Viewing the cart

Given Getting driver from add to card page 
When user click on the shopping cart button
And user click on the veiw cart button
Then Page title should contains "SUMMARY"

And Close the Browser