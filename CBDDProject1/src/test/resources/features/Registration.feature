Feature: User Registration
Scenario: User registration with different data
Given User is on registration page
When user enters following details
|Jignasha|Vaghashiya|test@gmail.com|9999|Banglore|
|tom|peter|tom@gmail.com|99999|London|
|Lisa|dsouza|lisa@gmail.com|88877|SFO|
Then user registration should be successfull 

Scenario: User registration with different data with columns
Given User is on registration page
When user enters following details with columns 
|firstname|lastname|email|phone|city|
|Jignasha|Vaghashiya|test@gmail.com|9999|Banglore|
|tom|peter|tom@gmail.com|99999|London|
|Lisa|dsouza|lisa@gmail.com|88877|SFO|
Then user registration should be successfull 