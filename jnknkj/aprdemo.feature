Feature: Refund return policy

Scenario: Refund of an item
Given Alex purchase Microwave for 100 dollars
And Alex has receipt
When Alex return faulty microwave
Then Alex should get refund of 100 dollars


Scenario Outline: Refund of an item1
Given Alex purchase Microwave for <price> dollars
And Alex has receipt
When Alex return faulty microwave
Then Alex should get refund of <price> dollars

Examples:
 |price|
 |200|
 |300|
 
@RegressionTest
Scenario: Login
 Given User provides valid credentials
 Then SignIn is successful
 
 
 Scenario: app credentials
 Given User is at SignIn page
 When User provides valid user name and password
   |Shibika|Mayur|
   |Deesha|Sayali|
   |Will|David|
   
Then User SignIn in success   



