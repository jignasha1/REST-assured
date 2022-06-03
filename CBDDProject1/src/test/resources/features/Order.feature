Feature: Amazon Order Page

Background: 
Given a registeres user exists
Given User is on Amazon login page
When user enteres username
And user enteres password
And user click on Login button
Then user navigates to order page

Scenario: Check previous order Details
When user clicks on Order Link
Then user checks previous order details

Scenario: Check open order details
When user clicks on Open Orders link
Then user checks the open orders details

Scenario: Check cancelled order details
When user clicks on Cancelled Orders link
Then user checks the cancelled order details