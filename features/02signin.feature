Feature: Signin 

Scenario Outline: Successful Login with valid credentials

Given Getting driver from homepage of the application. 
When user click on SigIn 
And User enters Email as <email> and Password as <password>
And Click on Login

Examples:
|email 			|password				|
|defenceaspirants87@gmail.com|Banti#4321|
#|hardy23@gmail.com|Jackson@123|