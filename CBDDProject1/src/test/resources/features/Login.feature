Feature: Login Feature

Scenario Outline: Login fail - possible combinations
Given user is on application landing page
When user clicks on Sign in button
Then user is displayed on login screen
When user enters "<UserName>" in username field
And user enters "<Password>" in password field
And user clicks on Sign in button
Then user gets login failed error message

Examples: 
|UserName         |Password|
|incorrectusername|123456  |
|Jignasha					|password|
|Jignasha1				|test1   |