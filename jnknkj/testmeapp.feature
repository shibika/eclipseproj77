Feature: Signin to TestmeApp
Scenario Outline: Signin to testme
Given User is on Testmee Sign in page
When User has entered <username> and <password>
Then Login is successful

Examples:
 |username|password|
 |shibik1|password1|
 |shibika2|password2|

 
 

Scenario: Sign up for TestmeApp
Given User is on testme signup page
When User enter all required mandatory fields
|Fields            |Values|
|username          |Shibika1|
|firstname|shibika|
|lastname|khobragade|
|password|password1|
|confirmpassword|password1|
|gender|female|
|email|nshibika.sona@gmail.com|
|mobile|8308618832|
|dob|07/04/1988|
|address|pimple gurav|
|security_question_answer|Chandrapur|
Then User is signed up successfully
 